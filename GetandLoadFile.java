package com.example.Pdf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import com.gnostice.pdfone.PdfDocument;
import com.gnostice.pdfone.PdfSearchElement;
import com.gnostice.pdfone.PdfSearchMode;
import com.gnostice.pdfone.PdfSearchOptions;

public class GetandLoadFile 

{ public static void getfile(String situationtermname) throws IOException
	
  {
	int n,i,baLength;
	//String sittmname=situationtermname;
	String sittmname=situationtermname;
	PdfSearchElement pseResult;
	
	
	URL situationpdfwikiurl = new URL("https://en.wikipedia.org/api/rest_v1/page/pdf"+"/"+sittmname);
	byte[] ba1 = new byte[1024];
	FileOutputStream fos1 = new FileOutputStream(situationtermname+".pdf");
	try 
	{
		// Contacting the URL
		System.out.print("Connecting to " + situationpdfwikiurl.toString() + " ... ");
		URLConnection urlConn = situationpdfwikiurl.openConnection();
        urlConn.setRequestProperty("User-Agent", "szkhanctg@yahoo.com");
		
		// Checking whether the URL contains a PDF
		if (!urlConn.getContentType().equalsIgnoreCase("application/pdf")) 
		{
			System.out.println("FAILED.\n[Sorry. This is not a PDF.]");
		} 
		else {
			try {

				// Read the PDF from the URL and save to a local file
				InputStream is1 = situationpdfwikiurl.openStream();
				while ((baLength = is1.read(ba1)) != -1) 
				{
					fos1.write(ba1, 0, baLength);
				}
				fos1.flush();
				fos1.close();
				is1.close();

				
				

			} catch (ConnectException ce) {
				System.out.println("FAILED.\n[" + ce.getMessage() + "]\n");
			}
		}

	} catch (NullPointerException npe) {
		System.out.println("FAILED.\n[" + npe.getMessage() + "]\n");
	}
	
	
	}

}
