package model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Adressbook {

    private String phoneNum;
    private String name;
    private String email;
    private String webPage;

    public Adressbook(String phoneNum, String name, String email, String webPage) {
        this.phoneNum = phoneNum;
        this.name = name;
        this.email = email;
        this.webPage = webPage;
    }


    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }
}
