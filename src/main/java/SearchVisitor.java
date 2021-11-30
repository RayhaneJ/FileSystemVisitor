public class SearchVisitor implements FileSystemVisitor {
    private PredicateStrategy predicateStrategy;

    public SearchVisitor(PredicateStrategy predicateStrategy){
        this.predicateStrategy = predicateStrategy;
    }

    @Override
    public Boolean visit(Repertoire rep) {
        return predicateStrategy.checkPredicate(rep);
    }

    @Override
    public Boolean visit(Fichier fichier) {
        return predicateStrategy.checkPredicate(fichier);
    }

    @Override
    public Boolean visit(Lien lien) {
        return predicateStrategy.checkPredicate(lien);
    }
}
