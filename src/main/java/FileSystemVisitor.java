public interface FileSystemVisitor {
    public Boolean visit(Repertoire rep);
    public Boolean visit(Fichier fichier);
    public Boolean visit(Lien lien);
}
