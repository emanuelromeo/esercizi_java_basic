package forEach;

public class ContaTreCaratteri {
    public static void main(String[] args) {
        String[] words = {"ciao", "Java", "ok", "for", "fantastico"};
        int count = 0;

        for (String word : words) {
            if (word.length() > 3) {
                count++;
            }
        }

        System.out.println(count);
    }
}
