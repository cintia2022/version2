public class matrices {        /*para ingresar valores a la matriz*/

    public static void main(String[] args) {

        
        int matriz [] [] = new int [3] [3];    /*3 filas y 3 columnas, Matriz de 3x3 */ 

        /*declaracion */
        matriz [0] [0] = 5;   /*a la fila cero y columna cero le asigo el valor 5 */
        matriz [0] [1] = 13;
        matriz [0] [2] = 96;
        matriz [1] [0] = 35;
        matriz [1] [1] = 33;
        matriz [1] [2] = 71;
        matriz [2] [0] = 446;
        matriz [2] [1] = 228;
        matriz [2] [2] = 24;

        for (int f=0; f<3; f++) {   /*f=filas, hay 0,1 y 2, suma de 1 en 1 */  

            for(int c=0; c<3; c++){     /*c=columnas, hay 0,1 y 2, suma de 1 en 1 */ 

              System.out.println("el valor de la posicion f:"+ f + "c:" + c);
              System.out.println("es de: " + matriz [f] [c]);

            }
        } 


    } 


     }

