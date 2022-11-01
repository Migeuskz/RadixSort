/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radixSort;

/**
 *
 * @author Mikey
 */
public class radix {
    
    public void radix(int[] arreglo){
        int x,i,j;
        for(x = Integer.SIZE -1; x >= 0; x--){
            int aux[] = new int[arreglo.length];
            j = 0;
            for(i = 0; i < arreglo.length; i++){
                boolean mover = arreglo[i]<< x >= 0;
                /*
                if(x>y){
                    mayor=x;
                }else{
                    mayor=y;
                }
                Operador Ternario ?
                resultado = (condicion)? valor1:valor2
                mayor=(x>y)?x:y
                */
                if(x == 0 ? !mover:mover){
                    aux[j]=arreglo[i];
                    j++;
                }else{
                    arreglo[i-j]=arreglo[i];
                }
            }
            for(i = j; i<aux.length;i++){
                aux[i]=arreglo[i-j];
            }
            arreglo=aux;
        }
        System.out.println("El arreglo Ordenado con Radix es: ");
        mostrarArreglo(arreglo);
    }
    
    public void mostrarArreglo(int[]arreglo){
        int k;
        for(k=0; k<arreglo.length;k++){
            System.out.print("[" + arreglo[k] + "]");
        }
        System.out.println();
    }
    
}
    

