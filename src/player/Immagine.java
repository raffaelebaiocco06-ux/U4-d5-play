package player;

public class Immagine extends Elemento{
    private int luminosita;
    //costruttore
    public Immagine(String titolo,int luminosita){
        super(titolo);
        this.luminosita=luminosita;
    }
//metodi alza e abbassa luminosita

    public int abbassaLuminosita(){
        return luminosita--;
    }
    public int alzaLuminosita(){
        return luminosita++;
    }
}
