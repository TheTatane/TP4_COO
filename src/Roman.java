/**
 * Created by tatane on 24/05/2017.
 */
public class Roman extends Livre {

    private String prixLitteraire;

    /**
     * Constructeur Roman
     * Crée une instance de Roman en appelant le constucteur de la classe mère (Document)
     * @param num
     * @param titre
     * @param auteur
     * @param nbPages
     */
    public Roman (int num, String titre,String auteur, int nbPages)
    {
        super(num, titre, auteur, nbPages);
    }

    /**
     * Procédure imprimer
     * Imprime le roman
     */
    @Override
    public void imprimer() {
        System.out.println("Imprime ..."+this);
    }

    @Override
    public String toString() {
        return ""+super.toString()+" Roman{" +
                "prixLitteraire='" + prixLitteraire + '\'' +
                '}';
    }
}
