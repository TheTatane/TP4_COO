import java.util.ArrayList;

/**
 * Created by tatane on 24/05/2017.
 */
public class Bibliotheque {

    ArrayList<Etagere> sesEtageres;

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
