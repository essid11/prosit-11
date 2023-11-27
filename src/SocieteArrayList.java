/*import java.util.ArrayList;
import java.util.List;

public class SocieteArrayList implements IGestion<Employé>{

    private List<Employé> employees;

    public SocieteArrayList() {
        employees = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employé employé) {
        employees.add(employé);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employé employee : employees) {
            if (employee.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employé employé) {
        return false;
    }

    @Override
    public void supprimerEmploye(Employé employé) {
        return employees.contains(employé);
    }

    @Override
    public void displayEmploye() {

    }

    @Override
    public void trierEmployeParId() {

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}*/
