import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        PasswordChecker checker = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите минимальную длину пароля:");
        String length = scanner.nextLine();
        checker.minLength = Integer.parseInt (length);
        checker.setMinLength(checker.minLength);

        System.out.print("Введите максимально допустимое количество повторений символа подряд:");
        String volume = scanner.nextLine();
        checker.maxRepeats = Integer.parseInt (volume);
        checker.setMaxRepeats(checker.maxRepeats);

        while (true){
            System.out.print("Введите пароль или end:");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            if (checker.verify(input)) {
                System.out.println("Подходит!");
            } else{
                System.out.println("Не подходит!");

            }

        }




    }
}