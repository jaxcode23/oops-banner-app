public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(" *****    *****    ******    ****** ");
        System.out.println("*     *  *     *   *     *   *      ");
        System.out.println("*     *  *     *   *     *   *      ");
        System.out.println("*     *  *     *   ******    *****  ");
        System.out.println("*     *  *     *   *              * ");
        System.out.println("*     *  *     *   *              * ");
        System.out.println(" *****    *****    *         ****** ");

    }
}public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all banner lines inside a String array
        String[] banner = {

                String.join("", " ***** ", "   ",
                        " ***** ", "   ",
                        " ****** ", "   ",
                        " ****** "),

                String.join("", "*     *", "  ",
                        "*     *", "   ",
                        "*     *", "   ",
                        "*      "),

                String.join("", "*     *", "  ",
                        "*     *", "   ",
                        "*     *", "   ",
                        "*      "),

                String.join("", "*     *", "  ",
                        "*     *", "   ",
                        "****** ", "   ",
                        " ***** "),

                String.join("", "*     *", "  ",
                        "*     *", "   ",
                        "*      ", "   ",
                        "      *"),

                String.join("", "*     *", "  ",
                        "*     *", "   ",
                        "*      ", "   ",
                        "      *"),

                String.join("", " ***** ", "   ",
                        " ***** ", "   ",
                        "*      ", "   ",
                        " ******")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}