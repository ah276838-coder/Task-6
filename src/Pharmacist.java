public class Pharmacist extends MedicalStaff {
    public Pharmacist(String id, String department, int hours) {
        super(id, department, hours);
    }
    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Dispensing medicines and advising on their use."
        );
    }
}
