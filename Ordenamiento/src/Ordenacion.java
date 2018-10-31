
public class Ordenacion {

    public static int[] bubbleSort(int A[]) {
        int n = A.length;
        for (int p = 1; p < n; p++) {
            for (int i = 0; i < n - p; i++) {
                if (A[i] > A[i + 1]) {
                    int aux = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = aux;
                }//if
            }
        }
        return A;
    }//burbuja

    public static void quickSort(int A[], int izq, int der) {
        int piv = A[izq], i = izq, j = der, aux;
        while (i < j) {
            while (A[i] <= piv && i < j) {
                i++;
            }//while anidado dentro del while
            while (A[j] > piv) {
                j--;
            }//while anidado dentro del while
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }//if anidado dentro del while 
        }//while
        A[izq] = A[j];
        A[j] = piv;
        if (izq < j - 1) {
            quickSort(A, izq, j - 1);
        }
        if (j + 1 < der) {
            quickSort(A, j + 1, der);
        }
    }//ordena enteros    

    public static void quickSortS(String A[], int izq, int der) {
        String piv = A[izq], aux;
        int i = izq, j = der;
        while (i < j) {
            while (A[i].compareToIgnoreCase(piv) <= 0 && i < j) {
                i++;
            }//while anidado dentro del while
            while (A[j].compareToIgnoreCase(piv) > 0) {
                j--;
            }//while anidado dentro del while
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }//if anidado dentro del while 
        }//while
        A[izq] = A[j];
        A[j] = piv;
        if (izq < j - 1) {
            quickSortS(A, izq, j - 1);
        }
        if (j + 1 < der) {
            quickSortS(A, j + 1, der);
        }
    }//ordena Strings orden alfabeticos

    public static void quickSort(int A[]) {
        quickSort(A, 0, A.length - 1);
    }//ordena enteros mandando a llamar la otra funcion

    public static void quickSortS(String A[]) {
        quickSortS(A, 0, A.length - 1);
    }//ordena Strings mandando a llamar la funcion

    public static void main(String[] args) {
        //int A[] = {4,8,2,1,7};
        String A[] = {"Victor", "Elvis", "Damaris", "Jorge", "Fredy"};
        quickSortS(A);
        for (String a : A) {
            System.out.print(a + ", "); //foreach - se puede utilizar siempre que haya arreglos
        }
    }//for
}//class

//proyecto final Jtabla que ordena por tipo marca modelo año color y precio almacenados de un archivo
//Metodos 4 metodos Burbuja QuickSort
//Orden Ascendente o Descendente
//Tiempo que tardo en ordenarlo
