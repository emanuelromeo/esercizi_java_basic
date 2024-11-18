package forLoop;

public class DivisibilePerSette {
    public static void main(String[] args) {
        int[] numbers = {12, 18, 22, 35, 44, 49};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 7 == 0) {
                System.out.println(numbers[i]);
                break;
            }
        }
    }
}
