import java.util.ArrayList;

/**
 * Created by tatane on 24/05/2017.
 */
public class Etagere {

    
    ArrayList<Document> sesDocuments;
    private static int MAX_DOCS=20;

    public Etagere()
    {
        sesDocuments = new ArrayList<Document>();
    }

    void ajouterDocument(Document doc)
    {
        if(sesDocuments.size()<MAX_DOCS)
            sesDocuments.add(doc);
        else
            System.out.println("Plus de place dans cette étagère");
    }

    public void rechercher(String auteur)
    {
        for (int i=0; i<sesDocuments.size();i++)
        {
            if(sesDocuments.get(i) instanceof Livre && ((Livre) sesDocuments.get(i)).auteur.equals(auteur))
            {
                System.out.println(sesDocuments.get(i));
            }
        }
    }

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

    @Override
    public String toString() {
        return "Etagere{" +
                "sesDocuments=" + sesDocuments +
                '}';
    }
}
