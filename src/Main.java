public class Main {
    public static void main(String[] args) {
        MedicalStaff doctor =
                new Doctor("D001", "Outpatient", 8);
        MedicalStaff nurse =
                new Nurse("N001", "Nursing", 8);
        MedicalStaff pharmacist =
                new Pharmacist("P001", "Pharmacy", 7);
        MedicalStaff technician =
                new LaboratoryTechnician("L001", "Laboratory", 8);
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
