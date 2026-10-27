public class Nurse extends MedicalStaff {
    public Nurse(String id, String department, int hours) {
        super(id, department, hours);
    }
    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Providing patient care and monitoring vital signs."
        );
    }
}
