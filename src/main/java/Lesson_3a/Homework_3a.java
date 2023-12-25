package Lesson_3a;
public class Homework_3a {
    public static void main(String[] args) {
        between10And20(int a, int b);
        positiveOrNegative(int a);
        isNegative(int a);
        printLine("Hi", 2);
        leapYear (int Year)
    }

    /** task.1
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */
    public static boolean between10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /** task.2
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали
     * или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static void positiveOrNegative(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }

    /** task.3
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное.
     */
    public static boolean isNegative(int a) {
        return a < 0;
    }

    /** task.4
     * Написать метод, которому в качестве аргументов передается строка
     * и число, метод должен отпечатать в консоль указанную строку,
     * указанное количество раз;
     */
    public static void printLine(String line, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(line);
    }

    /** task.5
     * Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    static boolean leapYear(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }
}

