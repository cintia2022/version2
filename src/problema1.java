import java.util.Scanner;    /*importar para usar el scanner */

public class problema1 {
    public static void main(String[] args) {
        

         double sueldo = 0;          /*definir las variables */
         int categoria;

     
    System.out.println("Ingrese la categoria para calcular el sueldo");

    Scanner teclado = new Scanner (System.in);    /*Scanner es un tipo de clase, nos permite ingresar valores por teclado */
                                                 /*teclado, es el nombre de la variable */
    categoria = teclado.nextInt();         /*nextInt = proximo entero */


    if (categoria == 1){
        sueldo =15890 + (15890*0.10);
    }
    else {
        if(categoria==2){
        sueldo = 25630.89;    
        }
        else {
            if (categoria==3){
                sueldo = 35560.20 - (35560.20*0.11);
            }
            else {
                System.out.println("debe ingresar un numero de categoria valido");
            }
        }
    }
    
    if (categoria==1 || categoria==2 || categoria==3) {
     System.out.println("El total de la categoria selecionada" + categoria  +   "es igual a: " + sueldo);
    }
    
    













    }
}
