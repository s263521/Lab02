package it.polito.tdp.alien;

import java.util.HashMap;
import java.util.Map;

public class AlienDictionary {

	Map<String, Word> mappaTraduzione;
	
	public AlienDictionary() {
		mappaTraduzione = new HashMap<>();
	}
	
	/**
	 * Aggiunge nel dizionario una parola con la rispettiva traduzione
	 * @param w
	 */
	public void addWord(String alienWord, String translation) {
		if (mappaTraduzione.containsKey(alienWord)) {
			mappaTraduzione.remove(alienWord);
		}
		Word w = new Word(alienWord, translation);
		mappaTraduzione.put(alienWord, w);
	}
	
	/**
	 * Traduce la parola passata come parametro
	 * @param alienWord
	 * @return
	 */
	public String translateWord(String alienWord) {
		Word w = mappaTraduzione.get(alienWord);
		String traduzione = w.getTranslation();
		return traduzione;
	}

	public Map<String, Word> getMappaTraduzione() {
		return mappaTraduzione;
	}

	@Override
	public String toString() {
		String s = "";
		for (Word w : mappaTraduzione.values()) {
			s += w.toString();
		}
		return s;
	}
	
	
}
