
public class Ordenacion {
    public static int[] bubbleSort(int A[]){
        int n = A.length;
        for(int p=1; p<n; p++)
            for(int i=0; i<n-p; i++)
                if(A[i] > A[i+1]){int aux = A[i]; A[i] = A[i+1]; A[i+1] = aux;}//if
        return A;
    }//burbuja
    //LEER QICKSORT
    public static void main(String[] args) {
        int A[] = {4,8,2,1,7};
        A = bubbleSort(A);
        for(int a: A)System.out.println(a); //foreach - se puede utilizar siempre que haya arreglos
    }//for
}//class
