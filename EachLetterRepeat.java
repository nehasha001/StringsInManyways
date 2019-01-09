package Assignment4;

import java.util.Arrays;

public class EachLetterRepeat {
        public static void main(String[] args)
        {
            String s1="This is Java class";
            int count=0;
            for(int i=0;i<=s1.length()-1;i++)
            {
                char c1=s1.charAt(i);
                for(int j=0;j<=s1.length()-1;j++)
                {
                    if(s1.charAt(i)==s1.charAt(j))
                    {
                        count=count+1;
                    }
                }
                System.out.println(s1.charAt(i)+"-"+count);
                count=0;
            }
        }
    }