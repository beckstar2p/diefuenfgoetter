package pack1;

import java.util.ArrayList;

public class Kundenverwaltung {
	
	ArrayList<Kunde> kundenliste = new ArrayList<Kunde>();
	
	
	public Kundenverwaltung() {
		
	}
	
	public void kundeHinzufügen(Kunde pKunde) {
		kundenliste.add(pKunde);
	}
	
	
}
