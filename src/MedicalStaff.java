public abstract class MedicalStaff {
    private String employeeId;
    private String department;
    private int workingHours;

    public MedicalStaff(String employeeId, String department,
                        int workingHours) {
        this.employeeId = employeeId;
        this.department = department;
        this.workingHours = workingHours;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Working Hours: " + workingHours);
    }

    public abstract void performDuties();
}
