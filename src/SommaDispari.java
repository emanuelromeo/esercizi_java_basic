public class SommaDispari {
    public static void main(String[] args) {
        int[] array = {56, 78, 45, 79, 34};
        int sum = 0;

        for (int j : array) {
            if (j % 2 == 1) {
                sum += j;
            }
        }

        System.out.println("La somma degli elementi dispari dell'array è: " + sum);
    }
}
