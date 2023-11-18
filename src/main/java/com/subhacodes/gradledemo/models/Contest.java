package com.subhacodes.gradledemo.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Contest {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String ContestName;
    private String contestDescription;

    public Contest(){

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContestName() {
        return this.ContestName;
    }

    public void setContestName(String ContestName) {
        this.ContestName = ContestName;
    }

    public String getContestDescription() {
        return this.contestDescription;
    }

    public void setContestDescription(String contestDescription) {
        this.contestDescription = contestDescription;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", ContestName='" + getContestName() + "'" +
            ", contestDescription='" + getContestDescription() + "'" +
            "}";
    }

    
}
