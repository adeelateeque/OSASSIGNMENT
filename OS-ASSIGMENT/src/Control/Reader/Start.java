package Control.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class Start {
	Properties p= new Properties();;
	Reader r=null;
	
	public static void main(String args[]){
		new Start("diskq1.Properties");
	}
	
	public Start(String fileName, int method){
		try
		{
			p.load(new BufferedReader(new FileReader(fileName)));
			r= new Reader(p);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		selectMethod(method);
	}
	
	public void selectMethod(int method){
		//the methods to use
		if(methd)
	}
}
