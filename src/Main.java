import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("War.txt");
        MethodCountWord word = new MethodCountWord();
        int number = word.countInputWord(file);
        if (number == 0) {
            System.out.println("� ������ ���� ����� � ��� �� ������� �� ������ ����� ���������");
        } else {
            System.out.println("������ ��� ����� � ��� �������� "+number+" ���� ���������");
        }
        MethodCountWord array = new MethodCountWord();
        ArrayList<String> lines = array.countScanner(file);
        System.out.println(lines.size());
    }
}
