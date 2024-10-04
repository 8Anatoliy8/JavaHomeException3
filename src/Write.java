import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Write {
    public static void writeToFile(String surname, String name, String midname, LocalDate birthday, int phoneNumber, char gender) throws IOException {
        String fileName = surname + ".txt";
        String line = String.format("%s, %s, %s, %s, %d, %c",surname, name, midname, birthday,phoneNumber, gender);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(line);
            bw.newLine();
        }
    }
}
