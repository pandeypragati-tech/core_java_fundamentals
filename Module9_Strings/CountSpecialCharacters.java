public class CountSpecialCharacters {
    public static void main(String[] args) {
        String text = "Java@123!";

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '@' || ch == '!') {
                count++;
            }
        }

        System.out.println("Number of special characters: " + count);
    }
}
