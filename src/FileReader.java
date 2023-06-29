import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {


    public static List<String> lista(String filePath) {
        List<String> lista = new ArrayList<>();
        File file = new File(filePath);
        Scanner sc = null;
        try {sc = new Scanner(file);

            while (sc.hasNextLine()) {


            }
        }catch ()


    }

}
