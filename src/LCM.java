import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to lcm..\n");
        System.out.print("Enter your first num: ");
        int first = sc.nextInt();
        System.out.print("Enter your second num: ");
        int second = sc.nextInt();
        int lcm = lcm(first, second);
        System.out.println("LCM is: " + lcm);
        sc.close();

    }

    public static int lcm(int first, int second){
        int max = Math.max(first,second);
        while (true){                                       //true runs the loop forever to stop this we have to return
            if (max % first == 0 && max % second == 0){     //it checks the condition both are true then only it return
                return max;
            }
            max++;            //if condition is not true then max gets increment 
             //                  and its starts checking one more time and loop goes on until both gets true..
        }
    }
    
}


/* Why Math.max because  lcm is never smaller than the bigger number among the numbers given by user..
so, it directly starts checking from bigger num therefore reducing the time complexity; */

//It is a brute force method..