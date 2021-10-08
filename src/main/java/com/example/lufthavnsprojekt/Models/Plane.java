package com.example.lufthavnsprojekt.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "planes")
public class Plane {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(updatable = false)
        private Long id;

        @Column(nullable = false)
        private boolean hasPassengeres = true;

        @Column(nullable = false)
        private boolean isClean = false;

        @Column(nullable = false)
        private boolean hasGas = false;

        @Column(nullable = false)
        private String model;

        @JsonBackReference
        @OneToMany
        @JoinColumn(name = "iata_code")
        Set<Flight> flights;

        @Column(nullable = true)
        private String Icao;

        @Column(nullable = false)
        private char size;

        @JsonBackReference
        @OneToMany(mappedBy = "plane")
        Set<Task> tasks;

        @JsonBackReference
        @ManyToOne
        Gate gate;

        public Plane(boolean hasPassengeres, boolean isClean, boolean hasGas, String model, Set<Flight> flights, String icao, char size, Set<Task> tasks, Gate gate) {
                this.hasPassengeres = hasPassengeres;
                this.isClean = isClean;
                this.hasGas = hasGas;
                this.model = model;
                this.flights = flights;
                Icao = icao;
                this.size = size;
                this.tasks = tasks;
                this.gate = gate;
        }

        public Plane() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public boolean isHasPassengeres() {
                return hasPassengeres;
        }

        public void setHasPassengeres(boolean passengers) {
                this.hasPassengeres = passengers;
        }

        public boolean isIsClean() {
                return isClean;
        }

        public void setIsClean(boolean clean) {
                this.isClean = clean;
        }

        public boolean isHasGas() {
                return hasGas;
        }

        public void setHasGas(boolean gas) {
                this.hasGas = gas;
        }

        public char getSize() {
                return size;
        }

        public void setSize(char size) {
                this.size = size;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public Set<Flight> getFlights() {
                return flights;
        }

        public void setFlights(Set<Flight> flights) {
                this.flights = flights;
        }

        public String getIcao() {
                return Icao;
        }

        public void setIcao(String icao) {
                Icao = icao;
        }

        public boolean isClean() {
                return isClean;
        }

        public void setClean(boolean clean) {
                isClean = clean;
        }

        public Set<Task> getTasks() {
                return tasks;
        }

        public void setTasks(Set<Task> tasks) {
                this.tasks = tasks;
        }

        public Gate getGate() {
                return gate;
        }

        public void setGate(Gate gate) {
                this.gate = gate;
        }
}