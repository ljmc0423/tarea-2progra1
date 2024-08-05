package progra1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ljmc2
 */
public class Matta_Lorenzo_Tarea2Progra1 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        
        while(true){
            System.out.println("1. forma >"
                    +        "\n2. piramide"
                    +        "\n3. detecta palindromos"
                    +        "\n4. salir");
            String opcion=lea.next();
            switch(opcion){
                case"1"://forma >
                    System.out.println("Ingrese una palabra: ");
                    opcion=lea.next().toUpperCase();
                    int contador=0;
                    while(contador<opcion.length()){
                        for(int i=0;i<contador;i++){
                            System.out.print(" ");
                        }
                        System.out.println(opcion.charAt(contador));
                        contador++;
                    }
                    contador=opcion.length()-1;
                    while(contador>=0){
                        for(int i=contador+1;i>1;i--){
                            System.out.print(" ");
                        }
                        System.out.println(opcion.charAt(contador));
                        contador--;
                    }
                    System.out.println("Oprima enter para continuar.");
                    lea.next();
                    break;

                case"2"://pirámide

                    System.out.println("Ingrese el número de filas:");
                    int filas=lea.nextInt();

                    for(int i=1;i<=filas;i++){
                        for(int j=1;j<i;j++){
                            System.out.print("  ");
                        }
                        for(int j=i;j<=filas;j++) {
                            System.out.print(j+" ");
                        }
                        for(int j=filas-1;j>=i;j--) {
                            System.out.print(j+" ");
                        }

                        System.out.println();
                    }
                    System.out.println("Oprima enter para continuar.");
                    lea.next();
                    break;

                case"3"://detecta palíndromos
                    System.out.println("Ingrese la cantidad de palabras: ");
                    int cantidad=lea.nextInt();

                    String palabra;

                    String palindromos="";
                    String noPalindromos="";

                    for (int i=0;i<cantidad;i++) {
                        System.out.println("Ingrese la palabra "+(i+1)+ ":");
                        palabra=lea.next();

                        int frente=0;
                        int reves=palabra.length()-1;
                        boolean esPalindromo=true;

                        while(frente<reves){
                            if (palabra.charAt(frente)!=palabra.charAt(reves)){
                                esPalindromo=false;
                                break;
                            }
                            frente++;
                            reves--;
                        }

                        if(esPalindromo){
                            palindromos+=palabra+" \n";
                        }else{
                            noPalindromos+=palabra+" \n";
                        }
                    }

                    System.out.println("\nPalindromos:\n"+palindromos);
                    System.out.println("No palindromos:\n"+noPalindromos);
                    System.out.println("Oprima enter para continuar.");
                    lea.next();
                    break;

                    case"4":
                        System.out.println("Programa finalizado.");
                        System.exit(0);
                        break;
            }
        }
        
    }
}
