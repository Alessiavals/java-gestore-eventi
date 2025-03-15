import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Classe Evento
public class Evento {
    private String titolo;
    private LocalDate data;
    private int numeroPostiTotali;
    private int numeroPostiPrenotati;

    // Costruttore
    public Evento(String titolo, LocalDate data, int numeroPostiTotali) throws IllegalArgumentException {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La data dell'evento non può essere nel passato.");
        }
        if (numeroPostiTotali <= 0) {
            throw new IllegalArgumentException("Il numero di posti totali deve essere positivo.");
        }
        this.titolo = titolo;
        this.data = data;
        this.numeroPostiTotali = numeroPostiTotali;
        this.numeroPostiPrenotati = 0;
    }

    // Getter e Setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La data dell'evento non può essere nel passato.");
        }
        this.data = data;
    }


    public int getNumeroPostiTotali() {
        return numeroPostiTotali;
    }

   
    public int getNumeroPostiPrenotati() {
        return numeroPostiPrenotati;
    }

    // Metodo per prenotare
    public void prenota() throws IllegalStateException {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalStateException("Impossibile prenotare, l'evento è già passato.");
        }
        if (numeroPostiPrenotati >= numeroPostiTotali) {
            throw new IllegalStateException("Non ci sono più posti disponibili.");
        }
        numeroPostiPrenotati++;
    }

    // Metodo per disdire
    public void disdici() throws IllegalStateException {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalStateException("Impossibile disdire, l'evento è già passato.");
        }
        if (numeroPostiPrenotati <= 0) {
            throw new IllegalStateException("Non ci sono prenotazioni da disdire.");
        }
        numeroPostiPrenotati--;
    }

    // Metodo toString
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Evento in programma:" + data.format(formatter) + " - " + titolo;
    }
}
