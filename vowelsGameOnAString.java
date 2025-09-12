public class vowelsGameOnAString {
    public boolean doesAliceWin(String s) {
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                return true;    // at least one vowel -> Alice wins
            }
        }
        return false;           // no vowels -> Bob wins
    }
}
