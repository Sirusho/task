import java.util.Scanner;

    public class RangeTask {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Input a number");
            int number= scanner.nextInt();
            switch (((number+45)/45)){
                case 1:
                    System.out.println("Range is 0 -> 44");
                    break;
                case 2:
                    System.out.println("Range is 45 -> 89");
                    break;
                case 3:
                    System.out.println("Range is 90 -> 134");
                    break;
                default:
                    System.out.println("Range is unknown");
            }
        }
    }
