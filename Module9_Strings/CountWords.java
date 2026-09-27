public class CountWords {
    public static void main(String[] args) {
        String text = "Java is easy to learn";

            String[] words = text.trim().split("\\s+");

            System.out.println("Number of words: " + words.length);
    }
}
