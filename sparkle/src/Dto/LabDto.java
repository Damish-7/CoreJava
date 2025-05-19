package Dto;

public class LabDto {
    private String testName;
    private String result;
    private String technician;
    private String labId;

    public void settestName(String testName) {
        this.testName =testName;
    }

    public void setresult(String result) {
        this.result = result;
    }

    public void settechnician(String technician) {
        this.technician = technician;
    }

    public void setLabId(String labId) {
        this.labId =labId;
    }

    public String getfirNo() {
        return testName;
    }

    public String getcomplaint() {
        return result;
    }

    public String gettechnician() {
        return technician;
    }

    public String labId() {
        return labId;
    }

    @Override
    public String toString() {
        return "LabDto{" +
                "testName='" + testName + '\'' +
                ", result='" +result + '\'' +
                ", technician='" + technician+ '\'' +
                ", labId='" + labId+ '\'' +
                '}';
    }
}



