package com.example.Pdf;


import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class SitandServ
{	
		
	public static void main(String[] args) throws IOException 
	{
		 //ServCapConScoringFlood.calculatemultipleservicescoreflood();
	     //ServCapConScoring.calculatemultipleservicescore();
		 //ServCapConScoringCyclone.calculatemultipleservicescorecyclone();
		// long startTime = System.nanoTime();
		//ServCapConScoringEarthquake.calculatemultipleservicescoreearthquake();
		 //ServCapConScoringCyclone.calculatemultipleservicescorecyclone();
		// long startTime = System.nanoTime();
		 //GenericWSim.gwsim();
	    GetServFile.getsrvfile("water pressure");
		//MultipleServiceScoreCyclone.calculatemultipleservicescorecyclone();
		// MultipleServiceScoreFlood.calculatemultipleservicescoreflood();
		//MultipleServiceScoreEarthquake.calculatemultipleservicescoreearthquake();
	     //MultipleServiceScore.calculatemultipleservicescore();
		//MultipleServiceScoreFullWord.calculatemultipleservicescorefull();
		//RequirementbasedScore.calculatemultipleservicescorereq();
		
		// long endTime = System.nanoTime();
		 
	   //  long durationInNano = (endTime - startTime);  //Total execution time in nano seconds
	 
	    //Same duration in millis
	     
	  //   long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);  //Total execution time in nano seconds
	     
	  //  System.out.println(durationInNano);
	  //   System.out.println(durationInMillis);
		
		// WTextProcessor.wtextprocess();
	  
		 // SimCaller.simc(); 
		 
		//
	  //   GetandLoadFile.getfile("rescue boat");
		// GetHtmlFile.gethtmlfile("camera");
	       // ConvertServFile.convertservfile("gas");
		   //WTextProcessorService.wtextprocess("gas");
	       //SimpleWTokens.simplewikitext("water level");
		  //SimpleWTokensService.simplewikitextservice("gas");
		  //CoreNLPStemmer.stemming("simplewtokens"+" "+"river");
		  // CoreNLPStemmer.stemming("simplewtokens"+"bushfire");
		  //WordCounter.wcount();
	  // VSimService.vsimserv(g);
		//VSim.vsim();
		//double[][] cellscore = new double[9][6];
		//double servtermweight,sittermweight;
		//int[] countnew = new int[6];
	/*	ArrayList<String> sittermnamesonly = new ArrayList<String>();
	    int  sizeofsituationterms;
		int i,k,n;
	    String situationtermname; 
	   // String servicetermtomatch;
		
	    ArrayList<String> SituationTerms = new ArrayList<String>()
		{{add("Flood"); add("Water");add("River");
		  add("City"); add("Household"); 
		  add("Public Transport");}};
		
		//ArrayList<String> ServiceTerms = new ArrayList<String>()
		//{{add("Wind Speed"); add("Wind Direction");
		//add("wind");add("Air");
		//add("Environment");add("Meteorology");}};
		
		//double[] sittermweightarray = {0.6,0.1,0.042857143,0.042857143,
		//		0.042857143,0.042857143,0.042857143,0.042857143,0.042857143};
		//double[] servicetermweightarray = {0.3,0.3,0.25,0.1,0.025,0.025};
		
        sizeofsituationterms = SituationTerms.size();
	    for (i = 0; i <sizeofsituationterms; i++) 
	    { 
		 situationtermname = SituationTerms.get(i);
		 sittermnamesonly.add(situationtermname);
         
          System.out.println( situationtermname);
          GetandLoadFile.getfile(situationtermname); 
		  ConvertToText.convertfile(sittermnamesonly);
         }
	   /* 
	   // for (k = 0; k <sittermnamesonly.size(); k++) 
	   
	  //  for (k = 0; k <sittermnamesonly.size(); k++) 
	   // {
	    for (n=0;n<servicetermweightarray.length;n++)	
	    	
	  //  for (n=0;n<6;n++)	
	    {
	    try {  
	    	   servicetermtomatch= ServiceTerms.get(n);	
	    	   System.out.println(servicetermtomatch);
	    	 //  br = new BufferedReader(new FileReader(sittermnamesonly.get(k) +".txt"));
	     
	    	   Scanner fileScanner = new Scanner(new File(sittermnamesonly.get(k) +".txt"));
	    	   Pattern pattern =  Pattern.compile(ServiceTerms.get(n));
	    	   Matcher matcher = null;
	    	  while(fileScanner.hasNextLine())
	    	  {
	    	     String line = fileScanner.nextLine();
	    		// lineID++;
	    		 matcher = pattern.matcher(line);
	    		 if(matcher.find())
	    	     {    		  
	    		  countnew[n]= countnew[n]+1;
	    		 
	    		  
	    		 // lineNumbers.add(lineID);
	    	     }
	 			}
	    	   fileScanner.close();
	    	   servtermweight= servicetermweightarray[n];
			   sittermweight= sittermweightarray[k];
			   System.out.println(countnew[n]);
			   cellscore[k][n] = countnew[n]*servtermweight*sittermweight;
	    	   System.out.println(cellscore[k][n]);
	            }
	         
	    	  // servicetermtomatch = ServiceTerms.get(n);				
				//System.out.println(doc.getInputFileName());
			   // PDDocument document = PDDocument.load(file); 
		     	 
		 catch (Exception e) 
		    {
				System.out.println("File opening fAILED.\n[" + e.getMessage() + "]");
			}
	      
	       }
	    
	    System.out.println("OUTERLOOOOOOOOOOOOOOOOOOOP" + "---"+ SituationTerms.get(k));
			//	System.out.println(document.getNumberOfPages());
			//	document.close();
			//	COSDocument cosDoc = parser.getDocument();
			
			/*	for (n=0;n<servicetermweightarray.length;n++)
					
				{
				
				 servicetermtomatch= ServiceTerms.get(n);	
			     lstSearchResults = 		
			    (ArrayList) doc.search(1, servicetermtomatch,PdfSearchMode.LITERAL,
		                                  PdfSearchOptions.NONE);	
			     
				
			    System.out.println(servicetermtomatch);
				servtermweight= servicetermweightarray[n];
				System.out.println(lstSearchResults.size());
				sittermweight= sittermweightarray[k];
				numberofoccurence[n] = lstSearchResults.size(); 
				lstSearchResults.clear();
				//cellscore = numberofoccurenceindoc*servtermweight*sittermweight;
				servicescore = numberofoccurence[n]*servtermweight*sittermweight + 
						         servicescore;
				//System.out.println(servicescore);
				}
				
				System.out.println(sittermnamesonly.get(k));
				System.out.println(servicescore);
				System.out.println("---------------------------");
				
				} 
			     
			catch (Exception e) 
		    {
				System.out.println("File opening fAILED.\n[" + e.getMessage() + "]");
			}
		 try {
			  doc.close();
		      } catch (PdfException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	   
      }
	 

	    
	 }
	*/ 
	}
}
