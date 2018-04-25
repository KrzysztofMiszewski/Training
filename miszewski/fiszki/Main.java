package miszewski.fiszki;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Main{
	
	private final Pattern pattern = Pattern.compile("(.*?);(.*?);(.*?);(.*)");
	
	private final int MENU_EXIT = 0;
	private final int LOAD_FILE = 1;
	private WordList wl;
	
	public void start(){
		do {
			System.out.println("Wybierz opcje");
			System.out.println("0 - Koniec");
			System.out.println("1 - Zaladuj plik");
			int choice = getUserChoiceFromMenu();
			switch (choice) {
				case MENU_EXIT:
					System.exit(0);
				case LOAD_FILE:
					loadFile();
					break;
				default:
					System.out.println("Zly numer");
			}
		} while (true);
	}
	
	private void loadFile(){
		if (this.wl == null){
			Path path = Paths.get("miszewski\\fiszki\\library.txt");
			try (Scanner sc = new Scanner(path)) {
				WordList wl = new WordList();
				while (sc.hasNextLine()){
					String line = sc.nextLine();
					Word word = createWord(line);
					wl.addWord(word);
				}
				System.out.println("Plik wczytany");
			} catch (IOException exs){
				System.out.println("Brak pliku");
			}
		} else {
			System.out.println("Plik juz zostal wczytany");
		}
	}
	
	private Word createWord(String line){
		Scanner sc = new Scanner(line);
		Word word;
		Matcher matcher = pattern.matcher(line);
		if (matcher.find()){
			sc.close();
			word = new Word(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4));
		} else {
			word = null;
		}
		sc.close();
		return word;
	}
	
	private String getUserInput(String msg) {
        System.out.print("-->>> " + msg);
        return System.console().readLine();
    }
	
	private int getUserChoiceFromMenu() {
        System.out.println();
        return Integer.parseInt(getUserInput("Podaj opcje, ktora wybierasz: "));
    }
}