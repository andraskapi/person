import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = FileReader.readHandler("person.txt");
        List<Person> people = new ArrayList<>();
        for (var lista: lines ){
            String[] lineAsArray = lista.split(",");
            String name = lineAsArray[0];
            int age = Integer.parseInt(lineAsArray[1]);
            Gender gender = lineAsArray[2].equals("férfi") ? Gender.MALE : Gender.FEMALE;

            Person actual = new Person(name,age,gender);
         people.add( new Person(lineAsArray[0],
                    Integer.parseInt(lineAsArray[1]),
                    lineAsArray[2].equals("férfi") ? Gender.MALE : Gender.FEMALE ) );
        }
        for (var actual : people
             ) {
            System.out.println(actual);

        }



    }
}
