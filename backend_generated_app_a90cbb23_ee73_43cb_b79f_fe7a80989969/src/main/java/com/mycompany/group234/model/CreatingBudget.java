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

@Entity(name = "CreatingBudget")
@Table(name = "\"CreatingBudget\"", schema =  "\"generated_app\"")
@Data
                        
public class CreatingBudget {
	public CreatingBudget () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"BudgetID\"", nullable = true )
  private Integer budgetID;
	  
  @Column(name = "\"Cast\"", nullable = true )
  private String cast;
  
	  
  @Column(name = "\"Crew\"", nullable = true )
  private String crew;
  
	  
  @Column(name = "\"Equipment\"", nullable = true )
  private String equipment;
  
	  
  @Column(name = "\"Location\"", nullable = true )
  private String location;
  
	  
  @Column(name = "\"PreProduction\"", nullable = true )
  private String preProduction;
  
	  
  @Column(name = "\"Properties\"", nullable = true )
  private String properties;
  
	  
  @Column(name = "\"Costumes\"", nullable = true )
  private String costumes;
  
	  
  @Column(name = "\"Stunts\"", nullable = true )
  private String stunts;
  
	  
  @Column(name = "\"Makeup\"", nullable = true )
  private String makeup;
  
	  
  @Column(name = "\"VFX\"", nullable = true )
  private String vFX;
  
	  
  @Column(name = "\"Permits\"", nullable = true )
  private String permits;
  
	  
  @Column(name = "\"Rentalagreements\"", nullable = true )
  private String rentalagreements;
  
	  
  @Column(name = "\"Insurance\"", nullable = true )
  private String insurance;
  
	  
  @Column(name = "\"ArtDesign\"", nullable = true )
  private String artDesign;
  
	  
  @Column(name = "\"TotalExpectedBudget\"", nullable = true )
  private String totalExpectedBudget;
  
	  
  @Column(name = "\"Logistics\"", nullable = true )
  private String logistics;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "CreatingBudget [" 
  + "BudgetID= " + budgetID  + ", " 
  + "Cast= " + cast  + ", " 
  + "Crew= " + crew  + ", " 
  + "Equipment= " + equipment  + ", " 
  + "Location= " + location  + ", " 
  + "PreProduction= " + preProduction  + ", " 
  + "Properties= " + properties  + ", " 
  + "Costumes= " + costumes  + ", " 
  + "Stunts= " + stunts  + ", " 
  + "Makeup= " + makeup  + ", " 
  + "VFX= " + vFX  + ", " 
  + "Permits= " + permits  + ", " 
  + "Rentalagreements= " + rentalagreements  + ", " 
  + "Insurance= " + insurance  + ", " 
  + "ArtDesign= " + artDesign  + ", " 
  + "TotalExpectedBudget= " + totalExpectedBudget  + ", " 
  + "Logistics= " + logistics 
 + "]";
	}
	
}