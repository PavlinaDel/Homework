package domashnaaa;
import java.util.Scanner;

public class zadacha3 {


    public static void main(String[] args) {
        McLover();
    }

    public static void McLover() {
        System.out.println("Vyvedi etaj : ");
        Scanner scan = new Scanner(System.in);
        int Floor = scan.nextInt();
        switch (Floor) {
            case 0:
                System.out.println("Auch!");
                break;
            case 1:
                System.out.println("Zdravei, Mariq");
                break;
            case 2:
                System.out.println("Zdravei, Marina");
                break;
            case 3:
                System.out.println("Zdravei, Malina");
                break;
            case 4:
                System.out.println("Zdravei, Marianna");
                break;
            case 5:
                System.out.println("Zdravei, Marieta");

                break;
            case 6:
                System.out.println("Zdravei, Margarita");
                break;
            case 7:
                System.out.println("Zdravei, Merilin");
                break;
            case 8:
                System.out.println("Zdravei, Mihaela");
                break;

        }
    }
}