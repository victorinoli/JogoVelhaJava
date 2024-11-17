import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int init = 1;

        while (init == 1) {

            JogoVelha jogoVelha = new JogoVelha();

            jogoVelha.init();

            System.out.printf("Deseja continuar jogando%n" +
                              "0 para nao%n" +
                              "1 para sim\n");

            init = sc.nextInt();
        }

    }
}