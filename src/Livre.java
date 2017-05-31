/**
 * Created by tatane on 24/05/2017.
 */
public class Livre extends Document implements Imprimable {

    protected String auteur;
    protected int nbPages;

    /**
     * Constructeur Livre
     * Crée une instance de Livre en appelant le constucteur de la classe mère
     * @param num
     * @param titre
     * @param auteur
     * @param nbPages
     */
    public Livre(int num, String titre,String auteur, int nbPages)
    {
        super(num, titre);
        this.auteur=auteur;
        this.nbPages=nbPages;
    }

    /**
     * Getter pour l'attribut nbPages
     * @return le nombre de pages du livre
     */
    public int getNbPages() {
        return nbPages;
    }

    /**
     * Getter pour l'attribut auteur
     * @return l'auteur du livre
     */
    public String getAuteur() {
        return auteur;
    }

    @Override
    public void imprimer() {

    }

    @Override
    public String toString() {
        return ""+super.toString()+"Livre{" +
                "auteur='" + auteur + '\'' +
                ", nbPages=" + nbPages +
                '}';
    }


}
