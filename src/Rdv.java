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

    
}
