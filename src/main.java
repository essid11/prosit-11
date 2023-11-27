public class main {
    public static void main(String[] args){


        Employé employe1 = new Employé(10,"yassine","yassine","tic",22);
        Employé employe2 = new Employé(2,"jamila","jamila","tic",22);
        Employé employe3 = new Employé(3,"Helmi","Helmi","tic",22);
        Employé employe4 = new Employé(4,"yassine","yassine","tic",22);

        Departement d1 = new Departement(2,"marketing",8);
        Departement d2 = new Departement(2,"rh",8);

        AffectationHashMap aff = new AffectationHashMap();
        aff.ajouterEmployeDepartement(employe1,d1);
        aff.ajouterEmployeDepartement(employe2,d1);
        aff.ajouterEmployeDepartement(employe3,d1);
        aff.ajouterEmployeDepartement(employe4,d2);

        System.out.println("TreeMap");
        System.out.println(aff.trierMap());


    }
}
