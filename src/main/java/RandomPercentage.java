import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {
     Random rand1 = new Random();
     Random rand2 = new Random();

     double per1, per2;

     per1 = rand1.nextDouble() * 100;
     per2 = rand2.nextDouble() * 100;
        System.out.print("Unseeded Random: ");
     System.out.printf("%.2f", per1);
     System.out.print("%");
     System.out.println();
     System.out.printf("%.2f", per2);

        System.out.print("%");
    }
}