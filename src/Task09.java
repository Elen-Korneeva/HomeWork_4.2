public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание №9");
        System.out.println(compute());
        
    }
    public static String compute () { // можно String заменить на int
        int sum = 0;
        for (int i = 0; i < 1_000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return Integer.toString(sum);
        // здесь прописать просто return sum и запустить программу, выведит тоже число
    }
    
}
