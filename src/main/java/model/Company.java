package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company extends model.Adressbook {

    @Id
    private Long companyId;
    private String companyName;
    private String adress1;
    private String adress2;
    private int personalNum;
    private String sector;

    public Company(String phoneNum, String name, String email, String webPage, Long companyId, String companyName, String adress1,String adress2 ,int personalNum, String sector) {
        super(phoneNum, name, email, webPage);
        this.companyId = companyId;
        this.companyName = companyName;
        this.adress1 = adress1;
        this.adress2 = adress2;
        this.personalNum = personalNum;
        this.sector = sector;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdress1() {
        return adress1;
    }

    public void setAdress1(String adress1) {
        this.adress1 = adress1;
    }

    public String getAdress2() {  return adress1; }

    public void setAdress2(String adress1) { this.adress2 = adress2; }

    public int getPersonalNum() {
        return personalNum;
    }

    public void setPersonalNum(int personalNum) {
        this.personalNum = personalNum;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
