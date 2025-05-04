import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in); // Creo un oggetto Scanner per leggere l'input dell'utente da tastiera    
   
   
    try{ // Provo a eseguire il blocco di codice che può generare eccezioni
   
   
    double somma=0;
    double media=0; 
    double deviazioneParziale=0;     // Ho inizializzato le variabili necessarie per il 
    double sommaDeviazione=0;        //calcolo della media e della deviazione media         
    double deviazioneMedia=0;
   
     
    
System.out.println("=======GESTIONALE PER LA MEDIA DELLO STUDENTE=======");



System.out.println("Dichiara la quantità di voti che vuoi inserire per calcolare la media");

int numeroVoti=scanner.nextInt(); //questo intero "numeroVoti" definito dall'input dell'utente determina la
                                  //grandezza dell'array double "voti"

                                  
                                  if (numeroVoti > 15) 
                                  {
                                
                                    System.out.println("Non puoi inserire più di 15 voti, riprova");
                             return;  // "return" Termina l'esecuzione del programma se 
                                      //il numero di voti inserito supera il limite consentito di 15.
                                  }
                                    
                                  
    System.out.println("=============================================================");
                                
                            

double [] voti=new double[numeroVoti];      // Creo un array di n. elementi(input utente "numeroVoti")
                                         //  per memorizzare i voti inseriti dall'utente

  
System.out.println("Inserisci i voti dello studente per calcolare la media e la deviazione della media.");

for(int i=0; i<voti.length;i++)
{                                        // Il ciclo for percorre l'array "voti" per ogni iterazione (i).
voti[i]= scanner.nextDouble();         // L'utente viene invitato a inserire i voti uno per uno. 
}                                      // Ogni voto inserito viene memorizzato nell'array "voti" alla
                                       // posizione corrente (i).


for(int i=0;i<voti.length;i++)
{                                // In ogni iterazione, il valore del voto corrente (voti[i]) 
    somma+=voti[i];              //viene aggiunto alla variabile "somma".  La variabile "somma" è 
}                                //inizialmente impostata a 0  e viene aggiornata per tutta la
                                 // lunghezza dell'array "voti".

media=somma/voti.length;


// Una volta calcolata la media, procedo a calcolare la deviazione media.
// La deviazione media è la media delle differenze assolute tra ciascun voto e la media.


for(int i=0;i<voti.length;i++)
{

deviazioneParziale=voti[i]-media;
deviazioneParziale = Math.abs(voti[i] - media); //Utilizzo "Math.abs" per convertire le differenze 
sommaDeviazione+=deviazioneParziale;               //negative in valori assoluti, garantendo che
                                                  //tutte le deviazioni siano positive prima di sommarle.

}

deviazioneMedia=sommaDeviazione/voti.length;


System.out.println("=================================================");

//Output 

System.out.println("La media dei voti è: "+media);
System.out.println("La deviazione media è "+deviazioneMedia);
   // Chiudi lo scanner per evitare perdite di risorse

} catch (InputMismatchException e) {    // Gestisce errori di input non numerico
    System.out.println("Errore: inserisci solo numeri validi.");
}finally{   
    scanner.close(); // Chiudo lo scanner per liberare le risorse
}

}
}