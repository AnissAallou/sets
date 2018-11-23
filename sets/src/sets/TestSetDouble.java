package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import listes.Ville;

public class TestSetDouble {

	public static void main(String[] args) { 
		

		
		HashSet<Double> dobble = new HashSet<Double>();
		
		   dobble.add(1.5);
	       dobble.add(8.25);
	       dobble.add(-7.32);
	       dobble.add(13.3);
	       dobble.add(-12.45);
	       dobble.add(48.5);
	       dobble.add(0.01);
	      
	      System.out.print(dobble + " " + "\n");
	      
	      
	      
	      System.out.println("Le plus grand �l�ment de la collection est : " + Collections.max(dobble) 
	      + "\nLe plus petit �l�ment de la collection est : " + Collections.min(dobble));
	      
	      dobble.remove(Collections.min(dobble));
	      
	      System.out.print("\nEn supprimant le plus petit �l�ment de la collection, on obtient : \n" + dobble + " " + "\n");
	  
	      
	      // chaque nombre n�gatif deviendra positif gr�ce � la m�thode Math.abs()
	    		
	    	
	      HashSet <Double> dobbleTest = new HashSet<Double>();

	      for (Double dobbleNeg : dobble) {
				 if(dobbleNeg < 0) {
					 dobbleTest.add(Math.abs(dobbleNeg));
				 } else {
					 dobbleTest.add(dobbleNeg);
				 }
			}
	    		
	    		System.out.print("\nconversion des nombres n�gatifs : \n" + dobbleTest);
	    	
	}
}
