
public class Pitagoras {
    public double calcularHipotenusa(int catetoA, int catetoB) {

            double c = 0;
            catetoA *= catetoA;
            catetoB *= catetoB;
            c = catetoA + catetoB;
            c = Math.sqrt(c);
            return c;

//         La hipotenusa es el lado opuesto del ángulo recto.
//         Calcular el valor de c dados los valores catetoA y catetoB
    }
    public double calcularHipotenusa(double catetoA, double catetoB) {

        double c = 0;
        catetoA *= catetoA;
        catetoB *= catetoB;
        c = catetoA + catetoB;
        c = Math.sqrt(c);
        return c;

//         La hipotenusa es el lado opuesto del ángulo recto.
//         Calcular el valor de c dados los valores catetoA y catetoB
}
}

// public String fizzBuzz(int number) {
//     for(int i = 0 ; i <= 50 ; i++){
//         if(i%3 == 0 && i%5 == 0 ){
//             System.out.println("FizzBuzz");
//         } else if (i%3 == 0){
//             System.out.println("Fizz");
//         } else if (i%5 == 0){
//             System.out.println("Buzz");
//         } else {
//             System.out.println("2");
//         }
//     }
// }
// }
