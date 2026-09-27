public class CountCharacters {
    public static void main(String[] args) {
        String text = "Java Programming";

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                count++;
            }
        }

        System.out.println("Number of characters: " + count);
    }
}
