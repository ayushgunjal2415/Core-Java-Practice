package Math;

public class Dice {
    public static void main(String[] args) {
        
        for( int i = 1; i <= 6; i++){
            int dice = (int) (Math.random()*6) + 1;
            System.out.println("Roll " + i + ": " + dice);
        }
    }
}
