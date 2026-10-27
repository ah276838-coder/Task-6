public class LaboratoryTechnician extends MedicalStaff {
    public LaboratoryTechnician(String id, String department, int hours) {
        super(id, department, hours);
    }
    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Conducting laboratory tests and analyzing samples."
        );
    }
}
