import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Value x");
        int x = scanner.nextInt();
        if (x<3){
            System.out.println("X jest mniejsze od 3");
        }else {
            System.out.println("X jest wieksze od 3");
        }
    }
}

