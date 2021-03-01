package pack1;

public class Artikel {

	private String name;
	private double preis;
	private String artikelnr;
	private double gewicht;
	private int lagerbestand;
	private int anzahlImWarenkorb;

	public Artikel() {
		// TODO Auto-generated constructor stub
	}

	public double rabattierterArtikel(String pRabattcode) {

		if (pRabattcode.equals("Hennig")) {
			preis = preis - 0.01;
		} else if (pRabattcode.equals("2")) {
			preis = preis - (preis * 0.30);
		} else if (pRabattcode.equals("3")) {
			preis = preis - (preis * 0.15);
		}
		return preis;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getArtikelnr() {
		return artikelnr;
	}

	public void setArtikelnr(String artikelnr) {
		this.artikelnr = artikelnr;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public int getLagerbestand() {
		return lagerbestand;
	}

	public void setLagerbestand(int lagerbestand) {
		this.lagerbestand = lagerbestand;
	}

	public int getAnzahl() {
		return anzahlImWarenkorb;
	}

	public void setAnzahl(int anzahl) {
		this.anzahlImWarenkorb = anzahl;
	}

}
