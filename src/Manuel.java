/**
 * Created by tatane on 24/05/2017.
 */
public class Manuel extends Livre {

    private int niveauScolaire;

    public Manuel (int num, String titre,String auteur, int nbPages, int niveauScolaire)
    {
        super(num, titre, auteur, nbPages);
        this.niveauScolaire=niveauScolaire;
    }
}