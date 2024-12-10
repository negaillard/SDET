package lection2;

import lection2.Exceptions.WrongLoginException;
import lection2.Exceptions.WrongPasswordException;

public class UserValidator {
    private static boolean isValidlogin(String login){
        return login != null && login.length() < 20 && login.matches("^[a-zA-Z0-9_]+$");
    }

    private static boolean isValidPassword(String password, String confirmPassword) {
        if (password == null || password.length() >= 20 || !password.equals(confirmPassword)) {
            return false;
        }
        return password.matches("^[a-zA-Z0-9_]+$");
    }

    public static boolean validateUser(String login, String password, String confirmPassword) throws WrongLoginException {
        try{
             if(!isValidlogin(login)){ throw new WrongLoginException("Неверный логин");}
             if(!isValidPassword(password, confirmPassword)){ throw new WrongPasswordException("Неверный пароль");}
        } catch (WrongPasswordException | WrongLoginException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return false;
        }
        return true;
    }
}
