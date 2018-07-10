package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PartnerContact extends model.Adressbook {

    @Id
    private Long partnerContactId;

    public PartnerContact(String phoneNum, String name, String email, String webPage, Long partnerContactId) {
        super(phoneNum, name, email, webPage);
        this.partnerContactId = partnerContactId;
    }

    public Long getPartnerContactId() {
        return partnerContactId;
    }

    public void setPartnerContactId(Long partnerContactId) {
        this.partnerContactId = partnerContactId;
    }

}
