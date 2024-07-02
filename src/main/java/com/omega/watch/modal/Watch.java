package com.omega.watch.modal;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "watches")
public class Watch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model_name", nullable = false)
    private String modelName;

    @Column(name = "reference_number", nullable = false, unique = true)
    private String referenceNumber;

    @Column(name = "movement_type", nullable = false)
    private String movementType;

    @Column(name = "case_material", nullable = false)
    private String caseMaterial;

    @Column(name = "case_diameter_mm", nullable = false)
    private Double caseDiameterMm;

    @Column(name = "thickness_mm", nullable = false)
    private Double thicknessMm;

    @Column(name = "lug_to_lug_mm", nullable = false)
    private Double lugToLugMm;

    @Column(name = "between_lugs_mm", nullable = false)
    private Double betweenLugsMm;

    @Column(name = "dial_color", nullable = false)
    private String dialColor;

    @Column(name = "crystal_material", nullable = false)
    private String crystalMaterial;

    @Column(name = "crystal_features")
    private String crystalFeatures;

    private String calibre;

    @Column(name = "power_reserve_hours")
    private Integer powerReserveHours;

    @Column(name = "water_resistance_bar")
    private Integer waterResistanceBar;

    @Column(name = "total_weight_grams")
    private Double totalWeightGrams;

    @Column(nullable = false)
    private BigDecimal price;

    private String brand;
    private String collection;

    @Column(name = "is_limited_edition")
    private boolean isLimitedEdition;

    @Column(name = "warranty_months")
    private Integer warrantyMonths;

    @ElementCollection
    @CollectionTable(name = "watch_tags", joinColumns = @JoinColumn(name = "watch_id"))
    @Column(name = "tag")
    private Set<String> tags;

    @OneToMany(mappedBy = "watch", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<WatchImage> images;

    public Watch() {

    }

    public Watch(String modelName, String referenceNumber, String movementType, String caseMaterial,
            Double caseDiameterMm, Double thicknessMm, Double lugToLugMm, Double betweenLugsMm,
            String dialColor, String crystalMaterial, String crystalFeatures, String calibre,
            Integer powerReserveHours, Integer waterResistanceBar, Double totalWeightGrams,
            BigDecimal price, String brand, String collection, boolean isLimitedEdition,
            Integer warrantyMonths, Set<String> tags) {
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
        this.price = price;
        this.brand = brand;
        this.collection = collection;
        this.isLimitedEdition = isLimitedEdition;
        this.warrantyMonths = warrantyMonths;
        this.tags = tags;
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

	public Double getCaseDiameterMm() {
		return caseDiameterMm;
	}

	public void setCaseDiameterMm(Double caseDiameterMm) {
		this.caseDiameterMm = caseDiameterMm;
	}

	public Double getThicknessMm() {
		return thicknessMm;
	}

	public void setThicknessMm(Double thicknessMm) {
		this.thicknessMm = thicknessMm;
	}

	public Double getLugToLugMm() {
		return lugToLugMm;
	}

	public void setLugToLugMm(Double lugToLugMm) {
		this.lugToLugMm = lugToLugMm;
	}

	public Double getBetweenLugsMm() {
		return betweenLugsMm;
	}

	public void setBetweenLugsMm(Double betweenLugsMm) {
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

	public Integer getPowerReserveHours() {
		return powerReserveHours;
	}

	public void setPowerReserveHours(Integer powerReserveHours) {
		this.powerReserveHours = powerReserveHours;
	}

	public Integer getWaterResistanceBar() {
		return waterResistanceBar;
	}

	public void setWaterResistanceBar(Integer waterResistanceBar) {
		this.waterResistanceBar = waterResistanceBar;
	}

	public Double getTotalWeightGrams() {
		return totalWeightGrams;
	}

	public void setTotalWeightGrams(Double totalWeightGrams) {
		this.totalWeightGrams = totalWeightGrams;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public boolean isLimitedEdition() {
		return isLimitedEdition;
	}

	public void setLimitedEdition(boolean isLimitedEdition) {
		this.isLimitedEdition = isLimitedEdition;
	}

	public Integer getWarrantyMonths() {
		return warrantyMonths;
	}

	public void setWarrantyMonths(Integer warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

	public Set<WatchImage> getImages() {
		return images;
	}

	public void setImages(Set<WatchImage> images) {
		this.images = images;
	}
}
