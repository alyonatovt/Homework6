import java.util.Arrays;
import java.util.Random;

public class MainProgram {
    //task1
    public static void main(String[] args) {
        int[] numbers = new int[20];

        Random random = new Random();
        for (int i = 0; i < numbers.length ; i++) {
            numbers [i] = random.nextInt(201)-100;
        }
        System.out.println(Arrays.toString(numbers));
        //task2
        int firstNegativeIndex = -1;
        int sumOfNegatives = 0;
        for (int i = 0; i < numbers.length && firstNegativeIndex == -1; i++) {
            if (numbers[i] < 0) {
                sumOfNegatives += numbers[i];
                firstNegativeIndex = i;
            }
        }
        System.out.println("Сума від'ємних:" + sumOfNegatives);
        //task3
        int countP = 0;
        int countN = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                countP++;
            } else {
                countN++;
            }
        }
        System.out.println("Сума парних:" + countP);
        System.out.println("Сума непарних:" + countN);
        //task4
        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;

            } else if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Максимальне значення: " + max + " (індекс: " + maxIndex + ")");
        System.out.println("Мінімальне значення: " + min + " (індекс: " + minIndex + ")");
        //task5
        double averageAfterNegative = 0;
        int countAfterNegative = 0;
        boolean hasNegative = true;
        if (hasNegative) {
            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                averageAfterNegative += numbers[i];
                countAfterNegative++;
            }
            if (countAfterNegative > 0) {
                averageAfterNegative /= countAfterNegative;
            }
            if (hasNegative) {
                System.out.println("Середнє арифметичне після першого від'ємного: " + averageAfterNegative);
            } else {
                System.out.println("Від'ємних чисел немає");
            }
        }
    }
}
