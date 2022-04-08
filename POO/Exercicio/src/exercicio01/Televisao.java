package exercicio01;

public class Televisao {

    private int volume;
    private int canal;

    Televisao(int numeroCanalPadrao, int potenciaVolumePadrao){
        this.volume = potenciaVolumePadrao;
        this.canal = numeroCanalPadrao;
    }

    public void setMaisVolume(){
        if(this.volume < 100){
            this.volume++;
        }
    }

    public void setMenosVolume(){
        if(this.volume > 0){
            this.volume--;
        }

    }

    public void setMaisCanal(){
        this.canal++;
    }

    public void setMenosCanal(){
        this.canal--;
    }

    public void escolhaCanal(int novoCanal){
        this.canal = novoCanal;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int potenciaVolume) {
        this.volume = potenciaVolume;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int numeroCanal) {
        this.canal = numeroCanal;
    }
}
