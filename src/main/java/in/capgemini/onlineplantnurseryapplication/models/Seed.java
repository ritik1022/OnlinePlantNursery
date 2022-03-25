package in.capgemini.onlineplantnurseryonline.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seed {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int seedId;
	private String commonName;
	private String bloomTime;
	private String watering;
	private String difficultyLevel;
	private String temperature;
	private String typesOfSeeds;
	private String seedsDescription;
	private int seedsStock;
	private double seedsCost;
	private int seedsPerPacket;
	
	public Seed() {
		super();
	}
	public int getSeedId() {
		return seedId;
	}
	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public String getBloomTime() {
		return bloomTime;
	}
	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}
	public String getWatering() {
		return watering;
	}
	public void setWatering(String watering) {
		this.watering = watering;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getTypesOfSeeds() {
		return typesOfSeeds;
	}
	public void setTypesOfSeeds(String typesOfSeeds) {
		this.typesOfSeeds = typesOfSeeds;
	}
	public String getSeedsDescription() {
		return seedsDescription;
	}
	public void setSeedsDescription(String seedsDescription) {
		this.seedsDescription = seedsDescription;
	}
	public int getSeedsStock() {
		return seedsStock;
	}
	public void setSeedsStock(int seedsStock) {
		this.seedsStock = seedsStock;
	}
	public double getSeedsCost() {
		return seedsCost;
	}
	public void setSeedsCost(double seedsCost) {
		this.seedsCost = seedsCost;
	}
	public int getSeedsPerPacket() {
		return seedsPerPacket;
	}
	public void setSeedsPerPacket(int seedsPerPacket) {
		this.seedsPerPacket = seedsPerPacket;
	}
	
}
