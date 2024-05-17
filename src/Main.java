import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<dino> Dino = new ArrayList<dino>();
        ArrayList<zomb> Zombie = new ArrayList<zomb>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hur många i laget dino?: ");
        int val1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Hur många i laget zombie?: ");
        int val2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < val1; i++) {
            dino tal = new dino();
            Dino.add(tal);

        }

        for (int i = 0; i < val2; i++) {
            zomb tal2 = new zomb();
            Zombie.add(tal2);

        }

        System.out.println("Det är " + Dino.size() + " dinosaurier");
        System.out.println("Det är " + Zombie.size() + " zombies");

        System.out.println("Hello world!");
    }
}