public class Jogo {

    private final int[] jogos = {11,11,11,11,11};
    private char player;
    private final int[][] jogosPossiveis = {{1,2,3},{4,5,6},{7,8,9},
                                            {1,4,7},{2,5,8},{3,6,9},
                                            {1,5,9},{3,5,7}
    };

    public Jogo() {}


    public void setPlayer(char player) {
        this.player = player;
    }

    public void setJogada(int local, int turno) {
        jogos[turno] = local;
    }

    public char getPlayer() {
        return player;
    }

    public boolean verificaVitoria() {

        for(int i = 0; i < 8; i++) {

            int contador = 0;

            for(int j = 0; j < 3; j++) {

                for(int k = 0; k < 5; k++) {
                    if(jogosPossiveis[i][j] == jogos[k]){
                        contador++;
                    }
                }
            }

            if(contador == 3) {
                return true;
            }
        }return false;
    }

}
