package Utilitario;

import java.util.Scanner;

public class Utility {

    

    static Scanner sc = new Scanner(System.in);
    

    /**
     * Obtener un numero mayor o igual a 0
     * @param mensaje
     * @return Un numero mayor o igual a 0
     */

    public static int obtenerUnNumeroPositivo(String mensaje) {
        int numero = 0;
        boolean numeroValido = false;

        System.out.print(mensaje);
        String entrada = sc.nextLine();
        while (!numeroValido) {
            try {
                numero = Integer.parseInt(entrada);
                if (numero >= 0 && numero <4 ) {
                    numeroValido = true;
                } else {
                    System.out.print("El número ingresado no es valido, Ingresa otro número: ");
                   
                    entrada = sc.nextLine();
                }
            } catch (NumberFormatException e) {
                System.out.print("El valor ingresado no es un número , Intentalo otra vez: ");
                
                entrada = sc.nextLine();
            }
        }

        return numero;
    }

    /**
     * Obtener una cadena valida que contenga solo letras. 
     * @param mensaje
     * @return la cadena (frase)
     */
    public static String obtenerUnaCadenaValida(String mensaje){
        String cadena;
        
        System.out.print(mensaje);
        cadena = sc.nextLine();
         while (true) {

            if (contieneSoloLetras(cadena)) {
                break;
            } else {
                System.out.print("La frase ingresada no es válida, Intentalo otra vez: ");
                cadena = sc.nextLine();
            }
        }
        return cadena;
    }

    /**
     * limpia la terminal
     */
    public static final void clearTerminal() {
        try {
            String operatingSystem = System.getProperty("os.name");

            if (operatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /**
     * Verifica si la  cadena contiene solo letras
     * @param frase frase ingresada
     * @return ok si todo esta bien
     */
    private static boolean contieneSoloLetras(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            
            if (!Character.isLetter(frase.charAt(i)) && frase.charAt(i) != ' ' && frase.charAt(i)!='@' && frase.charAt(i)!='.') {

                return false;
            }
        }
        return true;
    }
    /**
     * verifica si es una letra
     * @param cadena 
     * @return letra
     */
    public static boolean esLetra(String cadena) {
        if (cadena.length() != 1) {
            return false;
        }
        char caracter = cadena.charAt(0);
        return caracter == 'b' || caracter == 'c' || caracter == 'd' || caracter == 'f' || caracter == 'g'
                    || caracter == 'h' || caracter == 'j' || caracter == 'k' || caracter == 'l' || caracter == 'm'
                    || caracter == 'n' || caracter == 'p' || caracter == 'q' || caracter == 'r' || caracter == 's'
                    || caracter == 't' || caracter == 'v' || caracter == 'w' || caracter == 'x' || caracter == 'y'
                    || caracter == 'z' || caracter == 'B' || caracter == 'C' || caracter == 'E' || caracter == 'F' || caracter == 'G'
                    || caracter == 'H' || caracter == 'J' || caracter == 'K' || caracter == 'L' || caracter == 'M'
                    || caracter == 'N' || caracter == 'P' || caracter == 'Q' || caracter == 'R' || caracter == 'S'
                    || caracter == 'T' || caracter == 'V' || caracter == 'W' || caracter == 'X' || caracter == 'Y'
                    || caracter == 'Z';
    }
    /**
     * Elimina la vocal de una frase
     * @param frase frase ingresada
     * @param vocal vocal a eliminar de la frase
     * @return la frase sin vocales
     */
    public static String eliminarVocal(String frase, String vocal) {

        frase = frase.toLowerCase();
        vocal = vocal.toLowerCase();

        frase = frase.replace(vocal, " ");

        return frase;
    }
    /**
     * Cuenta el numero de vocales de una frase
     * @param cadena frase ingresada
     * @return el numero de vocales
     */
    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }
    /**
     * Cuenta el numero de letras de una frase
     * @param cadena frase ingresada
     * @return el numero de letras
     */
    public static int contarLetras(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'b' || caracter == 'c' || caracter == 'd' || caracter == 'f' || caracter == 'g'
                    || caracter == 'h' || caracter == 'j' || caracter == 'k' || caracter == 'l' || caracter == 'm'
                    || caracter == 'n' || caracter == 'p' || caracter == 'q' || caracter == 'r' || caracter == 's'
                    || caracter == 't' || caracter == 'v' || caracter == 'w' || caracter == 'x' || caracter == 'y'
                    || caracter == 'z') {
                contador++;
            }
        }
        return contador;
    }
    /**
     * Verifica si es una vocal
     * @param texto cadena ingresada
     * @return la vocal
     */
    public static boolean esVocal1(String texto) {
        if (texto.length() != 1) {
            return false;
        }
        char caracter = texto.charAt(0);
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
               caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U';
    }
    /**
     * Elimina una letra de una frase
     * @param frase cadena ingresada
     * @param letra letra a eliminar de la frase
     * @return frase sin la letra 
     */
    public static String eliminarLetra(String frase, String letra) {

        frase = frase.toLowerCase();
        letra = letra.toLowerCase();

        frase = frase.replace(letra, " ");

        return frase;
    }
    /**
     * Invierte una frase
     * @param frase cadena ingresada
     * @return la frase invertida
     */
    public static String invertirFrase(String frase) {
        StringBuilder sb = new StringBuilder(frase);
        sb.reverse();
        return sb.toString();
    }
    /**
     * Verifica si es una  vocal  
     * @param c caracter a verificar
     * @return la vocal
     */
    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    /**
     * convierte las vocales en mayusculas
     * @param frase cadena ingresada
     * @return la cadena con las vocales en mayuscula
     */
    public static String convertirVocalesMayusculas(String frase) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Utility.esVocal(c)) {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }
    /**
     * invierte la frase
     * @param frase cadena ingresada
     * @return la cadena invertida
     */
    public static String invertirFrase2(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        return builder.reverse().toString();
    }
    /**
     * invierte la frase con letras en mayúsculas y vocales en minúsculas
     * @param frase cadena ingresada
     * @return la frase
     */
    public static String convertirAMayusculas(String frase) {
        StringBuilder builder = new StringBuilder();

        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                
                    builder.append(Character.toUpperCase(c));
                }
             else {
                builder.append(c);
            }
        }

        return builder.toString();
    }
    /**
     * Alterna las letrs en mayusculas y minusculas
     * @param frase cadena ingresada
     * @return la frase alternada con mayusculas y minusculas
     */
    public static String alternarMayusculasMinusculas(String frase) {
        StringBuilder builder = new StringBuilder();

        boolean convertirMayuscula = true;

        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                if (convertirMayuscula) {
                    builder.append(Character.toUpperCase(c));
                } else {
                    builder.append(Character.toLowerCase(c));
                }
                convertirMayuscula = !convertirMayuscula;
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }
}
