
public class MathUtilities {
    public static void main(String[] args) {
        System.out.println(SumOfAllDigits(19999));
        System.out.println("\n\nPress any key ...");
    }

    private static int SumOfAllDigits(int input) {
        int sum = 0;

        while(true) {
            while(input > 0) {
                sum += input % 10;
                input = input / 10;
            }

            if(sum <= 9){
                break;
            }

            System.out.println(sum);
            input = sum;
            sum = 0;
        }

        return sum;
    }
}
