package View;


import java.awt.Color;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.util.*;

public class SystemApp {
	public static void main(String args[]) throws IOException{
	 try {
	        // Select the Look and Feel
		     UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
	    } 
	    catch (UnsupportedLookAndFeelException e) {
	       // handle exception
	    }
	    catch (ClassNotFoundException e) {
	       // handle exception
	    }
	    catch (InstantiationException e) {  
	       // handle exception
	    } 
	    catch (IllegalAccessException e) {
	       // handle exception
	    }
	   
	    		 
	    DiskOptimizationApp app= new DiskOptimizationApp();
		app.getJWindow().setVisible(true);
	}
}
