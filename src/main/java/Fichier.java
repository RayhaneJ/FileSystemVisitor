public class Fichier extends Entree {
    private int taille;

    public void accept(FileSystemVisitor v){
        v.visit(this);
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
