public class Medecin {
    private int idMedecin;
    private String nomMedecin;
    private String prenomMedecin;
    private String specialite;

    public Medecin(int idMedecin, String nomMedecin, String prenomMedecin, String specialite){
        this.idMedecin=idMedecin;
        this.nomMedecin=nomMedecin;
        this.prenomMedecin=prenomMedecin;
        this.specialite=specialite;
    }

    public int getIdMedecin(){
        return this.idMedecin;
    }

    public String getNomMedecin(){
        return this.nomMedecin;
    }

    public String getPrenomMedecin(){
        return this.prenomMedecin;
    }

    public String getSpecialite(){
        return this.specialite;
    }

    public String toString(){
        return "[Identifiant du Médecin : " + idMedecin + "Nom : " + nomMedecin +
        "Prénom : " + prenomMedecin + "Spécialité : " + specialite +" ]";
    }

}
