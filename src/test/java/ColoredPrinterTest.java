import com.egorgoncharov.coloredprinter.ColoredPrinter;

public class ColoredPrinterTest {
    public static void main(String[] args) {
        ColoredPrinter rc = new ColoredPrinter();
        rc.put("Weather bot\n");
        rc.beginTextColoring("#ffffff");
        rc.beginBackgroundColoring("#000000");
        rc.beginTextBolding();
        rc.beginTextItalics();
        rc.beginTextUnderlining();
        rc.put("Today in New York is raining, and temperature is -2 C°\n");
        rc.reset();
        rc.putANSI(ColoredPrinter.GREEN_BOLD_BRIGHT);
        rc.put("Have a good day");
        rc.reset();
        rc.log();
    }
}
