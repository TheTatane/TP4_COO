/**
 * Created by tatane on 24/05/2017.
 */
public class Dictionnaire extends Document {

    private String langue;

    /**
     * Contstucteur Dictionnaire
     * Crée une instance de Dictionnaire en appelant le constucteur de la classe mère (Document)
     * @param num
     * @param titre
     * @param langue
     */
    public Dictionnaire(int num, String titre, String langue)
    {
        super(num,titre);
        this.langue=langue;
    }
}
