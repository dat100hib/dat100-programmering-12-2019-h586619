package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		
		int antall = 0;
		
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] != null) {
				antall++;
			}
		}
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		
		int pos = 0;
		
		while (pos < nesteledig && !funnet) {
			if (innlegg.erLik(innleggtabell[pos]))
				funnet = true;
			else pos++;
		}
		if (funnet = true) 
		return pos;
		else return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		int pos = finnInnlegg(innlegg);
		if (pos >= 0)
			return true;
		else return false;
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggtabell.length) 
			return true;
			else return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean ledig = ledigPlass();
		boolean eritab = finnes(innlegg);
		if (ledig == true && eritab == false) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else return false;
	}
	
	
	public String toString() {
		
		
		throw new UnsupportedOperationException(TODO.method());
		
		
		
	}
		
		
	

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}