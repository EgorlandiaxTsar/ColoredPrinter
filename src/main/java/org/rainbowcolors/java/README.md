# Rainbow Colors For Java
## __Description__
This small library helps You to print beautiful colored text in console, this library is very easy to use, the manual is provided down below
___
## __Manual__
### *Step 1:*
For first You have to create an instance of 'RainbowColors' class (pkg: org.rainbowcolors.java.RainbowColors):
```java
public class Main {
    public static void main (String[] args) {
        RainbowColors rc = new RainbowColors(); //Creating a new instance of 'RainbowColors' class    
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
        RainbowColors rc = new RainbowColors();        
        rc.put("Hello world!"); //Adding some text to our string
    }
}
```
Then, let's add some colored text and colored background:
```java
public class Main {
    public static void main (String[] args) {
        RainbowColors rc = new RainbowColors();        
        rc.put("Hello world!");
        rc.beginTextColoring("FF2828"); //Starting text coloring
        rc.beginBackgroundColoring("FFD3D3"); //Starting background coloring
        rc.put("Red text on light-pink background <3");
    }
}
```
In methods ```beginTextColorng()``` and ```beginBackgroundColoring()``` You can pass also a ```Color``` class instance (pkg: java.awt.Color) or an int array with rgb values: note that if array size isn't equal to 3 then ```IllegalArgumentException``` will be thrown. Also, if you don't want to create your color, you can use method ```putANSI()``` and pass a static constant of class ```RainbowColor``` as color (a lot of colors are available!)<br>
In this library You can add also emphasis:
```java
public class Main {
    public static void main (String[] args) {
        RainbowColors rc = new RainbowColors();        
        rc.put("Hello world!");
        rc.beginTextColoring("FF2828");
        rc.beginBackgroundColoring("FFD3D3");
        rc.beginTextBolding(); //Starting text bolding
        rc.beginTextItalics(); //Starting text italics
        rc.beginTextUnderlining(); //Starting text underlining
        rc.beginTextReversing(); //Starting text reversing
        rc.put("Red text on light-pink background <3");
    }
}
```
After all operations, never forget to use method ```reset()```: after using it all graphics will be reset: text and background will become default:
```java
    public class Main {
        public static void main (String[] args) {
            RainbowColors rc = new RainbowColors();        
            rc.put("Hello world!\n");
            rc.beginTextColoring("FF2828");
            rc.beginBackgroundColoring("FFD3D3");
            rc.beginTextBolding();
            rc.beginTextItalics();
            rc.beginTextUnderlining();
            rc.beginTextReversing();
            rc.put("Red text on light-pink background <3");
            rc.reset(); //Reset graphics
        }
    }
```
If You want to do some manipulations with string, You can access to variable ```'instance'.accumulatedString``` and modify it:
```java
public class Main {
    public static void main (String[] args) {
        RainbowColors rc = new RainbowColors();        
            rc.put("Hello world!\n");
            rc.beginTextColoring("FF2828");
            rc.beginBackgroundColoring("FFD3D3");
            rc.beginTextBolding();
            rc.beginTextItalics();
            rc.beginTextUnderlining();
            rc.beginTextReversing();
            rc.put("Red text on light-pink background <3");
            rc.reset();
            rc.updateAccumulatedText(rc.accumulatedString.replaceAll('world', 'Java')); //Updating accumulated text
    }
}
```
___
### *Step 3*:
Finally, after all manipulations, let's print the string:
```java
    public class Main {
        public static void main (String[] args) {
            RainbowColors rc = new RainbowColors();        
            rc.put("Hello world!\n");
            rc.beginTextColoring("FF2828");
            rc.beginBackgroundColoring("FFD3D3");
            rc.beginTextBolding();
            rc.beginTextItalics();
            rc.beginTextUnderlining();
            rc.beginTextReversing();
            rc.put("Red text on light-pink background <3");
            rc.reset();
            rc.updateAccumulatedText(rc.accumulatedString.replaceAll('world', 'Java'));
            rc.log(); //Prints text and line 
            rc.print(); //Prints text
        }
    }
```
You can use method ```log()```, it's analog of ```System.out.println()``` or ```print()```, which is equal to ```System.out.print()```
___
## __Note__
* This library is absolutely free, so You can do unlimited copies of it and/or share it
* It's the first version, so if this library has some bugs, please be kind and write about that bug in issues panel on GitHub
* This library is written on Java v11.0.7