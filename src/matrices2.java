import java.util.Scanner;         /*para ingresar valores desde la terminal a la matriz*/

public class matrices2 {

    public static void main(String[] args) {

        
        int matriz [] [] = new int [3] [3];    /*3 filas y 3 columnas, Matriz de 3x3 */ 

        Scanner teclado = new Scanner (System.in); 

        for (int f=0; f<3; f++) {   /*f=filas, hay 0,1 y 2, suma de 1 en 1 */  

               /*c=columnas, hay 0,1 y 2, suma de 1 en 1 */ 

              System.out.println("ingrese el valor de la posicion f:"+ f + "c:" + c);
              matriz [f][c] = teclado.nextInt();

            }
        } 


    } 


     
