
import java.util.Scanner;

public class uzz
{
     public static String uz(String word)
     {
          String a="";
          String b="";
          switch (word) {
              case "hoes": a="huzz"; break;
              case "bros": a="bruzz"; break;
              default: 
                    if(word.length()>3)
                    {
                         b=word.substring(0, word.length()-2);
                         a=b+"uzz";
                    }        
          }
          return a;
     }
     public static void main(String[] args)
     {
          Scanner in=new Scanner(System.in);
         boolean state=true;
         while(state)
         {
           String word=in.nextLine();
         word=uz(word);
         System.out.println(word);
         }
     }
}
