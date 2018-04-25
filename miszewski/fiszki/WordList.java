package miszewski.fiszki;

public class WordList{
	
	private int length = 0;
	private Word lastWord;
	private Word firstWord;
	
	public void addWord(Word word){
		if (firstWord == null){
			firstWord = word;
			lastWord = word;
			length++;
		} else {
			lastWord.setNextWord(word);
			word.setPreviousWord(lastWord);
			lastWord = word;
			length++;
		}
	}
	
	public Word getWord(int place){
		switch (place) {
			case 0:
				return null;
			case 1:
				return firstWord;
			default:
				Word word = firstWord;
				for (int i = 2; i <= place; i++){
					word = word.getNextWord();
				}
				return word;
		}
	}
	
	public Word getFirstWord(){
		return firstWord;
	}
}