public class CountVowelsConsonants {
    public static void main(String[] args) {
        String text = "Java Programming";

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        double percentage = (double) vowels / (double) consonants;
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Percentage: " + percentage);
    }
}
