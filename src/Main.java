import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Пустая строка");
            }

            // код, который обрабатывает введенные данные

        } catch (OutOfMemoryError e) {
            System.out.println("Ошибка: Не хватает памяти");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Объект не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: Недопустимое значение поля");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}