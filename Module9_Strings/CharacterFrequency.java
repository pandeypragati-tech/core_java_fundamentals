class CharacterFrequency
{
    public static void main(String[] args)
    {
        String text = "programming";

        char search = 'g';

        int count = 0;

        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == search)
            {
                count++;
            }
        }

        System.out.println(
            "Frequency of '" + search + "' = " + count
        );
    }
}
