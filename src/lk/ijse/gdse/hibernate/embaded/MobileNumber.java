package lk.ijse.gdse.hibernate.embaded;

import javax.persistence.Embeddable;

@Embeddable
public class MobileNumber {
    private String type;
    private String mobileNo;

    public MobileNumber() {
    }

    public MobileNumber(String type, String mobileNo) {
        this.setType(type);
        this.setMobileNo(mobileNo);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
