package pl.przydan.menu;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MenuRecipeViews implements MenuInterface {

    // klasa ze skanerem
    private Scanner scanner;

    @Override
    public void menuInit() {
        startMenu();
    }

    public MenuRecipeViews(Scanner scanner) {
        this.scanner = scanner;
    }

    public int startMenu() {
        printHeader();
        printMenuOptions();
        return getDecisionAfterEnter();
    }

    public int getDecision() {
        return scanner.nextInt();
    }

    private int getDecisionAfterEnter() {
        return readIntAndClearLine();
//        int menu = scanner.nextInt();
//        scanner.nextLine(); // istotne że tu to jest
//        return menu;
        //
    }

    private int readIntAndClearLine() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public String getPhrase() {
        return scanner.nextLine().trim();
    }


    private void printHeader() {
        System.out.println("|###########################################|");
        System.out.println("|###########=-Spis receptur ver1.0-=########|");
        System.out.println("|###########################################|");
        System.out.println();
    }

    private void printMenuOptions() {
        System.out.println("1. Szukaj receptury.");
        System.out.println("2. Dodaj recepturę.");
        System.out.println("3. Usuń recepturę.");
        System.out.println("4. Zmień recepturę.");
        System.out.println("5. Wyświetl wszystkie.");

        System.out.println("Wybierz opcję: ");
    }

    private void searchRecipe() {
        System.out.println("test 1");
    }

    private void addRecipe() {

        System.out.println("test 2");
    }

    private void deleteRecipe() {

        System.out.println("test 3");
    }

    private void updateRecipe() {

        System.out.println("test 4");
    }

    private void printAllRecipes() {

        System.out.println("test 5");
    }
}
