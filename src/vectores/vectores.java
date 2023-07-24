
package vectores;

import java.util.Scanner;

public class vectores {

    public static void main(String[] args) {

    int vector []= new int [15];          /*declaracion del vector de 15 posiciones de tipo entero */
    
    Scanner teclado = new Scanner (System.in);   /*declaro el Scanner para poder ingresar datos por teclado, de donde voy a scanner datos, de lo que entre al sistema */
      
    /*cargamos el vector por teclado mediante el for*/

    for(int i =0; i<15; i++) {   /*en una linea ponemos 3 partes, variable, condicion de parada, incremento de 1 en 1 */
       
        System.out.println("ingrese un numero para el vector");
        
        vector[i] = teclado.nextInt();
       
   
    } 

    /*Recorrer y contar cuantos numeros 3 hay */
    
    int cont= 0;      /*declaramos una variable contador */

    for(int i =0; i<15; i++) {   /*recorremos el vector mediante un for*/

        vector[i] = teclado.nextInt();
        
        if(vector[i]==3){
            cont = cont +1;

        }
    
    }
     
     System.out.println("la cantidad de numeros 3 que hay es:" + cont);
    

        } 


    } 


     
