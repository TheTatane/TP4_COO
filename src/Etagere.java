import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by tatane on 24/05/2017.
 */
public class Etagere implements Imprimable {

    
    ArrayList<Document> sesDocuments;
    private static int MAX_DOCS=20;

    /**
     * Constructeur Bibliotheque
     * Crée une instance de Bibliotheque
     * Crée une ArrayList vide de type Document pour stocker les documents
     */
    public Etagere()
    {
        sesDocuments = new ArrayList<Document>();
    }

    /**
     * Procédure ajouterDocument
     * Ajoute un document passé en paramètre s'il reste de la place dans l'étagère
     * @param doc
     */
    public void ajouterDocument(Document doc)
    {
        if(sesDocuments.size()<MAX_DOCS)
            sesDocuments.add(doc);
        else
            System.out.println("Plus de place dans cette étagère");
    }

    /**
     * Procédure rechercher
     * Recherche les documents de l'étagère ayant pour auteur le nom auteur passé en paramètre
     * @param auteur
     */
    public void rechercher(String auteur)
    {
        for (int i=0; i<sesDocuments.size();i++)
        {
            if(sesDocuments.get(i) instanceof Livre && ((Livre) sesDocuments.get(i)).auteur.equals(auteur))
            {
                System.out.print(sesDocuments.get(i));
            }
        }

    }

    // 1 ère version du Tri
    /*
    public void triAlphabetique()
    {
        int min;
        Document D1;
        for(int i = 0; i < sesDocuments.size(); i++)
        {
            min = i;
            for(int j = i; j < sesDocuments.size(); j++)
            {
                if(sesDocuments.get(min).titre.compareTo(sesDocuments.get(j).titre) > 0)
                {
                    min = j;
                }
            }
            D1 = sesDocuments.get(i);
            sesDocuments.set(i, sesDocuments.get(min));
            sesDocuments.set(min, D1);
        }
    }
    */

    /**
     * Procédure triAlphabetique
     * Tri la Collection de documents par ordre alphabétique en se basant sur le titre de chaque document
     */
    public void triAlphabetique()
    {
        Collections.sort(sesDocuments);
    }


    /**
     * Procédure imprimer
     * Affiche les livres imprimables présents dans l'étagère
     */
    @Override
    public void imprimer() {

        System.out.print("\nImprime ...");
        for (int i =0; i<sesDocuments.size(); i++)
        {
            if(sesDocuments.get(i) instanceof Livre)
            {
                System.out.print(sesDocuments.get(i));
            }
        }
    }

    /**
     * Fonction getTailleOccupé
     * Permet de connaitre la taille occupée dans l'étagère
     * @return la taille occupée par les documents présent dans l'étagère
     */
    public int getTailleOccupé()
    {
        return sesDocuments.size();
    }


    @Override
    public String toString() {
        return "Etagere{" +
                "sesDocuments=" + sesDocuments +
                '}';
    }



}
