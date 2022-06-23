// Recursion Demonstration

class Recursion{
    static int factorial(int x){
        if (x != 0)
            return x * factorial(x-1); // Recursive call
        else // Base case
            return 1;
    }
    public static void main(String[] args) {
        int num = 6, total;
        total = factorial(num);
        System.out.println(num + " factorial = " + total);
    }
}