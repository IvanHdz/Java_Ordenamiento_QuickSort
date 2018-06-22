/**
 *
 * @author Jesus Ivan
 */

/**
 * Utelirías para ordenamiento de arreglos (estructuras de datos)
 * (no soporta primitivos, sólo los wrappers: Integer, Long, Double, etc;
 * en general cualquier objeto que implemente la interfaz java.lang.Comparable)
 *
 */

public class ArregloQuickSort {
    /**
     * Implementación del método de ordenación quicksort, 
     * en orden ascendente, forma recursiva
     * @param a El arreglo a ordenar
     */

 public static <E extends Comparable<? super E>> void quicksort(E a[], int ini, int fin) {
        if (a == null)
            throw new NullPointerException();
        int izq = ini, 
            der = fin, 
            pos = ini;
        boolean band = true;

	//Cada iteración representa una pasada de izq/der y viceversa

        while (band) { 
            band = false;

            // Recorre el algoritmo de derecha a izquierda

            while (a[pos].compareTo(a[der]) <= 0 && pos != der) 
   	--der;
            	   	if (pos != der) {
                		intercambiar(a, pos, der);
                		pos = der;
                
   	//Recorre el algoritmo de izquierda a derecha

                		while (a[pos].compareTo(a[izq]) >= 0 && pos != izq)
                    		++izq;
                			if (pos != izq) {
                    			band = true;
                    			intercambiar(a, pos, izq);
                    			pos = izq;
                			}
         		}           
        }

        if ( (pos-1) > ini)
            quicksort(a, ini, pos-1); //Acomoda los elementos del conjunto izquierdo
        if ( fin > (pos+1) )
            quicksort(a, pos+1, fin); //Acomoda los elementos del conjunto derecho
    }

  public static <E extends Comparable<? super E>> void reverseOrder(E a[]) {
        E aux = null;

        for (int i = 0; i < a.length/2; i++) {
            aux = a[i];          
            a[i] = a[a.length - (i+1)];
            a[a.length - (i+1)] = aux;
        }
    }
    
     /**
     * Intercambia los elementos en las posiciones pos1 y pos2 del arreglo a[]
     * a   El arreglo que contiene los objetos a intercambiar
     * pos1  Posición 1
     * pos2  Posición 2
     */

    private static void intercambiar(Object a[], int pos1, int pos2) {
        Object aux = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = aux;
    }
    
        
    public static <E extends Comparable<? super E>> void quicksort(E a[]) {
        quicksort(a, 0, a.length-1);
    }
    
    public static void main(String[] args) {
        Integer a[] = {15, 67, 8, 16, 44, 27, 12, 35, 1};
        //burbujaAscendente(a);
        quicksort(a);
        reverseOrder(a);
        for (int b : a) {
            System.out.println(b);
    }
  }    
}