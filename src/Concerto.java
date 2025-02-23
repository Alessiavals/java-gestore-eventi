import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {
    private LocalTime ora;
    private double prezzo;

    // Costruttore
    public Concerto(String titolo, LocalDate data, int numeroPostiTotali, LocalTime ora, double prezzo) {
        super(titolo, data, numeroPostiTotali); 
        this.ora = ora;
        this.prezzo = prezzo;
    }

    // Getter e Setter
    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

   
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    // Metodo per restituire la data e ora formattata
    public String getDataEOraFormattata() {
        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter oraFormatter = DateTimeFormatter.ofPattern("HH:mm");
        return getData().format(dataFormatter) + " " + ora.format(oraFormatter);
    }

    // Metodo per restituire il prezzo formattato
    public String getPrezzoFormattato() {
        return String.format("EUR", prezzo);
    }

  
    @Override
    public String toString() {
        return getDataEOraFormattata() + " - " + getTitolo() + " - " + getPrezzoFormattato();
    }
}
