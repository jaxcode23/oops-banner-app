import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPatternMap pattern = CharacterPatternMap.getPattern(ch);
                lineBuilder.append(pattern.getPattern()[i]).append("   ");
            }

            banner[i] = lineBuilder.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static Inner Class for Character Pattern Management
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        private static final Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        static {
            patternMap.put('O', new CharacterPatternMap('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            patternMap.put('P', new CharacterPatternMap('P', new String[]{
                    "****** ",
                    "*     *",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      ",
                    "*      "
            }));

            patternMap.put('S', new CharacterPatternMap('S', new String[]{
                    " ******",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ******"
            }));
        }

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }

        public static CharacterPatternMap getPattern(char ch) {
            return patternMap.get(ch);
        }
    }
}