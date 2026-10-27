public class Pharmacist extends MedicalStaff {
    private String licenseNumber;

    public Pharmacist(String id, String department, int hours, String licenseNumber) {
        super(id, department, hours);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("License Number: " + licenseNumber);
    }

    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Dispensing medicines and advising on their use."
        );
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
