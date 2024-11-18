import lection2.Exceptions.WrongLoginException;
import static lection2.UserValidator.validateUser;

public class Main {
    public static void main(String[] args) throws WrongLoginException {
        System.out.println(validateUser("user123", "pass123", "pass123")); // true
        System.out.println(validateUser("user123", "pass123", "pass1234")); // false
        System.out.println(validateUser("user123_", "pass123", "pass123")); // true
        System.out.println(validateUser("user123_", "pass123", "pass1234")); // false
        System.out.println(validateUser("user123_", "pass123_ ", "pass123_ ")); // false
        System.out.println(validateUser("user123_", "pass123_", "pass123")); // true
        System.out.println(validateUser("user123_", "pass123_", "pass123_")); // false
        System.out.println(validateUser("user123_", "pass123_", "pass123_")); // false
        System.out.println(validateUser("user123", "pass123", "pass1234")); // false
        System.out.println(validateUser("user123", "pass123", "pass123")); // true
    }
}
