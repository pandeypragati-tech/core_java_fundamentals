class StringToCharArray
{
    public static void main(String[] args)
    {
        String text = "Java";

        char[] characters = text.toCharArray();

        System.out.println("Characters:");

        for (char ch : characters)
        {
            System.out.println(ch);
        }
    }
}