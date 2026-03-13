package player;

public abstract class Elemento {
 private String titolo;
  // costruttore
    public Elemento(String titolo){
        this.titolo=titolo;
    }

    //metodo get
    public String getTitolo(){
        return titolo;
    }
}
