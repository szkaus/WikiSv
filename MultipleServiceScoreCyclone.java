package com.example.Pdf;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleServiceScoreCyclone 

{
	public static void  calculatemultipleservicescorecyclone()
	
	{
		 
		int k;
		double[] scoreofservices = new double[32];
		int n = 0;
		double q=0;

	    int m;

		int l;
	    String servicetermtomatch;
		ArrayList servicetomatch;
		double servtermweight;
		
		double sittermweight;
		ArrayList<ArrayList> arraylistofservices = new ArrayList<ArrayList>();
		
		 ArrayList<String>VICENV05WindSS = new ArrayList<String>();
		 ArrayList<String> VICENV06SoilMS = new ArrayList<String>();
		 ArrayList<String>VICENV07AtmosphericPS =new ArrayList<String>();
		 
		 ArrayList<String>VICMET13AirQualityS =new ArrayList<String>();
		 ArrayList<String>VICENV17ThermalCameraS =new ArrayList<String>();
		 ArrayList<String>VICCountryFire01FireFighterDroneS =new ArrayList<String>();
		// ArrayList<String>VICENV10LiqSSC = new ArrayList<String>();
		 	 
		 ArrayList<String>VICENV08TsunamiBS =new ArrayList<String>();
		 //ArrayList<String>VICRoad01SpeedgunS =new ArrayList<String>();
		 //ArrayList<String>SmartDroneInc01DroneImageS =new ArrayList<String>();
		 //ArrayList<String>RoboFarmInc01RoboShepherdS =new ArrayList<String>();
		 ArrayList<String>VICFireVolunt01FireTruckS =new ArrayList<String>();
		 ArrayList<String>VICROAD03VisibilitySensorS =new ArrayList<String>();
		 //ArrayList<String>VICROAD04WeightSensorS =new ArrayList<String>();
		 ArrayList<String>VICENV09FloodSS = new ArrayList<String>();
		 ArrayList<String>VICENV10SeismicSS = new ArrayList<String>();
		 ArrayList<String>VICENV11SmokeandTemperatureDS = new ArrayList<String>();
		 ArrayList<String>VICCG1RescueBoatS = new ArrayList<String>();
		 	 
		 //https://www.iot-store.com.au/collections/sensors/products/weather-station-ws-3000-anemometer-wind-vane-pluviometer
		 ArrayList<String>VICMET11WeatherStationS = new ArrayList<String>();
		 ArrayList<String>VICENV12WaterQualityS = new ArrayList<String>();
		 
		 ArrayList<String> VICSKY02SurveillanceDroneS = new ArrayList<String>();
		 ArrayList<String> VICATOMIC01RadiationSensorS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY05CCTVS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY09SoundMeterS = new ArrayList<String>();	 
		 ArrayList<String> VICMET19LightningSensorS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY20LightMeterS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY21SmartSpeakerS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY22SpeedGunS = new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY23RangeFinderS = new ArrayList<String>();
		 ArrayList<String> VICCountryFire03QuadCopterImagingS = new ArrayList<String>();
		 ArrayList<String>  VICOtwayParkAuth01SprinklerS = new ArrayList<String>();
		 ArrayList<String> VICEnv23SalinitySensorS = new ArrayList<String>();
		 ArrayList<String> VICAstroPhy01UVSensorS = new ArrayList<String>();
		 ArrayList<String> VicInfrastructure01CrackMeterS = new ArrayList<String>();
		 ArrayList<String> VicInfrastructure02GasleakageS= new ArrayList<String>();
		 ArrayList<String> VicMET25RainfallS = new ArrayList<String>();
		 ArrayList<String> VicMET26SnowDepthS = new ArrayList<String>();
		/* 
		 ArrayList<Double>VICENV05WindSweights = new ArrayList<Double>();
		 ArrayList<Double>VICENV06SoilMSweights = new ArrayList<Double>();
		 ArrayList<Double>VICENV06AtmosphericPSweights = new ArrayList<Double>();
		 ArrayList<Double>VICENV08TsunamiBSweights = new ArrayList<Double>();
		 ArrayList<Double>VICRoad01SpeedgunSweights = new ArrayList<Double>();
		 ArrayList<Double>SmartDroneInc01DroneImageSweights = new ArrayList<Double>();
		 ArrayList<String>VICENV05FloodSS = new ArrayList<String>();
		 */
		 	 
		 ArrayList<Double>SituationTermshereWeights = new ArrayList<Double>();
		 
	     ArrayList<ArrayList>Allweights =new ArrayList<ArrayList>();
		 
		// ArrayList<Double>WindSSweights =new ArrayList<Double>();
		// ArrayList<Double>SoilMSweights =new ArrayList<Double>(); 
		// ArrayList<Double>AtmosphericPSweights =new ArrayList<Double>(); 

	     /*
	     VICENV05WindSweights.add(0.3);
	     VICENV05WindSweights.add(0.3);
	     VICENV05WindSweights.add(0.25);
	     VICENV05WindSweights.add(0.1);
	     VICENV05WindSweights.add(0.025);
	     VICENV05WindSweights.add(0.025);
		 
	     VICENV06SoilMSweights.add(0.5);
	     VICENV06SoilMSweights.add(0.3);
	     VICENV06SoilMSweights.add(0.1);
	     VICENV06SoilMSweights.add(0.1);
			 
		 Allweights.add(VICENV05WindSweights);
		 Allweights.add(VICENV06SoilMSweights);
		 */	 
		 
		 VICCG1RescueBoatS.add("flood rescue");
		 VICCG1RescueBoatS.add("rescue boat");
		 //VICCG1RescueBoatS.add("lifeboats");
		 //VICCG1RescueBoatS.add("boat");
		 //VICCG1RescueBoatS.add("boats");
		 	 
		 VICENV12WaterQualityS.add("water quality");
		 VICENV12WaterQualityS.add("water pollution");
		 VICENV12WaterQualityS.add("water");
		// VICENV12WaterQualityS.add("drinking");
		// VICENV12WaterQualityS.add("ice");
		 
		 
		 VICMET11WeatherStationS.add("wind speed");
		 VICMET11WeatherStationS.add("wind direction");
		 VICMET11WeatherStationS.add("humidity");
		 VICMET11WeatherStationS.add("temperature");
		 VICMET11WeatherStationS.add("weather");
		  
		 VICENV11SmokeandTemperatureDS.add("smoke");
		 VICENV11SmokeandTemperatureDS.add("temperature");
		 VICENV11SmokeandTemperatureDS.add("fire");
		// VICENV11SmokeandTemperatureDS.add("fires");
		// VICENV11SmokeandTemperatureDS.add("flame");
	
		 	 
		 VICENV09FloodSS.add("water level");
		 VICENV09FloodSS.add("water flow rate");
		 VICENV09FloodSS.add("flood");
		// VICENV09FloodSS.add("flooding");
		// VICENV09FloodSS.add("floods");
		 
				 	 
		 VICENV05WindSS.add("wind speed");
		 VICENV05WindSS.add("wind direction");
		 VICENV05WindSS.add("wind");
		// VICENV05WindSS.add("winds");
		// VICENV05WindSS.add("meteorological");
		 
	
	     	     
		 VICENV06SoilMS.add("soil moisture");
		 VICENV06SoilMS.add("soil dryness");
		 VICENV06SoilMS.add("soil");
		// VICENV06SoilMS.add("soils");
		// VICENV06SoilMS.add("clay");
		 
		 
		 VICENV07AtmosphericPS.add("atmospheric pressure");
		// VICENV07AtmosphericPS.add("altitude");
		 VICENV07AtmosphericPS.add("atmosphere");
		// VICENV07AtmosphericPS.add("mbar");
		// VICENV07AtmosphericPS.add("atmosphere");
		 
		 
		 VICENV08TsunamiBS.add("tsunami");
		 VICENV08TsunamiBS.add("earthquake");
		 //VICENV08TsunamiBS.add("ocean");
		// VICENV08TsunamiBS.add("oceans");
		 //VICENV08TsunamiBS.add("sea");
		 
		/* 
		 VICRoad01SpeedgunS.add("vehicle speed");
		 VICRoad01SpeedgunS.add("vehicle direction");
		 VICRoad01SpeedgunS.add("road traffic");
		 VICRoad01SpeedgunS.add("transport");
		 VICRoad01SpeedgunS.add("security");
		 
		 SmartDroneInc01DroneImageS.add("Aerial Thermal Imaging");
		 SmartDroneInc01DroneImageS.add("Aerial Imaging");
		 SmartDroneInc01DroneImageS.add("Drone");
		 SmartDroneInc01DroneImageS.add("Surveillance");
		 
		 RoboFarmInc01RoboShepherdS.add("Aerial Shepherding");
		 RoboFarmInc01RoboShepherdS.add("Livestock");
		 RoboFarmInc01RoboShepherdS.add("Agriculture");
		 */
		 
		 VICFireVolunt01FireTruckS.add("firefighting");
		 VICFireVolunt01FireTruckS.add("rescue");
		 VICFireVolunt01FireTruckS.add("fire");
		// VICFireVolunt01FireTruckS.add("fires");
		// VICFireVolunt01FireTruckS.add("flame");
		 
		 
		 VICROAD03VisibilitySensorS.add("road visibility");
		 VICROAD03VisibilitySensorS.add("aerosol detection");
		 VICROAD03VisibilitySensorS.add("visibility");
		// VICROAD03VisibilitySensorS.add("fog");
		// VICROAD03VisibilitySensorS.add("distance");
		 
		 VICENV10SeismicSS.add("vibration");
		 VICENV10SeismicSS.add("earthquake");
		// VICENV10SeismicSS.add("earthquakes");
		// VICENV10SeismicSS.add("seismic");
		// VICENV10SeismicSS.add("geological");
		 
		 
		 VICMET13AirQualityS.add("air quality");
		 VICMET13AirQualityS.add("air pollution");
		 VICMET13AirQualityS.add("air");
		// VICMET13AirQualityS.add("atmosphere");
		// VICMET13AirQualityS.add("atmospheric");
		 
		 VICENV17ThermalCameraS.add("thermal camera");
		 VICENV17ThermalCameraS.add("thermal image");
		 VICENV17ThermalCameraS.add("thermal");
		// VICENV17ThermalCameraS.add("thermography");
		// VICENV17ThermalCameraS.add("Infrared");
		// VICENV17ThermalCameraS.add("emissivity");
		 
		 
		 VICCountryFire01FireFighterDroneS.add("bushfire");
		 VICCountryFire01FireFighterDroneS.add("firefigthing");
		 VICCountryFire01FireFighterDroneS.add("fire");
		// VICCountryFire01FireFighterDroneS.add("fires");
		// VICCountryFire01FireFighterDroneS.add("flame");
		 
		// VICENV10LiqSSC.add("soil liquefaction");
		// VICENV10LiqSSC.add("soil");
		// VICENV10LiqSSC.add("soils");
		// VICENV10LiqSSC.add("clay");
		// VICENV10LiqSSC.add("water");
		 
		 VICSKY02SurveillanceDroneS.add ("aerial surveillance");
		 VICSKY02SurveillanceDroneS.add ("surveillance");
		// VICSKY02SurveillanceDroneS.add ("law");
		// VICSKY02SurveillanceDroneS.add ("security");
		// VICSKY02SurveillanceDroneS.add ("government");
		 
		 VICATOMIC01RadiationSensorS.add ("radiation detection");
		 VICATOMIC01RadiationSensorS.add ("nuclear radiation");
		// VICATOMIC01RadiationSensorS.add ("decay");
		 // VICATOMIC01RadiationSensorS.add ("radioactive");
		 // VICATOMIC01RadiationSensorS.add("nuclides");
		 
		 
		 VICHIGHWAY05CCTVS.add ("monitoring");
		 VICHIGHWAY05CCTVS.add ("cctv");
		// VICHIGHWAY05CCTVS.add("surveillance");
		//  VICHIGHWAY05CCTVS.add("camera");
		// VICHIGHWAY05CCTVS.add("cameras");
		 
		 VICHIGHWAY09SoundMeterS.add("sound level meter");
		 VICHIGHWAY09SoundMeterS.add("sound meter");
		 //notfound
		 
		 VICMET19LightningSensorS.add("thunder");
		 VICMET19LightningSensorS.add("lightning");
		// VICMET19LightningSensorS.add("thunderstorm");
		// VICMET19LightningSensorS.add("positive");
		// VICMET19LightningSensorS.add("cloud");
		 
		 VICHIGHWAY20LightMeterS.add("light level meter");
		 VICHIGHWAY20LightMeterS.add("lux meter");
		// VICHIGHWAY20LightMeterS.add("exposure");
		// VICHIGHWAY20LightMeterS.add("calibration");
		// VICHIGHWAY20LightMeterS.add("receptor");
		 
		 VICHIGHWAY21SmartSpeakerS.add("smart speaker");
		 VICHIGHWAY21SmartSpeakerS.add("loudspeaker");
		 VICHIGHWAY21SmartSpeakerS.add("announcement");
		// VICHIGHWAY21SmartSpeakerS.add("smart");
		// VICHIGHWAY21SmartSpeakerS.add("goolge");
		// VICHIGHWAY21SmartSpeakerS.add("amazon");
		// VICHIGHWAY21SmartSpeakerS.add("assistant");
		 
		 
		 VICHIGHWAY22SpeedGunS.add("vehicle speed");
		 VICHIGHWAY22SpeedGunS.add("speed gun");
		// VICHIGHWAY22SpeedGunS.add("radar");
		// VICHIGHWAY22SpeedGunS.add("speed");
		// VICHIGHWAY22SpeedGunS.add("frequency");
		 
		 
		 VICHIGHWAY23RangeFinderS.add("laser range finder");
		 VICHIGHWAY23RangeFinderS.add("range finder");
		// VICHIGHWAY23RangeFinderS.add("rangefinder");
		// VICHIGHWAY23RangeFinderS.add("rangefinders");
		// VICHIGHWAY23RangeFinderS.add("ranging");
		 
		 //http://www.flybycopters.servicebro.com/index.php?rt=product/product&product_id=156
		 VICCountryFire03QuadCopterImagingS.add("thermal imaging");
		 VICCountryFire03QuadCopterImagingS.add("search");
		 VICCountryFire03QuadCopterImagingS.add("rescue");
		 
		 //https://widgetbrain.com/use-iot-save-home-bushfires/
		 //http://platypussprinkler.com/c/public-asset-bushfire-fire-protection-sprinkler-system
		 VICOtwayParkAuth01SprinklerS.add("bushfire"); //occured 8 times in the webpage
		 VICOtwayParkAuth01SprinklerS.add("fire");  //occured 17 times in the webpage
		 VICOtwayParkAuth01SprinklerS.add("wildfire");
		 
		 //https://www.vernier.com/products/sensors/sal-bta/
		 VICEnv23SalinitySensorS.add("water salinity");
		 VICEnv23SalinitySensorS.add("salinity");
		 
	
		 //http://www.ecosearch.info/sites/default/files/prodotto_scheda_tecnica/SU-100manual.pdf
		 
		 VICAstroPhy01UVSensorS.add("ultra violet radiation");
		 VICAstroPhy01UVSensorS.add("ultra violet ray");
		 
		 
        //https://www.pcte.com.au/crack-meter
		 
		 VicInfrastructure01CrackMeterS.add("crack meter");
		 VicInfrastructure01CrackMeterS.add("crack");
		 VicInfrastructure01CrackMeterS.add("concrete structure");
		 
       //jolpi labs
		 VicInfrastructure02GasleakageS.add("gas leakage");
		 VicInfrastructure02GasleakageS.add("gas");
		 VicInfrastructure02GasleakageS.add("fire");
		 
		 //
		 
		 VicMET25RainfallS.add("rain gauge");
		 VicMET25RainfallS.add("rainfall");
		 
		 //http://geonor.com/live/products/weather-instruments/shm-30-31-laser-snow-depth-sensor/
		 
		 VicMET26SnowDepthS.add("snow depth");
		 VicMET26SnowDepthS.add("snow height");
		 VicMET26SnowDepthS.add("snowfall");
		 
		/*
		 VICROAD04WeightSensorS.add("Weight in Motion");
		 VICROAD04WeightSensorS.add("Vehicle Weight");
		 VICROAD04WeightSensorS.add("Weight");
		 VICROAD04WeightSensorS.add("transport");
		*/  
		 arraylistofservices.add(VICENV05WindSS);
		 arraylistofservices.add(VICENV06SoilMS);
		 arraylistofservices.add(VICENV07AtmosphericPS);
		 arraylistofservices.add( VICENV08TsunamiBS);
		 //arraylistofservices.add(VICRoad01SpeedgunS);
		// arraylistofservices.add(SmartDroneInc01DroneImageS);
		 //arraylistofservices.add(RoboFarmInc01RoboShepherdS);
		 arraylistofservices.add(VICFireVolunt01FireTruckS);
		 arraylistofservices.add(VICROAD03VisibilitySensorS);
		// arraylistofservices.add(VICROAD04WeightSensorS);
		 arraylistofservices.add(VICENV09FloodSS);
		 arraylistofservices.add(VICENV10SeismicSS);
		 arraylistofservices.add(VICENV11SmokeandTemperatureDS);
		 arraylistofservices.add(VICMET11WeatherStationS);
		 arraylistofservices.add(VICENV12WaterQualityS);
		 arraylistofservices.add(VICCG1RescueBoatS);
		 arraylistofservices.add(VICMET13AirQualityS);
		 arraylistofservices.add(VICENV17ThermalCameraS);
		 arraylistofservices.add(VICCountryFire01FireFighterDroneS);
		// arraylistofservices.add(VICENV10LiqSSC);
		 
		 arraylistofservices.add(VICSKY02SurveillanceDroneS);
		 arraylistofservices.add(VICATOMIC01RadiationSensorS);
		 arraylistofservices.add(VICHIGHWAY05CCTVS);
		 arraylistofservices.add(VICHIGHWAY09SoundMeterS);
		 arraylistofservices.add(VICMET19LightningSensorS);
		 arraylistofservices.add(VICHIGHWAY20LightMeterS);
		 arraylistofservices.add(VICHIGHWAY21SmartSpeakerS);
		 arraylistofservices.add(VICHIGHWAY22SpeedGunS);
		 arraylistofservices.add(VICHIGHWAY23RangeFinderS);
		 
		 arraylistofservices.add(VICCountryFire03QuadCopterImagingS);
		 arraylistofservices.add(VICOtwayParkAuth01SprinklerS);
		 arraylistofservices.add(VICEnv23SalinitySensorS);
		 arraylistofservices.add(VICAstroPhy01UVSensorS);
		 arraylistofservices.add(VicInfrastructure01CrackMeterS);
		 arraylistofservices.add(VicInfrastructure02GasleakageS);
		 arraylistofservices.add(VicMET25RainfallS);
		 arraylistofservices.add (VicMET26SnowDepthS);
	     
	     
	     ArrayList<String> SituationTermshere = new ArrayList<String>()
			{{add("cyclone"); add("storm surge");add("wind"); 
			  add("rainfall");}};
		  
	      SituationTermshereWeights.add(1.0);
	      SituationTermshereWeights.add(0.2999406394661774);
	      SituationTermshereWeights.add(0.25472248891083393);
	      SituationTermshereWeights.add(0.2348631623355509);
	  
	     
	      for (l=0;l<arraylistofservices.size();l++)
	      {  
	       for (k=0;k<SituationTermshere.size();k++)   
	       { 		    	
	    	for(n=0;n<arraylistofservices.get(l).size();n++)
	    	{
	    	  try 
	    	  {  
	   	       servicetomatch= arraylistofservices.get(l);
	   	       
	   	       int[] countoccurence = new int[servicetomatch.size()]; 
	   	     //  double[][][] cellscore = new double[arraylistofservices.size()][SituationTermshere.size()][arraylistofservices.get(l).size()];
	   	      // System.out.println(servicetomatch.size());
	   	       servicetermtomatch=servicetomatch.get(n).toString(); 
	   	    	   
	   	       System.out.println(servicetermtomatch);
	    	  
	   	       Scanner fileScanner = new Scanner(new File("cyclone/"+"simplewtokens"+SituationTermshere.get(k) +".txt"));
	   	      // System.out.println(SituationTermshere.get(k));
	   	        
	   	       Pattern pattern =  Pattern.compile("\\b"+servicetermtomatch+"\\b",Pattern.CASE_INSENSITIVE);
	   	       Matcher matcher = null;
	   	       while(fileScanner.hasNextLine())
	   	       {
	   	    	 String line = fileScanner.nextLine();
	   	        
	   	         matcher = pattern.matcher(line);
	   	         if(matcher.find())
	   	    	 {    		  
	   	         countoccurence[n]= countoccurence[n]+1;
	   	    	   }
	   	 		 }
	   	    	 fileScanner.close();
	   	    	
	   	    	// servtermweight= (double) Allweights.get(l).get(n);
	   	    	 
	   			sittermweight= SituationTermshereWeights.get(k);
	   			 
	   			 System.out.println(countoccurence[n]);
	   			 q = q+countoccurence[n]*sittermweight;
	   			 //q = q+countoccurence[n];
	   			 
	   	            }
	   	           
	    	  catch (Exception e) 
			    {
					System.out.println("File opening fAILED.\n[" + e.getMessage() + "]");
				}
	    	
	    	       }	
	    	   
	       System.out.println("*************Situation term separation line");
	       }
	       System.out.println("#############Service term separation line");
	       System.out.println(q);
	       scoreofservices[l]=q;
	       q=0;
	      } 
	      
		
	}

}
