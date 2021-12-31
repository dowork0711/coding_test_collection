import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        sc.close();

        int index = 1;

        while(index <= number) {
            System.out.println(index);
            index++;
        }

    }

}
