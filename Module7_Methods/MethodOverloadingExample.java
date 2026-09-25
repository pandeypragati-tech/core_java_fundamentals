class MethodOverloadingExample
{
    static void display()
    {
        System.out.println("No argument");
    }

    static void display(int number)
    {
        System.out.println("Integer: " + number);
    }

    static void display(String name)
    {
        System.out.println("Name: " + name);
    }

    static void display(int number, String name)
    {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args)
    {
        display();
        display(10);
        display("Java");
        display(20, "Programming");
    }
}