public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int day = 0; day < arr.length; day++) {
            sum += arr[day];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int max = 0;
        for (int day = 0; day < arr.length; day++) {
            if (arr[day] > max) {
                max = arr[day];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        //Task 2.1
        int min = 201000;
        for (int day = 0; day < arr.length; day++) {
            if (arr[day] < min) {
                min = arr[day];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        double days = arr.length;
        for (int day = 0; day < arr.length; day++) {
            sum += arr[day];
        }
        double average = sum / days;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.", average);
    }
    public static void task4() {
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int letter = reverseFullName.length-1; letter >=0; letter--) {
            System.out.print(reverseFullName[letter]);
        }
    }
}