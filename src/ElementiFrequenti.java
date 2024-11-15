public class ElementiFrequenti {
    public static void main(String[] args) {

        int[] array = {1, 1, 3, 3, 5, 7, 7, 7};
        int[] frequence = new int[array.length];
        int count;
        int maxCount = 1;
        int[] mostFrequentElements;
        int frequentElementsCount = 0;

        for (int i = 0; i < array.length; i++) {
            count = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            frequence[i] = count;

            if (count >= maxCount) {
                if (count == maxCount) {
                    frequentElementsCount++;
                } else {
                    frequentElementsCount = 1;
                }
                maxCount = count;
            }
        }

        mostFrequentElements = new int[frequentElementsCount];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (frequence[i] == maxCount) {
                mostFrequentElements[j] = array[i];
                j++;
            }
        }

        System.out.print("Gli elementi più frequenti sono: " + mostFrequentElements[0]);
        for (int i = 1; i < mostFrequentElements.length; i++) {
            System.out.print(", " + mostFrequentElements[i]);
        }

        System.out.println(", che si ripetono " + maxCount + " volte ciascuno");

    }
}
