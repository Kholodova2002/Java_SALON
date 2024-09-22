package com.example.mysalon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<VisitHistory> visitHistories;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ScheduledVisit> scheduledVisits;

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<VisitHistory> getVisitHistories() {
        return visitHistories;
    }

    public void setVisitHistories(List<VisitHistory> visitHistories) {
        this.visitHistories = visitHistories;
    }

    public List<ScheduledVisit> getScheduledVisits() {
        return scheduledVisits;
    }

    public void setScheduledVisits(List<ScheduledVisit> scheduledVisits) {
        this.scheduledVisits = scheduledVisits;
    }
}
