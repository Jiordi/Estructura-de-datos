
import com.mycompany.myapp.dto.Automovil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ordenacion {

    public Automovil[] bubbleSortNumeros(Automovil A[], int posicion, String opcion) {
        if (posicion == 0) {
            for (int p = 1; p < A.length; p++) {
                for (int i = 0; i < A.length - p; i++) {
                    if (opcion.equalsIgnoreCase("año")) {
                        if (A[i].getAño() > A[i + 1].getAño()) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if
                    } else if (opcion.equalsIgnoreCase("precio")) {
                        if (A[i].getPrecio() > A[i + 1].getPrecio()) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if
                    }
                }
            }
        } else {
            for (int p = 1; p < A.length; p++) {
                for (int i = 0; i < A.length - p; i++) {
                    if (opcion.equalsIgnoreCase("año")) {
                        if (A[i].getAño() < A[i + 1].getAño()) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if
                    } else if (opcion.equalsIgnoreCase("precio")) {
                        if (A[i].getPrecio() < A[i + 1].getPrecio()) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if
                    }
                }
            }
        }
        return A;
    }//burbuja

    public Automovil[] bubbleSortString(Automovil A[], int posicion, String opcion) {
        int n = A.length;
        if (posicion == 0) {
            for (int p = 1; p < n; p++) {
                for (int i = 0; i < n - p; i++) {
                    if (opcion.equalsIgnoreCase("tipo")) {
                        if (A[i].getTipo().compareToIgnoreCase(A[i + 1].getTipo()) >= 0) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if
                    } else if (opcion.equalsIgnoreCase("marca")) {
                        if (A[i].getMarca().compareToIgnoreCase(A[i + 1].getMarca()) >= 0) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if

                    } else if (opcion.equalsIgnoreCase("modelo")) {
                        if (A[i].getModelo().compareToIgnoreCase(A[i + 1].getModelo()) >= 0) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if

                    } else if (opcion.equalsIgnoreCase("color")) {
                        if (A[i].getColor().compareToIgnoreCase(A[i + 1].getColor()) >= 0) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if

                    }
                }
            }
        } else {
            for (int p = 1; p < n; p++) {
                for (int i = 0; i < n - p; i++) {
                    if (opcion.equalsIgnoreCase("tipo")) {
                        if (A[i].getTipo().compareToIgnoreCase(A[i + 1].getTipo()) < 0) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if
                    } else if (opcion.equalsIgnoreCase("marca")) {
                        if (A[i].getMarca().compareToIgnoreCase(A[i + 1].getMarca()) < 0) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if
                    } else if (opcion.equalsIgnoreCase("modelo")) {
                        if (A[i].getModelo().compareToIgnoreCase(A[i + 1].getModelo()) < 0) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if
                    } else if (opcion.equalsIgnoreCase("color")) {
                        if (A[i].getColor().compareToIgnoreCase(A[i + 1].getColor()) < 0) {
                            Automovil aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }//if
                    }
                }
            }
        }
        return A;
    }//burbuja

    public Automovil[] quickSortNumeros(Automovil A[], int izq, int der, int posicion, String opcion) {
        if (posicion == 0) {
            if (opcion.equalsIgnoreCase("año")) {
                int piv = A[izq].getAño(), i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getAño() <= piv && i < j) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getAño() > piv) {
                        j--;
                    }//while anidado dentro del while
                    if (i < j) {
                        aux = A[i];
                        A[i] = A[j];
                        A[j] = aux;
                    }//if anidado dentro del while 
                }//while
                A[izq] = A[j];
                A[j].setAño(piv);
                if (izq < j - 1) {
                    quickSortNumeros(A, izq, j - 1, posicion, opcion);
                }
                if (j + 1 < der) {
                    quickSortNumeros(A, j + 1, der, posicion, opcion);
                }
            } else if (opcion.equalsIgnoreCase("precio")) {
                float piv = A[izq].getPrecio();
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getPrecio() <= piv && i < j) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getPrecio() > piv) {
                        j--;
                    }//while anidado dentro del while
                    if (i < j) {
                        aux = A[i];
                        A[i] = A[j];
                        A[j] = aux;
                    }//if anidado dentro del while 
                }//while
                A[izq] = A[j];
                A[j].setPrecio(piv);
                if (izq < j - 1) {
                    quickSortNumeros(A, izq, j - 1, posicion, opcion);
                }
                if (j + 1 < der) {
                    quickSortNumeros(A, j + 1, der, posicion, opcion);
                }
            }
        } else {
            if (opcion.equalsIgnoreCase("año")) {
                int piv = A[(izq + der) / 2].getAño(), i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getAño() > piv) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getAño() < piv) {
                        j--;
                    }//while anidado dentro del while
                    if (j >= i) {
                        aux = A[i];
                        A[i] = A[j];
                        A[j] = aux;
                        i++;
                        j--;
                    }//if anidado dentro del while 
                }//while
                if (izq < j) {
                    quickSortNumeros(A, izq, j, posicion, opcion);
                }
                if (i < der) {
                    quickSortNumeros(A, i, der, posicion, opcion);
                }
            } else if (opcion.equalsIgnoreCase("precio")) {
                float piv = A[(izq + der) / 2].getPrecio();
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getPrecio() > piv) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getPrecio() < piv) {
                        j--;
                    }//while anidado dentro del while
                    if (j >= i) {
                        aux = A[i];
                        A[i] = A[j];
                        A[j] = aux;
                        i++;
                        j--;
                    }//if anidado dentro del while 
                }//while
                if (izq < j) {
                    quickSortNumeros(A, izq, j, posicion, opcion);
                }
                if (i < der) {
                    quickSortNumeros(A, i, der, posicion, opcion);
                }
            }
        }
        return A;
    }//burbuja

    public Automovil[] quickSortString(Automovil A[], int izq, int der, int posicion, String opcion) {
        if (posicion == 0) {
            if (opcion.equalsIgnoreCase("tipo")) {
                Automovil piv = A[izq];
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getTipo().compareToIgnoreCase(piv.getTipo()) <= 0 && i < j) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getTipo().compareToIgnoreCase(piv.getTipo()) > 0) {
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
                    quickSortString(A, izq, j - 1, posicion, opcion);
                }
                if (j + 1 < der) {
                    quickSortString(A, j + 1, der, posicion, opcion);
                }
            }
            if (opcion.equalsIgnoreCase("marca")) {
                Automovil piv = A[izq];
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getMarca().compareToIgnoreCase(piv.getMarca()) <= 0 && i < j) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getMarca().compareToIgnoreCase(piv.getMarca()) > 0) {
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
                    quickSortString(A, izq, j - 1, posicion, opcion);
                }
                if (j + 1 < der) {
                    quickSortString(A, j + 1, der, posicion, opcion);
                }
            }
            if (opcion.equalsIgnoreCase("modelo")) {
                Automovil piv = A[izq];
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getModelo().compareToIgnoreCase(piv.getModelo()) <= 0 && i < j) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getModelo().compareToIgnoreCase(piv.getModelo()) > 0) {
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
                    quickSortString(A, izq, j - 1, posicion, opcion);
                }
                if (j + 1 < der) {
                    quickSortString(A, j + 1, der, posicion, opcion);
                }
            }
            if (opcion.equalsIgnoreCase("color")) {
                Automovil piv = A[izq];
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getColor().compareToIgnoreCase(piv.getColor()) <= 0 && i < j) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getColor().compareToIgnoreCase(piv.getColor()) > 0) {
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
                    quickSortString(A, izq, j - 1, posicion, opcion);
                }
                if (j + 1 < der) {
                    quickSortString(A, j + 1, der, posicion, opcion);
                }
            }
        } else {
            if (opcion.equalsIgnoreCase("tipo")) {
                Automovil piv = A[(izq + der) / 2];
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getTipo().compareToIgnoreCase(piv.getTipo()) > 0) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getTipo().compareToIgnoreCase(piv.getTipo()) < 0) {
                        j--;
                    }//while anidado dentro del while
                    if (j >= i) {
                        aux = A[i];
                        A[i] = A[j];
                        A[j] = aux;
                        i++;
                        j--;
                    }//if anidado dentro del while 
                }//while
                if (izq < j) {
                    quickSortString(A, izq, j, posicion, opcion);
                }
                if (i < der) {
                    quickSortString(A, i, der, posicion, opcion);
                }
            } else if (opcion.equalsIgnoreCase("marca")) {
                Automovil piv = A[(izq + der) / 2];
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getMarca().compareToIgnoreCase(piv.getMarca()) > 0) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getMarca().compareToIgnoreCase(piv.getMarca()) < 0) {
                        j--;
                    }//while anidado dentro del while
                    if (j >= i) {
                        aux = A[i];
                        A[i] = A[j];
                        A[j] = aux;
                        i++;
                        j--;
                    }//if anidado dentro del while 
                }//while
                if (izq < j) {
                    quickSortString(A, izq, j, posicion, opcion);
                }
                if (i < der) {
                    quickSortString(A, i, der, posicion, opcion);
                }
            } else if (opcion.equalsIgnoreCase("modelo")) {
                Automovil piv = A[(izq + der) / 2];
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getModelo().compareToIgnoreCase(piv.getModelo()) > 0) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getModelo().compareToIgnoreCase(piv.getModelo()) < 0) {
                        j--;
                    }//while anidado dentro del while
                    if (j >= i) {
                        aux = A[i];
                        A[i] = A[j];
                        A[j] = aux;
                        i++;
                        j--;
                    }//if anidado dentro del while 
                }//while
                if (izq < j) {
                    quickSortString(A, izq, j, posicion, opcion);
                }
                if (i < der) {
                    quickSortString(A, i, der, posicion, opcion);
                }
            } else if (opcion.equalsIgnoreCase("color")) {
                Automovil piv = A[(izq + der) / 2];
                int i = izq, j = der;
                Automovil aux;
                while (i < j) {
                    while (A[i].getColor().compareToIgnoreCase(piv.getColor()) > 0) {
                        i++;
                    }//while anidado dentro del while
                    while (A[j].getColor().compareToIgnoreCase(piv.getColor()) < 0) {
                        j--;
                    }//while anidado dentro del while
                    if (j >= i) {
                        aux = A[i];
                        A[i] = A[j];
                        A[j] = aux;
                        i++;
                        j--;
                    }//if anidado dentro del while 
                }//while
                if (izq < j) {
                    quickSortString(A, izq, j, posicion, opcion);
                }
                if (i < der) {
                    quickSortString(A, i, der, posicion, opcion);
                }
            }

        }
        return A;
    }

    public Automovil[] shellNumeros(Automovil A[], int posicion, String opcion) {
        if (posicion == 0) {
            if (opcion.equalsIgnoreCase("año")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getAño() > A[i].getAño()) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            } else if (opcion.equalsIgnoreCase("precio")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getPrecio() > A[i].getPrecio()) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.                                
                            }
                        }
                    }
                }
            }
        } else {
            if (opcion.equalsIgnoreCase("año")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getAño() < A[i].getAño()) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            } else if (opcion.equalsIgnoreCase("precio")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getPrecio() < A[i].getPrecio()) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.                                
                            }
                        }
                    }
                }
            }
        }
        return A;
    }

    public Automovil[] shellString(Automovil A[], int posicion, String opcion) {
        if (posicion == 0) {
            if (opcion.equalsIgnoreCase("tipo")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getTipo().compareToIgnoreCase(A[i].getTipo()) > 0) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            } else if (opcion.equalsIgnoreCase("marca")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getMarca().compareToIgnoreCase(A[i].getMarca()) > 0) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            } else if (opcion.equalsIgnoreCase("modelo")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getModelo().compareToIgnoreCase(A[i].getModelo()) > 0) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            } else if (opcion.equalsIgnoreCase("color")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getColor().compareToIgnoreCase(A[i].getColor()) > 0) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            }
        } else {
            if (opcion.equalsIgnoreCase("tipo")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getTipo().compareToIgnoreCase(A[i].getTipo()) < 0) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            } else if (opcion.equalsIgnoreCase("marca")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getMarca().compareToIgnoreCase(A[i].getMarca()) < 0) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            } else if (opcion.equalsIgnoreCase("modelo")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getModelo().compareToIgnoreCase(A[i].getModelo()) < 0) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            } else if (opcion.equalsIgnoreCase("color")) {
                int salto, i;
                Automovil aux;
                boolean cambios;
                for (salto = A.length / 2; salto != 0; salto /= 2) {
                    cambios = true;
                    while (cambios) { // Mientras se intercambie algún elemento
                        cambios = false;
                        for (i = salto; i < A.length; i++) // se da una pasada
                        {
                            if (A[i - salto].getColor().compareToIgnoreCase(A[i].getColor()) < 0) { // y si están desordenados
                                aux = A[i]; // se reordenan
                                A[i] = A[i - salto];
                                A[i - salto] = aux;
                                cambios = true; // y se marca como cambio.
                            }
                        }
                    }
                }
            }
        }
        return A;
    }

    public List<Automovil> radixNumeros(List<Automovil> a) {
        for (int i = a.size();
                i >= 0; i--) {
            for (int j = a.size();
                    j > a.size() - i; j--) {
                if (a.get(j).getAño() > a.get(j - 1).getAño()) {
                    Automovil tempswap = a.get(j);
                    a.remove(j);
                    a.add(j, a.get(j - 1));
                    a.remove(j - 1);
                    a.add(j - 1, tempswap);
                }
            }
        }
        return a;
    }


    /*public void quickSortS(String A[], int izq, int der) {
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
    }//ordena Strings orden alfabeticos*/
    public Automovil[] quickSortNumeros(Automovil A[], int posicion, String opcion) {
        return quickSortNumeros(A, 0, A.length - 1, posicion, opcion);
    }//ordena enteros mandando a llamar la otra funcion

    public Automovil[] quickSortString(Automovil A[], int posicion, String opcion) {
        return quickSortString(A, 0, A.length - 1, posicion, opcion);
    }//ordena enteros mandando a llamar la otra funcion

    /*public void quickSortS(String A[]) {
        quickSortS(A, 0, A.length - 1);
    }//ordena Strings mandando a llamar la funcion*/
}//class

//proyecto final Jtabla que ordena por tipo marca modelo año color y precio almacenados de un archivo
//Metodos 4 metodos Burbuja QuickSort ShellSort Radix
//Orden Ascendente o Descendente
//Tiempo que tardo en ordenarlo
