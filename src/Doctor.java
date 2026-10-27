public class Doctor extends MedicalStaff {
    public Doctor(String id, String department, int hours) {
        super(id, department, hours);
    }
    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Diagnosing patients and prescribing treatment."
        );
    }
}
