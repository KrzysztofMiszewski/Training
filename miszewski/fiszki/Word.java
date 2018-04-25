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
	
	public void setNextWord(Word nextWord){
		this.nextWord = nextWord;
	}
	
	public void setPreviousWord(Word previousWord){
		this.previousWord = previousWord;
	}
	
	public Word getNextWord(){
		return nextWord;
	}
	
	public Word getPreviousWord(){
		return previousWord;
	}
	
	public String getPolish(){
		return polish;
	}
	
	public void printWord(){
		System.out.println(kanji + " " + onyomi + " " + kunyomi + " " + polish);
	}
}