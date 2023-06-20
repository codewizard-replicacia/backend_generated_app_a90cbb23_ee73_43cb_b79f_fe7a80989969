package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.Casting;
import com.mycompany.group234.model.ProductionActualFilming;
import com.mycompany.group234.model.ScoutingLocations;
import com.mycompany.group234.model.CreatingBudget;
import com.mycompany.group234.model.PreProduction;
import com.mycompany.group234.model.ProducerRaiseFunds;
import com.mycompany.group234.model.OrganisingLogistics;
import com.mycompany.group234.model.Crew;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Casting")
@Table(name = "\"Casting\"", schema =  "\"generated_app\"")
@Data
                        
public class Casting {
	public Casting () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"CastingID\"", nullable = true )
  private Integer castingID;
	  
  @Column(name = "\"LeadMale\"", nullable = true )
  private String leadMale;
  
	  
  @Column(name = "\"LeadFemale\"", nullable = true )
  private String leadFemale;
  
	  
  @Column(name = "\"LeadMaleDad\"", nullable = true )
  private String leadMaleDad;
  
	  
  @Column(name = "\"LeadMaleMom\"", nullable = true )
  private String leadMaleMom;
  
	  
  @Column(name = "\"LeadFemaleDad\"", nullable = true )
  private String leadFemaleDad;
  
	  
  @Column(name = "\"LeadFemailMom\"", nullable = true )
  private String leadFemailMom;
  
	  
  @Column(name = "\"SupportCharacter1\"", nullable = true )
  private String supportCharacter1;
  
	  
  @Column(name = "\"SupportCharacter2\"", nullable = true )
  private String supportCharacter2;
  
	  
  @Column(name = "\"Comedian1\"", nullable = true )
  private String comedian1;
  
	  
  @Column(name = "\"Comedian2\"", nullable = true )
  private String comedian2;
  
	  
  @Column(name = "\"Villian\"", nullable = true )
  private String villian;
  
	  
  @Column(name = "\"SpecialApperance\"", nullable = true )
  private String specialApperance;
  
	  
  @Column(name = "\"MobileNumber\"", nullable = true )
  private Long mobileNumber;
  
	  
  @Column(name = "\"Address\"", nullable = true )
  private String address;
  
	  
  @Column(name = "\"Compensation\"", nullable = true )
  private Long compensation;
  
	  
  @Column(name = "\"Agreement\"", nullable = true )
  private String agreement;
  
	  
  @Column(name = "\"Dates\"")
  @Temporal(value = TemporalType.DATE)
  private Date dates;  
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Casting [" 
  + "CastingID= " + castingID  + ", " 
  + "LeadMale= " + leadMale  + ", " 
  + "LeadFemale= " + leadFemale  + ", " 
  + "LeadMaleDad= " + leadMaleDad  + ", " 
  + "LeadMaleMom= " + leadMaleMom  + ", " 
  + "LeadFemaleDad= " + leadFemaleDad  + ", " 
  + "LeadFemailMom= " + leadFemailMom  + ", " 
  + "SupportCharacter1= " + supportCharacter1  + ", " 
  + "SupportCharacter2= " + supportCharacter2  + ", " 
  + "Comedian1= " + comedian1  + ", " 
  + "Comedian2= " + comedian2  + ", " 
  + "Villian= " + villian  + ", " 
  + "SpecialApperance= " + specialApperance  + ", " 
  + "MobileNumber= " + mobileNumber  + ", " 
  + "Address= " + address  + ", " 
  + "Compensation= " + compensation  + ", " 
  + "Agreement= " + agreement  + ", " 
  + "Dates= " + dates 
 + "]";
	}
	
}