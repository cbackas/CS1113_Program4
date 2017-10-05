// Zachary Gibson
// 60975
// Project 4

import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Project 4: Braille by Zac Gibson");
        System.out.println("Enter some words:");

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            printBraille(s);
        }
    }

    public static void printBraille(String text) {
        final String letters = "abcdefghijklmnopqrstuvwxyz1234567890 ";
        final String code1 = ". . ..... .....  . .. . ..... .....  . .. .  ...... . . ..... .....  . .  ";
        final String code2 = "  .    . .. ..... ..  .    . .. ..... ..  . ..   . .  .    . .. ..... ..  ";
        final String code3 = "                    . . . . . . . . . . .... .......                      ";

        System.out.println("");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.print(" " + ch + " ");
        }

        System.out.println("");
        System.out.print("|");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int indexLetters = letters.indexOf(ch + "") * 2;
            char c1 = code1.charAt(indexLetters);
            char c2 = code1.charAt(indexLetters + 1);
            System.out.print(c1 + "" + c2 + "|");
        }

        System.out.println("");
        System.out.print("|");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int indexLetters = letters.indexOf(ch + "") * 2;
            char c1 = code2.charAt(indexLetters);
            char c2 = code2.charAt(indexLetters + 1);
            System.out.print(c1 + "" + c2 + "|");
        }

        System.out.println("");
        System.out.print("|");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int indexLetters = letters.indexOf(ch + "") * 2;
            char c1 = code3.charAt(indexLetters);
            char c2 = code3.charAt(indexLetters + 1);
            System.out.print(c1 + "" + c2 + "|");
        }
        System.out.println("");
    }
}
