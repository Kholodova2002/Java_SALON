package com.example.mysalon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "visit_histories")
public class VisitHistory {
    // Геттеры и сеттеры
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime visitDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public void setId(Long id) {
        this.id = id;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
