import java.util.Scanner;
import java.util.Locale;

public class lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double altura;
        char sexo;
        double pesoIdeal;
        altura = scan.nextDouble();
        sexo = scan.next().charAt(0);
        
        if(altura<=0 || sexo!='f' && sexo!='m'){
            System.out.print("Entrada inválida!\n");
        }else{
            if(sexo=='m'){
                pesoIdeal = (72.7 * altura)-58;
                System.out.printf("%.1f kg", pesoIdeal);
            }
            else if(sexo=='f'){
                pesoIdeal = (62.1 * altura)-44.7;
                System.out.printf("%.1f kg", pesoIdeal);
            }
        }
            
        
    } 
}
