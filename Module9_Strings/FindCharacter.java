public class FindCharacter {
    public static void main(String[] args) {
        String text = "Java Programming";

        int index = text.indexOf('P');

        if (index != -1) {
            System.out.println("Character found");
        } else {
            System.out.println("Character not found");
        }
    }   
}
