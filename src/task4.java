public class task4 {
    public static void main(String[] args) {
        int number = 10;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("number factorial " + number + " if we use cycle for: " + factorial);
        while (factorial <= number) {
            factorial *= factorial;
            factorial++;
        }
        System.out.println("number factorial " + number + " if we use cycle while: " + factorial);
    }
}
