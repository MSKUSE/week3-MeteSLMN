public class FindMaximum {
    public static void main(String[] args) {
        int FirstNum = Integer.parseInt(args[0]);
        int SecondNum = Integer.parseInt(args[1]);
        if (FirstNum > SecondNum) {
            System.out.println(FirstNum);
        } else if (SecondNum > FirstNum) {
            System.out.println(SecondNum);
        } else {
            System.out.println("Both Maximum");
        }
    }
}
