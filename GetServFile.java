package com.example.Pdf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLConnection;

import com.gnostice.pdfone.PdfSearchElement;

public class GetServFile 
{
 public static boolean  getsrvfile(String srvfilename) throws IOException
 {
	 int n,i,baLength;
		String servicefilename=srvfilename;
		PdfSearchElement pseResult;
		
		
		URL situationpdfwikiurl = new URL("https://en.wikipedia.org/api/rest_v1/page/pdf"+"/"+servicefilename);
		byte[] ba1 = new byte[1024];
		//FileOutputStream fos1 = new FileOutputStream("servicefiles/"+srvfilename+".pdf");
		FileOutputStream fos1 = new FileOutputStream("timetest/"+srvfilename+".pdf");
		try 
		{
			// Contacting the URL
			System.out.print("Connecting to " + situationpdfwikiurl.toString() + " ... ");
			URLConnection urlConn = situationpdfwikiurl.openConnection();
	        urlConn.setRequestProperty("User-Agent", "szkhanctg@yahoo.com");
			
			// Checking whether the URL contains a PDF
			if (!urlConn.getContentType().equalsIgnoreCase("application/pdf")) 
			{
				System.out.println("Sorry the specified service could not be found");
				return false;
				
			} 
			else 
			{
				try 
				{

					// Read the PDF from the URL and save to a local file
					InputStream is1 = situationpdfwikiurl.openStream();
					while ((baLength = is1.read(ba1)) != -1) 
					{
						fos1.write(ba1, 0, baLength);
					}
					fos1.flush();
					fos1.close();
					is1.close();
					return true;
				} 
			catch (ConnectException ce) 
			{
			  System.out.println("FAILED.\n[" + ce.getMessage() + "]\n");
			  return false;
				}
			}

		} 
		catch (NullPointerException npe) 
		{
			System.out.println("FAILED.\n[" + npe.getMessage() + "]\n");
			return false;
		}
		
		
		 
	 
 }
 
}
