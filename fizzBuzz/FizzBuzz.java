
public class FizzBuzz {
    public String secuencia(int a){
        String fizzbuzz = "";
        if(a % 3 == 0 && a % 5 == 0){
            fizzbuzz = "FizzBuzz";
        }
        else if(a % 3 == 0){
            fizzbuzz = "Fizz";
        }
        else if(a % 5 == 0){
            fizzbuzz = "Buzz";
        }
        
        else{System.out.println(a);
        }
        return fizzbuzz;
    }
}
