import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Inserisci il titolo dell'evento: ");
        String titolo = scanner.nextLine();

      
        System.out.print("Inserisci la data dell'evento (yyyy-mm-dd): ");
        String dataInput = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataInput);

       
        System.out.print("Inserisci il numero di posti totali: ");
        int numeroPostiTotali = scanner.nextInt();

        // Creo l'evento
        Evento evento = new Evento(titolo, data, numeroPostiTotali);

        // Prenotazioni
        System.out.print("Quanti posti vuoi prenotare? ");
        int prenotazioni = scanner.nextInt();
        for (int i = 0; i < prenotazioni; i++) {
            evento.prenota();
        }

       
        System.out.println("Posti prenotati: " + evento.getNumeroPostiPrenotati());
        System.out.println("Posti disponibili: " + (evento.getNumeroPostiTotali() - evento.getNumeroPostiPrenotati()));

        // Disdette
        System.out.print("Quanti posti vuoi disdire? ");
        int disdette = scanner.nextInt();
        for (int i = 0; i < disdette; i++) {
            evento.disdici();
        }

   
        System.out.println("Posti prenotati: " + evento.getNumeroPostiPrenotati());
        System.out.println("Posti disponibili: " + (evento.getNumeroPostiTotali() - evento.getNumeroPostiPrenotati()));

        Concerto concerto = new Concerto(titolo, data, numeroPostiTotali, null, disdette);
        concerto.toString();
        scanner.close();

        
    }
}
