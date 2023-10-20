
@FunctionalInterface
interface CubeCal {
    int calculateCube(int num);
}
public class CubeOfNum {
   public static void main(String[] args) {
        CubeCal sq = (num) -> num * num * num;
        int inputNumber = 10;
        int result = sq.calculateCube(inputNumber);
        System.out.println("The Cube of " + inputNumber + " is: " + result);
    }
}

