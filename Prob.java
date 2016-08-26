import java.util.Random;
public class Prob {
    public static void main(String[] args)  {
    
        Random number = new Random();
        int x;
        double s, probability;
        s = 0;
        
        for (int i = 0; i < 100; i++) {
            x = number.nextInt(100) + 1;
            if (x % 2 == 0) {
                s = s + 1;
            }
        }
        probability = s/100;
        System.out.println(probability);
    }
}
            
