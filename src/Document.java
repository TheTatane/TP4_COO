/**
 * Created by tatane on 24/05/2017.
 */
public abstract class Document {

    protected int numero;
    protected String titre;

    public Document(int num, String titre)
    {
        this.numero=num;
        this.titre=titre;
    }

    @Override
    public String toString() {
        return "\nDocument{" +
                "numero=" + numero +
                ", titre='" + titre + '\'' +
                '}';
    }

}
