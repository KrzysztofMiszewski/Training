package miszewski.fiszki;

public class Word{
	
	private final String kanji;
	private final String onyomi;
	private final String kunyomi;
	private final String polish;
	private Word nextWord;
	private Word previousWord;
	
	public Word(String kanji, String onyomi, String kunyomi, String polish){
		this.kanji = kanji;
		this.onyomi = onyomi;
		this.kunyomi = kunyomi;
		this.polish = polish;
	}
	
}