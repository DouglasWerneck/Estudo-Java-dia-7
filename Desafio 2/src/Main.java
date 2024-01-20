import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int valor = input.nextInt();

        if(valor % 2 != 0){
            System.out.println("iMPAR");
        } else if(valor > 1 && valor <= 5){
            System.out.println("A");
        } else if(valor >5 && valor <= 20){
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        input.close();
    }
}