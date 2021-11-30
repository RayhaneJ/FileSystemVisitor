import java.util.Date;

public abstract class Entree {
    private String nom;
    private Date date;

    public void accept(FileSystemVisitor v) { }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
