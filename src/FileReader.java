import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {


    public static List<String> readHandler(String filePath) {
        List<String> lines = new ArrayList<>();
        File file = new File(filePath);
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
            sc.close();

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage() + "A fájl nem található");
        }
        return lines;


    }

}
