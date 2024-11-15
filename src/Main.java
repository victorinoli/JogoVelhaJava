import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Grade grade = new Grade();
        Jogo[] j = new Jogo[2];
        int[] turno = new int[2];
        int numAtual;
        int jAtual;

        j[0] = new Jogo();
        j[1] = new Jogo();

        grade.zeraJogos();

        System.out.println("Deseja jogar com X ou O?");

        if (sc.nextLine().equals("X")) {
            j[0].setPlayer('X');
            j[1].setPlayer('O');
        }else {
            j[1].setPlayer('X');
            j[0].setPlayer('O');
        }

        for(int i = 0; i < 9; i++){

            if( i % 2 == 1){
                turno[0]++;
            }else {
                turno[1]++;
            }

            numAtual = grade.verificaJogo(sc.nextInt());
            jAtual =i%2;

            j[jAtual].setJogada(numAtual,turno[jAtual]);
            grade.jogar(numAtual, j[jAtual].getPlayer());
            if(j[jAtual].verificaVitoria()){
                System.out.printf("vitoria de %c", j[jAtual].getPlayer());
                break;
            }

        }

    }
}