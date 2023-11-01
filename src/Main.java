public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(3454));

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int original = number;
        
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }
}



