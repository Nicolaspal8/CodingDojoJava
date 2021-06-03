import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava {

    public ArrayList<Integer> mayoresque(int[] arr){
        
        ArrayList<Integer> newarr = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            
            sum += arr[i];
            if(arr[i]>10){
                newarr.add(arr[i]);
            }
            
        }
        System.out.println(sum);
        return newarr;
    }
    

    public ArrayList<String> palabrasmayores(String[] arr){
        ArrayList<String> arraydepalabras = new ArrayList<>();
        ArrayList<String> masde5 = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            arraydepalabras.add(arr[i]);
            
            
        }
        Collections.shuffle(arraydepalabras);
        for(int i = 0; i<arraydepalabras.size(); i++){
            System.out.println(arraydepalabras.get(i));
            if(arraydepalabras.get(i).length() > 5){

                masde5.add(arraydepalabras.get(i));

            }
        }
        return masde5;

    }

    public void caracteres(char[] x){
        ArrayList<Character> caracteres = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            caracteres.add(x[i]);

        }
        Collections.shuffle(caracteres);
        System.out.println(caracteres.get(caracteres.size()-1));
        System.out.println(caracteres.get(0));
        if(caracteres.get(0) == 'a' && caracteres.get(0) == 'e' && caracteres.get(0) == 'i' && caracteres.get(0) == 'o' && caracteres.get(0) == 'u'){
            System.out.println(caracteres.get(0) + "Es una vocal");
        }

    }

    public int[] arrayaleatorio(int n){
        Random r = new Random();
        
        int[] arrnew = new int[n];
        for (int i = 0; i < n; i++) {

            int numero = r.nextInt(100-55)+55;
            arrnew[i] = numero;
        }
        // Arrays.sort(arrnew);
        return arrnew;

    }


    public int[] arrayaleatorio2(int n){
        Random r = new Random();
        
        
        int[] arrnew2 = new int[n];
        for (int i = 0; i < n; i++) {

            int numero = r.nextInt(101-54)+54;
            arrnew2[i] = numero;
            
        }
         Arrays.sort(arrnew2);
        //  int[] solo = new int[]{};
         
        System.out.println(Arrays.toString(arrnew2));

        //  int[] nuevoarregloo = new int[] {arrnew};
        Arrays.stream(arrnew2).forEach(System.out::println); 
        int mayor = arrnew2[0];
        int menor = arrnew2[0];
        for (int j = 1; j < arrnew2.length; j++) {
            if(arrnew2[j] > mayor){
                mayor = arrnew2[j];
            }
            if(arrnew2[j] < menor){
                menor = arrnew2[j];
            }
            
        }
        System.out.println("aqui va el mayor "+ mayor);
        System.out.println("aqui va el menor "+ menor);
        return arrnew2;

    }
    public void cadenaaleatoria(int n, String palabras){
        String nuevasletras = "";
        palabras.trim();
        
        Random r = new Random();
        System.out.println(palabras);
        for (int i = 0; i < n; i++) {

            int random = r.nextInt(palabras.length());

            nuevasletras += palabras.charAt(random);
            System.out.println(nuevasletras);
        }
        // nuevo += String.valueOf(digito[i]);
        System.out.println(nuevasletras);
    }


    public void cadenaaleatoria2(int n, int n2, String palabras){
        String nuevasletras = "";
        palabras.trim();
        ArrayList<String> nuevoarreglodestring = new ArrayList<>();
        Random r = new Random();
        System.out.println(palabras);

        for (int i = 0; i < n2; i++) {
            
      
        for (int j = 0; j < n; j++) {

            int random = r.nextInt(palabras.length());

            nuevasletras += palabras.charAt(random);
           
        }
        
        
        // nuevo += String.valueOf(digito[i]);
        nuevoarreglodestring.add(i, nuevasletras);
        nuevasletras = "";
        
        
    }
    System.out.println(nuevoarreglodestring);


    }

}
