import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String operator;
        double number1, number2;

        // Запрос первого числа у пользователя
        System.out.print("Введите первое число: ");
        number1 = scanner.nextDouble();

        // Запрос второго числа у пользователя
        System.out.print("Введите второе число: ");
        number2 = scanner.nextDouble();

        // Запрос оператора у пользователя
        System.out.print("Введите оператор (+, -, * или /): ");
        operator = scanner.next();

        // Вызов метода calculations для выполнения операции
        double result = calculations(number1, number2, operator);

        // Вывод результата
        System.out.println("Результат: " + result);
    }

    // Метод calculations выполняет операцию над числами
    public static double calculations(double number1, double number2, String operator) {

        double result = 0;

        // Используем оператор switch для выполнения нужной операции
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                // Проверяем, что делитель не равен нулю
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    // Выводим сообщение об ошибке при делении на ноль
                    System.out.println("Ошибка: деление на ноль");
                }
                break;
            default:
                // Выводим сообщение об ошибке при некорректном операторе
                System.out.println("Ошибка: некорректный оператор");
                break;
        }

        return result;

    }

}