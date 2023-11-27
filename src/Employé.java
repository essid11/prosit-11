import java.util.Objects;

public class Employé implements Comparable<Employé> {
    public int id;
    public String nom;
    public String prenom;
    public String nomDepartement;
    public int grade;

    public Employé(){

    }

    public Employé(int id, String nom, String prenom,String nomDepartement, int grade){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement= nomDepartement;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        Employé employé = (Employé) obj;
        return id == employé.id && grade == employé.grade && Objects.equals(nom, employé.nom) && Objects.equals(prenom, employé.prenom) && Objects.equals(nomDepartement, employé.nomDepartement);
    }

    @Override
    public String toString() {
        return "Employé{" + "id=" + id + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", nomDepartement='" + nomDepartement + '\'' + ", grade=" + grade + '}';
    }

    @Override
    public int compareTo(Employé o) {
        // return Integer.compare(this.id,o.getId());
        return this.id - o.getId();
    }
}
