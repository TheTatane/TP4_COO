/**
 * Created by tatane on 24/05/2017.
 */
public abstract class Document implements Comparable<Document> {

    protected int numero;
    protected String titre;

    /**
     * Constructeur Document
     * Crée une instance de Document
     * @param num
     * @param titre
     */
    public Document(int num, String titre)
    {
        this.numero=num;
        this.titre=titre;
    }

    /**
     * Fonction compareTo
     * Permet de définir sur quel critère s'effectura la fonction sort
     * @param d
     * @return Si le titre en cible est plus petit que le titre passé en paramètre
     */
    public int compareTo (Document d)
    {
        return titre.compareToIgnoreCase(d.getTitre());
    }

    /**
     * Getter pour l'attribut titre
     * @return le titre du document
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Getter pour l'attribut numero
     * @return le numero du document
     */
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "\nDocument{" +
                "numero=" + numero +
                ", titre='" + titre + '\'' +
                '}';
    }

}
