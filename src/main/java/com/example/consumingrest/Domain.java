package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Domain {

    @JsonProperty("domain")
    private String domain;
    private Date create_date;
    private Date update_date;
    private String country;
    private Boolean isDead;

    public Domain(){}

    public String getDomain() {
        return domain;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public String getCountry() {
        return country;
    }

    public Boolean getDead() {
        return isDead;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDead(Boolean dead) {
        isDead = dead;
    }

    @Override
    public String toString() {
        return "domains:[{" +
            "domain='" + domain + '\'' +
            ", create_date=" + create_date +
            ", update_date=" + update_date +
            ", country='" + country + '\'' +
            ", isDead=" + isDead +
            "}]";
    }
}
