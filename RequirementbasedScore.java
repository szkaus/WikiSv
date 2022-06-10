package com.example.Pdf;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RequirementbasedScore 

{
	public static void  calculatemultipleservicescorereq()
	 
	 {   
		int k;
		double[] scoreofservices = new double[53];
		int n = 0;
		double q=0;

	    int m;

		int l;
	    String servicetermtomatch,requiredterm;
		ArrayList servicetomatch;
		double servtermweight;
		
		double sittermweight;
		ArrayList<ArrayList> arraylistofservices = new ArrayList<ArrayList>();
		
		//ArrayList<String> requiredunfoundservices = new ArrayList<String>();
		ArrayList<String> AUID1SmartGardenS  =new ArrayList<String>();
		ArrayList<String> VICMET13AirQualityS =new ArrayList<String>();
		 ArrayList<String> VICATOMIC01RadiationSensorS = new ArrayList<String>();
		 ArrayList<String>VICENV05WindSS = new ArrayList<String>();
		 ArrayList<String> VICENV06SoilMS = new ArrayList<String>();
		 ArrayList<String>VICENV07AtmosphericPS =new ArrayList<String>();
		 ArrayList<String> VICHIGHWAY22SpeedGunS =new ArrayList<String>();
		 ArrayList<String>VICENV17ThermalCameraS =new ArrayList<String>();
		 ArrayList<String>VICCountryFire01FireFighterDroneS =new ArrayList<String>();
		// ArrayList<String>VICENV10LiqSSC = new ArrayList<String>();
		 //ArrayList<String>VICRoad01SpeedgunS =new ArrayList<String>();
		 //ArrayList<String>SmartDroneInc01DroneImageS =new ArrayList<String>();
		 //ArrayList<String>RoboFarmInc01RoboShepherdS =new ArrayList<String>();
		 ArrayList<String>VICFireVolunt01FireTruckS =new ArrayList<String>();
		 ArrayList<String>VICROAD03VisibilitySensorS =new ArrayList<String>();
		 //ArrayList<String>VICROAD04WeightSensorS =new ArrayList<String>();
		 ArrayList<String>VICENV09FloodSS = new ArrayList<String>();
		 
		 ArrayList<String>VICENV11SmokeandTemperatureDS = new ArrayList<String>();	 
		 //https://www.iot-store.com.au/collections/sensors/products/weather-station-ws-3000-anemometer-wind-vane-pluviometer
		 ArrayList<String>VICMET11WeatherStationS = new ArrayList<String>();
		 //ArrayList<String>VICENV12WaterQualityS = new ArrayList<String>();
		 
		// ArrayList<String> VICHIGHWAY09SoundMeterS = new ArrayList<String>();	 
		 ArrayList<String> VICMET19LightningSensorS = new ArrayList<String>();
		 
		 ArrayList<String> VICHIGHWAY21SmartSpeakerS = new ArrayList<String>();
		 
		 ArrayList<String> VICHIGHWAY23RangeFinderS = new ArrayList<String>();
		 ArrayList<String> VICCountryFire03QuadCopterImagingS = new ArrayList<String>();
		 ArrayList<String>  VICOtwayParkAuth01SprinklerS = new ArrayList<String>();
		 
		 ArrayList<String> VicInfrastructure01CrackMeterS = new ArrayList<String>();
		 ArrayList<String> VicInfrastructure02GasleakageS= new ArrayList<String>();
		 ArrayList<String> VicMET25RainfallS = new ArrayList<String>();
		
		 
		
		 ArrayList<String> AUID1SmartLightS = new ArrayList<String>();
		 
		 ArrayList<String> AUID1AirConditionerS = new ArrayList<String>();
		 
		 
		
		 ArrayList<String> AUID1DysonAirPurifierS = new ArrayList<String>(); 
		 ArrayList<String>VICHIGHWAY20LightMeterS =new ArrayList<String>();
		 
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
		 //VICCG1RescueBoatS.add("lifeboats");
		 //VICCG1RescueBoatS.add("boat");
		 //VICCG1RescueBoatS.add("boats");
		 	 
		 //VICENV12WaterQualityS.add("water qualiti");
		 //VICENV12WaterQualityS.add("water pollut");
		 //VICENV12WaterQualityS.add("water");
		// VICENV12WaterQualityS.add("drinking");
		// VICENV12WaterQualityS.add("ice");
		 
		 VICMET11WeatherStationS.add("wind speed");
		 VICMET11WeatherStationS.add("wind direct");
		 VICMET11WeatherStationS.add("humid");
		 VICMET11WeatherStationS.add("temperatur");
		 VICMET11WeatherStationS.add("weather");
		 VICMET11WeatherStationS.add("weather station");
		 
		 VICENV11SmokeandTemperatureDS.add("smoke");
		 VICENV11SmokeandTemperatureDS.add("temperatur");
		 VICENV11SmokeandTemperatureDS.add("fire");
		 VICENV11SmokeandTemperatureDS.add("smoke and temperature");
		// VICENV11SmokeandTemperatureDS.add("fires");
		// VICENV11SmokeandTemperatureDS.add("flame");
		 	 
		 VICENV09FloodSS.add("water level");
		 VICENV09FloodSS.add("water flow rate");
		 VICENV09FloodSS.add("flood");
		 VICENV09FloodSS.add("inund");
		 VICENV09FloodSS.add("delug");
		 VICENV09FloodSS.add("alluvion");
		// VICENV09FloodSS.add("flooding");
		// VICENV09FloodSS.add("floods");
		 		 	 
		 VICENV05WindSS.add("wind speed");
		 VICENV05WindSS.add("wind direct");
		 VICENV05WindSS.add("wind");
		 VICENV05WindSS.add("wind speed and direction");
		// VICENV05WindSS.add("winds");
		// VICENV05WindSS.add("meteorological");
			     
		 VICENV06SoilMS.add("soil moistur");
		 VICENV06SoilMS.add("soil dryness");
		 VICENV06SoilMS.add("soil");
		// VICENV06SoilMS.add("soils");
		// VICENV06SoilMS.add("clay");
		 
		 VICENV07AtmosphericPS.add("atmospher pressur");
		// VICENV07AtmosphericPS.add("altitude");
		 VICENV07AtmosphericPS.add("atmospher");
		// VICENV07AtmosphericPS.add("mbar");
		// VICENV07AtmosphericPS.add("atmosphere");
		 
		// VICENV08TsunamiBS.add("ocean");
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
		 
		 VICFireVolunt01FireTruckS.add("firefight");
		 VICFireVolunt01FireTruckS.add("rescu");
		 VICFireVolunt01FireTruckS.add("fire");
		 VICFireVolunt01FireTruckS.add("fire truck");
		// VICFireVolunt01FireTruckS.add("fires");
		// VICFireVolunt01FireTruckS.add("flame");
		 
		 VICROAD03VisibilitySensorS.add("road visibl");
		 VICROAD03VisibilitySensorS.add("aerosol detect");
		 VICROAD03VisibilitySensorS.add("visibl");
		// VICROAD03VisibilitySensorS.add("fog");
		// VICROAD03VisibilitySensorS.add("distance");
		 
		// VICENV10SeismicSS.add("vibrat");
		// VICENV10SeismicSS.add("earthquak");
		// VICENV10SeismicSS.add("seismic");
		// VICENV10SeismicSS.add("earthquakes");
		// VICENV10SeismicSS.add("seismic");
		// VICENV10SeismicSS.add("geological");
		VICMET13AirQualityS.add("air qualiti");
		// VICMET13AirQualityS.add("air");
		// VICMET13AirQualityS.add("atmosphere");
		// VICMET13AirQualityS.add("atmospheric");
		 
		 VICENV17ThermalCameraS.add("thermal camera");
		 VICENV17ThermalCameraS.add("thermal imag");
		 VICENV17ThermalCameraS.add("thermal");
		// VICENV17ThermalCameraS.add("thermography");
		// VICENV17ThermalCameraS.add("Infrared");
		// VICENV17ThermalCameraS.add("emissivity");
		 
		 VICCountryFire01FireFighterDroneS.add("bushfir");
		 VICCountryFire01FireFighterDroneS.add("firefight");
		 VICCountryFire01FireFighterDroneS.add("fire");
		 VICCountryFire01FireFighterDroneS.add("firefight drone");
		// VICCountryFire01FireFighterDroneS.add("fires");
		// VICCountryFire01FireFighterDroneS.add("flame");
		 
		// VICENV10LiqSSC.add("soil liquefaction");
		// VICENV10LiqSSC.add("soil");
		// VICENV10LiqSSC.add("soils");
		// VICENV10LiqSSC.add("clay");
		// VICENV10LiqSSC.add("water");
		 
		 
		// VICSKY02SurveillanceDroneS.add ("law");
		// VICSKY02SurveillanceDroneS.add ("security");
		// VICSKY02SurveillanceDroneS.add ("government");
		 
		 
		 
		// VICATOMIC01RadiationSensorS.add ("decay");
		 // VICATOMIC01RadiationSensorS.add ("radioactive");
		 // VICATOMIC01RadiationSensorS.add("nuclides");
		// VICHIGHWAY05CCTVS.add("surveillance");
		//  VICHIGHWAY05CCTVS.add("camera");
		// VICHIGHWAY05CCTVS.add("cameras");
		 
		// VICHIGHWAY09SoundMeterS.add("sound level");
		// VICHIGHWAY09SoundMeterS.add("sound");
		 //notfound
		 
		 VICMET19LightningSensorS.add("thunder");
		 VICMET19LightningSensorS.add("lightn");
		// VICMET19LightningSensorS.add("thunderstorm");
		// VICMET19LightningSensorS.add("positive");
		// VICMET19LightningSensorS.add("cloud");
		 
		 
		 VICHIGHWAY20LightMeterS.add("light level");
		 VICHIGHWAY20LightMeterS.add("light");
		 VICHIGHWAY20LightMeterS.add("visibl light");
		 VICHIGHWAY20LightMeterS.add("visibl radiat");
		 
		 VICHIGHWAY21SmartSpeakerS.add("smart speaker");
		 VICHIGHWAY21SmartSpeakerS.add("loudspeak");
		 VICHIGHWAY21SmartSpeakerS.add("speak");
		 
		 VICHIGHWAY21SmartSpeakerS.add("speak unit");
		 VICHIGHWAY21SmartSpeakerS.add("loudspeak system");
		 VICHIGHWAY21SmartSpeakerS.add("speak system");
		 
		 VICHIGHWAY21SmartSpeakerS.add("announc");
		 VICHIGHWAY21SmartSpeakerS.add("proclam");
		 VICHIGHWAY21SmartSpeakerS.add("annunci");
		 
		 VICHIGHWAY21SmartSpeakerS.add("declar");

		// VICHIGHWAY21SmartSpeakerS.add("smart");
		// VICHIGHWAY21SmartSpeakerS.add("goolge");
		// VICHIGHWAY21SmartSpeakerS.add("amazon");
		// VICHIGHWAY21SmartSpeakerS.add("assistant");
		  VICHIGHWAY22SpeedGunS.add("vehicl speed");
		   VICHIGHWAY22SpeedGunS.add("speed gun");
		// VICHIGHWAY22SpeedGunS.add("frequency");
		 VICHIGHWAY23RangeFinderS.add("laser rang");
		 VICHIGHWAY23RangeFinderS.add("rang");
		// VICHIGHWAY23RangeFinderS.add("rangefinder");
		// VICHIGHWAY23RangeFinderS.add("rangefinders");
		// VICHIGHWAY23RangeFinderS.add("ranging");
		 
		 //http://www.flybycopters.servicebro.com/index.php?rt=product/product&product_id=156
		 VICCountryFire03QuadCopterImagingS.add("thermal imag");
		 VICCountryFire03QuadCopterImagingS.add("search");
		 VICCountryFire03QuadCopterImagingS.add("rescu");
		 VICCountryFire03QuadCopterImagingS.add("imag quad copter");
		 
		 //https://widgetbrain.com/use-iot-save-home-bushfires/
		 //http://platypussprinkler.com/c/public-asset-bushfire-fire-protection-sprinkler-system
		 VICOtwayParkAuth01SprinklerS.add("bushfir"); //occured 8 times in the webpage
		 VICOtwayParkAuth01SprinklerS.add("fire");  //occured 17 times in the webpage
		 VICOtwayParkAuth01SprinklerS.add("wildfir");
		 VICOtwayParkAuth01SprinklerS.add("fire sprinkler");
		 
		 //https://www.vernier.com/products/sensors/sal-bta/
		
		 //http://www.ecosearch.info/sites/default/files/prodotto_scheda_tecnica/SU-100manual.pdf
		
        //https://www.pcte.com.au/crack-meter
		 
		 VicInfrastructure01CrackMeterS.add("crack");
		 VicInfrastructure01CrackMeterS.add("concret structur");
		 
       //jolpi labs
		 VicInfrastructure02GasleakageS.add("ga leakag");
		 VicInfrastructure02GasleakageS.add("ga");
		 VicInfrastructure02GasleakageS.add("fire");
		 
		 //
		 
		 VICATOMIC01RadiationSensorS.add("radiat");
		 VICATOMIC01RadiationSensorS.add("nuclear radiat");
		 
		 VicMET25RainfallS.add("rainfal");
		 VicMET25RainfallS.add("rain");
		 
		 //http://geonor.com/live/products/weather-instruments/shm-30-31-laser-snow-depth-sensor/
		 
		
		 
		 //the following services are from iotlineup.com
		 
		// AUID1AmazonEchoS.add("voic control");
		// AUID1AmazonEchoS.add("voic recognit");
		// AUID1AmazonEchoS.add("plai music"); //think about stemmmer>play
		// AUID1AmazonEchoS.add("answer question");
		// AUID1AmazonEchoS.add("set alarm");
		// AUID1AmazonEchoS.add("smart speaker");
	
		 
		 
		 
		 //https://iot.do/devices/mr-coffee-smart-coffeemaker
		 
		
		 
		 //https://smartmat.com/about/
		 
		
		 
		 //https://www2.meethue.com/en-au/bulbs
		 
		 AUID1SmartLightS.add("dim");
		 AUID1SmartLightS.add("light recip");
		 AUID1SmartLightS.add("ambianc control");
		 AUID1SmartLightS.add("smart light");
		 
		 //https://nest.com/smoke-co-alarm/overview/
		
		
		 
		 //https://www.hydrawise.com/
		 
		 
		 
		 //https://www.withings.com/us/en/blood-pressure-monitor
		 
		 
		 
		// https://www.fitbit.com/shop/adidas?color=blue-gray
		 
		 
		 
		 //https://www.ecobee.com/
		 
		 
		 
		 
		// https://www.chamberlain.com/durable-chain-drive-wi-fi-garage-door-opener-with-battery-backup/p/C870
			 
		
		 
		 //https://www.amazon.com/Edyn-EDYN-001-Garden-Sensor-Yellow/dp/B019QWCUBY
		 
		 
		 
		// https://www.ambiclimate.com/en/features/
		 
		 AUID1AirConditionerS.add("air condit");
		 AUID1AirConditionerS.add("temperatur");
		 AUID1AirConditionerS.add("humid");
		 AUID1AirConditionerS.add("sunlight");
		 AUID1AirConditionerS.add("air condit perform");
		 
		// https://getnotion.com/pages/water-leak-detector
		 
		
		//https://www.kickstarter.com/projects/28240313/kepler-your-best-home-gas-detector
		 
		// AUID1GasandCarbonmonoxideDetectorS.add("ga");
		// AUID1GasandCarbonmonoxideDetectorS.add("carbon monoxid");
		// AUID1GasandCarbonmonoxideDetectorS.add("ga and carbon monoxid");
		
		 //https://www.bitbrain.com/equipment/products/neckly
		 
		 
		 
		 //https://www.dyson.com/purifiers/dyson-pure-cool-features.html
		 

		 AUID1DysonAirPurifierS.add("air purifi");
		 AUID1DysonAirPurifierS.add("pollen");
		 AUID1DysonAirPurifierS.add("dust");
		 AUID1DysonAirPurifierS.add("smoke");
		 AUID1DysonAirPurifierS.add("bacteria");
		 AUID1DysonAirPurifierS.add("allergen");
		 AUID1DysonAirPurifierS.add("nitrogen di oxid");
		 AUID1DysonAirPurifierS.add("volatil organ compound");
		 
		 AUID1SmartGardenS.add("soil nutrit");
		 AUID1SmartGardenS.add("soil moistur");
		 AUID1SmartGardenS.add("garden diagnost");
		 AUID1SmartGardenS.add("garden");
		 
		/*
		 VICROAD04WeightSensorS.add("Weight in Motion");
		 VICROAD04WeightSensorS.add("Vehicle Weight");
		 VICROAD04WeightSensorS.add("Weight");
		 VICROAD04WeightSensorS.add("transport");
		*/  
		 arraylistofservices.add(VICENV05WindSS);
		 arraylistofservices.add(VICENV06SoilMS);
		 arraylistofservices.add(VICENV07AtmosphericPS);
		
		 //arraylistofservices.add(VICRoad01SpeedgunS);
		// arraylistofservices.add(SmartDroneInc01DroneImageS);
		 //arraylistofservices.add(RoboFarmInc01RoboShepherdS);
		 arraylistofservices.add(VICFireVolunt01FireTruckS);
		 arraylistofservices.add(VICROAD03VisibilitySensorS);
		// arraylistofservices.add(VICROAD04WeightSensorS);
		 arraylistofservices.add(VICENV09FloodSS);
		 //arraylistofservices.add(VICENV10SeismicSS);
		 arraylistofservices.add(VICENV11SmokeandTemperatureDS);
		 arraylistofservices.add(VICMET11WeatherStationS);
		 //arraylistofservices.add(VICENV12WaterQualityS);
		 
		
		 arraylistofservices.add(VICENV17ThermalCameraS);
		 arraylistofservices.add(VICCountryFire01FireFighterDroneS);
		// arraylistofservices.add(VICENV10LiqSSC);
		 



		// arraylistofservices.add(VICHIGHWAY09SoundMeterS);
		 arraylistofservices.add(VICMET19LightningSensorS);
		
		 arraylistofservices.add(VICHIGHWAY21SmartSpeakerS);
		 arraylistofservices.add(VICHIGHWAY23RangeFinderS);
		 
		 arraylistofservices.add(VICCountryFire03QuadCopterImagingS);
		 arraylistofservices.add(VICOtwayParkAuth01SprinklerS);

		
		 arraylistofservices.add(VicInfrastructure01CrackMeterS);
		 arraylistofservices.add(VicInfrastructure02GasleakageS);
		 arraylistofservices.add(VicMET25RainfallS);
		 
		 //arraylistofservices.add(AUID1AmazonEchoS);
		 		 
		 arraylistofservices.add(AUID1SmartLightS);
	
		
		 arraylistofservices.add(AUID1AirConditionerS);
	
		// arraylistofservices.add(AUID1GasandCarbonmonoxideDetectorS);
		
		 arraylistofservices.add(AUID1DysonAirPurifierS);
		 arraylistofservices.add(VICATOMIC01RadiationSensorS);
		 arraylistofservices.add(VICHIGHWAY20LightMeterS);
		 arraylistofservices.add(VICHIGHWAY22SpeedGunS);
		 arraylistofservices.add(VICMET13AirQualityS);
		 arraylistofservices.add(AUID1SmartGardenS);
		 
	     
	     ArrayList<String> RequiredServiceTerms = new ArrayList<String>()
			{{add("firetruck"); add("health");add("air pollut");
			  add("locat"); add("camera"); add("fire sprinkler");
			  add("smart speaker");add("firefight drone");}};  
			  
	      Map<String, String> roottofullrequiredtermmap = new HashMap<>();
	      
	      roottofullrequiredtermmap.put("firetruck", "firetruck");
	      roottofullrequiredtermmap.put("health", "health");
	      roottofullrequiredtermmap.put("air pollut", "air pollution");
	      roottofullrequiredtermmap.put("camera", "camera");
	      roottofullrequiredtermmap.put("locat","location");
	      roottofullrequiredtermmap.put("fire sprinkler", "fire sprinkler");
	      roottofullrequiredtermmap.put("smart speaker", "smart speaker");
	      roottofullrequiredtermmap.put("firefight drone", "firefighting drone");
	      
			  
		/*	
	      SituationTermshereWeights.add(1.0);
	      SituationTermshereWeights.add(0.07591501846233886);
	      SituationTermshereWeights.add(0.42353151308260895);
	      SituationTermshereWeights.add(0.0);
	      SituationTermshereWeights.add(0.013912972149709615);
	      SituationTermshereWeights.add(0.0);
	     
	     /* 
	      SituationTermshereWeights.add(1.0);
	      SituationTermshereWeights.add(0.07642259222444658);
	      SituationTermshereWeights.add(0.42535948736831236);
	      SituationTermshereWeights.add(0.0);
	      SituationTermshereWeights.add(0.01377812018371235);
	      SituationTermshereWeights.add(0.0);
	     
	     */
	    for (k=0;k<RequiredServiceTerms.size();k++)   
		  {  
	    	requiredterm= RequiredServiceTerms.get(k);
	    	System.out.println("###"+requiredterm);
	     for (l=0;l<arraylistofservices.size();l++)
	      {    		    	
	    	for(n=0;n<arraylistofservices.get(l).size();n++)
	    	{
	    	  try 
	    	  {  
	   	       servicetomatch= arraylistofservices.get(l);
	   	       
	   	      // int[] countoccurence = new int[servicetomatch.size()]; 
	   	     //  double[][][] cellscore = new double[arraylistofservices.size()][SituationTermshere.size()][arraylistofservices.get(l).size()];
	   	      // System.out.println(servicetomatch.size());
	   	       servicetermtomatch=servicetomatch.get(n).toString(); 
	   	    
	   	      // System.out.println(servicetermtomatch);
	    	  
               
	   	      // System.out.println(SituationTermshere.get(k));
	   	        
	   	       //Pattern pattern =  Pattern.compile("\\b"+servicetermtomatch+"\\b",Pattern.CASE_INSENSITIVE);
	   	       //Matcher matcher = null;
	   	      
	   	      // String line = requiredterm;
	   	        
	   	     //  matcher = pattern.matcher(line);
	   	    if(servicetermtomatch.replaceAll("\\s+","").equalsIgnoreCase(requiredterm.replaceAll("\\s+","")))
	   	       
	   	    	 {    		  
	   	         System.out.println("The service given below is found!!!!!!!");
	   	         System.out.println(requiredterm);
	   	         roottofullrequiredtermmap.remove(requiredterm);
	   	         //System.out.println(servicetomatch);
	   	         RequiredServiceTerms.remove(k);
	   	    	   }
	   	    else
	   	          {
	   	    	 //requiredunfoundservices.add(requiredterm);
	   	    	 //System.out.println(requiredterm);
	   	           }	
	   	    	
	   	    	// servtermweight= (double) Allweights.get(l).get(n);
	   	    	 
	   			// sittermweight= SituationTermshereWeights.get(k);
	   			 
	   			// System.out.println(countoccurence[n]);
	   			//q = q+countoccurence[n]*sittermweight;
	   			 // q = q+countoccurence[n];
	   			 
	   	            }
	   	           
	    	  catch (Exception e) 
			    {
					System.out.println("File opening fAILED.\n[" + e.getMessage() + "]");
				}
	    	
	    	       }	
	    	   
	      // System.out.println("*************Situation term separation line");
	       }
	     //  System.out.println("#############Service term separation line");
	     //  System.out.println(q);
	      // scoreofservices[l]=q;
	      // q=0;
	      } 
	         
	    WikiforRequiredServices.wikiforrequiredservices(RequiredServiceTerms,roottofullrequiredtermmap);	 
	    	  
		    
	 }
	     	

}
