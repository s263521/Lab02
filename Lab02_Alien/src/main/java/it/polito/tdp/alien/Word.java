package it.polito.tdp.alien;

import java.util.HashMap;
import java.util.Map;

public class Word {

	private String alienWord;
	private String translation;
	private AlienDictionary ad;
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
//	public boolean equals(String alienWord) {
//		if (ad.getMappaTraduzione().containsKey(alienWord)) 
//			return true;
//		else 
//			return false;
//	}

	
	@Override
	public String toString() {
		return "alienWord= " + alienWord + ", translation= " + translation + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
	
	
	
	
	

}
