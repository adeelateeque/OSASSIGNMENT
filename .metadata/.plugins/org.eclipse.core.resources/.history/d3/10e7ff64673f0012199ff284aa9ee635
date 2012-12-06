package Control.LOOK;

import java.util.Arrays;

import Control.Reader.Reader;

public class Look {
	Reader r;
	public Look(int current, int previous,int rawSequence[],Reader r){
		this.r=r;
		int direction=0;
		int lookSequence[] = rawSequence;
		//finding the direction of the arrow..
		if(previous>current){direction=0; };  // going towards zero
		if(previous<current){direction=1;}  // going away from zero
		
		//sorting the sequence in order
		Arrays.sort(lookSequence);
		//sorts it in LOOK methods
		LOOK(lookSequence,direction,r.getCurrent());
	}
	
	public void LOOK(int rawSequence[],int direction,int current){
		int sortedSequence[]=new int[rawSequence.length];
				
		if(direction==0)//going towards zero direction
		{
			//finding where the first point will be from
			int startIndex = 1010;
			for(int i=0;i<rawSequence.length;i++){
				if(current<rawSequence[i]){startIndex=i; break;}
				
			}
			
			//sorting into LOOK method
			int filledIndex=0;
			for(int i=startIndex-1;i>0;i--){
				sortedSequence[filledIndex]=rawSequence[i];
				filledIndex++;
			}
			for(int i=startIndex;i<rawSequence.length;i++){
				sortedSequence[i]=rawSequence[i];
			}
		}
		
		if(direction==1)//going away from zero direction
		{
			//finding where the first point will be from
			int startIndex = 1010;
			for(int i=0;i<rawSequence.length;i++){
				if(current<rawSequence[i]){startIndex=i; break;}
				
			}
			//sorting into LOOK method
			int filledIndex=0;
			for(int i=startIndex;i<rawSequence.length;i++){
				sortedSequence[filledIndex]=rawSequence[i];
				filledIndex++;
			}
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
		
		System.out.println("Method\t: LOOK"+'\n'+"-----------------");
		System.out.println("Order of Access\t: "+sequence);
		System.out.println("Total Distance\t= "+working1.substring(0,working1.length()-1));
		System.out.println("              \t= "+working2.substring(0,working2.length()-2));
		System.out.println("              \t= "+total+'\n');
		
	}
	
}
