import player.Elemento;
import player.Audio;
import player.Immagine;
import player.Video;
import interfaces.Riproducibile;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

Scanner scanner=new Scanner(System.in);


   Elemento[] myarray = new Elemento [5];

   for(int i=0;i<5;i++){
       int scegliere=0;
       System.out.println("Scegli tipo elemento (1=Immagine, 2=Audio, 3=Video): ");
       scegliere = Integer.parseInt(scanner.nextLine());

           while(scegliere!=1 && scegliere!=2 && scegliere!=3){
               System.out.println("NUmero NON valido....Ridigidare ");
               System.out.println("Scegli tipo elemento 1=Immagine, 2=Audio, 3=Video  ");
                scegliere = Integer.parseInt(scanner.nextLine());
           }
//devo dichiarare le variabili altrimenti mi piglio sto maledetto errore : java: variable volume is already defined in method main(java.lang.String[])
 String titolo;
int durata;
int volume;
int luminosita;
       switch(scegliere){
               //immagine
           case 1:
               System.out.println("Inserire Titolo ");
                titolo= scanner.nextLine();
               System.out.println("Inserire Luminosita ");
                luminosita= Integer.parseInt(scanner.nextLine());
               myarray[i]= new Immagine (titolo,luminosita);

               break;
               //Audio
           case 2:
               System.out.println("Inserire Titolo ");
                titolo= scanner.nextLine();
               System.out.println("Inserire Durata ");
                durata= Integer.parseInt(scanner.nextLine());
               System.out.println("Inserire Volume ");
                volume= Integer.parseInt(scanner.nextLine());
               myarray[i]= new Audio (titolo,volume,durata );

               break;
               //Video
           case 3:
               System.out.println("Inserire Titolo ");
                titolo= scanner.nextLine();
               System.out.println("Inserire Luminosita ");
                luminosita= Integer.parseInt(scanner.nextLine());
               System.out.println("Inserire Durata ");
                durata= Integer.parseInt(scanner.nextLine());
               System.out.println("Inserire Volume ");
                volume= Integer.parseInt(scanner.nextLine());
               myarray[i]= new Video (titolo,luminosita,durata,volume);

               break;

       }


   }
   //ora chiedo per stampare
        int chiedo;

        do {
            System.out.println("Scegli elemento da eseguire (1-5) oppure 0 per uscire");
            chiedo = Integer.parseInt(scanner.nextLine());

            if (chiedo>= 1 && chiedo <= 5) {
                Elemento e = myarray[chiedo - 1];

                if (e instanceof Immagine) {
                    ((Immagine) e).show();
                } else {
                    ((Riproducibile) e).play();
                }
            }

        } while (chiedo != 0);



    }
}