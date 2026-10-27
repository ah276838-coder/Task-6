public class LaboratoryTechnician extends MedicalStaff {
    private String certificationLevel;

    public LaboratoryTechnician(String id, String department, int hours, String certificationLevel) {
        super(id, department, hours);
        this.certificationLevel = certificationLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Certification Level: " + certificationLevel);
    }

    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Conducting laboratory tests and analyzing samples."
        );
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }
}
