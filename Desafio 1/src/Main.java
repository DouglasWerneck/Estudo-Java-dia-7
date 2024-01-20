import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int firstValue = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int secondValue = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int thirdValue = input.nextInt();
        System.out.println(firstValue + "\n" + secondValue +"\n" + thirdValue);
        input.close();
    }
}