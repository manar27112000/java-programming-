package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_ex {

    public static void main(String[] args) {
        //way 1
        Pattern pattern = Pattern.compile(".m");
        Matcher macher = pattern.matcher("am");
        boolean b = macher.matches();
        System.out.println(b);

        //way 2
        boolean b1 = Pattern.compile(".m").matcher("am").matches();
        System.out.println(b1);

        //way 3
        boolean b2 = Pattern.matches(".m", "am");
        System.out.println(b2);
/***************************************************************************/
        boolean b3 = Pattern.matches("[abcd]", "c");
        System.out.println(b3);

        boolean b4 = Pattern.matches("[abcd]", "m");
        System.out.println(b4);

        boolean b5 = Pattern.matches("[^abcd]", "c");
        System.out.println(b5);

        boolean b6 = Pattern.matches("[^abcd]", "m");
        System.out.println(b6);

        boolean b7 = Pattern.matches("[a-zA-Z]", "N123");
        System.out.println(b7);

        boolean b8 = Pattern.matches("[a-zA-Z]", "N123");
        System.out.println(b8);

        boolean b9 = Pattern.matches("[a-zA-Z&&[^agA]]", "m");
        System.out.println(b9);

        boolean b10 = Pattern.matches("[a-z&&[a-g]]", "fv");
        System.out.println(b10);

        boolean b11 = Pattern.matches("[ha]?", "a");
        System.out.println(b11);

        boolean b12 = Pattern.matches("[mm]?", "mmm");
        System.out.println(b12);

        boolean b13 = Pattern.matches("[muh]+", "mmmm");
        System.out.println(b13);

        boolean b14 = Pattern.matches("[muh]+", "mh");
        System.out.println(b14);

        boolean b15 = Pattern.matches("[muh]+", "mmuy");
        System.out.println(b15);


        boolean b16 = Pattern.matches("[muh]*", "mmuhhhmmm");
        System.out.println(b16);

        boolean b17 = Pattern.matches("m{3}", "mmm");
        System.out.println(b17);

        boolean b18 = Pattern.matches("m{3}", "mmmm");
        System.out.println(b18);

        boolean b19 = Pattern.matches("m{1,3}", "mm");
        System.out.println(b19);

        boolean b20 = Pattern.matches("m{4,}", "mmmmmmm");
        System.out.println(b20);
        System.out.println("**************************************************");

        boolean a = Pattern.matches("\\d", "123");
        System.out.println(a);
        boolean a1 = Pattern.matches("\\d", "1");
        System.out.println(a1);
        boolean a2 = Pattern.matches("\\d", "aa12");
        System.out.println(a2);
        boolean a3 = Pattern.matches("\\D", "123");
        System.out.println(a3);
        boolean a4 = Pattern.matches("\\D", "1");
        System.out.println(a4);
        boolean a5 = Pattern.matches("\\D", "aa12");
        System.out.println(a5);
        boolean a6 = Pattern.matches("\\D", "a");
        System.out.println(a6);
        System.out.println("*****************************************");

        boolean c = Pattern.matches("\\s", " ");
        System.out.println(c);
        boolean c1 = Pattern.matches("\\s", "55d");
        System.out.println(c1);
        boolean c2 = Pattern.matches("\\S", "f");
        System.out.println(c2);
        boolean c3 = Pattern.matches("\\S", " ");
        System.out.println(c3);
        boolean c4 = Pattern.matches("\\w", "1");
        System.out.println(c4);
        boolean c5 = Pattern.matches("\\w", "$");
        System.out.println(c5);
        boolean c6 = Pattern.matches("\\W", "a68");
        System.out.println(c6);
        boolean c7 = Pattern.matches("\\W", "$");
        System.out.println(c7);




    }
}
