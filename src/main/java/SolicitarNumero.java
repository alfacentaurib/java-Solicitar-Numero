/*
autor: jhon freddy
fecha: 2021-07-05
programa:
Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos
 */


import java.util.Scanner; //importamos el paquete Scanner
public class SolicitarNumero {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); //creamos un objeto de la clase Scanner

        System.out.println("Ingrese un numero: "); //pedimos los datos al usuario que va ser de tipo entero(int)
        int num1 = in.nextInt(); // Le asignamos a la variable num1 el numero entero introducido por teclado

        for(int i=0; i< 10; i++){ //creamos el bucle for
            System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));

        }
        System.out.println("FIN DEL PROGRAMA");

}
}
/*
EL RESULTADO DEL PROGRAMA ES:
POR EJEMPLO:
SI INGRESAMOS UN NUMERO 2:
SALIDA:

Ingrese un numero:
2
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
FIN DEL PROGRAMA

 */
