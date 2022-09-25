import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("War.txt");
        MethodCountWord word = new MethodCountWord();
        int number = word.countInputWord(file);
        if (number == 0) {
            System.out.println("В первом томе Война и мир не найдено ни одного слова страдание");
        } else {
            System.out.println("Первый том Война и мир содержит "+number+" слов страдание");
        }
        MethodCountWord array = new MethodCountWord();
        ArrayList<String> lines = array.countScanner(file);
        System.out.println(lines.size());
        for (int i=1;i<=10;i++) {
            for (int j=1;j<=10;j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
