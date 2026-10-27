public class Nurse extends MedicalStaff {
    private String shiftType;

    public Nurse(String id, String department, int hours, String shiftType) {
        super(id, department, hours);
        this.shiftType = shiftType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shift Type: " + shiftType);
    }

    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Providing patient care and monitoring vital signs."
        );
    }

    public String getShiftType() {
        return shiftType;
    }
}
