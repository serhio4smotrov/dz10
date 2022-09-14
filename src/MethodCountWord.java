import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodCountWord {
   String s;
   Pattern regex = Pattern.compile("..страд..",Pattern.CASE_INSENSITIVE);
   Matcher matcher;
   int number = 0;
   public int countInputWord(File file) throws IOException {

      BufferedReader bf = new BufferedReader(new FileReader(file));
         while ((s = bf.readLine())!=null) {
            matcher = regex.matcher(s);
            if (matcher.find()) {
               number++;
            }
         }
      return number;
   }
   ArrayList<String> countScanner(File file) throws IOException {
      Scanner sc = new Scanner(file);
      ArrayList<String> words = new ArrayList<>();
      while (sc.hasNextLine()) {
         matcher = regex.matcher(sc.nextLine());
         if (matcher.find()) {
            words.add(sc.nextLine());
         }
      }
      return words;
   }
}
