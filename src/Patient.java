public class Patient {
    private int idPatient;
    private String nom;
    private String prenom;
    private int age;

    public Patient(int idPatient, String nom, String prenom, int age ){
        this.idPatient=idPatient;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    public int getNumPatien(){
        return idPatient;
    }

    public String getNom(){
        return nom;
    }
    // public String setNom(String nom){
    // this.nom=nom;
    // }

    public String getPrenom(){
        return prenom;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Medecin [ Identifiant du patient : " + idPatient + 
        " nom : " + nom +
        " prenom : " + prenom + "Age : " + age+" ]";
    }
}
