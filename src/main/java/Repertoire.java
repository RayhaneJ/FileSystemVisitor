public class Repertoire extends Entree {
    public void accept(FileSystemVisitor v){
        v.visit(this);
    }
}
