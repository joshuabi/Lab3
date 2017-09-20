import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * Gets word count of an HTML file.
 * @author Josh
 *
 */

public class CorrectStyling {
    /**
    *
    * Scans HTML file.
    * @return
    *
   **/
       public static String urlToString(final String url) {
           Scanner urlScanner;
           try {
               urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
           } catch (IOException e) {
               return "";
           }
           String contents = urlScanner.useDelimiter("\\A").next();
           urlScanner.close();
           return contents;
       }

       public static void main(String args[])
       {
          String s = urlToString("http://erdani.com/tdpl/hamlet.txt");
          System.out.println(s);
          int count = 0;

          for (int i=1;i<s.length(); i++)
          {
              if (s.charAt(i) == ' ' || s.charAt(i)=='\n')
                  if(s.charAt(i-1) != ' ' && s.charAt(i-1)!='\n')
                  {
                      count++;
                  }
          }
          System.out.println(count);
       }
   }
