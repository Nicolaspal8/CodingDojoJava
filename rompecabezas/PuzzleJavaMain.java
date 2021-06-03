import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class PuzzleJavaMain {
    public static void main(String[] args) {

        PuzzleJava puzzle = new PuzzleJava();
        int[] arreglo = new int[] {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> resultado = puzzle.mayoresque(arreglo);
        System.out.println(resultado);


        PuzzleJava puzzle2 = new PuzzleJava();
        String [] palabras = new String[] {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        ArrayList<String> resultado2 = puzzle2.palabrasmayores(palabras);
        System.out.println(resultado2);


        PuzzleJava puzzle3 = new PuzzleJava();
        char[] palabras3 = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        puzzle3.caracteres(palabras3);


        PuzzleJava puzzle4 = new PuzzleJava();
        int number = 10;
        int [] resultado3 = puzzle4.arrayaleatorio(number);
        System.out.println(Arrays.toString(resultado3));


        PuzzleJava puzzle5 = new PuzzleJava();
        int number2 = 10;
        int [] resultado4 = puzzle4.arrayaleatorio2(number);
        System.out.println(Arrays.toString(resultado4));


        PuzzleJava puzzle6 = new PuzzleJava();
        int numerodecadena = 5;
        String letrasul = "4wiojf3p4iojg34iogj3049ij530ijowtnvorwijvnrojtreoijorijtvoierjvoijtvoiwjv";
        puzzle6.cadenaaleatoria(numerodecadena, letrasul);

        PuzzleJava puzzle7 = new PuzzleJava();
        int aa = 5;
        int bb = 10;
        int lengtharr = 10;
        String letrasul2 = "4wiojf3p4iojg34iogj3049ij530ijowtnvorwijvnrojtreoijorijtvoierjvoijtvoiwjv";
        puzzle6.cadenaaleatoria2(aa,bb, letrasul2);


    }
    
}
