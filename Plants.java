package in.capgemini.onlineplantnureseryapplication.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Plants {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int plantId;
	@Min(1)
	private int plantHeight;
	@NotBlank(message= "plantSpreed is required")	
	private String plantSpreed;
	@NotBlank(message= "commonName is required")
	@Size(min=2 , max=6 , message="please enter sizeable data")
	private String commonName;
	@NotBlank(message= "bloomTime is required")
	private String bloomTime;
	@NotBlank(message= "medicinalOrCulinaryUse is required")
	private String medicinalOrCulinaryUse;
	@NotBlank(message= "difficultyLevel is required")
	private String difficultyLevel;
	@NotBlank(message= "temparature is required")
	private String temparature;
	@NotBlank(message= "typeOfPlant is required")
	private String typeOfPlant;
	@NotBlank(message= "plantDescription is required")
	private String plantDescription;
	@Min(1)
	private int plantsStock;
	@Min(1)
	private double plantCost;	
	
	
	public Plants() {
		super();
	}
	
	
	public int getPlantId() {
		return plantId;
	}
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}
	public int getPlantHeight() {
		return plantHeight;
	}
	public void setPlantHeight(int plantHeight) {
		this.plantHeight = plantHeight;
	}
	public String getPlantSpreed() {
		return plantSpreed;
	}
	public void setPlantSpreed(String plantSpreed) {
		this.plantSpreed = plantSpreed;
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
	public String getMedicinalOrCulinaryUse() {
		return medicinalOrCulinaryUse;
	}
	public void setMedicinalOrCulinaryUse(String medicinalOrCulinaryUse) {
		this.medicinalOrCulinaryUse = medicinalOrCulinaryUse;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public String getTemparature() {
		return temparature;
	}
	public void setTemparature(String temparature) {
		this.temparature = temparature;
	}
	public String getTypeOfPlant() {
		return typeOfPlant;
	}
	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}
	public String getPlantDescription() {
		return plantDescription;
	}
	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}
	public int getPlantsStock() {
		return plantsStock;
	}
	public void setPlantsStock(int plantsStock) {
		this.plantsStock = plantsStock;
	}
	public double getPlantCost() {
		return plantCost;
	}
	public void setPlantCost(double plantCost) {
		this.plantCost = plantCost;
	}
	
}
