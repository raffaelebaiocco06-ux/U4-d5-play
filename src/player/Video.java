package player;
import interfaces.Riproducibile;
public class Video extends Elemento implements Riproducibile  {
    private int luminosita;
    private int durata;
    private int volume;


    //costruttore
    public Video(String titolo, int luminosita, int durata,int volume){
        super(titolo);
        this.luminosita=luminosita;
        this.durata=durata;
        this.volume=volume;
    }
//metodi alza e abbassa volume

    public int abbassaVolume(){
        return volume--;
    }
    public int alzaVolume(){
        return volume++;
    }
    //metodi alza e abbassa luminosita

    public int abbassaLuminosita(){
        return luminosita--;
    }
    public int alzaLuminosita(){
        return luminosita++;
    }

    //play
    @Override
    public void play(){
        System.out.println(" Video partito ");
    }
}


