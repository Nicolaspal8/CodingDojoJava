
public class PitagorasMain {
    public static void main(String[] args) {
        Pitagoras pitagoras = new Pitagoras();
        int a = 20;
        int b = 15;
        double respuesta = pitagoras.calcularHipotenusa( a, b);
        System.out.println("La Hipotenusa es "+ respuesta);
    }
    
}

