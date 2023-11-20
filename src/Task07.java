public class Task07 {
    /*static int COUNT = 0;
    public static void main(String[] args) {
        System.out.println("Задание №7");
        for (int i = 10_000_000; i <= 99_999_999; i++) {
            if (hasUniqueDigits(i) && i % 12345 == 0) {
                System.out.println(i);
                COUNT++;
            }
        }
        System.out.println("Общее количество: " + COUNT);
    }

    private static boolean hasUniqueDigits (int number) {
        boolean[] digits = new boolean[10];

        while (number > 0) {
            int digit = number % 10;
            if (digits[digit]) {
                return false;
            }
            digits[digit] = true;
            number = number / 10;
        }
        return true;

     */
    public static void main(String[] args) {
        System.out.println("Задание №7");
        int num = 5;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            System.out.print(bit);
        }
    }
}


