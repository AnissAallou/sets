package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import listes.Ville;

public class TestSetDouble {

	public static void main(String[] args) { 
		

		// On instancie avec HashSet
		HashSet<Double> dobble = new HashSet<Double>();
		
		dobble.add(1.5);
	       	dobble.add(8.25);
	       	dobble.add(-7.32);
	       	dobble.add(13.3);
	       	dobble.add(-12.45);
	       	dobble.add(48.5);
	       	dobble.add(0.01);
	      
	      	System.out.print(dobble + " " + "\n");
	      
	      
	      // On détermine le plus grand et le plus petit éléments de la collection
	      System.out.println("Le plus grand élément de la collection est : " + Collections.max(dobble) 
	      + "\nLe plus petit élément de la collection est : " + Collections.min(dobble));
	      
	      // On supprime le plus petit élément de la collection	
	      dobble.remove(Collections.min(dobble));
	      
	      System.out.print("\nEn supprimant le plus petit élément de la collection, on obtient : \n" + dobble + " " + "\n");
	  
	      
	      // chaque nombre négatif deviendra positif grâce à la méthode Math.abs()
	    		
	    	
	      HashSet <Double> dobbleTest = new HashSet<Double>();

	      for (Double dobbleNeg : dobble) {
				 if(dobbleNeg < 0) {
					 dobbleTest.add(Math.abs(dobbleNeg));
				 } else {
					 dobbleTest.add(dobbleNeg);
				 }
			}
	    		
	    		System.out.print("\nconversion des nombres négatifs : \n" + dobbleTest);
	    	
	}
}
