import java.util.ArrayList;
import java.util.Arrays;



public class BasicJava {
    public void todoslosnum(int a){
        for(int i = 1; i<=a; i++){
            System.out.println(i);
        }
        
    }
    public void imparesentre(int a){
        for(int i = 1; i<=a; i++){
            if(i % 2 == 1){
                System.out.println(i);
            } 
        }
    }

    public void sumaparcial(int a){
        int suma = 0;
        for(int i = 0; i<a; i++){
            System.out.println(i);
            System.out.println(suma += i);
        }
        
    }

    public void elrecorrido(int[] x){
        Arrays.stream(x).forEach(System.out::println);         
        for(int valor : x){
            System.out.println(valor);
        }
        

    }

    public void maximodecimomeridio(int[] x){
        int max = x[0];
        for(int i = 1; i<x.length; i++){

            max = Math.max(max, x[i]);
            // if(x[i]>max){
            //     max = x[i];
            // }
        }
        System.out.println(max);
    }


    public void elpromedio(double[] x){
        double sum =  0;
        
        for(int i = 0; i<x.length; i++){
            sum += x[i];

            
        }
        System.out.println("La suma es "+ sum);
        // int sumaentera =  (int) sum;
        sum = sum / x.length;
        System.out.println("El promedio es "+ sum);
        // double promedio = sum / x.length;
        // System.out.printf("Suma: %d. Promedio: %f", sum, sumaentera);

    }

    public ArrayList<Integer> imparesenarr(int x){
        
        ArrayList<Integer> y = new ArrayList<>();
       
    
            for(int i = 1; i < x; i++){
                if(i % 2 == 1){
                    y.add(i);
                }

            }
            return y;
    }


        public int mayoresquey(int[] x, int y){
            // for(int valor : x){
        //     System.out.println(valor);
        // }
        int mayores = 0;
        for(int valor : x ){
            if(valor > y){
                mayores += 1;
            }
        }
        return mayores;

        }


        public int[] alcuadrado(int[] x){
            for(int i = 0; i<x.length; i++){
                x[i] = (int) Math.pow(x[i], 2);
            }
            // for(int i = 0; i<x.length; i++){
            //     x[i] *= x[i];
            // }
            return x;
        }


        public int[] negativosfuera(int[] x){
            for(int i = 0; i<x.length; i++){
                if(x[i] < 0){
                    x[i] = 0;
                }
                
            }
            return x;
        }


        public ArrayList<Object> maxminavg(int[] x){
            int maximo = 0;
            int min = 0;
            double avg = 0;
            ArrayList<Object> finalarray = new ArrayList<>();

            for(int i = 1; i<x.length; i++){

                maximo = Math.max(maximo, x[i]);

                min = Math.min(min, x[i]);

                avg += x[i];
        }
        avg = avg/x.length;
        finalarray.add(maximo);
        finalarray.add(min);
        finalarray.add(avg);
        return finalarray;
    }

        public void mueveteizqu(int[] arr){
            for(int i = 0; i<arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = 0;
            System.out.println(Arrays.toString(arr));
        }
    
}
