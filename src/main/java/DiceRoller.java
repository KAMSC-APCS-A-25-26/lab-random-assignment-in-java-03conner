import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        int dice1, dice2, dice3, dice4;
        Random rand = new Random();
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random randseed = new Random(34);
        dice1 = rand.nextInt(6) + 1;
        dice2 = rand1.nextInt(6) + 1;
        dice3 = rand2.nextInt(6) + 1;
        dice4 = randseed.nextInt(6) + 1;

        System.out.println("Unseeded Die 1: " + dice1);
        System.out.println("Unseeded Die 2: " + dice2);
        System.out.println("Unseeded Die 3: " + dice3);
        System.out.println("Seeded Die: " + dice4);
    }
}
