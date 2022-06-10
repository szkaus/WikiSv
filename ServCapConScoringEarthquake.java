package com.example.Pdf;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ServCapConScoringEarthquake 
{
	 static int occurenceinsittermfile;
		public static int findTerm(String term, String textWiki) {
			//boolean result=false;
			/*String[] terms=term.split(" ");
			
			for(int index=0;index<terms.length;index++) 
			{
				if(!textWiki.equalsIgnoreCase(terms[index])) {
					return false;
				}
			}
			
			return true;*/
			int numberOfOCC=0;
			
			String [] text=textWiki.split("\n");
			String [] terms =term.split(" ");
			boolean found;
			//System.out.println("length="+text.length);
			if(termIndex(terms[0], text, 0)==-1) {
				return 0;
			}
			int index=0;
			while(index<text.length) {
				int trmIndex =termIndex(terms[0], text, index);
				//System.out.println("index = "+trmIndex);
				if(trmIndex==-1) {
					break;
				}
				index = trmIndex+1;
				found=true;
				for(int tIndex=1;tIndex<terms.length && trmIndex+1<text.length;tIndex++) {
					if(!compareTerm(terms[tIndex], text[++trmIndex])) {
						found=false;
						break;
					}
				}
				if(found) {
					numberOfOCC++;
				}
			}
			return numberOfOCC;
		}
		public static int termIndex(String term, String [] text, int startIndex) {
			
			for(int index=startIndex;index<text.length;index++) {
				if(compareTerm(term, text[index])) {
					return index;
				}
			}
			
			return -1;
		}
		public static boolean compareTerm(String term, String text) {
			if(term.equalsIgnoreCase(text)) {
				return true;
			}
			return false;
		}
		/*
		public static Map<String, Integer> termOccurences(String term, String textWiki){
			Map<String, Integer> resultMap=new HashMap<String, Integer>();
			String[] terms=term.split(" ");
			for(int index=0;index<terms.length;index++) 
			{
				
			}
			return resultMap;
			
		}*/
		
		
		
		static double sittermweight;
		static double[] countoccurence;
		
		public static void  calculatemultipleservicescoreearthquake()
		 
		 { 
			int k;
			double[] scoreofservices = new double[60];
			int n = 0;
			double q=0;
		    int m;
			int l;
		    String servicetermtomatch;
			ArrayList<ServtermnameandWeight> servicetomatch;

			ArrayList<ArrayList<ServtermnameandWeight>> arraylistofservices = new ArrayList<ArrayList<ServtermnameandWeight>>();

			 ArrayList<ServtermnameandWeight>VICENV05WindSS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICENV06SoilMS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight>VICENV07AtmosphericPS =new ArrayList<ServtermnameandWeight>();
			 
			 ArrayList<ServtermnameandWeight>VICMET13AirQualityS =new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight>VICENV17ThermalCameraS =new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight>VICCountryFire01FireFighterDroneS =new ArrayList<ServtermnameandWeight>();
			
			 ArrayList<ServtermnameandWeight>VICENV08TsunamiBS =new ArrayList<ServtermnameandWeight>();

			 ArrayList<ServtermnameandWeight>VICFireVolunt01FireTruckS =new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight>VICROAD03VisibilitySensorS =new ArrayList<ServtermnameandWeight>();
			
			 ArrayList<ServtermnameandWeight>VICENV09FloodSS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight>VICENV10SeismicSS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight>VICENV11SmokeandTemperatureDS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight>VICCG1RescueBoatS = new ArrayList<ServtermnameandWeight>();
			 	 
			 //https://www.iot-store.com.au/collections/sensors/products/weather-station-ws-3000-anemometer-wind-vane-pluviometer
			 ArrayList<ServtermnameandWeight>VICMET11WeatherStationS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight>VICENV12WaterQualityS = new ArrayList<ServtermnameandWeight>();
			 
			 ArrayList<ServtermnameandWeight> VICSKY02SurveillanceDroneS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICATOMIC01RadiationSensorS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICHIGHWAY05CCTVS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICHIGHWAY09SoundMeterS = new ArrayList<ServtermnameandWeight>();	 
			 ArrayList<ServtermnameandWeight> VICMET19LightningSensorS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICHIGHWAY20LightMeterS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICHIGHWAY21SmartSpeakerS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICHIGHWAY22SpeedGunS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICHIGHWAY23RangeFinderS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICCountryFire03QuadCopterImagingS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight>  VICOtwayParkAuth01SprinklerS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICEnv23SalinitySensorS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VICAstroPhy01UVSensorS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VicInfrastructure01CrackMeterS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VicInfrastructure02GasleakageS= new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VicMET25RainfallS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> VicMET26SnowDepthS = new ArrayList<ServtermnameandWeight>();
			 
			 ArrayList<ServtermnameandWeight>  AUID1AmazonEchoS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1NestCameraS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1SmartCoffemakerS = new ArrayList<ServtermnameandWeight>();
			// ArrayList<ServtermnameandWeight> AUID1SmartYogaMatS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1SmartLightS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1NestProtectS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1HydrawiseS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1JuneOvenS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1VideoDoorbellS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1BPMS = new ArrayList<ServtermnameandWeight>();
			// ArrayList<ServtermnameandWeight> FitbitVersa = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1FitbitVersaS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1SmartLockS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1SmartThermostatS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1SmartGarageDoorS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1SmartGardenS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1BabyMonitorS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1AirConditionerS = new ArrayList<ServtermnameandWeight>();
			 ArrayList<ServtermnameandWeight> AUID1WaterLeakS = new ArrayList<ServtermnameandWeight>();
			 //ArrayList<ServtermnameandWeight> AUID1GasandCarbonmonoxideDetectorS = new ArrayList<ServtermnameandWeight>(); 
			 ArrayList<ServtermnameandWeight> AUID1IndoorLocS = new ArrayList<ServtermnameandWeight>(); 
			 ArrayList<ServtermnameandWeight> AUID1DysonAirPurifierS = new ArrayList<ServtermnameandWeight>(); 

			
			 ArrayList<Double>SituationTermshereWeights = new ArrayList<Double>();

			

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
		     //https://contest.techbriefs.com/2016/entries/machinery-automation-robotics/6342
			 
		     ServtermnameandWeight sw1 = new ServtermnameandWeight("sea rescu",1.0);
		     ServtermnameandWeight sw2 = new ServtermnameandWeight("rescue boat",1.0);
		     ServtermnameandWeight sw3 = new ServtermnameandWeight("boat",0.389);
		     
		     VICCG1RescueBoatS.add(sw1);
			 VICCG1RescueBoatS.add(sw2);
			 VICCG1RescueBoatS.add(sw3);
			 
			 ServtermnameandWeight sw4 = new ServtermnameandWeight("water qualiti",1.0);
		     ServtermnameandWeight sw5 = new ServtermnameandWeight("water pollut",1.0);
		     ServtermnameandWeight sw6 = new ServtermnameandWeight("water",0.865);
		     ServtermnameandWeight sw7 = new ServtermnameandWeight("H2O",0.865);
		     
		     VICENV12WaterQualityS.add(sw4);
		     VICENV12WaterQualityS.add(sw5);
		     VICENV12WaterQualityS.add(sw6);
		     VICENV12WaterQualityS.add(sw7);
		     
		     ServtermnameandWeight sw8 = new ServtermnameandWeight("smoke",1.0);
		     ServtermnameandWeight sw9 = new ServtermnameandWeight("temperature",1.0);
		     ServtermnameandWeight sw10 = new ServtermnameandWeight("fire",0.299);
		     
		       VICENV11SmokeandTemperatureDS.add(sw8);
		       VICENV11SmokeandTemperatureDS.add(sw9);
		       VICENV11SmokeandTemperatureDS.add(sw10);
		     

		     ServtermnameandWeight sw11 = new ServtermnameandWeight("water level",1.0);
		     ServtermnameandWeight sw12 = new ServtermnameandWeight("water flow rate",1.0);
		     ServtermnameandWeight sw13 = new ServtermnameandWeight("flood",0.066);
		     ServtermnameandWeight sw14 = new ServtermnameandWeight("inund",0.066);
		     ServtermnameandWeight sw15 = new ServtermnameandWeight("delug",0.066);
		     ServtermnameandWeight sw16 = new ServtermnameandWeight("alluvion",0.066);
			 
		     
		     VICENV09FloodSS.add(sw11);
		     VICENV09FloodSS.add(sw12);
		     VICENV09FloodSS.add(sw13);
		     VICENV09FloodSS.add(sw14);
		     VICENV09FloodSS.add(sw15);
		     VICENV09FloodSS.add(sw16);
		     
		     ServtermnameandWeight sw17 = new ServtermnameandWeight("wind speed",1.0);
		     ServtermnameandWeight sw18 = new ServtermnameandWeight("wind direction",1.0);
		     ServtermnameandWeight sw19 = new ServtermnameandWeight("wind",0.794);
		     ServtermnameandWeight sw20 = new ServtermnameandWeight("air current",0.794);
		     ServtermnameandWeight sw21 = new ServtermnameandWeight("current of air",0.794);
		     
		     
		     VICENV05WindSS.add(sw17);
		     VICENV05WindSS.add(sw18);
		     VICENV05WindSS.add(sw19);
		     VICENV05WindSS.add(sw20);
		     VICENV05WindSS.add(sw21);
		     
		     ServtermnameandWeight sw22 = new ServtermnameandWeight("soil moistur",1.0);
		     ServtermnameandWeight sw23 = new ServtermnameandWeight("soil dryness",1.0);
		     ServtermnameandWeight sw24 = new ServtermnameandWeight("soil",1.0);
		     ServtermnameandWeight sw25 = new ServtermnameandWeight("dirt",1.0);
		     ServtermnameandWeight sw26 = new ServtermnameandWeight("filth",1.0);
		     ServtermnameandWeight sw27 = new ServtermnameandWeight("grime",1.0);
		     ServtermnameandWeight sw28 = new ServtermnameandWeight("stain",1.0);
		     ServtermnameandWeight sw29 = new ServtermnameandWeight("greas",1.0);
		     ServtermnameandWeight sw30 = new ServtermnameandWeight("grung",1.0);
		     
		     
		     VICENV06SoilMS.add(sw22);
		     VICENV06SoilMS.add(sw23);
		     VICENV06SoilMS.add(sw24);
		     VICENV06SoilMS.add(sw25);
		     VICENV06SoilMS.add(sw26);
		     VICENV06SoilMS.add(sw27);
		     VICENV06SoilMS.add(sw28);
		     VICENV06SoilMS.add(sw29);
		     VICENV06SoilMS.add(sw30);
		     
		     
		     ServtermnameandWeight sw31 = new ServtermnameandWeight("atmospher pressure",1.0);
		     ServtermnameandWeight sw32 = new ServtermnameandWeight("atmospher", 0.533);
		     ServtermnameandWeight sw33 = new ServtermnameandWeight("ambianc",0.533);
		     ServtermnameandWeight sw34 = new ServtermnameandWeight("ambienc",0.533);
		    
		     VICENV07AtmosphericPS.add(sw31);
		     VICENV07AtmosphericPS.add(sw32);
		     VICENV07AtmosphericPS.add(sw33);
		     VICENV07AtmosphericPS.add(sw34);
		     
		     ServtermnameandWeight sw35 = new ServtermnameandWeight("tsunami",1.0);
		     ServtermnameandWeight sw36 = new ServtermnameandWeight("tsunami buoy",1.0);
		     ServtermnameandWeight sw37 = new ServtermnameandWeight("earthquak",0.312);
		     
		     ServtermnameandWeight sw38 = new ServtermnameandWeight("quak",0.312);
		     ServtermnameandWeight sw39 = new ServtermnameandWeight("temblor",0.312);
		     ServtermnameandWeight sw40 = new ServtermnameandWeight("seism",0.312);
		     
		     
		     VICENV08TsunamiBS.add(sw35);
		     VICENV08TsunamiBS.add(sw36);
		     VICENV08TsunamiBS.add(sw37);
		     VICENV08TsunamiBS.add(sw38);
		     VICENV08TsunamiBS.add(sw39);
		     VICENV08TsunamiBS.add(sw40);
		     
		     ServtermnameandWeight sw41 = new ServtermnameandWeight("firefight",1.0);
		     ServtermnameandWeight sw42 = new ServtermnameandWeight("fire truck",1.0);
		     ServtermnameandWeight sw43 = new ServtermnameandWeight("rescu",1.0);
		     ServtermnameandWeight sw44 = new ServtermnameandWeight("fire",0.833);
		     ServtermnameandWeight sw45 = new ServtermnameandWeight("deliver",1.0);
		     ServtermnameandWeight sw46 = new ServtermnameandWeight("save",1.0);
		     	     
		     VICFireVolunt01FireTruckS.add(sw41);
		     VICFireVolunt01FireTruckS.add(sw42);
		     VICFireVolunt01FireTruckS.add(sw43);
		     VICFireVolunt01FireTruckS.add(sw44);
		     VICFireVolunt01FireTruckS.add(sw45);
		     VICFireVolunt01FireTruckS.add(sw46);
		     
		     ServtermnameandWeight sw47 = new ServtermnameandWeight("road visibl",1.0);
		     ServtermnameandWeight sw48 = new ServtermnameandWeight("aerosol detect",1.0);
		     ServtermnameandWeight sw49 = new ServtermnameandWeight("visibl",1.0);
		     
		     
		     VICROAD03VisibilitySensorS.add(sw47);
		     VICROAD03VisibilitySensorS.add(sw48);
		     VICROAD03VisibilitySensorS.add(sw49);
		     
		     ServtermnameandWeight sw50 = new ServtermnameandWeight("vibrat",1.0);
		     ServtermnameandWeight sw51 = new ServtermnameandWeight("quiver",1.0);
		     ServtermnameandWeight sw52 = new ServtermnameandWeight("earthquak",1.0);
		     
		     ServtermnameandWeight sw53 = new ServtermnameandWeight("quak",1.0);
		     ServtermnameandWeight sw54 = new ServtermnameandWeight("temblor",1.0);
		     ServtermnameandWeight sw55 = new ServtermnameandWeight("seism",1.0);
		     ServtermnameandWeight sw56 = new ServtermnameandWeight("seismic",0.627);
		     
		     VICENV10SeismicSS.add(sw50);
			 VICENV10SeismicSS.add(sw51);
			 VICENV10SeismicSS.add(sw52);
			 VICENV10SeismicSS.add(sw53);
			 VICENV10SeismicSS.add(sw54);
			 VICENV10SeismicSS.add(sw55);
			 VICENV10SeismicSS.add(sw56);
		     
			 ServtermnameandWeight sw57 = new ServtermnameandWeight("air qualiti",1.0);
		     
			 VICMET13AirQualityS.add(sw57);
			 
			 ServtermnameandWeight sw58 = new ServtermnameandWeight("thermal camera",1.0);
		     ServtermnameandWeight sw59 = new ServtermnameandWeight("thermal imag",1.0);
		     ServtermnameandWeight sw60 = new ServtermnameandWeight("thermal",0.313);
		     
		     VICENV17ThermalCameraS.add(sw58);
		     VICENV17ThermalCameraS.add(sw59);
		     VICENV17ThermalCameraS.add(sw60);
		     
		     ServtermnameandWeight sw61 = new ServtermnameandWeight("firefight",1.0);
		     ServtermnameandWeight sw62 = new ServtermnameandWeight("fire",0.833);
		     ServtermnameandWeight sw63 = new ServtermnameandWeight("firefight drone",1.0);
		     
		     VICCountryFire01FireFighterDroneS.add(sw61);
		     VICCountryFire01FireFighterDroneS.add(sw62);
		     VICCountryFire01FireFighterDroneS.add(sw63);
		     
		     ServtermnameandWeight sw64 = new ServtermnameandWeight("aerial surveil",1.0);
		     ServtermnameandWeight sw65 = new ServtermnameandWeight("surveil",1.0);
		     ServtermnameandWeight sw66 = new ServtermnameandWeight("surveillance drone",1.0);
		     
		     VICSKY02SurveillanceDroneS.add(sw64);
		     VICSKY02SurveillanceDroneS.add(sw65);
		     VICSKY02SurveillanceDroneS.add(sw66);
		     
		     ServtermnameandWeight sw67 = new ServtermnameandWeight("radiat",1.0);
		     ServtermnameandWeight sw68 = new ServtermnameandWeight("nuclear radiat",1.0);
		     
		     VICATOMIC01RadiationSensorS.add(sw67);
		     VICATOMIC01RadiationSensorS.add(sw68);
		     
		     ServtermnameandWeight sw69 = new ServtermnameandWeight("sound level",1.0);
		     ServtermnameandWeight sw70 = new ServtermnameandWeight("sound",0.718);
		     
		     VICHIGHWAY09SoundMeterS.add(sw69);
		     VICHIGHWAY09SoundMeterS.add(sw70);
		     
		     ServtermnameandWeight sw71 = new ServtermnameandWeight("light level",1.0);
		     ServtermnameandWeight sw72 = new ServtermnameandWeight("light",1.0);
		     ServtermnameandWeight sw73 = new ServtermnameandWeight("visibl light",1.0);
		     ServtermnameandWeight sw74 = new ServtermnameandWeight("visibl radiat",1.0);
		    
		     VICHIGHWAY20LightMeterS.add(sw71);
		     VICHIGHWAY20LightMeterS.add(sw72);
		     VICHIGHWAY20LightMeterS.add(sw73);
		     VICHIGHWAY20LightMeterS.add(sw74);
		     
		     ServtermnameandWeight sw75 = new ServtermnameandWeight("smart speaker",1.0);
		     ServtermnameandWeight sw76 = new ServtermnameandWeight("loudspeak",1.0);
		     ServtermnameandWeight sw77 = new ServtermnameandWeight("speak",1.0);
		     ServtermnameandWeight sw78 = new ServtermnameandWeight("speak unit",1.0);
		     
		     ServtermnameandWeight sw79 = new ServtermnameandWeight("loudspeak system",1.0);
		     ServtermnameandWeight sw80 = new ServtermnameandWeight("speak system",1.0);
		     ServtermnameandWeight sw81 = new ServtermnameandWeight("announc",1.0);
		     ServtermnameandWeight sw82 = new ServtermnameandWeight("proclam",1.0);
		     
		     ServtermnameandWeight sw83 = new ServtermnameandWeight("annunci ",1.0);
		     ServtermnameandWeight sw84 = new ServtermnameandWeight("declar",1.0);
		     
		     VICHIGHWAY21SmartSpeakerS.add(sw75);
		     VICHIGHWAY21SmartSpeakerS.add(sw76);
		     VICHIGHWAY21SmartSpeakerS.add(sw77);
		     VICHIGHWAY21SmartSpeakerS.add(sw78);
		     VICHIGHWAY21SmartSpeakerS.add(sw79);
		     VICHIGHWAY21SmartSpeakerS.add(sw80);
		     VICHIGHWAY21SmartSpeakerS.add(sw81);
		     VICHIGHWAY21SmartSpeakerS.add(sw82);
		     VICHIGHWAY21SmartSpeakerS.add(sw83);
		     VICHIGHWAY21SmartSpeakerS.add(sw84);
		     
		     ServtermnameandWeight sw85 = new ServtermnameandWeight("thermal imag",1.0);
		     ServtermnameandWeight sw86 = new ServtermnameandWeight("search",1.0);
		     ServtermnameandWeight sw87 = new ServtermnameandWeight("rescu",1.0);
		     ServtermnameandWeight sw88 = new ServtermnameandWeight("deliver",1.0);
		     
		     ServtermnameandWeight sw89 = new ServtermnameandWeight("save",1.0);
		     ServtermnameandWeight sw90 = new ServtermnameandWeight("imag quad copter",1.0);
		  
		     VICCountryFire03QuadCopterImagingS.add(sw85);
		     VICCountryFire03QuadCopterImagingS.add(sw86);
		     VICCountryFire03QuadCopterImagingS.add(sw87);
		     VICCountryFire03QuadCopterImagingS.add(sw88);
		     VICCountryFire03QuadCopterImagingS.add(sw89);
		     VICCountryFire03QuadCopterImagingS.add(sw90);
		     
		     ServtermnameandWeight sw91 = new ServtermnameandWeight("bushfir",1.0);
		     ServtermnameandWeight sw92 = new ServtermnameandWeight("fire",0.678);
		     ServtermnameandWeight sw93 = new ServtermnameandWeight("wildfir",1.0);
		     ServtermnameandWeight sw94 = new ServtermnameandWeight("fire sprinkler",1.0);
		     
		     VICOtwayParkAuth01SprinklerS.add(sw91);
		     VICOtwayParkAuth01SprinklerS.add(sw92);
		     VICOtwayParkAuth01SprinklerS.add(sw93);
		     VICOtwayParkAuth01SprinklerS.add(sw94);
		     
		     
		     
		     
		     ServtermnameandWeight sw99 = new ServtermnameandWeight("water salin",1.0);
		     ServtermnameandWeight sw100 = new ServtermnameandWeight("salin",1.0);
		     ServtermnameandWeight sw101 = new ServtermnameandWeight("salti",1.0);
		     ServtermnameandWeight sw102 = new ServtermnameandWeight("salt",1.0);
		     
		     VICEnv23SalinitySensorS.add(sw99);
		     VICEnv23SalinitySensorS.add(sw100);
		     VICEnv23SalinitySensorS.add(sw101);
		     VICEnv23SalinitySensorS.add(sw102);
		     
		     ServtermnameandWeight sw103 = new ServtermnameandWeight("ultra violet radiat",1.0);
		     ServtermnameandWeight sw104 = new ServtermnameandWeight("ultra violet rai",1.0);
		     
		     VICAstroPhy01UVSensorS.add(sw103);
		     VICAstroPhy01UVSensorS.add(sw104);
		     
		     ServtermnameandWeight sw105 = new ServtermnameandWeight("crack",1.0);
		     ServtermnameandWeight sw106 = new ServtermnameandWeight("cleft",1.0);
		     
		     ServtermnameandWeight sw107 = new ServtermnameandWeight("crevic",1.0);
		     ServtermnameandWeight sw108 = new ServtermnameandWeight("fissur",1.0);
		     
		     ServtermnameandWeight sw109 = new ServtermnameandWeight("scissur",1.0);
		     ServtermnameandWeight sw110 = new ServtermnameandWeight("concret structur",1.0);

		     VicInfrastructure01CrackMeterS.add(sw105);
		     VicInfrastructure01CrackMeterS.add(sw106);
		     VicInfrastructure01CrackMeterS.add(sw107);
		     VicInfrastructure01CrackMeterS.add(sw108);
		     VicInfrastructure01CrackMeterS.add(sw109);
		     VicInfrastructure01CrackMeterS.add(sw110);
		     
		     ServtermnameandWeight sw111 = new ServtermnameandWeight("ga leakag",1.0);
		     ServtermnameandWeight sw112 = new ServtermnameandWeight("ga",1.0);
		     
		     ServtermnameandWeight sw113 = new ServtermnameandWeight("gaseou state",1.0);
		     ServtermnameandWeight sw114 = new ServtermnameandWeight("fire",0.069);
		     
		     VicInfrastructure02GasleakageS.add(sw111);
		     VicInfrastructure02GasleakageS.add(sw112);
		     VicInfrastructure02GasleakageS.add(sw113);
		     VicInfrastructure02GasleakageS.add(sw114);
		     
		     ServtermnameandWeight sw115 = new ServtermnameandWeight("rainfal",1.0);
		     ServtermnameandWeight sw116 = new ServtermnameandWeight("rain",1.0);
		     
		     VicMET25RainfallS.add(sw115);
		     VicMET25RainfallS.add(sw116);
		     
		     ServtermnameandWeight sw117 = new ServtermnameandWeight("snow depth",1.0);
		     ServtermnameandWeight sw118 = new ServtermnameandWeight("snow height",1.0);
		     
		     ServtermnameandWeight sw119 = new ServtermnameandWeight("snowfal",1.0);
		     ServtermnameandWeight sw120 = new ServtermnameandWeight("snow",1.0);
		     
		     VicMET26SnowDepthS.add(sw117);
		     VicMET26SnowDepthS.add(sw118);
		     VicMET26SnowDepthS.add(sw119);
		     VicMET26SnowDepthS.add(sw120);
		     
		     ServtermnameandWeight sw121 = new ServtermnameandWeight("voic control",1.0);
		     ServtermnameandWeight sw122 = new ServtermnameandWeight("voic recognit",1.0);
		     
		     ServtermnameandWeight sw123 = new ServtermnameandWeight("plai music",1.0);
		     ServtermnameandWeight sw124 = new ServtermnameandWeight("answer question",1.0);
		     
		     ServtermnameandWeight sw125 = new ServtermnameandWeight("set alarm",1.0);
		     ServtermnameandWeight sw126 = new ServtermnameandWeight("smart speaker",1.0);
		     
		     AUID1AmazonEchoS.add(sw121);
		     AUID1AmazonEchoS.add(sw122);
		     AUID1AmazonEchoS.add(sw123);
		     AUID1AmazonEchoS.add(sw124);
		     AUID1AmazonEchoS.add(sw125);
		     AUID1AmazonEchoS.add(sw126);
		     
		     ServtermnameandWeight sw127 = new ServtermnameandWeight("motion alert",1.0);
		     ServtermnameandWeight sw128 = new ServtermnameandWeight("sound alert",1.0);
		    
		     ServtermnameandWeight sw129 = new ServtermnameandWeight("night vision",1.0);
		     ServtermnameandWeight sw130 = new ServtermnameandWeight("HD stream",1.0);
		     
		     ServtermnameandWeight sw131 = new ServtermnameandWeight("camera",1.0);
		     ServtermnameandWeight sw132 = new ServtermnameandWeight("photograph camera",1.0);
		     
		     AUID1NestCameraS.add(sw127);
		     AUID1NestCameraS.add(sw128);
		     AUID1NestCameraS.add(sw129);
		     AUID1NestCameraS.add(sw130);
		     AUID1NestCameraS.add(sw131);
		     AUID1NestCameraS.add(sw132);
		     
		     ServtermnameandWeight sw133 = new ServtermnameandWeight("brew coffe",1.0);
		     ServtermnameandWeight sw134 = new ServtermnameandWeight("brew schedul",1.0);
		    
		     ServtermnameandWeight sw135 = new ServtermnameandWeight("smart coffe maker",1.0);
		     
		     AUID1SmartCoffemakerS.add(sw133);
		     AUID1SmartCoffemakerS.add(sw134);
		     AUID1SmartCoffemakerS.add(sw135);
		     
		     ServtermnameandWeight sw136 = new ServtermnameandWeight("dim",1.0);
		     ServtermnameandWeight sw137 = new ServtermnameandWeight("light recip",1.0);
		   
		     ServtermnameandWeight sw138 = new ServtermnameandWeight("ambianc control",1.0);
		     ServtermnameandWeight sw139 = new ServtermnameandWeight("smart light",1.0);
		     
		     AUID1SmartLightS.add(sw136);
		     AUID1SmartLightS.add(sw137);
		     AUID1SmartLightS.add(sw138);
		     AUID1SmartLightS.add(sw139);
		     
		     ServtermnameandWeight sw140 = new ServtermnameandWeight("smoke",1.0);
		     ServtermnameandWeight sw141 = new ServtermnameandWeight("fume",1.0);
		     ServtermnameandWeight sw142 = new ServtermnameandWeight("carbon monoxid",1.0);
		     
		     AUID1NestProtectS.add(sw140);
		     AUID1NestProtectS.add(sw141);
		     AUID1NestProtectS.add(sw142);
		     
		     ServtermnameandWeight sw143 = new ServtermnameandWeight("smart water",1.0);
		     ServtermnameandWeight sw144 = new ServtermnameandWeight("sprinkler",1.0);
		     ServtermnameandWeight sw145 = new ServtermnameandWeight("predict water",1.0);
		     ServtermnameandWeight sw146 = new ServtermnameandWeight("irrig control",1.0);
		     ServtermnameandWeight sw147 = new ServtermnameandWeight("smart irrig control",1.0);
		    
		     AUID1HydrawiseS.add(sw143);
		     AUID1HydrawiseS.add(sw144);
		     AUID1HydrawiseS.add(sw145);
		     AUID1HydrawiseS.add(sw146);
		     AUID1HydrawiseS.add(sw147);
		     
		     ServtermnameandWeight sw148 = new ServtermnameandWeight("food thermomet",1.0);
		     ServtermnameandWeight sw149 = new ServtermnameandWeight("food recognit",1.0);
		     ServtermnameandWeight sw150 = new ServtermnameandWeight("cook program",1.0);
		     ServtermnameandWeight sw151 = new ServtermnameandWeight("oven",1.0);
		     
		     AUID1JuneOvenS.add(sw148);
		     AUID1JuneOvenS.add(sw149);
		     AUID1JuneOvenS.add(sw150);
		     AUID1JuneOvenS.add(sw151);
		     
		     ServtermnameandWeight sw152 = new ServtermnameandWeight("motion detect",1.0);
		     ServtermnameandWeight sw153 = new ServtermnameandWeight("video doorbel",1.0);
		     ServtermnameandWeight sw154 = new ServtermnameandWeight("night vision",1.0);
		     ServtermnameandWeight sw155 = new ServtermnameandWeight("video",1.0);
		     ServtermnameandWeight sw156 = new ServtermnameandWeight("picture",1.0);
		    
	         
		     AUID1VideoDoorbellS.add(sw152);
		     AUID1VideoDoorbellS.add(sw152);
		     AUID1VideoDoorbellS.add(sw153);
		     AUID1VideoDoorbellS.add(sw154);
		     AUID1VideoDoorbellS.add(sw155);
		     
		     ServtermnameandWeight sw158 = new ServtermnameandWeight("blood pressur",1.0);
		     ServtermnameandWeight sw159 = new ServtermnameandWeight("hypertens",1.0);
		     ServtermnameandWeight sw160 = new ServtermnameandWeight("high blood pressur",1.0);
		     ServtermnameandWeight sw161 = new ServtermnameandWeight("cardiovascular",1.0);
		     
		     AUID1BPMS.add(sw158);
		     AUID1BPMS.add(sw159);
		     AUID1BPMS.add(sw160);
		     AUID1BPMS.add(sw161);
		     
		     ServtermnameandWeight sw162 = new ServtermnameandWeight("work out",1.0);
		     ServtermnameandWeight sw163 = new ServtermnameandWeight("heart rate",1.0);
		     ServtermnameandWeight sw164 = new ServtermnameandWeight("plai music",1.0);
		     ServtermnameandWeight sw165 = new ServtermnameandWeight("global posit system",1.0);
		     ServtermnameandWeight sw166 = new ServtermnameandWeight("activ tracker",1.0);
		     ServtermnameandWeight sw167 = new ServtermnameandWeight("sleep tracker",1.0);
		     
		     AUID1FitbitVersaS.add(sw162);
		     AUID1FitbitVersaS.add(sw163);
		     AUID1FitbitVersaS.add(sw164);
		     AUID1FitbitVersaS.add(sw165);
		     AUID1FitbitVersaS.add(sw166);
		     AUID1FitbitVersaS.add(sw167);
		     
		     ServtermnameandWeight sw168 = new ServtermnameandWeight("auto lock",1.0);
		     ServtermnameandWeight sw169 = new ServtermnameandWeight("smart lock",1.0);
		     
		     AUID1SmartLockS.add(sw168);
		     AUID1SmartLockS.add(sw169);
		     
		     ServtermnameandWeight sw170 = new ServtermnameandWeight("smart thermostat",1.0);
		     ServtermnameandWeight sw171 = new ServtermnameandWeight("temperatur adjustment",1.0);
		     ServtermnameandWeight sw172 = new ServtermnameandWeight("energi report",1.0);
		     
		     AUID1SmartThermostatS.add(sw170);
		     AUID1SmartThermostatS.add(sw171);
		     AUID1SmartThermostatS.add(sw172);
		     
		     ServtermnameandWeight sw173 = new ServtermnameandWeight("garag door open",1.0);
		     
		     AUID1SmartGarageDoorS.add(sw173);
		     
		     ServtermnameandWeight sw174 = new ServtermnameandWeight("soil nutrit",1.0);
		     ServtermnameandWeight sw175 = new ServtermnameandWeight("soil moistur",1.0);
		     ServtermnameandWeight sw176 = new ServtermnameandWeight("garden diagnost",1.0);
		     ServtermnameandWeight sw177 = new ServtermnameandWeight("garden",1.0);
		     
		     AUID1SmartGardenS.add(sw174);
		     AUID1SmartGardenS.add(sw175);
		     AUID1SmartGardenS.add(sw176);
		     AUID1SmartGardenS.add(sw177);
		     
		     
		     ServtermnameandWeight sw178 = new ServtermnameandWeight("sleep tracker",1.0);
		     ServtermnameandWeight sw179 = new ServtermnameandWeight("activ tracker",1.0);
		     ServtermnameandWeight sw180 = new ServtermnameandWeight("babi monitor",1.0);
		     
		     AUID1BabyMonitorS.add(sw178);
		     AUID1BabyMonitorS.add(sw179);
		     AUID1BabyMonitorS.add(sw180);
		     
		     ServtermnameandWeight sw181 = new ServtermnameandWeight("air condit",1.0);
		     ServtermnameandWeight sw182 = new ServtermnameandWeight("temperatur",1.0);
		     ServtermnameandWeight sw183 = new ServtermnameandWeight("humid",1.0);
		     ServtermnameandWeight sw184 = new ServtermnameandWeight("sunlight",1.0);
		     ServtermnameandWeight sw185 = new ServtermnameandWeight("sunshin",1.0);
		     ServtermnameandWeight sw186 = new ServtermnameandWeight("sun",1.0);
		     ServtermnameandWeight sw187 = new ServtermnameandWeight("air condit perform",1.0);
		     
		     AUID1AirConditionerS.add(sw181);
		     AUID1AirConditionerS.add(sw182);
		     AUID1AirConditionerS.add(sw183);
		     AUID1AirConditionerS.add(sw184);
		     
		     AUID1AirConditionerS.add(sw185);
		     AUID1AirConditionerS.add(sw186);
		     AUID1AirConditionerS.add(sw187);
		     
		     ServtermnameandWeight sw188 = new ServtermnameandWeight("wind speed",1.0);
		     ServtermnameandWeight sw189 = new ServtermnameandWeight("wind direct",1.0);
		     ServtermnameandWeight sw190 = new ServtermnameandWeight("humid",1.0);
		     ServtermnameandWeight sw191 = new ServtermnameandWeight("temperatur",1.0);
		     ServtermnameandWeight sw192 = new ServtermnameandWeight("weather",1.0);
		     ServtermnameandWeight sw193 = new ServtermnameandWeight("condit",1.0);
		     ServtermnameandWeight sw194 = new ServtermnameandWeight("weather condit",1.0);
		     ServtermnameandWeight sw195 = new ServtermnameandWeight("atmospher condit",1.0);
		     
		     VICMET11WeatherStationS.add(sw188);
		     VICMET11WeatherStationS.add(sw189);
		     VICMET11WeatherStationS.add(sw190);
		     VICMET11WeatherStationS.add(sw191);
		     VICMET11WeatherStationS.add(sw192);
		     VICMET11WeatherStationS.add(sw193);
		     VICMET11WeatherStationS.add(sw194);
		     VICMET11WeatherStationS.add(sw195);
		     
		     
		     ServtermnameandWeight sw196 = new ServtermnameandWeight("water leak",1.0);
		     
		     AUID1WaterLeakS.add(sw196);
		     
		     ServtermnameandWeight sw197 = new ServtermnameandWeight("indoor locat",1.0);
		     
		     //https://www.bitbrain.com/equipment/products/neckly
		     AUID1IndoorLocS.add(sw197);
		     
		     ServtermnameandWeight sw198 = new ServtermnameandWeight("air purifi",1.0);
		     ServtermnameandWeight sw199 = new ServtermnameandWeight("pollen",1.0);
		     ServtermnameandWeight sw200 = new ServtermnameandWeight("dust",1.0);
		     ServtermnameandWeight sw201 = new ServtermnameandWeight("smoke",1.0);
		     ServtermnameandWeight sw202 = new ServtermnameandWeight("bacteria",1.0);
		     ServtermnameandWeight sw203 = new ServtermnameandWeight("bacterium",1.0);
		     ServtermnameandWeight sw204 = new ServtermnameandWeight("allergen",1.0);
		     ServtermnameandWeight sw205 = new ServtermnameandWeight("nitrogen di oxid",1.0);
		     ServtermnameandWeight sw206 = new ServtermnameandWeight("volatil organ compound",1.0);
		     ServtermnameandWeight sw207 = new ServtermnameandWeight("air condit perform",1.0);
		   
		     
		     AUID1DysonAirPurifierS.add(sw198);
		     AUID1DysonAirPurifierS.add(sw199);
		     AUID1DysonAirPurifierS.add(sw200);
		     AUID1DysonAirPurifierS.add(sw201);
		     AUID1DysonAirPurifierS.add(sw202);
		     AUID1DysonAirPurifierS.add(sw203);
		     AUID1DysonAirPurifierS.add(sw204);
		     AUID1DysonAirPurifierS.add(sw205);
		     AUID1DysonAirPurifierS.add(sw206);
		     AUID1DysonAirPurifierS.add(sw207);
		     
		     ServtermnameandWeight sw208 = new ServtermnameandWeight("video",1.0);
		     ServtermnameandWeight sw209 = new ServtermnameandWeight("picture",1.0);
		     ServtermnameandWeight sw210 = new ServtermnameandWeight("cctv",1.0);
		     
		     VICHIGHWAY05CCTVS.add(sw208);
		     VICHIGHWAY05CCTVS.add(sw209);
		     VICHIGHWAY05CCTVS.add(sw210);
		     
		     ServtermnameandWeight sw211 = new ServtermnameandWeight("sound level",1.0);
		     ServtermnameandWeight sw212 = new ServtermnameandWeight("sound",1.0);
		     
		     VICHIGHWAY09SoundMeterS.add(sw211);
		     VICHIGHWAY09SoundMeterS.add(sw212);
		     
		     ServtermnameandWeight sw213 = new ServtermnameandWeight("thunder",1.0);
		     ServtermnameandWeight sw214 = new ServtermnameandWeight("boom",1.0);
		     ServtermnameandWeight sw215 = new ServtermnameandWeight("roar",1.0);
		     ServtermnameandWeight sw216 = new ServtermnameandWeight("lightn",1.0);
		     
		     VICMET19LightningSensorS.add(sw213);
		     VICMET19LightningSensorS.add(sw214);
		     VICMET19LightningSensorS.add(sw215);
		     VICMET19LightningSensorS.add(sw216);
		     
		     ServtermnameandWeight sw217 = new ServtermnameandWeight("vehicl speed",1.0);
		     ServtermnameandWeight sw218 = new ServtermnameandWeight("speed gun",1.0);
		     
		     VICHIGHWAY22SpeedGunS.add(sw217);
		     VICHIGHWAY22SpeedGunS.add(sw218);
		     
		     ServtermnameandWeight sw219 = new ServtermnameandWeight("laser rang",1.0);
		     ServtermnameandWeight sw220 = new ServtermnameandWeight("rang",1.0);
		     ServtermnameandWeight sw221 = new ServtermnameandWeight("scope",1.0);
		     ServtermnameandWeight sw222 = new ServtermnameandWeight("reach",1.0);
		     ServtermnameandWeight sw223 = new ServtermnameandWeight("orbit",1.0);
		     ServtermnameandWeight sw224 = new ServtermnameandWeight("compass",1.0);
		     ServtermnameandWeight sw225 = new ServtermnameandWeight("ambit",1.0);
		     
		     VICHIGHWAY23RangeFinderS.add(sw219);
		     VICHIGHWAY23RangeFinderS.add(sw220);
		     VICHIGHWAY23RangeFinderS.add(sw221);
		     VICHIGHWAY23RangeFinderS.add(sw222);
		     VICHIGHWAY23RangeFinderS.add(sw223);
		     VICHIGHWAY23RangeFinderS.add(sw224);
		     VICHIGHWAY23RangeFinderS.add(sw225);
		     
		     ServtermnameandWeight sw226 = new ServtermnameandWeight("thermal imag",1.0);
		     ServtermnameandWeight sw227 = new ServtermnameandWeight("search",1.0);
		     ServtermnameandWeight sw228 = new ServtermnameandWeight("rescue",1.0);
		     ServtermnameandWeight sw229 = new ServtermnameandWeight("deliver",1.0);
		     ServtermnameandWeight sw230 = new ServtermnameandWeight("save",1.0);
		     ServtermnameandWeight sw231 = new ServtermnameandWeight("imag quad copter",1.0);
		     
		     VICCountryFire03QuadCopterImagingS.add(sw226);
		     VICCountryFire03QuadCopterImagingS.add(sw227);
		     VICCountryFire03QuadCopterImagingS.add(sw228);
		     VICCountryFire03QuadCopterImagingS.add(sw229);
		     VICCountryFire03QuadCopterImagingS.add(sw230);
		     VICCountryFire03QuadCopterImagingS.add(sw231);
		     
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
			 
			 arraylistofservices.add(AUID1AmazonEchoS);
			 arraylistofservices.add(AUID1NestCameraS);
			 arraylistofservices.add(AUID1SmartCoffemakerS);
			 //arraylistofservices.add(AUID1SmartYogaMatS);
			 arraylistofservices.add(AUID1SmartLightS);
			 arraylistofservices.add(AUID1NestProtectS);
			 arraylistofservices.add(AUID1HydrawiseS);
			 arraylistofservices.add(AUID1JuneOvenS);
			 arraylistofservices.add(AUID1VideoDoorbellS);
			 arraylistofservices.add(AUID1BPMS);
			 arraylistofservices.add(AUID1FitbitVersaS);
			 arraylistofservices.add(AUID1SmartLockS);
			 arraylistofservices.add(AUID1SmartThermostatS);
			 arraylistofservices.add(AUID1SmartGarageDoorS);
			 arraylistofservices.add(AUID1SmartGardenS);
			 arraylistofservices.add(AUID1BabyMonitorS);
			 arraylistofservices.add(AUID1AirConditionerS);
			 arraylistofservices.add(AUID1WaterLeakS);
			 //arraylistofservices.add(AUID1GasandCarbonmonoxideDetectorS);
			 arraylistofservices.add(AUID1IndoorLocS);
			 arraylistofservices.add(AUID1DysonAirPurifierS);
			 
			 ArrayList<String> SituationTermshere = new ArrayList<String>()
				{{add("earthquake"); }};
				  
			 
			/*
		      SituationTermshereWeights.add(1.0);
		      SituationTermshereWeights.add(0.399);
		      SituationTermshereWeights.add(0.379);
		      SituationTermshereWeights.add(0.319);
		      SituationTermshereWeights.add(0.319);
		      SituationTermshereWeights.add(0.319);
		     */
		      SituationTermshereWeights.add(1.0);
		     
		      for (l=0;l<51;l++)
		      {  
		       for (k=0;k<SituationTermshere.size();k++)   
		       { sittermweight= SituationTermshereWeights.get(k);		    	
		    	 try 
		    	  {  
		    	   servicetomatch= arraylistofservices.get(l);
		    	   int arraysizetokeepservicetermoccurence= servicetomatch.size();
		    	  // System.out.println(arraysizetokeepservicetermoccurence);
		    	   countoccurence = new double[arraysizetokeepservicetermoccurence]; 
		    	   Iterator<ServtermnameandWeight> itr=servicetomatch.iterator();  
		    	   while(itr.hasNext())
			   	   {  
		    		 
			   	     ServtermnameandWeight st=(ServtermnameandWeight)itr.next();  
			         System.out.println(st.servterm+" "+st.servtermweight);
			         servicetermtomatch=st.servterm;
			         // Scanner fileScanner = new Scanner(new File("bushfire/"+ "stemmedsimplewtokens"+ SituationTermshere.get(k) +".txt"));
			       //  Path fpath=Paths.get("bushfire/"+ "stemmedsimplewtokens"+ SituationTermshere.get(k) +".txt");
			       //  System.out.println("Path = = "+ fpath.toAbsolutePath().toString());
			         
			         String wholefilecontents = new String(Files.readAllBytes(Paths.get("earthquake/"+ "stemmedsimplewtokens"+ " " + SituationTermshere.get(k) +".txt")));
			         //////////PREV CODE
			         /*
			         Pattern pattern =  Pattern.compile("\\b"+servicetermtomatch+"\\b",Pattern.CASE_INSENSITIVE);
			   	     Matcher matcher = null;
			   	      while(fileScanner.hasNextLine())
			   	     {
		   	    	 String line = fileScanner.nextLine();
		   	         matcher = pattern.matcher(line);
		   	         if(matcher.find())
		   	    	  {    		  
		   	             System.out.println("the term is found: " + servicetermtomatch);
		   	        	 countoccurence[n]= countoccurence[n]+st.servtermweight;
		   	    	   }
		   	 		 }
			         
			   	  fileScanner.close(); */
			     
			     
			     System.out.println(servicetermtomatch+ " found = "+ findTerm(servicetermtomatch, wholefilecontents));
			   	  
			     occurenceinsittermfile= findTerm(servicetermtomatch, wholefilecontents);
			     System.out.println(occurenceinsittermfile+"*"+sittermweight+"*"+st.servtermweight);
			     q = q+occurenceinsittermfile*sittermweight*st.servtermweight;
	   			  //System.out.println(countoccurence[n]);
	   			 
			   	   }
		    	  } 
		    	catch (Exception e) 
				{
				 System.out.println("File opening fAILED.\n[" + e.getMessage() + "]");
				    	 
			   	  }    
		    	
		    	 //q = q+countoccurence[n]*sittermweight;
		       System.out.println("*************Situation term separation line");	 
		   	      }  
		       System.out.println("#############Service term separation line");
		       System.out.println(q);
		       
		       scoreofservices[l]=q;
		       q=0;  
		       
		       }
		      Arrays.sort(scoreofservices);
		      System.out.println("The sorted scores are:");
		      for (double number : scoreofservices) 
		      {
		         System.out.println("Score = " + number);
		      } 	    	  
			    
		 }
}
