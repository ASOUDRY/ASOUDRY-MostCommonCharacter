import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        // find the key with the highest value in the HashMap
        char mostCommonChar = ' ';
        int highestCount = 0;
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostCommonChar = entry.getKey();
                highestCount = entry.getValue();
            }
        }
        return mostCommonChar;
    }
}
