package pack1;

import java.util.ArrayList;

public class Warenkorb {

	ArrayList<Artikel> artikelliste = new ArrayList<Artikel>();
	private double gesamtpreis;
	private double versandkosten;
	private String gutscheincode;

	public Warenkorb() {
		// TODO Auto-generated constructor stub
	}

	public void zumWarenkorbHinzufuegen(Artikel pArtikel, int pAnzahl) {
		pArtikel.setAnzahl(pAnzahl);
		artikelliste.add(pArtikel);
	}

	public void gesamtPreisBerechnen() {
		for(int i=0;i<artikelliste.size();i++) {
			gesamtpreis= gesamtpreis+ (artikelliste.get(i).getAnzahl()*artikelliste.get(i).getPreis());
		}
		gesamtpreis= gesamtpreis + versandkostenBerechenen();
	}

	public double versandkostenBerechenen() {
		double pGewicht = 0;
		for(int i=0;i<artikelliste.size();i++) {
			pGewicht = pGewicht+ artikelliste.get(i).getGewicht();
		}
		if(pGewicht<=2) {
			return 2.99;
		}
			return 0;
		
	}

	public double rabattieren(String pRabattcode) {
		
		if (pRabattcode.equals("niklas10")) {
			gesamtpreis = gesamtpreis - (gesamtpreis * 0.1);
		}else if(pRabattcode.equals("marie30")) {
			gesamtpreis = gesamtpreis -(gesamtpreis * 0.30);
		}else if(pRabattcode.equals("martin15")) {
			gesamtpreis = gesamtpreis -(gesamtpreis * 0.15);
		}
		return gesamtpreis;
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
