package Control.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

import Control.CSCAN.CScan;
import Control.FCFS.FCFS;
import Control.LOOK.Look;
import Control.SCAN.Scan;
import Control.SSTF.SSTF;

public class Start {
	Properties p= new Properties();;
	Reader r;
	
	public static void main(String args[]){
		new Start("diskq1.Properties",1);
		new Start("diskq1.Properties",2);
		new Start("diskq1.Properties",3);
		new Start("diskq1.Properties",4);
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
		if(method==1) new FCFS(r.getRawSequence(),r);
		if(method==2) new SSTF(r.getCurrent(),r.getRawSequence(),r);
		if(method==3) new Scan(r.getCurrent(),r.getPrevious(),r.getRawSequence(),r);
		if(method==4) new CScan(r.getCurrent(),r.getPrevious(),r.getRawSequence(),r);
	}
	
	
	
}
