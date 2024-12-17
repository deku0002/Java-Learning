public class Main{
    public static void main(String[]args){
        String bulletIt = "Print a Bulleted List\n"+
                "\u2022 First Point😊😢🥵❤️\n" +
                "\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";
        String textblock = """
                Print a Bulleted List:
                            \u2022 First Point
                                \u2022 Sub Point""";
        System.out.println(textBlock);
    }
}