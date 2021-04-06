public class StudentParking extends ParkingPermit {

    public String type;
    public String semester;

    public void issuePermit(){
        if(this.checkRegistration() == true){
            System.out.println("Permit issued for Student " + super.getCurrentDateTime());
        } else {
            System.out.println("Student is not registered, please verify the information");
        }
    }

    public boolean checkRegistration(){
        if(!this.type.equals("") && !this.semester.equals("")){
            return true;
        } else {
            return false;
        }
    }
}
