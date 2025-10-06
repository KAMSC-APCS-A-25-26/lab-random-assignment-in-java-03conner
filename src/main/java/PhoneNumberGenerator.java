import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        num1 = rand1.nextInt(8);
        num2 = rand2.nextInt(8);
        num3 = rand3.nextInt(8);


            Random rand4 = new Random();
            num4 = rand4.nextInt(743);
            Random rand7 = new Random();
            Random rand8 = new Random();
            Random rand9 = new Random();

            num7 = rand1.nextInt(10);
            num8 = rand2.nextInt(10);
            num9 = rand3.nextInt(10);

            System.out.print(num1);
            System.out.print(num2);
            System.out.print(num3);
            System.out.print("-");
            System.out.print(String.format("%03d",num4));
            System.out.print("-");
            System.out.print(num7);
            System.out.print(num8);
            System.out.print(num9);
        }





    }
