package Assignment4;

import java.util.Scanner;

public class ReverseEntireString {
    public static void main(String[] args)
    {

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        StringBuilder reverse = new StringBuilder("This is Java Class");


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse.append(str.charAt(i));
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}

//In the above code, we are basically reading in a String from the user afterwhich we will begin an iteration loop
// that will build the new reversed String. This is done in the “for” loop by obtaining the characters of the original String
// individually from the end by using the “charAt” function of the String class and concatenating them to a new
// String by using the “+” operator.