import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные в данном формате: Фамилия Имя Отчество ДатаРождения НомерТелефона, Пол: ");

        try {
            String [] parts = sc.nextLine().split(" ");
            if (parts.length != 6) {
                throw new IllegalArgumentException("Вы ввели неверное количество данных");
            }

            String surname = parts[0];
            String name = parts[1];
            String midname = parts[2];

            LocalDate date = Date.parseDate(parts[3]);

            int phoneNumber = PhoneNumber.parsePhoneNumber(parts[4]);

            char gender = Gender.parseGender(parts[5]);

            Write.writeToFile(surname, name, midname, date, phoneNumber, gender);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка формата даты");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}