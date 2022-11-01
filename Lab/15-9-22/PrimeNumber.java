class PrimeNumber {
 
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
 
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
 
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
 
        for (int i = 1; i <= a; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}