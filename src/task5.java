public class task5 {
    public static void main(String[] args) {
        int count = 0; //counter for the number of identical combinations
        for (int hours = 3; hours < 24; hours++) { //set the number of hours
            for (int minutes = 30; minutes < 60; minutes++) { //set the number of minutes
                // check if the required time is symmetrical
                if (hours / 10 == minutes % 10 && hours % 10 == minutes / 10) {
                    // output a symmetric combination
                    System.out.printf("symmetric combination: %02d:%02d\n", hours, minutes);
                    count++;
                }
            }
        }
        // print the total number of symmetric combinations
        System.out.println("total number of symmetric combinations: " + count);
    }
}
