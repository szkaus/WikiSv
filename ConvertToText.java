package com.example.Pdf;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ConvertToText 
{
  static int a, sizeofsitterms;
  public static void convertfile(ArrayList<String> sittermnamesonly)
  {
	  sizeofsitterms=  sittermnamesonly.size();
	  
	  for (a = 0; a <sizeofsitterms; a++) 
	  {
	   try 
	   { 
		    File f = new File(sittermnamesonly.get(a) +".pdf");
			String parsedText;
			PDFParser parser = new PDFParser(new RandomAccessFile(f, "r"));
			parser.parse();
			COSDocument cosDoc = parser.getDocument();
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDDocument pdDoc = new PDDocument(cosDoc);
			parsedText = pdfStripper.getText(pdDoc);
			PrintWriter pw = new PrintWriter(sittermnamesonly.get(a) + "." + "txt");
			
			pw.println(parsedText);
			pw.close();	
			pdDoc.close();               //important 
			
		 }
	   catch (Exception e) 
	    {
			System.out.println("File opening fAILED.\n[" + e.getMessage() + "]");
		}
         }

  }
}