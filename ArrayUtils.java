/**
 * Created by 123 on 08.02.2016.
 */
    import java.util.Arrays;

    /**
     * Created by 123 on 07.02.2016.
     */
//Реализуйте метод rotateClockwise(int[][]) класса ArrayUtils, который
// 1) проверяет,
// что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null;
// (возможные ошибки:
// null вместо массива,
// одна из размерностей = 0,
// длина не равна ширине,
// есть строки разной длины,
// есть строки с null вместо одномерных массивов)
// 2) "проворачивает" массив по часовой стрелке на 90 градусов, т.е
// [1] -> [1] [[1, 2], [3, 4]] ->
// [[3, 1], [4, 2]] [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]] ...
    public class ArrayUtils {
        public static void main(String[] args) {
            int[][] test = new int[][]{{1, 2, 3, 4}, {2, 2, 4}, {1}, {5}};//rows

            assertMethod(rotateClockwise(new int[][]{{1, 2, 3}, {1, 2, 4}, {1, 4, 6}}), new int[][]{{1, 2, 3}, {1, 2, 4}, {1, 4, 6}});

        }

        public static int[][] rotateClockwise(int[][] arg) {
            // try to identify non- square matrix

//            for (int[] args : arg) { // print input array
//                System.out.println(Arrays.toString(args));
//            }
//            System.out.println("");

            int amountOfRows = arg[0].length;//have found amount of rows

            for (int row = 0; row < arg.length; row++) { // compare amount of rows and amount of elements in each row
                int length = arg[row].length;
                if (amountOfRows != length) {
                    System.out.println("It is non-square matrix");
                    return null;
                }

            }
            return arg;
        }
        private static void assertMethod(int[][] input, int[][] expected) {
            int[][] result = rotateClockwise(input);
            if (Arrays.deepEquals(result, expected)) {
                System.out.println("OK");
            } else {
                System.out.println("   expected: " + Arrays.deepToString(expected) +
                        " \n " +
                        "calculated: " + Arrays.deepToString(result));
            }
        }
    }


