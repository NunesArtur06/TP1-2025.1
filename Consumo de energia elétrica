import java.util.Scanner;
import java.util.Locale;

public class lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double consumo;
        double comTarifa = 0;
        consumo = scan.nextDouble();
        
        if (consumo <= 500){
             comTarifa = consumo*0.02;
        }else if (consumo>500 && consumo<=1000){
            comTarifa = 50+((consumo-500)*0.05);
        }else if (consumo>1000){
            comTarifa = 350+((consumo-1000)*0.10);
        }
        
        double comTaxa;
        comTaxa = comTarifa + 5.0;
        
        System.out.printf("%.2f 5.00 %.2f", comTarifa, comTaxa);
        
        
            
        
    } 
}
