public class Main {
    public static void main(String[] args) {
        MedicalStaff doctor =
                new Doctor("D001", "Outpatient", 8, "Cardiology");
        MedicalStaff nurse =
                new Nurse("N001", "Nursing", 8, "Morning");
        MedicalStaff pharmacist =
                new Pharmacist("P001", "Pharmacy", 7, "PH-2024-001");
        MedicalStaff technician =
                new LaboratoryTechnician("L001", "Laboratory", 8, "Senior");
        MedicalStaff[] staff = {
                doctor, nurse, pharmacist, technician
        };

        for (MedicalStaff member : staff) {
            System.out.println("\n-------------------------");
            member.displayInfo();
            member.performDuties();
        }
    }
}
