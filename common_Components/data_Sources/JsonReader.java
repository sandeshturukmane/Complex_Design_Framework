package data_Sources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.GsonJsonProvider;
import com.jayway.jsonpath.spi.mapper.GsonMappingProvider;


public class JsonReader {
	public static void main(String [] args) throws IOException{
		System.out.println("--- 0th JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/Jan2021API/DataSource/TestData/testData.json",
				"$..knowledgeWare.userCreationWorkFlow.[?(@.username == 'Pritam')].password");
		
		/*
		System.out.println("--- 1st JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/Jan2021API/DataSource/TestData/testData.json",
				"$..knowledgeWare.commonForProject.url");
		*/
		/*
		System.out.println("--- 2nd JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/Jan2021API/DataSource/TestData/testData.json",
				"$..knowledgeWare.userCreationWorkFlow[1].username");
		*/
		/*
		System.out.println("--- 3rd JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/Jan2021API/DataSource/TestData/testData.json",
				"$..knowledgeWare.userCreationWorkFlow[*].username");
		*/
		/* Alternate way of doing above operation */
		/*
		System.out.println("--- 4th JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/Jan2021API/DataSource/TestData/testData.json",
				"$..['knowledgeWare'].['userCreationWorkFlow'][0].['username']");
		*/
		/*System.out.println("--- 5th JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/Jan2021API/DataSource/TestData/testData.json",
				"$..['knowledgeWare'].['userCreationWorkFlow'][*].['name']");
		*/
		/*
		System.out.println("--- 6th JSon path ---");
		readJsonFileDynamic("C:/OLDLaptop/Selenium/Jan2021API/DataSource/TestData/testData.json",
				"$..knowledgeWare.userCreationWorkFlow.[?(@.age > 25)].username");
		*/
		/*
		System.out.println("--- 7th JSon path ---");
		readJsonFileDynamic(TestData.getJsonPath(),
				"$..knowledgeWare.userCreationWorkFlow.[?(@.username == 'Pritam')].email");
		*/
	}
	@SuppressWarnings("unchecked")
	public static List<String> readJsonFileDynamic(String filePath, String jsonPath) {
		List<String> returnJsonList = new ArrayList<String>();
	    System.out.println("jsonpath - "+jsonPath);
	    try
	    {
	    	//ReadAllBytes from file from the path to convert into String
	        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
	        //Configuration
	        Configuration conf = Configuration.builder()
	                .jsonProvider(new GsonJsonProvider())
	                .mappingProvider(new GsonMappingProvider())
	                .build();
	        //Need complete file into documentContext
	        DocumentContext docContext = JsonPath.using(conf).parse(fileContent);
	        returnJsonList = docContext.read(jsonPath, List.class);//List 
	        for(String listElement:returnJsonList){
	        	System.out.println(listElement.toString());
	        }
	        //System.out.println(returnJsonList.get(0).toString());
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        System.out.println("exception");
	    } 
	    return returnJsonList;
	}
	
	@SuppressWarnings("unchecked")
	public static String readJsonFileDynamic(String filePath, String jsonPath, int index) {
		List<String> returnJsonList = new ArrayList<String>();
	    System.out.println("jsonpath - "+jsonPath);
	    try
	    {
	        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
	        Configuration conf = Configuration.builder()
	                .jsonProvider(new GsonJsonProvider())
	                .mappingProvider(new GsonMappingProvider())
	                .build();
	     
	        DocumentContext docContext = JsonPath.using(conf).parse(fileContent);
	        returnJsonList = docContext.read(jsonPath, List.class);//List 
	        /*String listElement = null;
	        for(listElement:returnJsonList){
	        	System.out.println(listElement.toString());
	        }*/
	        //System.out.println(returnJsonList.get(0).toString());
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        System.out.println("exception");
	    } 
	    return returnJsonList.get(index);
	}
	
}