package pack1;

import java.util.ArrayList;

public class Warenkorb {
	
	ArrayList <Artikel> artikellisteArrayList = new ArrayList<Artikel>();
	private double gesamtpreis;
	private double versandkosten;
	private String gutscheincode;
	
	public Warenkorb() {
		// TODO Auto-generated constructor stub
	}
	
	public void gesamtPreisBerechnen() {
		
	}
	
	public void versandkostenBerechenen() {
		
	}
	
	public void rabattieren() {
		
	}

	
	
	
	
	
	
	
	
	public ArrayList<Artikel> getArtikellisteArrayList() {
		return artikellisteArrayList;
	}

	public void setArtikellisteArrayList(ArrayList<Artikel> artikellisteArrayList) {
		this.artikellisteArrayList = artikellisteArrayList;
	}

	public double getGesamtpreis() {
		return gesamtpreis;
	}

	public void setGesamtpreis(double gesamtpreis) {
		this.gesamtpreis = gesamtpreis;
	}

	public double getVersandkosten() {
		return versandkosten;
	}

	public void setVersandkosten(double versandkosten) {
		this.versandkosten = versandkosten;
	}

	public String getGutscheincode() {
		return gutscheincode;
	}

	public void setGutscheincode(String gutscheincode) {
		this.gutscheincode = gutscheincode;
	}
	
	
}
