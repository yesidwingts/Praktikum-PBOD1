/*Nama file : UserInputValidator.java
 *Nama/NIM  : Yesi Dwi Ningtias/24060122120027
 Praktikum PBO D1 - Pertemuan 3
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidator {
    public static void validateUsername(String username) {
        assert username.length() >= 5 : "Username must be at least 5 characters long.";
        assert username.length() <= 20 : "Username must be at most 20 characters long.";
        
        Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]+");
        Matcher matcher = pattern.matcher(username);
        assert matcher.matches() : "Invalid username.";
    }

    public static void validateEmail(String email) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(email);
        assert matcher.matches() : "Invalid email address.";
    }

    public static void validateAge(int age) {
        assert age >= 17 && age <= 99 : "Age must be between 17 and 99.";
    }
}
