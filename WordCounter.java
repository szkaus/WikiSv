package com.example.Pdf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class WordCounter 
{
	
	public static void  wcount()	
	{
	 	
	LinkedHashMap<String, Integer> wordcount = new LinkedHashMap<String, Integer>();
	try { 
       // BufferedReader in = new BufferedReader(
         //                         new FileReader("simplewtokenscamera" + ".txt"));
        BufferedReader in = new BufferedReader(
               new FileReader("servicefiles/"+"stemmedsimplewtokensdrought" + ".txt"));
        String str;

        while ((str = in.readLine()) != null) 
        { 
            str = str.toLowerCase(); // convert to lower case 
            String[] words = str.split("\\s+"); //split the line on whitespace, would return an array of words

            for( String word : words ) 
            {
              if( word.length() == 0 ) 
              {
                continue; 
              }

              Integer occurences = wordcount.get(word);

              if( occurences == null) 
              {
                occurences = 1;
              } 
              else 
              {
                occurences++;
              }

             wordcount.put(word, occurences);
            }

          } 
         in.close();
        } 
    catch(Exception e)
	{
        System.out.println(e);
    }


    ArrayList<Integer> values = new ArrayList<Integer>();
    values.addAll(wordcount.values());

    Collections.sort(values, Collections.reverseOrder());

    int last_i = -1;

    for (Integer i : values.subList(0, 50)) 
    { 
       if (last_i == i) // without duplicates
            continue;
        last_i = i;

      for (String s : wordcount.keySet()) 
      { 

            if (wordcount.get(s) == i) // which have this value  
               System.out.println(s+ " " + i);
            


       }
	
	
	}
	}
}
