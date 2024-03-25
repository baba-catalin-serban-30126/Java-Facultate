package isp.lab2.Exercise4StringSearch;

import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        String[] words = input.split(",");
int count = 0;
for (String word : words) {
if (word.contains(substring)) {
count++;
}
}
String[] result = new String[count];
int i = 0;
for (String word : words) {
if (word.contains(substring)) {
result[i] = word;
i++;
}
}
return result;

    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
