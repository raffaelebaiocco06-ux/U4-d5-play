package player;
import interfaces.Riproducibile;
public class Audio extends Elemento implements Riproducibile {

    private int volume;
    private int durata;

    //costruttore
    public Audio(String titolo,int volume,int durata){
        super(titolo);
        this.volume=volume;
        this.durata=durata;
    }

//metodi alza e abbassa volume

    public int abbassaVolume(){
        return volume--;
    }
    public int alzaVolume(){
        return volume++;
    }
    //play
@Override
    public void play(){
        System.out.println(" Audio partito ");
}
}
