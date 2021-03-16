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
	public void addWord(Word w) {
		if (mappaTraduzione.containsKey(w.getAlienWord())) {
			mappaTraduzione.remove(w.getAlienWord());
		}
		mappaTraduzione.put(w.getAlienWord(), w);
	}
	
	/**
	 * Traduce la parola passata come parametro
	 * @param alienWord
	 * @return
	 */
	public Word translateWord(String alienWord) {
//		if (mappaTraduzione.containsKey(alienWord)) {
//		return mappaTraduzione.get(alienWord);
//		} else {
//			return null;
//		}	
		
		return mappaTraduzione.get(alienWord);
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
