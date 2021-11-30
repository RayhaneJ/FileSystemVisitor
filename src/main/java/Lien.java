public class Lien extends Entree {
    public void accept(FileSystemVisitor v){
        v.visit(this);
    }
}
