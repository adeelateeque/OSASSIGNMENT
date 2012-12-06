package View;

import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SystemApp {
	@SuppressWarnings({ "static-access" })
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
	   
	    DiskOptimizationApp.getJWindow().setVisible(true);
	}
}
