/**
 * Created by tatane on 24/05/2017.
 */
public class Manuel extends Livre {

    private int niveauScolaire;

    /**
     * Constructeur Manuel
     * Crée une instance de Manuel en appelant le constructeur de la classe mère (Document)
     * @param num
     * @param titre
     * @param auteur
     * @param nbPages
     * @param niveauScolaire
     */
    public Manuel (int num, String titre,String auteur, int nbPages, int niveauScolaire)
    {
        super(num, titre, auteur, nbPages);
        this.niveauScolaire=niveauScolaire;
    }

    /**
     * Procédure imprimer
     * Imprime le manuel
     */
    @Override
    public void imprimer() {
        System.out.println("\nImprime ..."+this);
    }

    @Override
    public String toString() {
        return ""+super.toString()+" Manuel{" +
                "niveauScolaire='" + niveauScolaire + '\'' +
                '}';
    }
}
