package Java.lesson8.clinic;

public class Patient {

    public String problem;
    public TreatmentPlan treatmentPlan;

    public Patient(String problem) {
        this.problem = problem;
        this.treatmentPlan = new TreatmentPlan();
    }

    public Patient(String problem, TreatmentPlan treatmentPlan) {
        this.problem = problem;
        this.treatmentPlan = treatmentPlan;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "problem='" + problem + '\'' +
                ", treatmentPlan=" + treatmentPlan +
                '}';
    }
}
