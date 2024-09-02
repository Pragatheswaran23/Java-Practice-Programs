package Senario;

import java.util.Scanner;

public class FlameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String name1 = scanner.nextLine();

        System.out.println("Enter the second name: ");
        String name2 = scanner.nextLine();

        // Calculate the combined length after removing common characters
        int combinedLength = getCombinedLength(name1, name2);

        // Determine the FLAMES result
        String result = getFlamesResult(combinedLength);

        System.out.println("The FLAMES result is: " + result);
    }

    private static int getCombinedLength(String name1, String name2) {
        StringBuilder name1Builder = new StringBuilder(name1);
        StringBuilder name2Builder = new StringBuilder(name2);

        for (int i = 0; i < name1Builder.length(); i++) {
            char ch = name1Builder.charAt(i);
            int index = name2Builder.indexOf(Character.toString(ch));
            if (index != -1) {
                name1Builder.deleteCharAt(i);
                name2Builder.deleteCharAt(index);
                i--;
            }
        }

        return name1Builder.length() + name2Builder.length();
    }

    private static String getFlamesResult(int count) {
        String flames = "FLAMES";
        StringBuilder flamesBuilder = new StringBuilder(flames);

        int index = 0;
        while (flamesBuilder.length() > 1) {
            index = (index + count - 1) % flamesBuilder.length();
            flamesBuilder.deleteCharAt(index);
        }

        char resultChar = flamesBuilder.charAt(0);
        switch (resultChar) {
            case 'F':
                return "Friends";
            case 'L':
                return "Lovers";
            case 'A':
                return "Affectionate";
            case 'M':
                return "Marriage";
            case 'E':
                return "Enemies";
            case 'S':
                return "Siblings";
            default:
                return "Unknown";
        }
    }
}