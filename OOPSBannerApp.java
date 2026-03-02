import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner(word, patternMap);
    }

    // Build pattern storage using HashMap
    private static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        });

        return map;
    }

    // Render banner using nested loops + StringBuilder
    private static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("   ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}