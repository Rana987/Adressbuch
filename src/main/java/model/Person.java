package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person extends model.Adressbook {

    @Id
    private Long personId;
    private String title;
    private String adress1;
    private String adress2;
    private String cv;
    private String photo;

    public Person(String phoneNum, String name, String email, String webPage, Long personId, String title, String adress1,String adress2, String cv, String photo) {
        super(phoneNum, name, email, webPage);
        this.personId = personId;
        this.title = title;
        this.adress1 = adress1;
        this.adress2 = adress2;
        this.cv = cv;
        this.photo = photo;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdress1() {
        return adress1;
    }

    public void setAdress1(String adress1) {
        this.adress1 = adress1;
    }

    public String getAdress2() {  return adress1; }

    public void setAdress2(String adress1) { this.adress2 = adress2; }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
