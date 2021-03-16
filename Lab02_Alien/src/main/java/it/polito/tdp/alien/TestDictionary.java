package it.polito.tdp.alien;

public class TestDictionary {

	public static void main(String[] args) {
		
		System.out.println("Test Dizionario -parte codice-");
		AlienDictionary ad = new AlienDictionary();
		
		Word w1 = new Word("ev","casa");
		Word w2 = new Word("bağ","giardino");
		Word w3 = new Word("gül","fiore");
		Word w4 = new Word("makaron","pasta");
		
		ad.addWord(w1);
		ad.addWord(w2);
		ad.addWord(w3);
		ad.addWord(w4);
		
		System.out.println(ad);
		System.out.println("\n\n Prova Traduzione");
		
		Word w5 = ad.translateWord("ev");
		System.out.println(w5);
		
	}
	
	
}
