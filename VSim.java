package com.example.Pdf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class VSim 
{   static Integer k,m,n,l,p,x,y,refinedvalue,presenceinhashmap,presenceinrefined,d,e;
    static Integer gettimes,diff,the15,f;
    static String refinedkey;
	private static LinkedHashMap<String, Integer> testhashmap;
	//private static Integer termsimilarity; 
	static String termfromprimarypage;
	static double dotsc, magnitude =0;
	private static LinkedHashMap<String, Integer> hashmaptomatchagainst;
	private static Integer termfreqfromprimarypage;
	private static LinkedHashMap<String, Integer> otherhashmap;
	private static Integer presenceinotherhashmap;
	private static LinkedHashMap<String, Integer> hashmapformagnitude;
	private static Integer termfreq;
	static double dotscorehere;
	static double magnitudemainpage;
	static double magnitudeotherpage;
	static double cossim;
	static double magnitudemultiply;
	
	
	public static void  vsim()	
	{   
		ArrayList<LinkedHashMap<String, Integer>>listofhashmaps = new ArrayList<LinkedHashMap<String, Integer>>();
		ArrayList<LinkedHashMap<String, Integer>>refinedlistofhashmaps = new ArrayList<LinkedHashMap<String, Integer>>();
		
		
		LinkedHashMap<String, Integer> test = new LinkedHashMap<String, Integer>();
		
		test.put("Hello", 5);
		test.put("World", 5);
		
		
		
		LinkedHashMap<String, Integer> wcountcyclonepage = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> wcountstormsurgepage = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> wcountwindpage = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> wcountrainfallpage = new LinkedHashMap<String, Integer>();
		//LinkedHashMap<String, Integer> wcounthumiditypage = new LinkedHashMap<String, Integer>();
	//	LinkedHashMap<String, Integer> wcounttemperaturepage = new LinkedHashMap<String, Integer>();
		
		
		
		LinkedHashMap<String, Integer> wcountcyclonetop10 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> wcountstormsurgetop10 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> wcountwindtop10 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> wcountrainfalltop10 = new LinkedHashMap<String, Integer>();
		//LinkedHashMap<String, Integer> wcounthumiditytop10 = new LinkedHashMap<String, Integer>();
		//LinkedHashMap<String, Integer> wcounttemperaturetop10 = new LinkedHashMap<String, Integer>();
		
		
		listofhashmaps.add(wcountcyclonepage);
		listofhashmaps.add(wcountstormsurgepage);
		listofhashmaps.add(wcountwindpage);
		listofhashmaps.add(wcountrainfallpage);
		//listofhashmaps.add(wcounthumiditypage);
		//listofhashmaps.add(wcounttemperaturepage);
		
		
		refinedlistofhashmaps.add(wcountcyclonetop10);
		refinedlistofhashmaps.add(wcountstormsurgetop10);
		refinedlistofhashmaps.add(wcountwindtop10);
		refinedlistofhashmaps.add(wcountrainfalltop10);
		//refinedlistofhashmaps.add(wcounthumiditytop10);
		//refinedlistofhashmaps.add(wcounttemperaturetop10);
		
		
		List<Double> allmagnitude = new ArrayList<Double>();
		List<Double> alldotscore = new ArrayList<Double>();
		List<Double> allcossim = new ArrayList<Double>();
		
 

		ArrayList<String>cyclonepageterms = new ArrayList<String>();
		ArrayList<String>stormsurgepageterms = new ArrayList<String>();
		ArrayList<String>windpageterms = new ArrayList<String>();
		ArrayList<String>rainfallpageterms = new ArrayList<String>();
		//ArrayList<String>humiditypageterms = new ArrayList<String>();
		//ArrayList<String>temperaturepageterms = new ArrayList<String>();
		
		
		
		ArrayList<ArrayList<String>> arraylistofpages = new ArrayList<ArrayList<String>>();
		
		arraylistofpages.add(cyclonepageterms); 
		arraylistofpages.add(stormsurgepageterms);
		arraylistofpages.add(windpageterms);
		arraylistofpages.add(rainfallpageterms);
		//arraylistofpages.add(humiditypageterms);
		//arraylistofpages.add(temperaturepageterms);
		
	
		
		ArrayList<String>iteratiionallpagenames = new ArrayList<String>();
		
		iteratiionallpagenames.add("bushfire");
		iteratiionallpagenames.add("drought");
		iteratiionallpagenames.add("fire");
		iteratiionallpagenames.add("flame");
		
		//iteratiionallpagenames.add("highway");
		//iteratiionallpagenames.add("wildlife");
		//iteratiionallpagenames.add("farm");
		//iteratiionallpagenames.add("household");
		
		int sizeofterms= iteratiionallpagenames.size();
		int i;
		
		for (i=0;i<sizeofterms;i++)
		{
			try 
			{
				BufferedReader in = new BufferedReader(
				        new FileReader("bushfire/"+"simplewtokens"+ iteratiionallpagenames.get(i).toString() + ".txt"));
			    //System.out.println("bushfire/"+"simplewtokens"+ listofbushfiresiterms.get(i).toString() + ".txt");
				String str;

		        try {
					while ((str = in.readLine()) != null) 
					{ 
					    str = str.toLowerCase(); // convert to lower case 
					    String[] words = str.split("\\s+"); //split the line on whitespace, would return an array of words
                        for( String word : words ) 
					    { 	
                         // System.out.println(word);
                          arraylistofpages.get(i).add(word);
                                               
					     }
					 }
				} 
		      catch (IOException e) 
		        {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			} 
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//System.out.println(k);	
			
		}
		
		for(m=0;m<arraylistofpages.size();m++)
		{
		 for (n=0;n<arraylistofpages.get(m).size();n++)
		 {
		   
		   String word = arraylistofpages.get(m).get(n);
		  // System.out.println(word);
		   if( word.length() == 0 ) 
           {
             continue; 
           }

           Integer occurences = listofhashmaps.get(m).get(word);

           if( occurences == null) 
           {
             occurences = 1;
           } 
           else 
           {
             occurences++;
             //System.out.println(word);
             //System.out.println(occurences);
           }
         
          
          listofhashmaps.get(m).put(word, occurences);
		    	   
		 }		 
		}
		
		 
		for (Map.Entry<String, Integer> entry : listofhashmaps.get(0).entrySet()) 
		 {
		   
		  // System.out.println(entry.getKey() + " = " + entry.getValue()); 
		 }
		
		
		for (x=0;x<listofhashmaps.size();x++)
		 {  int b=0;
		   /*	
		   testhashmap=listofhashmaps.get(x);
			 
			for (Entry<String, Integer> entry : testhashmap.entrySet()) 
			{
			    System.out.println(entry.getKey() + " = " + entry.getValue());
			}
			*/ 
			 ArrayList<Integer> values = new ArrayList<Integer>();
			    values.addAll(listofhashmaps.get(x).values());
             
			      
			    Collections.sort(values, Collections.reverseOrder());
			 
			Iterator<Integer> valuesIterator = values.iterator();
		    while (valuesIterator.hasNext()) 
		    {
		      //System.out.println(valuesIterator.next());	
			  
			  
			 Integer a= valuesIterator.next();
			  //System.out.println(a);
			 
			 for (String s :listofhashmaps.get(x).keySet()) 
		      { if (b==50)
			   {
				    
				break;	
			    }     
				
		       if (listofhashmaps.get(x).get(s) == a) // which have this value          
		       { 
		         refinedkey= s;
		          refinedvalue=a;
		          
		         if(!(refinedlistofhashmaps.get(x).containsKey(refinedkey)))
		         {
		           refinedlistofhashmaps.get(x).put(refinedkey, refinedvalue);
		    	   System.out.println(refinedkey+ " " + refinedvalue);
		    	   b++;
		         }	 
		         }
		       }
              	  
			 }
		    	
			 }
		    
		    for (d=0;d<refinedlistofhashmaps.size();d++)  
		    { 
		       double squaretermfreq;
		       double magnitudesquare=0;	
			 hashmapformagnitude = refinedlistofhashmaps.get(d);
			 for (Map.Entry<String, Integer> entry : hashmapformagnitude.entrySet()) 
			 {
				 termfreq=entry.getValue();
				 squaretermfreq = Math.pow(termfreq, 2);
				 
				 magnitudesquare = magnitudesquare + squaretermfreq;
				 
			  }
			     magnitude= Math.sqrt(magnitudesquare);
			     allmagnitude.add(magnitude); 
			      
		     }	
		  		    
		   // refinedlistofhashmaps.get(1).size();
			//for(e=0;e<d;e++) 
			//{
		    for(e=0;e<refinedlistofhashmaps.size();e++)
		    { double totaldotsc =0;
		     otherhashmap = refinedlistofhashmaps.get(e);
		     for (Map.Entry<String, Integer> entry : refinedlistofhashmaps.get(0).entrySet()) 
			 {
			   
			   termfromprimarypage = entry.getKey();
			   termfreqfromprimarypage =entry.getValue();
			   //System.out.println(entry.getKey() + " = " + entry.getValue());
			   presenceinotherhashmap =  otherhashmap.get(termfromprimarypage);
			   if(  presenceinotherhashmap != null) 
	           {
			     dotsc =  termfreqfromprimarypage*presenceinotherhashmap;
			     totaldotsc = totaldotsc + dotsc;
			     
			      }	 
			     	
			    }
		     alldotscore.add(totaldotsc);  
	        }
		   
		    
		   for(f=0;f<refinedlistofhashmaps.size();f++)
		   {
			 
			dotscorehere= alldotscore.get(f); 
			magnitudemainpage = allmagnitude.get(0);
			magnitudeotherpage = allmagnitude.get(f);
			magnitudemultiply = magnitudemainpage * magnitudeotherpage;
			cossim = dotscorehere/magnitudemultiply;
			System.out.println(cossim);
			allcossim.add(cossim);
			   
		   }	   
		 // System.out.println(refinedlistofhashmaps.size());
		   
		   /*
		   for (Map.Entry<String, Integer> entry : test.entrySet()) 
			 {
			   
			   //System.out.println(entry.getKey() + " = " + entry.getValue()); 
			 }
			*/ 
	}
		  
}	  
		 
	    
	    
		
	


