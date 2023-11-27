import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    Map<Employé, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employé e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
            System.out.println("Affectation réussie : " + e.getNom() + " -> " + d.getNomDepartement());
        } else {
            System.out.println("L'employé " + e.getNom() + " est déjà affecté à un département.");
        }

    }

    public void afficherEmployesEtDepartements() {

        for (Map.Entry<Employé, Departement> entry : affectations.entrySet()) {
            Employé employe = entry.getKey();
            Departement departement = entry.getValue();
            System.out.println(employe.getNom() + " -> " + departement.getNomDepartement());
        }
    }

    public boolean rechercherEmploye (Employé e){
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        return affectations.containsValue(d);
    }

    public TreeMap<Employé, Departement> trierMap(){
        TreeMap<Employé, Departement> emp = new TreeMap<>(affectations);
        return emp;
    }
}
