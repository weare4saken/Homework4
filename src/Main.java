import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        generateRandomArray();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        int number = 2;

        float[] massive2 = {1.57f, 7.654f, 9.986f};

        String[] massive3 = {"по теме", "от SkyPro", "Задачи", "Массивы"};

        System.out.println(massive1[number]);
        System.out.println(massive2[1]);
        System.out.println(massive3[2] + " " + massive3[1] + " " + massive3[0] + " " + massive3[3]);
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;

        float[] massive2 = {1.57f, 7.654f, 9.986f};

        String[] massive3 = {"по теме", "от SkyPro", "Задачи", "Массивы"};

        System.out.println(massive1[0] + ", " + massive1[1] + ", " + massive1[2]);
        System.out.println(massive2[0] + ", " + massive2[1] + ", " + massive2[2]);
        System.out.println(massive3[0] + ", " + massive3[1] + ", " + massive3[2] + ", " + massive3[3]);
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        for (int i = 2; i < massive1.length; i--) {
            if (i == 0) {
                System.out.print(massive1[i]);
                break;
            }
            System.out.print(massive1[i] + ", ");
        }

        System.out.println();

        float[] massive2 = {1.57f, 7.654f, 9.986f};
        for (int i = 2; i < massive2.length; i--) {
            if (i == 0) {
                System.out.print(massive2[i]);
                break;
            }
            System.out.print(massive2[i] + ", ");
        }

        System.out.println();

        String[] massive3 = {"по теме", "от SkyPro", "Задачи", "Массивы"};
        for (int i = 3; i < massive3.length; i--) {
            if (i == 0) {
                System.out.print(massive3[i]);
                break;
            }
            System.out.print(massive3[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("\n\nЗадача 4");
        int[] massive1 = new int[3];

        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;

        for (int i = 0; i < massive1.length; i++) {
            if (massive1[i] % 2 != 0) {
                massive1[i] = massive1[i] + 1;
            }
        }
        System.out.print(Arrays.toString(massive1));
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task5() {
        System.out.println("\n\nЗадача 5");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        int[] arr = generateRandomArray();
        int maxCost = arr[0];
        int minCoast = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCost) {
                maxCost = arr[i];
            } else if (arr[i] < minCoast) {
                minCoast = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCoast + " рублей. Максимальная сумма трат за день составила " + maxCost + " рублей");
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        float sumMiddle = (float) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц  " + sumMiddle + " рублей");
    }

    public static void task8() {
        System.out.println("\nЗадача 8");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}


