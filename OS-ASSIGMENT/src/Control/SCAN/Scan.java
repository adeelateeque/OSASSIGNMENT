package Control.SCAN;

import java.util.Arrays;

import Control.Reader.Reader;

public class Scan {
	Reader r;
	
	public Scan(int current, int previous,int rawSequence[],Reader r){
		this.r=r;
		int direction=0;
		int scanSequence[] = null;
		//finding the direction of the arrow..
		if(previous>current){direction=0; scanSequence=addZero(rawSequence);};  // going towards zero, adds 0 into the array
		if(previous<current){direction=1; scanSequence=addMax(rawSequence,r.getCylinders());}  // going away from zero, adds the max clyinder num into the array
		
		//sorting the sequence in order
		Arrays.sort(scanSequence);
		//sorts it in scan methods
		SCAN(scanSequence,direction,r.getCurrent());
	}
	

	public int[] addZero(int rawSequence[]){
		int arraylist[]= new int[rawSequence.length+1];
		for(int i=0; i<arraylist.length;i++){
			if(i==rawSequence.length);
			else arraylist[i]=rawSequence[i];
		}
		arraylist[arraylist.length-1]=0;
		rawSequence= new int[arraylist.length];
		for (int i=0; i<arraylist.length;i++){
			rawSequence[i]=arraylist[i];
		}
		return rawSequence;
	}
	
	
	public int[] addMax(int rawSequence[], int max){
		int arraylist[]= new int[rawSequence.length+1];
		for(int i=0; i<arraylist.length;i++){
			if(i==rawSequence.length)break;
			else arraylist[i]=rawSequence[i];
		}
		arraylist[arraylist.length-1]=max;
		rawSequence= new int[arraylist.length];
		for (int i=0; i<arraylist.length;i++){
			rawSequence[i]=arraylist[i];
		}
		return rawSequence;
	}

	public void SCAN(int rawSequence[],int direction,int current){
		int sortedSequence[]=new int[rawSequence.length+1];
		int next;
		
		if(direction==0)//going towards zero direction
		{
			//finding where the first point will be from
			int startIndex = 1010;
			for(int i=0;i<rawSequence.length;i++){
				if(current<rawSequence[i]){startIndex=i; break;}
				
			}
			
			//sorting into scan method
			int filledIndex=0;
			for(int i=startIndex-1;i>0;i--){
				sortedSequence[filledIndex]=rawSequence[i];
				filledIndex++;
			}
			for(int i=startIndex;i<rawSequence.length;i++){
				sortedSequence[i+1]=rawSequence[i];
			}
		}
		
		if(direction==1)//going away from zero direction
		{
			//finding where the first point will be from
			int startIndex = 1010;
			for(int i=0;i<rawSequence.length;i++){
				if(current<rawSequence[i]){startIndex=i; break;}
				
			}
			//sorting into scan method
			int filledIndex=0;
			for(int i=startIndex;i<rawSequence.length;i++){
				sortedSequence[filledIndex]=rawSequence[i];
				filledIndex++;
			}
			System.out.println("Start at:"+(startIndex-1));
			for(int i=startIndex-1;i>=0;i--){
				sortedSequence[filledIndex]=rawSequence[i];
				filledIndex++;
			}
		}
		
		output(sortedSequence);
	}
	
	public void output(int sortedSequence[]){
		String sequence="";
		String working1="";
		String working2="";
		int total=0;
		sequence+=r.getCurrent();
		int previous=r.getCurrent();
		
		for(int i=0; i<sortedSequence.length;i++)
		{
			int current=sortedSequence[i];
			sequence+=","+current;
			int d= Math.abs(previous-current);
			
			working1+="|"+previous+"-"+current+"|+";
			working2+=d+" + ";
			total+=d;
			previous=current;
		}
		
		System.out.println("SCAN"+'\n'+"====");
		System.out.println("Order of Access: "+sequence);
		System.out.println("Total Distance = "+working1.substring(0,working1.length()-1));
		System.out.println("               = "+working2.substring(0,working2.length()-2));
		System.out.println("               = "+total+'\n');
		
	}

}
