public class FacultyStaffParking extends ParkingPermit {
    public String group;
    public String year;

    public void issuePermit(){
        // payroll deduction
        System.out.println("payroll deducted");
        // issue a permit
        System.out.println("Permit issued for faculty/staff: " + super.getCurrentDateTime());
    }
}
