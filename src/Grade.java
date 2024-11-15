import java.util.Scanner;

public class Grade {

    private char[] jogos = new char[9];

    public void zeraJogos() {

        for (int i = 0; i < 9; i++) {
            jogos[i] = ' ';
        }
    }

    public void printajogo(){
        System.out.printf("  %c | %c | %c%n" +
                          "-------------%n" +
                          "  %c | %c | %c%n" +
                          "-------------%n" +
                          "  %c | %c | %c\n",
                                                jogos[0],jogos[1],jogos[2],
                                                jogos[3],jogos[4],jogos[5],
                                                jogos[6],jogos[7],jogos[8]);
    }

    public void jogar(int local, char player) {

        jogos[local-1] = player;

        printajogo();

    }

    public int verificaJogo(int local){

        boolean verifica = true;
        int contador;
        Scanner sc = new Scanner(System.in);

        while(verifica){

            contador = 0;

            for(int i = 0; i < 9; i++){
                if(jogos[i] == local){

                    System.out.println("digite um local que nao foi jogado");
                    local = sc.nextInt();

                }else {
                    contador++;
                }
            }


            if(contador == 9){
                verifica = false;
            }
        }

        return local;
    }

}
