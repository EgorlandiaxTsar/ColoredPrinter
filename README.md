# Rainbow Colors For Java
## __Description__
This small library helps You to print beautiful colored text in console, this library is very easy to use, the manual is provided down below
___
## __Manual__
### *Step 1:*
For first You have to create an instance of 'RainbowColors' class (pkg: com.egorgoncharov.coloredprinter.ColoredPrinter):
```java
public class Main {
    public static void main (String[] args) {
        ColoredPrinter printer = new RainbowColors(); //Creating a new instance of 'RainbowColors' class    
    }
}
```
In constructor You can put initial text color and/or initial text, also is allowed to pass another instance of ```RainbowColors``` class.
___
### *Step 2:*
Now we can continue by adding a text in our instance:
```java
public class Main {
    public static void main (String[] args) {
        ColoredPrinter printer = new RainbowColors();        
        printer.put("Hello world!"); //Adding some text to our string
    }
}
```
Then, let's add some colored text and colored background:
```java
public class Main {
    public static void main (String[] args) {
        ColoredPrinter printer = new RainbowColors();        
        printer.put("Hello world!");
        printer.beginTextColoring("FF2828"); //Starting text coloring
        printer.beginBackgroundColoring("FFD3D3"); //Starting background coloring
        printer.put("Red text on light-pink background <3");
    }
}
```
In methods ```beginTextColorng()``` and ```beginBackgroundColoring()``` You can pass also a ```Color``` class instance (pkg: java.awt.Color) or an int array with rgb values: note that if array size isn't equal to 3 then ```IllegalArgumentException``` will be thrown. Also, if you don't want to create your color, you can use method ```putANSI()``` and pass a static constant of class ```RainbowColor``` as color (a lot of colors are available!)<br>
In this library You can add also emphasis:
```java
public class Main {
    public static void main (String[] args) {
        ColoredPrinter printer = new RainbowColors();        
        printer.put("Hello world!");
        printer.beginTextColoring("FF2828");
        printer.beginBackgroundColoring("FFD3D3");
        printer.beginTextBolding(); //Starting text bolding
        printer.beginTextItalics(); //Starting text italics
        printer.beginTextUnderlining(); //Starting text underlining
        printer.beginTextReversing(); //Starting text reversing
        printer.put("Red text on light-pink background <3");
    }
}
```
After all operations, never forget to use method ```reset()```: after using it all graphics will be reset: text and background will become default:
```java
    public class Main {
        public static void main (String[] args) {
            ColoredPrinter printer = new RainbowColors();        
            printer.put("Hello world!\n");
            printer.beginTextColoring("FF2828");
            printer.beginBackgroundColoring("FFD3D3");
            printer.beginTextBolding();
            printer.beginTextItalics();
            printer.beginTextUnderlining();
            printer.beginTextReversing();
            printer.put("Red text on light-pink background <3");
            printer.reset(); //Reset graphics
        }
    }
```
If You want to do some manipulations with string, You can access to variable ```'instance'.accumulatedString``` and modify it:
```java
public class Main {
    public static void main (String[] args) {
        ColoredPrinter printer = new RainbowColors();        
            printer.put("Hello world!\n");
            printer.beginTextColoring("FF2828");
            printer.beginBackgroundColoring("FFD3D3");
            printer.beginTextBolding();
            printer.beginTextItalics();
            printer.beginTextUnderlining();
            printer.beginTextReversing();
            printer.put("Red text on light-pink background <3");
            printer.reset();
            printer.updateAccumulatedText(printer.accumulatedString.replaceAll('world', 'Java')); //Updating accumulated text
    }
}
```
___
### *Step 3*:
Finally, after all manipulations, let's print the string:
```java
    public class Main {
        public static void main (String[] args) {
            ColoredPrinter printer = new RainbowColors();        
            printer.put("Hello world!\n");
            printer.beginTextColoring("FF2828");
            printer.beginBackgroundColoring("FFD3D3");
            printer.beginTextBolding();
            printer.beginTextItalics();
            printer.beginTextUnderlining();
            printer.beginTextReversing();
            printer.put("Red text on light-pink background <3");
            printer.reset();
            printer.updateAccumulatedText(printer.accumulatedString.replaceAll('world', 'Java'));
            printer.log(); //Prints text and line 
            printer.print(); //Prints text
        }
    }
```
You can use method ```log()```, it's analog of ```System.out.println()``` or ```print()```, which is equal to ```System.out.print()```