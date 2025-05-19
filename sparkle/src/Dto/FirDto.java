package Dto;

public class FirDto {
    private String firNo;
    private String complaint;
    private String location;
    private String time;

    public void setfirNo(String firNo) {
        this.firNo = firNo;
    }

    public void setcomplaint(String complaint) {
        this.complaint = complaint;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public void settime(String time) {
        this.time = time;
    }

    public String getfirNo() {
        return firNo;
    }

    public String getcomplaint() {
        return complaint;
    }

    public String getlocation() {
        return location;
    }

    public String time() {
        return time;
    }

    @Override
    public String toString() {
        return "FirDto{" +
                "firNo='" + firNo + '\'' +
                ", complaint='" +complaint + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time+ '\'' +
                '}';
    }
}



