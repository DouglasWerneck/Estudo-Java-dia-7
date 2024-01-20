import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o num1 op num2 (2 * 4): ");

        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        char op = input.next().charAt(0);
        double num2 = input.nextDouble();

        if (op == '+')
            System.out.println((int) num1 + num2);
        else if (op == '-')
            System.out.println((int) num1 - num2);
        else if (op == '*')
            System.out.println((int) num1 * num2);
        else if (op == '/')
            System.out.println(num1 / num2);
        else
            System.out.println("Formato invalido!");

        input.close();
    }
}