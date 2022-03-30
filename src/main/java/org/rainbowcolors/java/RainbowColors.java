package org.rainbowcolors.java;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class RainbowColors {
    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";
    public static final String BLACK_BOLD = "\033[1;30m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final String WHITE_BOLD = "\033[1;37m";
    public static final String BLACK_UNDERLINED = "\033[4;30m";
    public static final String RED_UNDERLINED = "\033[4;31m";
    public static final String GREEN_UNDERLINED = "\033[4;32m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static final String BLUE_UNDERLINED = "\033[4;34m";
    public static final String PURPLE_UNDERLINED = "\033[4;35m";
    public static final String CYAN_UNDERLINED = "\033[4;36m";
    public static final String WHITE_UNDERLINED = "\033[4;37m";
    public static final String BLACK_BACKGROUND = "\033[40m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String YELLOW_BACKGROUND = "\033[43m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";
    public static final String CYAN_BACKGROUND = "\033[46m";
    public static final String WHITE_BACKGROUND = "\033[47m";
    public static final String BLACK_BRIGHT = "\033[0;90m";
    public static final String RED_BRIGHT = "\033[0;91m";
    public static final String GREEN_BRIGHT = "\033[0;92m";
    public static final String YELLOW_BRIGHT = "\033[0;93m";
    public static final String BLUE_BRIGHT = "\033[0;94m";
    public static final String PURPLE_BRIGHT = "\033[0;95m";
    public static final String CYAN_BRIGHT = "\033[0;96m";
    public static final String WHITE_BRIGHT = "\033[0;97m";
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m";
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m";
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";

    public String accumulatedText = "";

    public RainbowColors (String initialText) {
        this.accumulatedText = initialText;
    }

    public RainbowColors (String initialText, int[] initialColor) {
        this.accumulatedText = "";
        beginTextColoring(initialColor);
        this.accumulatedText += initialText;
    }

    @Contract(pure = true)
    public RainbowColors (@NotNull RainbowColors rc) {
        accumulatedText = rc.accumulatedText;
    }

    public RainbowColors () {}

    public void print(String text) {
        System.out.print(text);
    }

    public void print() {
        System.out.print(accumulatedText);
    }

    public void log (String text) {
        System.out.println(text);
    }

    public void log () {
        log(accumulatedText);
    }

    public void put (String text) {
        accumulatedText += text;
    }

    public void beginTextColoring (int @NotNull [] rgb) {
        if (rgb.length != 3) {
            throw new IllegalArgumentException("");
        }
        put("\033[38;2;" + rgb[0] + ";" + rgb[1] + ";" + rgb[2] + "m");
    }

    public void putANSI (String ansi) {
        put(ansi);
    }

    public void beginTextColoring (@NotNull Color color) {
        put("\033[38;2;" + color.getRed() + ";" + color.getGreen() + ";" + color.getBlue() + "m");
    }

    public void beginTextColoring (@NotNull String hex) {
        Color color = Color.decode(!hex.startsWith("#") ? "#" + hex : hex);
        beginTextColoring(color);
    }

    public void beginBackgroundColoring (int @NotNull [] rgb) {
        if (rgb.length != 3) {
            throw new IllegalArgumentException("");
        }
        put("\033[48;2;" + rgb[0] + ";" + rgb[1] + ";" + rgb[2] + "m");
    }

    public void beginBackgroundColoring (@NotNull Color color) {
        put("\033[48;2;" + color.getRed() + ";" + color.getGreen() + ";" + color.getBlue() + "m");
    }

    public void beginBackgroundColoring (@NotNull String hex) {
        Color color = Color.decode(!hex.startsWith("#") ? "#" + hex : hex);
        beginBackgroundColoring(color);
    }

    public void beginTextUnderlining () {
        put("\u001b[4m");
    }

    public void beginTextBolding () {
        put("\u001b[1m");
    }

    public void beginTextItalics () {
        put("\u001b[3m");
    }

    public void beginTextReversing() {
        put("\u001b[7m");
    }

    public void reset () {
        put("\u001B[0m");
    }

    public void clearAccumulatedString () {
        accumulatedText = "";
    }

    public void updateAccumulatedText (String update) {
        accumulatedText = update;
    }
}
