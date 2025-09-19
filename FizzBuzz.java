//Der bliver lavet en for løkke og 3 modulus operationer for at give resultatet Fizz, Buzz og FizzBuzz  
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            String result = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                            (i % 3 == 0) ? "Fizz" :
                            (i % 5 == 0) ? "Buzz" :
                            Integer.toString(i);
            System.out.println(result);
        }
    }
}