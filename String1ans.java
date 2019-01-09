package Assignment4;
//How many words in a String?
public class String1ans {
    public static void main(String[] args){
        String s="This is a java class";
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++)
        {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
            {
                count++;

            }
        }
        System.out.println("Number of words in a string = " + count);
    }
}

