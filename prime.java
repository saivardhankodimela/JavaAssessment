public class prime {
    public static void main(String[] args) {
        System.out.println("Printing all the prime numbers between 1 and 20 : ");
        System.out.print(2 + " ");

        for (int num = 3; num <= 20; num++) {
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.print(num + " ");
            }
        }
    }
}