public class task3 {
    public static void main(String[] args) {
        int number=10;
        for(int a = 10;a <= number; a++){
            if(number % a == 0){ //check if the number a is a divisor of 10 without a remainder
                System.out.println(a);
            }
        }
    }
}
