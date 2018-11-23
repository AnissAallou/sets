package sets;

import java.util.HashSet;

public class TestSetString {
	
	public static void main(String[] args) {
		
		HashSet<String> country = new HashSet<String>();
		
		country.add("USA");
		country.add("France");
		country.add("Allemagne");
		country.add("UK");
		country.add("Italie");
		country.add("Japon");
		country.add("Chine");
		country.add("Russie");
		country.add("Inde");
		
		
		String length = " ";
		for (String string : country) {
			//Le pays au plus grand nombre de caractères
			if(string.length()>length.length()) {
				length = string;
			}
			
		}
		
		System.out.println("Le pays qui a le plus grand nombre de lettres : " + length);
		
		country.remove(length); 
		
		// L'Allemagne perd comme en 45
		System.out.print("\nNouvelle version sans le pays au plus grand nombre de lettres : \n" + country + "\n");
		
		System.out.println("\nMettre en majuscules : ");
		
		for (String string : country) {
			// Mettre en MAJUSCULES
			System.out.print(string.toUpperCase() + " ");
		}
		
	}

}
