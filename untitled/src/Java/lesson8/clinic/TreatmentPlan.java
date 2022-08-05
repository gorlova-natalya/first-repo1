package Java.lesson8.clinic;

public class TreatmentPlan {

    private int treatmentPlan;

    public TreatmentPlan() {
    }

    public TreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void appointDoctor() {
        if (treatmentPlan == 1) {
            System.out.println("Пациенту назначен хирург");
        } else if (treatmentPlan == 2) {
            System.out.println("Пациенту назначен дантист");
        } else {
            System.out.println("Пациенту назначен терапевт");
        }
    }
}
