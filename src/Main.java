import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creo una LinkedList di frutti
        LinkedList<Fruit> frutti = new LinkedList<>(List.of(
                new Fruit("Pera"),
                new Fruit("Cocomero"),
                new Fruit("Limone")
        ));
        // Stampo lista iniziale frutta
        System.out.println("Lista frutta iniziale:");
        for (Fruit frutto : frutti) {
            System.out.println(frutto.getName());
        }

        // Aggiungo frutto al primo posto della lista
        frutti.addFirst(new Fruit("Banana"));
        // Aggiungo frutto all'ultimo posto della lista
        frutti.addLast(new Fruit("Mela"));
        // Stampo lista aggiornata
        System.out.println("\nLista con frutta aggiunta a inizio e fine lista:");
        for (Fruit frutto : frutti) {
            System.out.println(frutto.getName());
        }
    }
}