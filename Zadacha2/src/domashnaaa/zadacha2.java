package domashnaaa;

import java.util.Scanner;

public class zadacha2 {
    public zadacha2(){

    }
    public static void main(String[] args){
 DniteVMeseca();
    }
    public static void DniteVMeseca() {
        System.out.println("Въведете име на месец: ");
        Scanner scan = new Scanner(System.in);
        String Month = scan.nextLine();
        if (!Month.equals("Януари") && !Month.equals("Март") && !Month.equals("Май") && !Month.equals("Юли") && !Month.equals("Август") && !Month.equals("Октомври") && !Month.equals("Декември")) {
            if (!Month.equals("Април") && !Month.equals("Юни") && !Month.equals("Септември") && !Month.equals("Ноември")) {
                if (Month.equals("Февруари")) {

                    System.out.println(Month + "Месецът има 28 дни!");
                }
            } else {
                System.out.println(Month + "Месецът има 30 дни!");
            }
        }else{
            System.out.println(Month + "Месецът има 31 дни");
                }
            }
        }
