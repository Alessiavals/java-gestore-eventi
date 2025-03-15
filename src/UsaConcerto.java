import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class UsaConcerto {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Indica il titolo del concerto");
        String titolo = scan.nextLine();
        System.out.println("Inserire data:");
        String dataUtente = scan.nextLine();
        LocalDate data = LocalDate.parse(dataUtente);
        System.out.println("Inserire numero posti totali:");
        int numeroPostiTotali = scan.nextInt();
        System.out.println("Inserire l'orario");
        scan.nextLine();
        String orarioUtente = scan.nextLine();
        LocalTime ora = LocalTime.parse(orarioUtente);
        System.out.println("Inserire prezzo:");
        double prezzo = scan.nextDouble();

        Concerto concerto = new Concerto(titolo, data, numeroPostiTotali, ora, prezzo);

        System.out.println(concerto.toString());

    }

}
