import java.time.LocalDateTime;

public class Rdv {
    private Patient patient;
    private Medecin medecin;
    private LocalDateTime dateheure;
    
    public Rdv(Patient patient, Medecin medecin, LocalDateTime dateheure){
        this.patient=patient;
        this.medecin=medecin;
        this.dateheure=dateheure;
    }

    public Patient getPatient(){
        return this.patient;
    }

    public Medecin getMedecin(){
        return this.medecin;
    }

    public LocalDateTime getDateTime(){
        return this.dateheure;
    }

    public String toString(){
        return "[Le patient : " + patient + " Le medecin : "+ " Date et heure de RDV : " + dateheure + " ]";
    }
}
