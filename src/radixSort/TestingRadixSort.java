/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radixSort;

/**
 *
 * @author Mikey
 */
public class TestingRadixSort {
    public static void main(String[] args) {
        int[]arreglo = new int[10];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = (int)(Math.random()*100);
        }
        
        radix r = new radix();
        System.out.println("Programa que ejecuta el Algoritmo de RadixSort: ");
        r.radix(arreglo);
        r.mostrarArreglo(arreglo);
        
    }
}
