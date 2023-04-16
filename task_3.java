package homework1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class task_3 {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 7, 5}, {0, 1, 2}};
        doubleArray(array);
    }

    public static int[][] doubleArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length != array[j].length) {
                    throw new RuntimeException("Массивы не равны!");
                }
            }
        }
        return array;
    }
}
