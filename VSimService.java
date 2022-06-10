package com.example.Pdf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gnostice.pdfone.PdfSearchElement;

public class VSimService 
{
    static int a,b,totalcap,conceptforeachcap,conceptsize=0,d,e,f=0,g=0,w,y,h,m;
    static Integer refinedvalue;
    static String servicecap,serviceconcept,refinedkey;
    static String tempservconcept; 
    
    //static boolean c;
    
	public static void  vsimserv()
	
	{
		 ArrayList<String> service = new ArrayList<String>();
		
		ArrayList<ArrayList<String>> arraylistofservices = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> arraylistofallserviceconcepts = new ArrayList<ArrayList<String>>();
		ArrayList<LinkedHashMap<String, Integer>>top10forlastconcept = new ArrayList<LinkedHashMap<String, Integer>>();
		
		LinkedHashMap<String, Integer> top10service1 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service2 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service3 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service4 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service5 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service6 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service7 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service8 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service9 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service10 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service11 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service12 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service13 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service14 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service15 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service16 = new LinkedHashMap<String, Integer>();
		
		LinkedHashMap<String, Integer> top10service17 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service18 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service19 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service20 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service21 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service22 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service23 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service24 = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top10service25 = new LinkedHashMap<String, Integer>();
		
		
		
		
		
		top10forlastconcept.add(top10service1);
		top10forlastconcept.add(top10service2);
		top10forlastconcept.add(top10service3);
		top10forlastconcept.add(top10service4);
		top10forlastconcept.add(top10service5);
		top10forlastconcept.add(top10service6);
		top10forlastconcept.add(top10service7);
		top10forlastconcept.add(top10service8);
		top10forlastconcept.add(top10service9);
		top10forlastconcept.add(top10service10);
		top10forlastconcept.add(top10service11);
		top10forlastconcept.add(top10service12);
		top10forlastconcept.add(top10service13);
		top10forlastconcept.add(top10service14);
		top10forlastconcept.add(top10service15);
		top10forlastconcept.add(top10service16);
		
		
		top10forlastconcept.add(top10service17);
		top10forlastconcept.add(top10service18);
		top10forlastconcept.add(top10service19);
		top10forlastconcept.add(top10service20);
		top10forlastconcept.add(top10service21);
		top10forlastconcept.add(top10service22);
		top10forlastconcept.add(top10service23);
		top10forlastconcept.add(top10service24);
		top10forlastconcept.add(top10service25);
		
		
		LinkedHashMap<String, Integer> hashmapforserviceconcept = new LinkedHashMap<String, Integer>();
		
		 ArrayList<String>VICENV05WindSSC = new ArrayList<String>();
		 ArrayList<String> VICENV06SoilMSC = new ArrayList<String>();
		 ArrayList<String>VICENV07AtmosphericPSC =new ArrayList<String>();
		 ArrayList<String>VICENV08TsunamiBSC =new ArrayList<String>();
		 //ArrayList<String>VICRoad01SpeedgunSC =new ArrayList<String>();
		 //ArrayList<String>SmartDroneInc01DroneImageSC =new ArrayList<String>();
		 //ArrayList<String>RoboFarmInc01RoboShepherdSC =new ArrayList<String>();
		 ArrayList<String>VICFireVolunt01FireTruckSC =new ArrayList<String>();
		 ArrayList<String>VICROAD03VisibilitySensorSC =new ArrayList<String>();
		 //ArrayList<String>VICROAD04WeightSensorSC =new ArrayList<String>();
		 ArrayList<String>VICENV09FloodSSC = new ArrayList<String>();
		 ArrayList<String>VICENV10LiqSSC = new ArrayList<String>();
		 ArrayList<String>VICENV11SmokeandTemperatureDSC = new ArrayList<String>();
		 ArrayList<String>VICCG1RescueBoatSC = new ArrayList<String>();
		 ArrayList<String>VICMET11WeatherStationSC = new ArrayList<String>();
		 ArrayList<String>VICENV12WaterQualitySC = new ArrayList<String>();
		 
		 
		 ArrayList<String>VICMET13AirQualitySC = new ArrayList<String>();
		 ArrayList<String>VICENV17ThermalCameraSC = new ArrayList<String>();
		 ArrayList<String>VICCountryFire01FireFighterDroneSC = new ArrayList<String>();
		 ArrayList<String>VICENV10SeismicSC = new ArrayList<String>();
		
		 ArrayList<String> VICSKY02SurveillanceDroneSC = new ArrayList<String>();
		 ArrayList<String> VICATOMIC01RadiationSensorSC = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY05CCTVSC = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY09SoundMeterSC = new ArrayList<String>();	 
		 ArrayList<String> VICMET19LightningSensorSC = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY20LightMeterSC = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY21SmartSpeakerSC = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY22SpeedGunSC = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY23RangeFinderSC = new ArrayList<String>();
		
		
		 ArrayList<String>VICENV05WindSS = new ArrayList<String>();
		 ArrayList<String> VICENV06SoilMS = new ArrayList<String>();
		 ArrayList<String>VICENV07AtmosphericPS =new ArrayList<String>();
		 ArrayList<String>VICENV08TsunamiBS =new ArrayList<String>();
		// ArrayList<String>VICRoad01SpeedgunS =new ArrayList<String>();
		// ArrayList<String>SmartDroneInc01DroneImageS =new ArrayList<String>();
		// ArrayList<String>RoboFarmInc01RoboShepherdS =new ArrayList<String>();
		 ArrayList<String>VICFireVolunt01FireTruckS =new ArrayList<String>();
		 ArrayList<String>VICROAD03VisibilitySensorS =new ArrayList<String>();
		 //ArrayList<String>VICROAD04WeightSensorS =new ArrayList<String>();
		 ArrayList<String>VICENV09FloodSS = new ArrayList<String>();
		 ArrayList<String>VICENV10LiqSS = new ArrayList<String>();
		 ArrayList<String>VICENV11SmokeandTemperatureDS = new ArrayList<String>();
		 ArrayList<String>VICCG1RescueBoatS = new ArrayList<String>();
		 ArrayList<String>VICMET11WeatherStationS = new ArrayList<String>();
		 ArrayList<String>VICENV12WaterQualityS = new ArrayList<String>();
		 
		 
		 
		 ArrayList<String>VICMET13AirQualityS =new ArrayList<String>();
		 ArrayList<String>VICENV17ThermalCameraS =new ArrayList<String>();
		 ArrayList<String>VICCountryFire01FireFighterDroneS =new ArrayList<String>();
		 ArrayList<String>VICENV10SeismicS = new ArrayList<String>();
		 
		 ArrayList<String> VICSKY02SurveillanceDroneS = new ArrayList<String>();
		 ArrayList<String> VICATOMIC01RadiationSensorS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY05CCTVS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY09SoundMeterS = new ArrayList<String>();	 
		 ArrayList<String> VICMET19LightningSensorS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY20LightMeterS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY21SmartSpeakerS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY22SpeedGunS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY23RangeFinderS = new ArrayList<String>();
		 
		 
		 
		 arraylistofservices.add(VICENV05WindSS);
		 arraylistofservices.add(VICENV06SoilMS);
		 arraylistofservices.add(VICENV07AtmosphericPS);
		 arraylistofservices.add( VICENV08TsunamiBS);
		// arraylistofservices.add(VICRoad01SpeedgunS);
		 //arraylistofservices.add(SmartDroneInc01DroneImageS);
		 //arraylistofservices.add(RoboFarmInc01RoboShepherdS);
		 arraylistofservices.add(VICFireVolunt01FireTruckS);
		 arraylistofservices.add(VICROAD03VisibilitySensorS);
		 //arraylistofservices.add(VICROAD04WeightSensorS);
		 arraylistofservices.add(VICENV09FloodSS);
		 arraylistofservices.add(VICENV10LiqSS);
		 arraylistofservices.add(VICENV11SmokeandTemperatureDS);
		 arraylistofservices.add(VICMET11WeatherStationS);
		 arraylistofservices.add(VICENV12WaterQualityS);
		 arraylistofservices.add(VICCG1RescueBoatS);
		 
		 arraylistofservices.add(VICMET13AirQualityS);
		 arraylistofservices.add(VICENV17ThermalCameraS);
		 arraylistofservices.add(VICCountryFire01FireFighterDroneS);
		 arraylistofservices.add(VICENV10SeismicS);
		 
		 arraylistofservices.add(VICSKY02SurveillanceDroneS);
		 arraylistofservices.add(VICATOMIC01RadiationSensorS);
		 arraylistofservices.add(VICHIGHWAY05CCTVS);
		 arraylistofservices.add(VICHIGHWAY09SoundMeterS);
		 arraylistofservices.add(VICMET19LightningSensorS);
		 arraylistofservices.add(VICHIGHWAY20LightMeterS);
		 arraylistofservices.add(VICHIGHWAY21SmartSpeakerS);
		 arraylistofservices.add(VICHIGHWAY22SpeedGunS);
		 arraylistofservices.add(VICHIGHWAY23RangeFinderS);
		 
		 
		 
		 
		 arraylistofallserviceconcepts.add(VICENV05WindSSC);
		 arraylistofallserviceconcepts.add(VICENV06SoilMSC);
		 arraylistofallserviceconcepts.add(VICENV07AtmosphericPSC);
		 arraylistofallserviceconcepts.add(VICENV08TsunamiBSC);
		 //arraylistofallserviceconcepts.add(VICRoad01SpeedgunSC);
		// arraylistofallserviceconcepts.add(SmartDroneInc01DroneImageSC);
		// arraylistofallserviceconcepts.add(RoboFarmInc01RoboShepherdSC);
		 arraylistofallserviceconcepts.add(VICFireVolunt01FireTruckSC);
		 arraylistofallserviceconcepts.add(VICROAD03VisibilitySensorSC);
		 //arraylistofallserviceconcepts.add(VICROAD04WeightSensorSC);
		 arraylistofallserviceconcepts.add(VICENV09FloodSSC);
		 arraylistofallserviceconcepts.add(VICENV10LiqSSC);
		 arraylistofallserviceconcepts.add(VICENV11SmokeandTemperatureDSC);
		 arraylistofallserviceconcepts.add(VICMET11WeatherStationSC);
		 arraylistofallserviceconcepts.add(VICENV12WaterQualitySC);
		 arraylistofallserviceconcepts.add(VICCG1RescueBoatSC);
		 
		 arraylistofallserviceconcepts.add(VICMET13AirQualitySC);
		 arraylistofallserviceconcepts.add(VICENV17ThermalCameraSC);
		 arraylistofallserviceconcepts.add(VICCountryFire01FireFighterDroneSC);
		 arraylistofallserviceconcepts.add(VICENV10SeismicSC);
		 
		 
		 arraylistofallserviceconcepts.add(VICSKY02SurveillanceDroneSC);
		 arraylistofallserviceconcepts.add(VICATOMIC01RadiationSensorSC);
		 arraylistofallserviceconcepts.add(VICHIGHWAY05CCTVSC);
		 arraylistofallserviceconcepts.add(VICHIGHWAY09SoundMeterSC);
		 arraylistofallserviceconcepts.add(VICMET19LightningSensorSC);
		 arraylistofallserviceconcepts.add(VICHIGHWAY20LightMeterSC);
		 arraylistofallserviceconcepts.add(VICHIGHWAY21SmartSpeakerSC);
		 arraylistofallserviceconcepts.add(VICHIGHWAY22SpeedGunSC);
		 arraylistofallserviceconcepts.add(VICHIGHWAY23RangeFinderSC);
		 	 
		 
		 VICENV05WindSS.add("wind speed");
		 VICENV05WindSS.add("wind direction");
		 VICENV05WindSS.add("wind");		 		 
		 
		 VICCG1RescueBoatS.add("flood rescue");
		 VICCG1RescueBoatS.add("rescue boat");
		
		 
		 		 
		 VICENV12WaterQualityS.add("water quality");
		 VICENV12WaterQualityS.add("water pollution");
		 VICENV12WaterQualityS.add("water");
		 
		 
		 VICMET11WeatherStationS.add("temperature");
		 VICMET11WeatherStationS.add("humidity");
		 VICMET11WeatherStationS.add("wind speed");
		 VICMET11WeatherStationS.add("wind direction");
		 VICMET11WeatherStationS.add("weather");
		 		 
		 VICENV11SmokeandTemperatureDS.add("smoke");
		 VICENV11SmokeandTemperatureDS.add("temperature");
		 VICENV11SmokeandTemperatureDS.add("fire");
		 			 
		 VICENV10LiqSS.add("soil liquefaction");
		 VICENV10LiqSS.add("soil");
		 		 
		 VICENV09FloodSS.add("water level");
		 VICENV09FloodSS.add("water flow rate");
		 VICENV09FloodSS.add("flood");
				   	     
		 VICENV06SoilMS.add("soil moisture");
		 VICENV06SoilMS.add("soil dryness");
		 VICENV06SoilMS.add("soil");
		 
		 VICENV07AtmosphericPS.add("atmospheric pressure");
		 		 		 
		 VICENV08TsunamiBS.add("tsunami");
		 VICENV08TsunamiBS.add("earthquake");
		 VICENV08TsunamiBS.add("ocean");
		 	 
		// VICRoad01SpeedgunS.add("vehicle speed");
		// VICRoad01SpeedgunS.add("vehicle direction");
		// VICRoad01SpeedgunS.add("road traffic");		 
		 
		// SmartDroneInc01DroneImageS.add("thermal Imaging");
		// SmartDroneInc01DroneImageS.add("aerial Imaging");
		// SmartDroneInc01DroneImageS.add("surveillance");
		 
	//	 RoboFarmInc01RoboShepherdS.add("robot shepherd");
		// RoboFarmInc01RoboShepherdS.add("shepherding");
		// RoboFarmInc01RoboShepherdS.add("agriculture");
		 
		 VICFireVolunt01FireTruckS.add("firefighting");
		 VICFireVolunt01FireTruckS.add("rescue");
		 VICFireVolunt01FireTruckS.add("fire");
		
		 
		 VICROAD03VisibilitySensorS.add("road visibility");
		 VICROAD03VisibilitySensorS.add("aerosol detection");
		 VICROAD03VisibilitySensorS.add("visibility");
			
		 VICENV10SeismicS.add("vibration");
		 VICENV10SeismicS.add("earthquake");
		 
		 VICMET13AirQualityS.add("air quality");
		 VICMET13AirQualityS.add("air pollution");
		 VICMET13AirQualityS.add("air");
		 
		 VICENV17ThermalCameraS.add("thermal camera");
		 VICENV17ThermalCameraS.add("thermal image");
		// VICENV17ThermalCameraS.add("thermal");
		 
		 VICCountryFire01FireFighterDroneS.add("bushfire");
		 VICCountryFire01FireFighterDroneS.add("firefigthing");
		 VICCountryFire01FireFighterDroneS.add("fire");
		 
		 VICSKY02SurveillanceDroneS.add ("aerial surveillance");
		 VICSKY02SurveillanceDroneS.add ("surveillance");
		 
		 VICATOMIC01RadiationSensorS.add ("radiation detection");
		 VICATOMIC01RadiationSensorS.add ("nuclear radiation");
		 
		 VICHIGHWAY05CCTVS.add ("monitoring");
		 VICHIGHWAY05CCTVS.add ("cctv");
		 
		 
		 VICHIGHWAY09SoundMeterS.add("sound level meter");
		 VICHIGHWAY09SoundMeterS.add("decibel meter");
		 
		 VICMET19LightningSensorS.add("Thunder sensor");
		 VICMET19LightningSensorS.add("Lightning");
		 
		 VICHIGHWAY20LightMeterS.add("light level meter");
		 VICHIGHWAY20LightMeterS.add("lux meter");
		 
		 VICHIGHWAY21SmartSpeakerS.add("smart speaker");
		 VICHIGHWAY21SmartSpeakerS.add("smart");
		 VICHIGHWAY21SmartSpeakerS.add("smart speaker");
		 VICHIGHWAY21SmartSpeakerS.add("smart speaker");
		
		 
		 VICHIGHWAY22SpeedGunS.add("vehicle speed");
		 VICHIGHWAY22SpeedGunS.add("speed gun");
		 
		 
		 VICHIGHWAY23RangeFinderS.add("laser range finder");
		 VICHIGHWAY23RangeFinderS.add("range finder");
		 
		// VICROAD04WeightSensorS.add("vehicle weight");
		// VICROAD04WeightSensorS.add("weight");
		  
		 for (a=0;a<arraylistofservices.size();a++)
		 {for(b=0;b<arraylistofservices.get(a).size();b++)
		 {	  
	      
	     // totalcap=service.size();
	      service= arraylistofservices.get(a);
	      tempservconcept= service.get(b);
	      arraylistofallserviceconcepts.get(a).add(tempservconcept);    
		  }
		 //System.out.println(conceptsize);
		 }
		 
		 for (d=24;d<25;d++)
			 
		 {g=0;
	     for(e=0;e<arraylistofallserviceconcepts.get(d).size();e++)
		 {
		  g++;
		  service= arraylistofallserviceconcepts.get(d);
		  serviceconcept=service.get(e);
		  System.out.println(serviceconcept);
		  conceptsize=arraylistofallserviceconcepts.get(d).size();	 
		  //System.out.println(conceptsize);
		 
		  if(conceptsize<5 && g==arraylistofallserviceconcepts.get(d).size())
		  {
		   
			try 
		    {
		     if(GetServFile.getsrvfile(serviceconcept))
		    				     
		     {
			  //System.out.println(serviceconcept);
		      ConvertServFile.convertservfile(serviceconcept);
			  WTextProcessorService.wtextprocess(serviceconcept);
			  SimpleWTokensService.simplewikitextservice(serviceconcept);
			  
			  try 
				{
					BufferedReader in = new BufferedReader(
					 new FileReader("servicefiles/"+"simplewtokens" + " "+ serviceconcept + ".txt"));
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
	                    	Integer occurences = hashmapforserviceconcept.get(word);

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
	                    	
	                    hashmapforserviceconcept.put(word,occurences);
	                                               
						     }
						 }
				    in.close();
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
			ArrayList<Integer> values = new ArrayList<Integer>();
				    values.addAll(hashmapforserviceconcept.values());      
				    Collections.sort(values, Collections.reverseOrder());
				 
				Iterator<Integer> valuesIterator = values.iterator();
			    while (valuesIterator.hasNext()) 
			    { 
			      //System.out.println(valuesIterator.next());	
				 	  
				 Integer a= valuesIterator.next();
				  //System.out.println(a);
				 
				 for (String s :hashmapforserviceconcept.keySet()) 
			      { if (f==10)
				   {    
					break;	
					    }       				
			       if (hashmapforserviceconcept.get(s) == a) // which have this value          
			       { 
			         refinedkey= s;
			         refinedvalue=a;
			        // System.out.println(refinedkey+ " " + refinedvalue); 
			         if(!(top10forlastconcept.get(d).containsKey(refinedkey)))
			         {	 
			        // System.out.println(refinedkey+ " " + refinedvalue);
			         top10forlastconcept.get(d).put(refinedkey, refinedvalue);
			         f++;
			         }
			          
			       
			         }
			       }
	              	  
				 }
		      }
			
		     else
			{
			 continue;		
			 }
			
			 } 
		   catch (IOException e) 
		      {
		    	  System.out.println("FAILED.\n[" + e.getMessage() + "]\n");
			   }	  
		  
		  }	  
		  else
			{
			 continue;		
			 }
		  	  
	      //arraylistofallserviceconcepts.get(d).add(serviceconcept);
		  }
		  }
	    
		 for (w=24;w<25;w++)
	     {
	      for(y=0;y<top10forlastconcept.get(w).size();y++)
	      {
	       LinkedHashMap<String,Integer> testserviceconcept= top10forlastconcept.get(14);
	       Set<java.util.Map.Entry<String, Integer>> entrySet1 = testserviceconcept.entrySet();
	       Iterator<java.util.Map.Entry<String, Integer>> entrySetIterator = entrySet1.iterator();
	       while (entrySetIterator.hasNext()) {
	          
	          java.util.Map.Entry<String, Integer> entry = entrySetIterator.next();
	         // System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
	       }
          
	       
	      }	  	  
	     }
	     
	     LinkedHashMap<String,Integer> top10forfirst1 = top10forlastconcept.get(24);
	     
	    List<String> keys = new ArrayList<>(top10forfirst1.keySet());
		 
	     for (h=0;h<keys.size()-1;h++)
		 {
		  String term1 = keys.get(0);
		 // System.out.println(term1);
		  
		  String term2 = keys.get(h+1);
		 // System.out.println(term2);
		  GenericWSim.gwsim(term1,term2);
		  
		 }	 
			 
	    } 
	 
}

	
	

