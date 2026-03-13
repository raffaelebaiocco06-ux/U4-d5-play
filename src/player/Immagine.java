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
    //metodo show

    public void show(){
        String app="";
        char ast='*';
        for(int i=1;i<=luminosita;i++){
            app=app+ast;
        }
        // la stampa
        for(int i=1;i<=luminosita;i++){
            System.out.println("Immagine "+ getTitolo() + app);
        }


    }
}
