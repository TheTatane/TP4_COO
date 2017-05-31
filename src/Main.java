public class Main {

    public static void main(String[] args) {
        Etagere E1 = new Etagere();

        Manuel M1 = new Manuel(1,"Toto en Amérique","Paolo",242,5);
        Manuel M2 = new Manuel(2,"Toto au Japon","Paolo",318,4);
        Roman R1 = new Roman(3,"Les fleurs du mal","Charles Baudelaire",96);
        Roman R2 = new Roman(4,"L'Antéchrist","Nietzsche",215);
        Dictionnaire D1 = new Dictionnaire(5,"Larousse","Français");

        E1.ajouterDocument(M1);
        E1.ajouterDocument(R2);
        E1.ajouterDocument(M2);
        E1.ajouterDocument(R1);
        E1.ajouterDocument(D1);

        System.out.println(E1);
        E1.rechercher("Paolo");
        System.out.println("\n\nOn trie");
        E1.triAlphabetique();
        System.out.println(E1);

        R1.imprimer();
        M1.imprimer();

        E1.imprimer();
    }
}
