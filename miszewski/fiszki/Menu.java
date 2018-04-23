package miszewski.fiszki;

public class Menu{
	
	private final int MENU_EXIT = 0;
	
	public void Menu(){
		
	}
	
	public void start(){
		do {
			System.out.println("Wybierz opcje");
			System.out.println("0 - Koniec");
			System.out.println("1 - Zaladuj plik");
			int choice = getUserChoiceFromMenu();
			switch (choice) {
				case MENU_EXIT:
					System.exit(0);
				default:
					System.out.println("Zly numer");
			}
		} while (true);
	}

	private static String getUserInput(String msg) {
        System.out.print("-->>> " + msg);
        return System.console().readLine();
    }
	public static int getUserChoiceFromMenu() {
        System.out.println();
        return Integer.parseInt(getUserInput("Podaj opcje, ktora wybierasz: "));
    }
}