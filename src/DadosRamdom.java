import java.util.Random;
import java.util.Scanner;

public class DadosRamdom {
 public void dados(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numtiros,azar, total = 0;
        int uno=1,dos=2, tres=3, cuatro=4, cinco=5;
        System.out.print("numero de tiros: ");
        numtiros = sc.nextInt();
        sc.close();
        int [] numeroDeDado=new int[6];
        numeroDeDado[uno]=0;
        numeroDeDado[dos]=0;
        numeroDeDado[tres]=0;
        numeroDeDado[cuatro]=0;
        numeroDeDado[cinco]=0;

        for (int i = 0; i < numtiros; i++) {
            azar = rand.nextInt(5) + 1;
            if(azar==uno){
                numeroDeDado[uno]+=1;
            } else if (azar==dos) {
                numeroDeDado[dos]+=1;
            } else if (azar==tres) {
                numeroDeDado[tres]+=1;
            } else if (azar==cuatro) {
                numeroDeDado[cuatro]+=1;
            } else if (azar==cinco) {
                numeroDeDado[cinco]+=1;
            }
        }

        for (int k=1;k<6;k++){
            System.out.println("cayo: "+(k)+":"+numeroDeDado[k]+ "veces");

        }







    }

}
