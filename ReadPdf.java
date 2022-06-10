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

public class ReadPdf {
/*
	public static void main(String[] args) throws IOException 

	{
		String situationname= "Wildlife"; 
		int n,i;
		PdfSearchElement pseResult;
		 URL situationpdfwikiurl = new URL("https://en.wikipedia.org/api/rest_v1/page/pdf"+"/"+situationname);
//////// URL url = new URL("https://en.wikipedia.org/api/rest_v1/page/pdf/Forest");
		
		byte[] ba1 = new byte[1024];
		int baLength;
		FileOutputStream fos1 = new FileOutputStream(situationname+".pdf");
		try 
		{
			// Contacting the URL
			System.out.print("Connecting to " + situationpdfwikiurl.toString() + " ... ");
			URLConnection urlConn = situationpdfwikiurl.openConnection();

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

					// Load the PDF document and display its page count
					System.out.print("DONE.\nProcessing the PDF ... ");
					PdfDocument doc = new PdfDocument();
					try {
						doc.load(situationname +".pdf");
						//System.out.println("DONE.\nNumber of pages in the PDF is " +
							//	doc.getPageCount());
						ArrayList lstSearchResults1 = 
						           (ArrayList) doc.search(1,"park",PdfSearchMode.LITERAL,
			                                  PdfSearchOptions.NONE);
						  n = lstSearchResults1.size();        
					        for (i = 0; i < n; i++) {
					            pseResult = (PdfSearchElement) lstSearchResults1.get(i);
					            // Print search results to console output
					            System.out.println("Found your word \"" + n + "times");
						
						doc.close();
					}} catch (Exception e) {
						System.out.println("FAILED.\n[" + e.getMessage() + "]");
					}

				} catch (ConnectException ce) {
					System.out.println("FAILED.\n[" + ce.getMessage() + "]\n");
				}
			}

		} catch (NullPointerException npe) {
			System.out.println("FAILED.\n[" + npe.getMessage() + "]\n");
		}
	}
*/
}
