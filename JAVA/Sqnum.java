
@FunctionalInterface
interface SquareCal {
    int calculateSquare(int num);
}
public class Sqnum {
   public static void main(String[] args) {
        SquareCal sq = (num) -> num * num;
        int inputNumber = 10;
        int result = sq.calculateSquare(inputNumber);
        System.out.println("The square of " + inputNumber + " is: " + result);
    }
}
