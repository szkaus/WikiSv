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

public class GenericWSim
{   static Integer k,m,n,l,p,x,y,refinedvalue,presenceinhashmap,presenceinrefined,d,e;
    static Integer gettimes,diff,the15,f;
    static String refinedkey;
	private static LinkedHashMap<String, Integer> testhashmap;
	//private static Integer termsimilarity; 
	static String termfromprimarypage;
	static double dotsc, magnitude =0,cossimintocommontermratio;
	private static LinkedHashMap<String, Integer> hashmaptomatchagainst;
	private static Integer termfreqfromprimarypage;
	private static LinkedHashMap<String, Integer> otherhashmap;
	private static Integer presenceinotherhashmap;
	private static LinkedHashMap<String, Integer> hashmapformagnitude;
	private static Integer termfreq;
	static double commonterm;
	static double commontermsanddotscorehere;
	static double magnitudemainpage;
	static double magnitudeotherpage;
	static double cossim,modifiedcossim;
	static double magnitudemultiply;
	
	
	public static void  gwsim(String term1, String term2)	
	{   
		ArrayList<LinkedHashMap<String, Integer>>listofhashmaps = new ArrayList<LinkedHashMap<String, Integer>>();
		ArrayList<LinkedHashMap<String, Integer>>refinedlistofhashmaps = new ArrayList<LinkedHashMap<String, Integer>>();
				
		LinkedHashMap<String, Integer> wcountpage1 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> wcountpage2 = new LinkedHashMap<String, Integer>();
		
		
		
		LinkedHashMap<String, Integer> wcountpage1top10 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> wcountpage2top10 = new LinkedHashMap<String, Integer>();
		
		
		listofhashmaps.add(wcountpage1);
		listofhashmaps.add(wcountpage2);
		
		
		refinedlistofhashmaps.add(wcountpage1top10);
		refinedlistofhashmaps.add(wcountpage2top10);
		
		
		List<Double> allmagnitude = new ArrayList<Double>();
		List<Double> alldotscore = new ArrayList<Double>();
		
		List<Double> allcommontermratioanddotsc = new ArrayList<Double>();
		List<Double> allcossim = new ArrayList<Double>();
		List<Double> allmodifiedcossim = new ArrayList<Double>();
		List<Double> allcommontermratio = new ArrayList<Double>();
 

		ArrayList<String>page1pageterms = new ArrayList<String>();
		ArrayList<String>page2pageterms = new ArrayList<String>();
		
		
		
		ArrayList<ArrayList<String>> arraylistofpages = new ArrayList<ArrayList<String>>();
		
		arraylistofpages.add(page1pageterms); 
		arraylistofpages.add(page2pageterms);
		
	
		
		ArrayList<String>iteratiionallpagenames = new ArrayList<String>();
		
		iteratiionallpagenames.add(term1);
		iteratiionallpagenames.add(term2);
		
		
		int sizeofterms= iteratiionallpagenames.size();
		int i;
		
		for (i=0;i<sizeofterms;i++)
		{
			try 
			{
				BufferedReader in = new BufferedReader(
				       new FileReader("flood/"+"stemmedsimplewtokens"+ " " + iteratiionallpagenames.get(i).toString() + ".txt"));
				//BufferedReader in = new BufferedReader(
				       // new FileReader("servicefiles/"+"stemmedsimplewtokens"+ " " + iteratiionallpagenames.get(i).toString() + ".txt"));
				
				//BufferedReader in = new BufferedReader(
				       // new FileReader("cyclone/"+"stemmedsimplewtokens"+ " " + iteratiionallpagenames.get(i).toString() + ".txt"));
				//BufferedReader in = new BufferedReader(
				  //      new FileReader("bushfire/"+"simplewtokens"+ " " + iteratiionallpagenames.get(i).toString() + ".txt"));
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
				try {if(GetServFile.getsrvfile(iteratiionallpagenames.get(i).toString()))
				     {
					  ConvertServFile.convertservfile(iteratiionallpagenames.get(i).toString());
					  WTextProcessorService.wtextprocess(iteratiionallpagenames.get(i).toString());
					  SimpleWTokensService.simplewikitextservice(iteratiionallpagenames.get(i).toString());
					 // BufferedReader in = new BufferedReader(
						      // new FileReader("servicefiles/"+"stemmedsimplewtokens"+ " " + iteratiionallpagenames.get(i).toString() + ".txt"));
					    
					  BufferedReader in = new BufferedReader(
						       new FileReader("servicefiles/"+"stemmedsimplewtokens"+iteratiionallpagenames.get(i).toString() + ".txt"));
					  
					 // BufferedReader in = new BufferedReader(
						      //  new FileReader("flood/"+"stemmedsimplewtokens"+iteratiionallpagenames.get(i).toString() + ".txt"));
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
				      catch (IOException e1) 
				        {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				     }
				    else
				    {
				     System.out.println("concept does not exist in wiki");	
				    }	
				    } 
				catch (IOException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				// TODO Auto-generated catch block
				//e.printStackTrace();
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
		
		 
		//for (Map.Entry<String, Integer> entry : listofhashmaps.get(0).entrySet()) 
		// {
		   
		  // System.out.println(entry.getKey() + " = " + entry.getValue()); 
		// }
		
		
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
		    	   //System.out.println(refinedkey+ " " + refinedvalue);
		    	   b++;
		         }	 
		         }
		       }
			 
              	  
			 }
		   // System.out.println("----------------");	
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
		    { double totaldotsc =0, commontermratio=0, commontermratioanddotsc;
		      commonterm=0;
		     otherhashmap = refinedlistofhashmaps.get(e);
		     for (Map.Entry<String, Integer> entry : refinedlistofhashmaps.get(0).entrySet()) 
			 {
			   
			   termfromprimarypage = entry.getKey();
			   termfreqfromprimarypage =entry.getValue();
			   //System.out.println(entry.getKey() + " = " + entry.getValue());
			   presenceinotherhashmap =  otherhashmap.get(termfromprimarypage);
			   if(presenceinotherhashmap != null) 
	           { commonterm= commonterm+1;
			     
	             dotsc =  termfreqfromprimarypage*presenceinotherhashmap;
			     
			     totaldotsc = totaldotsc + dotsc;
			     
			      }	 
			     	
			    }
		     commontermratio=commonterm/50;
		     //System.out.println(commonterm);
		    // System.out.println(commontermratio);
		     commontermratioanddotsc= totaldotsc*commontermratio;
		     alldotscore.add(totaldotsc);
		     allcommontermratio.add(commontermratio);
		    // allcommontermratioanddotsc.add(commontermratioanddotsc);
	        }
		   System.out.println(commonterm);
		   //allcommontermratio.add(commontermratio);
		    
		   for(f=0;f<refinedlistofhashmaps.size();f++)
		   {
			   
			double dotscorehere= alldotscore.get(f); 
			//double modifieddotscorehere= allcommontermratioanddotsc.get(f);
			magnitudemainpage = allmagnitude.get(0);
			magnitudeotherpage = allmagnitude.get(f);
			magnitudemultiply = magnitudemainpage * magnitudeotherpage;
			
			cossim = dotscorehere/magnitudemultiply;
			cossimintocommontermratio = cossim*allcommontermratio.get(f);
			//modifiedcossim= modifieddotscorehere/magnitudemultiply;
			//allmodifiedcossim.add(modifiedcossim);
			allcossim.add(cossim);
			   
		   }
		    System.out.println(term1);
			System.out.println(term2);
			System.out.println(cossim);
			System.out.println(cossimintocommontermratio);
			
			System.out.println("*****************");
		  /*
			for(int xx=0;xx<alldotscore.size();xx++)
		    {
		     double dots=allcossim.get(xx);
		     System.out.println(dots);
		     
		     
		    }
			*/
			/*
		   for (Map.Entry<String, Integer> entry : test.entrySet()) 
			 {
			   
			   //System.out.println(entry.getKey() + " = " + entry.getValue()); 
			 }
			*/ 
	}
		  
}	  
		 
	    
	    
		
	



