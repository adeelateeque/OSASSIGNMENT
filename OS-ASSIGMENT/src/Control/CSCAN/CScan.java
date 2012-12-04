package Control.CSCAN;

import java.util.Arrays;

import Control.Reader.Reader;

public class CScan {

Reader r;
	
	public CScan(int current, int previous,int rawSequence[],Reader r){
		this.r=r;
		int direction=0;
		int cScanSequence[] = null;
		//finding the direction of the arrow..
		if(previous>current){direction=0; };  // going towards zero
		if(previous<current){direction=1;}  // going away from zero
		cScanSequence=addHeadAndTail(rawSequence, r.getCylinders());
		
		//sorting the sequence in order
		Arrays.sort(cScanSequence);
		for(int i=0; i<cScanSequence.length;i++){
			System.out.println(cScanSequence[i]);
		}
		
		//sorts it in scan methods
		CSCAN(cScanSequence,direction,r.getCurrent());
	}
	
	public int[]addHeadAndTail(int [] rawSequence,int tail){
		int arraylist[]= new int[rawSequence.length+2];
		for(int i=0; i<arraylist.length;i++){
			if(i==rawSequence.length)break;
			else arraylist[i]=rawSequence[i];
		}
		arraylist[arraylist.length-1]=0;
		arraylist[arraylist.length-2]=tail;
		rawSequence= new int[arraylist.length];
		for (int i=0; i<arraylist.length;i++){
			rawSequence[i]=arraylist[i];
		}
		return rawSequence;
	}
	
	
	public void CSCAN(int[]rawSequence, int direction,int current){
		
	}
	
}
