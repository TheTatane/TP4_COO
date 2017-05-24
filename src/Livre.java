/**
 * Created by tatane on 24/05/2017.
 */
public abstract class Livre extends Document {

    protected String auteur;
    protected int nbPages;


    public Livre(int num, String titre,String auteur, int nbPages)
    {
        super(num,titre);
        this.auteur=auteur;
        this.nbPages=nbPages;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String toString() {
        return ""+super.toString()+"Livre{" +
                "auteur='" + auteur + '\'' +
                ", nbPages=" + nbPages +
                '}';
    }
}
