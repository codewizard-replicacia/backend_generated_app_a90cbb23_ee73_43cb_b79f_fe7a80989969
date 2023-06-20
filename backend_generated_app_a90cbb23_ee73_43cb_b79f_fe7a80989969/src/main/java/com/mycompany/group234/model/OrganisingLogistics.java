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

@Entity(name = "OrganisingLogistics")
@Table(name = "\"OrganisingLogistics\"", schema =  "\"generated_app\"")
@Data
                        
public class OrganisingLogistics {
	public OrganisingLogistics () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"LogisticsID\"", nullable = true )
  private Integer logisticsID;
	  
  @Column(name = "\"FinalizedShootLocations\"", nullable = true )
  private String finalizedShootLocations;
  
	  
  @Column(name = "\"ScoutlocationPermits\"", nullable = true )
  private String scoutlocationPermits;
  
	  
  @Column(name = "\"ScoutLocationLicense\"", nullable = true )
  private String scoutLocationLicense;
  
	  
  @Column(name = "\"ShootPermissionForEachLocation\"", nullable = true )
  private Boolean shootPermissionForEachLocation;
  
	  
  @Column(name = "\"AccomodationAbroadHotel\"", nullable = true )
  private String accomodationAbroadHotel;
  
	  
  @Column(name = "\"Budgetforaccomodation\"", nullable = true )
  private String budgetforaccomodation;
  
	  
  @Column(name = "\"Airlines\"", nullable = true )
  private String airlines;
  
	  
  @Column(name = "\"Flight\"", nullable = true )
  private String flight;
  
	  
  @Column(name = "\"Tickets\"", nullable = true )
  private String tickets;
  
	  
  @Column(name = "\"Abroadgroundtransportationvendor\"", nullable = true )
  private String abroadgroundtransportationvendor;
  
	  
  @Column(name = "\"Vehicletype\"", nullable = true )
  private String vehicletype;
  
	  
  @Column(name = "\"NoOfVehicles\"", nullable = true )
  private Integer noOfVehicles;
  
	  
  @Column(name = "\"BudgetforTransportation\"", nullable = true )
  private String budgetforTransportation;
  
	  
  @Column(name = "\"Cateringtoteam\"", nullable = true )
  private String cateringtoteam;
  
	  
  @Column(name = "\"FoodBudget\"", nullable = true )
  private String foodBudget;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "OrganisingLogistics [" 
  + "LogisticsID= " + logisticsID  + ", " 
  + "FinalizedShootLocations= " + finalizedShootLocations  + ", " 
  + "ScoutlocationPermits= " + scoutlocationPermits  + ", " 
  + "ScoutLocationLicense= " + scoutLocationLicense  + ", " 
  + "ShootPermissionForEachLocation= " + shootPermissionForEachLocation  + ", " 
  + "AccomodationAbroadHotel= " + accomodationAbroadHotel  + ", " 
  + "Budgetforaccomodation= " + budgetforaccomodation  + ", " 
  + "Airlines= " + airlines  + ", " 
  + "Flight= " + flight  + ", " 
  + "Tickets= " + tickets  + ", " 
  + "Abroadgroundtransportationvendor= " + abroadgroundtransportationvendor  + ", " 
  + "Vehicletype= " + vehicletype  + ", " 
  + "NoOfVehicles= " + noOfVehicles  + ", " 
  + "BudgetforTransportation= " + budgetforTransportation  + ", " 
  + "Cateringtoteam= " + cateringtoteam  + ", " 
  + "FoodBudget= " + foodBudget 
 + "]";
	}
	
}