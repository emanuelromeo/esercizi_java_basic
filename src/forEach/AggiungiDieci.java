package forEach;

public class AggiungiDieci {
    public static void main(String[] args) {

        int[] array = {11, 32, 8, 38, 9, 6};
        int[] newArray = new int[array.length];
        int index = 0;

        for (int element : array) {
            newArray[index] = element + 10;
            index++;
        }

        System.out.print("I nuovi elementi dell'array sono:");
        for (int element : newArray) {
            System.out.print(" " + element);
        }

    }
}
