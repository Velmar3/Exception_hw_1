package homework1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? Ответ: 3.
public class task_1_2 {

    public static void main(String[] args) {
        divisionByZero();

        try {
            readFromFile();
        } catch (IOException ioe) {
            System.out.println("Файл не найден!");
        }


        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        // Печатает список
        printShow(fruits);
        // Выбрасывает исключение
        printShow(null);
    }

    public static void divisionByZero() {
        int number;
        int zero;
        try {
            number = 1;
            zero = 0;
            int result = number / zero;

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }
    }

    public static void readFromFile() throws IOException {
        // Указываем несуществующий файл, чтобы проверить работу исключения
        try (BufferedReader reader = new BufferedReader(new FileReader("out.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        }
    }

    public static void printShow(LinkedList<String> fruits) {
        if (fruits == null) {
            throw new NullPointerException("Аргумент не инициализирован!");
        }
        System.out.println(fruits);
    }
}
