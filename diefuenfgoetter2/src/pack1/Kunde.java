package pack1;

public class Kunde {

	private String vorname, nachname, kundenId, passwort;
	private Warenkorb warenkorb;

	public Kunde(String pVorname, String pNachname, String pPasswort) {
		this.vorname = pVorname;
		this.nachname = pNachname;
		this.passwort = pPasswort;
		this.kundenId= pVorname+"."+pNachname;
	}

	public void passwortAendern(String pPasswort) {
		passwort = pPasswort;
	}
}
