package Assignment4;

public class ReverseEachWord {
    public static void main(String[] args){
        StringBuffer buff1 = new StringBuffer("This is a Java Class");
        System.out.println("buffer ="+buff1);
        //reverses the character of the buffer and prints it
        System.out.println("reverse="+buff1.reverse());
    }
}
