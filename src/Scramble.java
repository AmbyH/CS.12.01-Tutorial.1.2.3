import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Scramble {
    public static void scrambleOrRemove(List<String> wordList) {
        int i = 0;
        while (i < wordList.size()) {
            String originalWord = wordList.get(i);
            String scrambledWord = scrambleWord(originalWord);

            if (!originalWord.equals(scrambledWord)) {
                wordList.set(i, scrambledWord);
                i++;
            } else {
                wordList.remove(i);
            }
        }
    }

    public static String scrambleWord(String input) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length()-1) {
                out.append(input.charAt(i));
                return out.toString();
            }
            if (input.charAt(i) == 'A' && !(input.charAt(i + 1) == 'A')) {
                out.append(input.charAt(i + 1)).append(input.charAt(i));
                if (i + 1 == input.length()) {i = input.length();}
                else {
                    i = i+1;
                }
            }
            else {
                out.append(input.charAt(i));
            }
        }
        return out.toString();
    }
}
