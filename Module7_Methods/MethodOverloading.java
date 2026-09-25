public class MethodOverloading {
    //method definition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }   
    //main method
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        // what is method overloading?
        // method overloading is when we have more than one method with same name but different parameters
        // in this case we have two methods with same name but different parameters
        // so we can call add(10, 20) or add(10, 20, 30)    
        
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        
    }
}
