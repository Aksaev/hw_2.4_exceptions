public class Main {
    public static void main(String[] args) {
        boolean result = Data.validate(
                "java_skyprogo",
                "D_1hWiKjjP_9",
                "D_1hWiKjjP_9"
        );
        if (result) {
            System.out.println("Логин и пароль коректные!");
        } else {
            System.out.println("Логин и/или пароль некоректные!");
        }
    }
}