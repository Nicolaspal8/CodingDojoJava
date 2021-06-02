import java.util.ArrayList;
import java.util.Arrays; 
public class BasicJavaMain {
    public static void main(String[] args) {
        BasicJava todos = new BasicJava();
        int a = 255;
        todos.todoslosnum(a);

        BasicJava impares = new BasicJava();
        impares.imparesentre(a);

        BasicJava sum = new BasicJava();
        sum.sumaparcial(a);

        BasicJava recorrearray = new BasicJava();
        int[] array = new int[]{1,3,5,7,9,13};
        recorrearray.elrecorrido(array);


        BasicJava elmaximo = new BasicJava();
        int[] maxval = new int[]{-3,-5,-7,1,2};
        elmaximo.maximodecimomeridio(maxval);
        

        BasicJava promedio = new BasicJava();
        double promediototal [] = {2,10,4};
        promedio.elpromedio(promediototal);
        

        BasicJava impares2 = new BasicJava();
        int numero = 255;
        ArrayList<Integer> resultadeichon =  impares2.imparesenarr(numero);
        System.out.println(resultadeichon);

        BasicJava mayoresque = new BasicJava();
        int arregloej [] = {1,3,5,7,4,5,6,-1};
        int numeroej = 3;
        int resultadomayor = mayoresque.mayoresquey(arregloej, numeroej);
        System.out.println(resultadomayor);


        BasicJava cuadrado = new BasicJava();
        int arraycuadrado [] = {1,5,10,-2};
        int resultadocuadrado [] = cuadrado.alcuadrado(arraycuadrado);
        // System.out.println(resultadocuadrado);
        System.out.println(Arrays.toString(resultadocuadrado));


        BasicJava negativfuera = new BasicJava();
        int arraynegativs [] = {1,5,10,-2};
        int [] resultarr = negativfuera.negativosfuera(arraynegativs);
        System.out.println(Arrays.toString(resultarr));


        BasicJava arrmaxminavg = new BasicJava();
        int arrtotal [] = {1,5,10,-2};
        ArrayList<Object> totalmaxminavg  = arrmaxminavg.maxminavg(arrtotal);
        System.out.println(totalmaxminavg);



        BasicJava correte = new BasicJava();
        int[] x = new int []{1,5,10,7,-2};
        correte.mueveteizqu(x);

    

        
    }
}
