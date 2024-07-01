package com.omega.watch.modal;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "watches")
public class Watch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Core Details
    @Column(nullable = false)
    private String modelName;

    @Column(unique = true, nullable = false)
    private String referenceNumber;

    @Column(nullable = false)
    private String movementType;

    // Case Properties
    @Column(nullable = false)
    private String caseMaterial;

    @Column(nullable = false)
    private double caseDiameterMm;

    @Column(nullable = false)
    private double thicknessMm;

    @Column(name = "lug_to_lug_mm")
    private double lugToLugMm;

    @Column(name = "between_lugs_mm")
    private double betweenLugsMm;

    // Dial and Crystal
    @Column(nullable = false)
    private String dialColor;

    @Column(nullable = false)
    private String crystalMaterial;

    @Column
    private String crystalFeatures;

    // Movement and Performance
    @Column
    private String calibre;

    @Column(name = "power_reserve_hours")
    private int powerReserveHours;

    @Column(name = "water_resistance_bar")
    private int waterResistanceBar;

    // Additional Information
    @Column(name = "total_weight_grams")
    private double totalWeightGrams;

    @ElementCollection // Use @ElementCollection for storing a list of strings
    @CollectionTable(name = "watch_tags", joinColumns = @JoinColumn(name = "watch_id"))
    @Column(name = "tag")
    private List<String> tags = new ArrayList<>();

    @Column
    private Integer price;

    public Watch() {
    }

    public Watch(String modelName, String referenceNumber, String movementType, String caseMaterial,
            double caseDiameterMm, double thicknessMm, double lugToLugMm, double betweenLugsMm,
            String dialColor, String crystalMaterial, String crystalFeatures, String calibre,
            int powerReserveHours, int waterResistanceBar, double totalWeightGrams, List<String> tags, Integer price) {

        this.modelName = modelName;
        this.referenceNumber = referenceNumber;
        this.movementType = movementType;
        this.caseMaterial = caseMaterial;
        this.caseDiameterMm = caseDiameterMm;
        this.thicknessMm = thicknessMm;
        this.lugToLugMm = lugToLugMm;
        this.betweenLugsMm = betweenLugsMm;
        this.dialColor = dialColor;
        this.crystalMaterial = crystalMaterial;
        this.crystalFeatures = crystalFeatures;
        this.calibre = calibre;
        this.powerReserveHours = powerReserveHours;
        this.waterResistanceBar = waterResistanceBar;
        this.totalWeightGrams = totalWeightGrams;
        this.tags = tags;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public String getCaseMaterial() {
        return caseMaterial;
    }

    public void setCaseMaterial(String caseMaterial) {
        this.caseMaterial = caseMaterial;
    }

    public double getCaseDiameterMm() {
        return caseDiameterMm;
    }

    public void setCaseDiameterMm(double caseDiameterMm) {
        this.caseDiameterMm = caseDiameterMm;
    }

    public double getThicknessMm() {
        return thicknessMm;
    }

    public void setThicknessMm(double thicknessMm) {
        this.thicknessMm = thicknessMm;
    }

    public double getLugToLugMm() {
        return lugToLugMm;
    }

    public void setLugToLugMm(double lugToLugMm) {
        this.lugToLugMm = lugToLugMm;
    }

    public double getBetweenLugsMm() {
        return betweenLugsMm;
    }

    public void setBetweenLugsMm(double betweenLugsMm) {
        this.betweenLugsMm = betweenLugsMm;
    }

    public String getDialColor() {
        return dialColor;
    }

    public void setDialColor(String dialColor) {
        this.dialColor = dialColor;
    }

    public String getCrystalMaterial() {
        return crystalMaterial;
    }

    public void setCrystalMaterial(String crystalMaterial) {
        this.crystalMaterial = crystalMaterial;
    }

    public String getCrystalFeatures() {
        return crystalFeatures;
    }

    public void setCrystalFeatures(String crystalFeatures) {
        this.crystalFeatures = crystalFeatures;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public int getPowerReserveHours() {
        return powerReserveHours;
    }

    public void setPowerReserveHours(int powerReserveHours) {
        this.powerReserveHours = powerReserveHours;
    }

    public int getWaterResistanceBar() {
        return waterResistanceBar;
    }

    public void setWaterResistanceBar(int waterResistanceBar) {
        this.waterResistanceBar = waterResistanceBar;
    }

    public double getTotalWeightGrams() {
        return totalWeightGrams;
    }

    public void setTotalWeightGrams(double totalWeightGrams) {
        this.totalWeightGrams = totalWeightGrams;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
