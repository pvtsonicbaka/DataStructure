package Practice;

import java.awt.Color;
import java.io.PrintStream;

public class ColorExample {
    public static void main(String[] args) {
        PrintStream out = new PrintStream(System.out, true);
        out.println(colorize("Hello, Red!", new Color(255, 0, 0)));
        out.println(colorize("Hello, Green!", new Color(0, 255, 0)));
        out.println(colorize("Hello, Blue!", new Color(0, 0, 255)));
        System.out.println(new Color(0,0,255));
    }

    private static String colorize(String text, Color color) {
        return "\033[38;2;" + color.getRed() + ";" + color.getGreen() + ";" + color.getBlue() + "m" + text + "\033[0m";
    }
}