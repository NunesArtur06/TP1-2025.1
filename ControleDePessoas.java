import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        char entrada;
        int homens=0;
        int mulheres=0;
        double totalHomens=0.00;
        double totalMulheres=0.00;
        while (true) {
            entrada = scan.next().charAt(0);
            if (entrada == 'h') {
                homens++;
                totalHomens = totalHomens + 12.50;
            }
            else if (entrada == 'm') {
                mulheres++;
                totalMulheres = totalMulheres + 7.40;
            }else if(entrada == 'q'){
                System.out.printf("%d %d\n",homens, mulheres );
                System.out.printf("%.2f %.2f %.2f", totalHomens, totalMulheres, totalMulheres+totalHomens);
                break;
            }
        }
    }

}
