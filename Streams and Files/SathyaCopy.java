// Write a java program to copy content from one file into another file

//SathyaCopy.java

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class CopyData
{
  
  FileInputStream fis;
  FileOutputStream fos;

   void copyFiles(String sfile,String dfile)
	{
	   try
	   {

        int x;
	   fis = new FileInputStream(sfile);
	   fos= new FileOutputStream(dfile);


	   while((x=fis.read())!=-1)
		{
		   char y = (char)x;
	      fos.write(y);
	   }
	   System.out.println("Data Successfully Copied");

	   }
	   catch(FileNotFoundException e)
		{
            System.err.println("Source File Not Found");
	    }
		catch(IOException e )
		{
		   System.err.println("Unable to open file in write mode");
		}
		catch(Exception e)
		{
           System.err.println(e);
		}
		finally
		{
			try
			{
				
			System.out.println("I am from finally block");

			if (fis!=null)
			{
				fis.close();
				System.out.println("Source file closed");
			}
		  if(fos!=null)
			{
			  fos.close();
			  System.out.println("Data copied and file closed");
		    }

			}catch(Exception e )
			{
			System.err.println(e);
			}
		
		}//finally

    }//copyFiles

}//CopyData----------------BLC
class  SathyaCopy
{
	public static void main(String[] args) 
	{
		if(args.length!=2)
		{
		System.out.println("Invalid Syntax,plz enter source and destination file in order....");
		}
		else
		{

		CopyData c = new CopyData();
		c.copyFiles(args[0],args[1]);

		}
	}
}
