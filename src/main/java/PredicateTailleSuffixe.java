public class PredicateTailleSuffixe implements PredicateStrategy{
    private String suffixe;
    private Integer taille;

    public PredicateTailleSuffixe(int taille){
        this.suffixe = "";
        this.taille = taille;
    }

    public PredicateTailleSuffixe(String suffixe){
        this.suffixe = suffixe;
        this.taille = 0;
    }

    public PredicateTailleSuffixe(String suffixe, int taille){
        this.suffixe = suffixe;
        this.taille = taille;
    }

    @Override
    public Boolean checkPredicate(Entree entree) {
        Fichier fichier = (Fichier) entree;
        if(fichier.getTaille() != 0 && entree.getNom() != "")
            return entree.getNom().endsWith(suffixe) && fichier.getTaille() >= taille;
        else if(fichier.getTaille() != 0 && entree.getNom() == "")
            return fichier.getTaille() >= taille;
        else if(fichier.getTaille() == 0 && entree.getNom() != "")
            return entree.getNom().endsWith(suffixe);
        else return false;
    }
}
