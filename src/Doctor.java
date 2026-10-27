public class Doctor extends MedicalStaff {
    private String specialty;

    public Doctor(String id, String department, int hours, String specialty) {
        super(id, department, hours);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Diagnosing patients and prescribing treatment."
        );
    }

    public String getSpecialty() {
        return specialty;
    }
}
