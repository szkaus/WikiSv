package com.example.Pdf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleWTokens 
{   static List<String> simpleWords;
	public static void  simplewikitext(String filetodownload)	
	
	{   
	 
		int k=0;
	    int i;
		
	    Pattern simpleWord = Pattern.compile("\\p{L}+"); // one or more Unicode letters
	    try (BufferedReader in = Files.newBufferedReader(Paths.get("cyclone/"+"removedstopwords"+ filetodownload + ".txt"))) 
	    {  FileOutputStream out=new FileOutputStream("cyclone/"+"simplewtokens"+ filetodownload + ".txt");
	        for (String line; (line = in.readLine()) != null; ) 
	        {
	            if (simpleWord.matcher(line).matches()) 
	            {
	            	PrintStream p=new PrintStream(out);
					p.println(line.toString());
	            }
	        }
	    } catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    /*
		try (Stream<String> lines = Files.lines(Paths.get("removedstopwordsfire.txt"))) 
		{
		    simpleWords = lines.filter(Pattern.compile("^\\p{L}+$").asPredicate())
		                       .collect(Collectors.toList());
		    k= simpleWords.size();
		    System.out.println(k);
		    
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (i=0;i<k;i++)
		{
		 
		 System.out.println(simpleWords.get(i).toString());
		 
		}
	*/	
	}
	

}
