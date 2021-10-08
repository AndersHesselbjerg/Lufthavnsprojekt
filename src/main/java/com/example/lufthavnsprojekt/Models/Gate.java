package com.example.lufthavnsprojekt.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Gate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int gateNo;
    @Column(nullable = false)
    private char gateSize;

    @JsonManagedReference
    @OneToMany(mappedBy = "gate")
    Set<Plane> planes;

    public Gate() {
    }

    public Gate(int gateNo, char gateSize, Set<Plane> planes) {
        this.gateNo = gateNo;
        this.gateSize = gateSize;
        this.planes = planes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGateNo() {
        return gateNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
    }

    public char getGateSize() {
        return gateSize;
    }

    public void setGateSize(char gateSize) {
        this.gateSize = gateSize;
    }

    public Set<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(Set<Plane> planes) {
        this.planes = planes;
    }
}