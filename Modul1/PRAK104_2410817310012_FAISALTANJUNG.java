package Modul1;
import java.util.Scanner;
public class PRAK104_2410817310012_FAISALTANJUNG {
    public static void main(String[] args) {
        int abuWin=0;
        int bagasWin=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String[] abuTurns=scanner.nextLine().split(" ");
        System.out.print("Tangan Bagas: ");
        String[] bagasTurns=scanner.nextLine().split(" ");

        for(int i=0; i<3;i++){
            String abu=abuTurns[i];
            String bagas=bagasTurns[i];

            if(abu.equals(bagas)){
                continue;
            }else if(abu.equals("B") && bagas.equals("G")){
                abuWin++;
            }else if(abu.equals("G") && bagas.equals("K")){
                abuWin++;
            }else if(abu.equals("K") && bagas.equals("B")){
                abuWin++;
            }else {
                bagasWin++;
            }
        }
        if(abuWin>bagasWin){
            System.out.println("Abu");
        }else if(bagasWin>abuWin){
            System.out.println("Bagas");
        }else{
            System.out.println("Seri");
        }
        scanner.close();
    }
}
