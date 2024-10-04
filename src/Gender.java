public class Gender {
    public static char parseGender(String gender) {
        if (gender.length() != 1 || (gender.charAt(0) != 'M' && gender.charAt(0) != 'F')) {
            throw new IllegalArgumentException("Вы ввели неверный формат пола");
        }
        return gender.toLowerCase().charAt(0);
    }
}
