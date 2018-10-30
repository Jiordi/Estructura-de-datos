
import static javax.swing.JOptionPane.showMessageDialog;



public class Grafos {



    public static boolean esIde(String cad) {



        int M[][] = {{1, 1, -1, -1}, {1, 1, 1, -1}}; //matriz de adyacencia

        int estado = 0;

        int entrada;

        for (int i = 0; i < cad.length(); i++) {

            int c = cad.charAt(i);

            if (c == '_') {

                entrada = 1;

            }//if

            else if (Character.isLetter(c)) {

                entrada = 0;

            } else if (Character.isDigit(c)) {

                entrada = 2;

            } //else if

            else {

                entrada = 3;

            }//else

            estado = M[estado][entrada];

            if (estado == -1) {

                return false;

            }//if

        }// for

        return true;



    }//esIde



    public static boolean esEntero(String cad) {



        int M[][] = {{1, 1, -1, 1},

        {1, -1, -1, -1}}; //matriz de adyacencia

        int estado = 0;

        int entrada = 0;

        for (int i = 0; i < cad.length(); i++) {

            int c = cad.charAt(i);

            if (c == '-') {

                entrada = 1;

            } else if (c == '+') {

                entrada = 3;

            } else if (Character.isDigit(c)) {

                entrada = 0;

            } else {

                entrada = 2;

            }

            estado = M[estado][entrada];

            if (estado == -1) {

                return false;

            }



        }// for

        return (cad.charAt(0)=='+'||cad.charAt(0)=='-')?cad.length()>=2:cad.length()>=1;

    }//esEntero



    public static boolean esHexa(String cadena) {

        int Matriz[][] = {{0, 0, -1}};

        int estado = 0;

        int entrada = 0;

        for (int i = 0; i < cadena.length(); i++) {

            int c = cadena.charAt(i);

            if (c >= 'A' && c <= 'F') {

                entrada = 1;

            } else if (Character.isDigit(c)) {

                entrada = 0;

            } else {

                entrada = 2;

            }

            estado = Matriz[estado][entrada];

            if (estado == -1) {

                return false;

            }

        }// for

        //TAREA ES FLOTANTE

        return cadena.length() >= 1;

    }//esHexadesimalgg



    

    // -,+,.,n,otro

    /*public static boolean esFloat(String cad) {

        if(cad.length()==0){return false;}

        if(cad.charAt(0)=='.'){

            return false;

        }

        int contador = 0;

        int M[][] = {{1, 1, -1, 1, 1},

        {1, -1, -1, -1, -1}}; //matriz de adyacencia

        int estado = 0;

        int entrada = 0;

        for (int i = 0; i < cad.length(); i++) {

            int c = cad.charAt(i);

            if (c == '-') {

                entrada = 1;

                M[1][4] = 1;

                contador++;

            } else if (c == '+') {

                entrada = 3;

                contador++;

                M[1][4] = 1;

            } else if (Character.isDigit(c)) {

                entrada = 0;

            } else if (c == '.') {

                entrada = 4;

                if (contador <= 1 && (cad.charAt(0) == '+' || cad.charAt(0) == '-')) {

                    M[1][4] = 1;

                    contador++;

                } else if (contador < 1) {

                    M[1][4] = 1;

                    contador++;

                } else {

                    M[1][4] = -1;

                }

            } else {

                entrada = 2;

            }

            estado = M[estado][entrada];

            if (estado == -1) {

                return false;

            }



        }// for

        return (cad.charAt(0)=='+'||cad.charAt(0)=='-')?cad.length()>=2:cad.length()>=1;

    }//esFloat*/

    

    public static boolean esFloat(String cad){

        cad=cad.trim();

        /*      0   1   2   3              

                    d,-,. , o,+*/

        int M[][]={{1,2,-1,-1,2},

                   {1,-1,3,-1,-1},

                   {1,-1,-1,-1,-1},

                   {3,-1,-1,-1,-1}},edo=0,ent; 

        for(int i=0;i<cad.length();i++){

            char c=cad.charAt(i);

            if(Character.isDigit(c)){

                ent=0;

            }else if(c=='-'){

                ent=1;

            }else if(c=='.'){

                ent=2;

            }

            else if(c=='+'){

                ent=4;

            }

            else{

                return false;

            }//else

            edo=M[edo][ent];

            if(edo==-1){

                return false;

            }

        }

        return true;

    }   



    public static void main(String[] args) {

        showMessageDialog(null, esFloat("+12.6"));

    }//main

}
    

