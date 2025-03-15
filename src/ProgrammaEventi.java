
import java.time.LocalDate;
import java.util.ArrayList;

public class ProgrammaEventi extends Evento {

    private String titoloProgrammaEventi;
    private ArrayList<Evento> eventi;

    // Costruttore 
    public ProgrammaEventi(String titolo, LocalDate data, int numeroPostiTotali, String titoloProgrammaEventi, ArrayList<Evento> eventi) {
        super(titolo, data, numeroPostiTotali);
        this.titoloProgrammaEventi = titolo;
        this.eventi = new ArrayList<>();
    }
    
    // Aggiunge l'evento 

    public void aggiungiEvento(Evento evento) {
        eventi.add(evento);
    }

    // Restituisce il numero di eventi
    public int getNumeroEventi() {
        return eventi.size();
    }

    // Svuota la lista di eventi

    public void svuotaEventi() {
        eventi.clear();
    }

   
}
