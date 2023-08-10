public class JReturnStatements {
    public static void main(String[] args) {
        double myNum = cube(8);
        System.out.println(myNum);
    }

    public static double cube(double numberToBeCube) {
        return (numberToBeCube * numberToBeCube * numberToBeCube);
    }
}
