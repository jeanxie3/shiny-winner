package emailapp;

import java.util.Scanner;

public class Email {
	private String vorName, nachName; 
	private String passwort ,abteilung ,alternativeEmail;
	private String email;
	private int mailboxKapazitaet;
	
	// Konstruktor zur Aufnahme des Vor- und Nachnamens
	
	// Fragen nach der Abteilung
	
	// Ein zufälliges Passwort generieren
	
	
	public Email(String vorName, String nachName) {
		this.vorName = vorName;
		this.nachName  = nachName;
		System.out.println("Email erstellen: " + this.vorName + " " + this.nachName);
		
		//Aufruf einer Methode zur Abfrage der Abteilung   Rückgabe der Abteilung
		this.abteilung = setabteilung();
		//System.out.println("Abteilung: "+ this.abteilung);
		
		//Eine Methode aufrufen, die ein zufälliges Passwort zurückgibt
		this.passwort = getpasswort(8);
		//System.out.println("Ihre Passwort: " + this.passwort);
		
		//Elemente zur Erstellung von E-Mails kombinieren
		email = vorName.toLowerCase() + "."+ nachName.toLowerCase() + "@" + abteilung.toLowerCase() + "." + "company.com";
		//System.out.println("Ihre Email: " + email);	
		
	}
	
	private String setabteilung() {
		System.out.print("Geben Sie Ihre Abteilung ein :" + "\n1 fuer Vertrieb\n2 fuer Entwicklung\n3 fuer Rechnungswesen\n0 fuer keine\nCode:");
		Scanner eingabe = new Scanner(System.in);
		int abteilungNum = eingabe.nextInt();
		if (abteilungNum == 1) {return "Vertrieb";}
		else if (abteilungNum == 2) {return "Entwicklung";}
		else if (abteilungNum == 3) {return "Rechnungsewesen";}
		else {return " ";}
	}
	
	private String getpasswort(int length) {
		String passwortset = "ABCDEFGHIJKLNMOPQRSTUVWXYZ#$%^*@";
		char[] passwort = new char[length];
		for(int i = 0; i<length; i++) {
			int rand = (int)(Math.random() * passwortset.length());
			passwort[i] = passwortset.charAt(rand);			
		}
		return new String (passwort);
	}
	
	    // Die Kapazität der Mailbox einstellen
		public void setMailboxKapazitaet(int kapazitaet) {
			this.mailboxKapazitaet = kapazitaet;
		}
		// Die alternative E-Mail einstellen
		public void setAlternativeEmail(String alternate) {
			this.alternativeEmail = alternate;
		}
		
		// Das Passwort ändern
		public void aenderndesPasswort(String passwort) {
			this.passwort = passwort;
		}	
		
		public int getKaoazitaet(){return mailboxKapazitaet;}
		public String getAlternativeEmail() {return alternativeEmail;}
		public String getpasswort() {return passwort;}
		
		public String zeigenInformationen() {
			return "Name:" + vorName + " " + nachName + 
					"\nUnternehmen Email : " + email +
					"\nMailbox Kapazitaet : " + mailboxKapazitaet;
		}
	
}