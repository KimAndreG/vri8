package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		for (int i = 0; i < samling.getAntalKort() - 1; i++) {
			for (int j = i + 1; j < samling.getAntalKort(); j++) {
				if (samling.getSamling()[i].compareTo(samling.getSamling()[j]) > 0) {
					Kort temp = samling.getSamling()[i];
					samling.getSamling()[i] = samling.getSamling()[j];
					samling.getSamling()[j] = temp;
				}
			}
		}
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		Random random = new Random();
		for (int i = samling.getAntalKort() - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			Kort temp = samling.getSamling()[i];
			samling.getSamling()[i] = samling.getSamling()[j];
			samling.getSamling()[j] = temp;
		}
	}
	
}
