import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ParkingPermit {
    public int id = 0;
    public String issueDate;
    public double cost;

    public void issuePermit(){
        this.id++;
        this.issueDate = this.getCurrentDateTime();
        this.cost = 2.50;

        System.out.println(
                //string interpolation
                "Permit " + this.id  + " Issued: " + this.issueDate + " costing: " + this.cost
        );
    }

    public String getCurrentDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
