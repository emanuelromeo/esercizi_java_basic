package forEach;

public class ElementiDiversi {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 6};
        boolean isInArray;

        for (int element1 : array1) {
            isInArray = false;
            for (int element2 : array2) {
                if (element1 == element2) {
                    isInArray = true;
                }
            }
            if (!isInArray) {
                System.out.println(element1);
            }
        }
    }
}
