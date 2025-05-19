package Dto;

public class LicenseDto {
    private String licenseNo;
    private String issuedDate;
    private String expiryDate;
    private String licenseType;

    public void setlicenseNo(String licenseNo) {
        this.licenseNo =licenseNo;
    }

    public void setissuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public void setexpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void  setlicenseType(String  licenseType) {
        this. licenseType = licenseType;
    }

    public String getlicenseNo() {
        return licenseNo;
    }

    public String getissuedDate() {
        return issuedDate;
    }

    public String getexpiryDate() {
        return expiryDate;
    }

    public String  getlicenseType() {
        return  licenseType;
    }

    @Override
    public String toString() {
        return "LicenseDto{" +
                "licenseNo='" + licenseNo + '\'' +
                ", issuedDate='" +issuedDate+ '\'' +
                ", expiryDate='" + expiryDate+ '\'' +
                ",  licenseType='" +  licenseType+ '\'' +
                '}';
    }
}



