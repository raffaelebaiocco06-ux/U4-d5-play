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
        String app="";
        char el='!';
        for(int q=1;q<=volume;q++){
            app=app+el;
        }

// la stampa
        for(int i=1;i<=durata;i++){
            System.out.println("Audio "+ getTitolo() + app);
        }

}
}
