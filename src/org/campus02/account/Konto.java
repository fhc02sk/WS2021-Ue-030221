package org.campus02.account;

public class Konto {
	
	protected String inhaber;
	protected double kontostand;
	
	public Konto(String inhaber) {
		this.inhaber = inhaber;
		this.kontostand = 0;
	}

	public void einzahlen (double wert)
	{
		this.kontostand+=wert;
	}
	public void auszahlen (double wert){
		kontostand-=wert;
	}
}
