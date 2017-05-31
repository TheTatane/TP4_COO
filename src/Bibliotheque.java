import java.util.ArrayList;

/**
 * Created by tatane on 24/05/2017.
 */
public class Bibliotheque {

    ArrayList<Etagere> sesEtageres;

    /**
     * Constructeur Bibliotheque
     * Crée une instance de Bibliotheque
     * Crée une ArrayList vide de type Etagere pour stocker les étagères
     */
    public Bibliotheque()
    {
        sesEtageres=new ArrayList<Etagere>();
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "sesEtageres=" + sesEtageres +
                '}';
    }
}
