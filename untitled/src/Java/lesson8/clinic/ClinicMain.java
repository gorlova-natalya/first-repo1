package Java.lesson8.clinic;

public class ClinicMain {

    public static void main(String[] args) {

        Patient patient1 = new Patient("болят зубы", new TreatmentPlan(2));
        Patient patient2 = new Patient("камни в почках", new TreatmentPlan(1));
        Patient patient3 = new Patient("боль в пояснице", new TreatmentPlan(6));

        Doctor surgeon = new Surgeon("Джонатан");
        Doctor dentist = new Dentist("Сара");
        Doctor therapist = new Therapist("Дилан");

        Patient[] patients = {patient1, patient2, patient3};

        patient1.treatmentPlan.appointDoctor();
        patient2.treatmentPlan.appointDoctor();
        patient3.treatmentPlan.appointDoctor();

        for (Patient patient : patients) {
            int plan = patient.treatmentPlan.getTreatmentPlan();
            if (plan == 1) {
                surgeon.heal();
            } else if (plan == 2) {
                dentist.heal();
            } else {
                therapist.heal();
            }
        }
    }
}
