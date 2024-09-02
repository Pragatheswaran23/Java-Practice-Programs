package Senario;

import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine().toUpperCase();

        printStarString(input);
    }

    public static void printStarString(String input) {
        String[] patterns = new String[5]; // To store each row of the pattern
        for (int i = 0; i < patterns.length; i++) {
            patterns[i] = "";
        }

        for (char ch : input.toCharArray()) {
            String[] letterPattern = getLetterPattern(ch);
            for (int i = 0; i < patterns.length; i++) {
                patterns[i] += letterPattern[i] + "  "; // Add some space between letters
            }
        }

        for (String line : patterns) {
            System.out.println(line);
        }
    }

    public static String[] getLetterPattern(char letter) {
        switch (letter) {
            case 'A':
                return new String[] {
                        "  *  ",
                        " * * ",
                        "*****",
                        "*   *",
                        "*   *"
                };
            case 'B':
                return new String[] {
                        "**** ",
                        "*   *",
                        "**** ",
                        "*   *",
                        "**** "
                };
            case 'C':
                return new String[] {
                        " ****",
                        "*    ",
                        "*    ",
                        "*    ",
                        " ****"
                };
            case 'D':
                return new String[] {
                        "**** ",
                        "*   *",
                        "*   *",
                        "*   *",
                        "**** "
                };
            case 'E':
                return new String[] {
                        "*****",
                        "*    ",
                        "*****",
                        "*    ",
                        "*****"
                };
            case 'F':
                return new String[] {
                        "*****",
                        "*    ",
                        "*****",
                        "*    ",
                        "*    "
                };
            case 'G':
                return new String[] {
                        " ****",
                        "*    ",
                        "*  **",
                        "*   *",
                        " ****"
                };
            case 'H':
                return new String[] {
                        "*   *",
                        "*   *",
                        "*****",
                        "*   *",
                        "*   *"
                };
            case 'I':
                return new String[] {
                        " *** ",
                        "  *  ",
                        "  *  ",
                        "  *  ",
                        " *** "
                };
            case 'J':
                return new String[] {
                        "  ***",
                        "   * ",
                        "   * ",
                        "*  * ",
                        " **  "
                };
            case 'K':
                return new String[] {
                        "*   *",
                        "*  * ",
                        "***  ",
                        "*  * ",
                        "*   *"
                };
            case 'L':
                return new String[] {
                        "*    ",
                        "*    ",
                        "*    ",
                        "*    ",
                        "*****"
                };
            case 'M':
                return new String[] {
                        "*   *",
                        "** **",
                        "* * *",
                        "*   *",
                        "*   *"
                };
            case 'N':
                return new String[] {
                        "*   *",
                        "**  *",
                        "* * *",
                        "*  **",
                        "*   *"
                };
            case 'O':
                return new String[] {
                        " *** ",
                        "*   *",
                        "*   *",
                        "*   *",
                        " *** "
                };
            case 'P':
                return new String[] {
                        "**** ",
                        "*   *",
                        "**** ",
                        "*    ",
                        "*    "
                };
            case 'Q':
                return new String[] {
                        " *** ",
                        "*   *",
                        "* * *",
                        "*  **",
                        " *** "
                };
            case 'R':
                return new String[] {
                        "**** ",
                        "*   *",
                        "**** ",
                        "*  * ",
                        "*   *"
                };
            case 'S':
                return new String[] {
                        " ****",
                        "*    ",
                        " *** ",
                        "    *",
                        "**** "
                };
            case 'T':
                return new String[] {
                        "*****",
                        "  *  ",
                        "  *  ",
                        "  *  ",
                        "  *  "
                };
            case 'U':
                return new String[] {
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        " *** "
                };
            case 'V':
                return new String[] {
                        "*   *",
                        "*   *",
                        "*   *",
                        " * * ",
                        "  *  "
                };
            case 'W':
                return new String[] {
                        "*   *",
                        "*   *",
                        "* * *",
                        "** **",
                        "*   *"
                };
            case 'X':
                return new String[] {
                        "*   *",
                        " * * ",
                        "  *  ",
                        " * * ",
                        "*   *"
                };
            case 'Y':
                return new String[] {
                        "*   *",
                        " * * ",
                        "  *  ",
                        "  *  ",
                        "  *  "
                };
            case 'Z':
                return new String[] {
                        "*****",
                        "   * ",
                        "  *  ",
                        " *   ",
                        "*****"
                };
            default:
                return new String[] {
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     "
                };
        }
    }
}
