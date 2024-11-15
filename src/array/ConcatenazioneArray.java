package array;

public class ConcatenazioneArray {
    public static void main(String[] args) {
        int[] firstArray =  {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10};
        int[] newArray = new int[firstArray.length + secondArray.length];

        int firstArrayLength = firstArray.length;

        for (int i = 0; i < newArray.length; i++) {
            if (i < firstArrayLength) {
                newArray[i] = firstArray[i];
            } else {
                newArray[i] = secondArray[i - firstArrayLength];
            }
        }

        for (int j : newArray) {
            System.out.println(j);
        }
    }
}
