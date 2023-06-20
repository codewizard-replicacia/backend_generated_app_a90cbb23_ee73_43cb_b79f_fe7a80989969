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

@Entity(name = "ScoutingLocations")
@Table(name = "\"ScoutingLocations\"", schema =  "\"generated_app\"")
@Data
                        
public class ScoutingLocations {
	public ScoutingLocations () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ScoutLocID\"", nullable = true )
  private Integer scoutLocID;
	  
  @Column(name = "\"ScriptAnalysisLocNotes\"", nullable = true )
  private String scriptAnalysisLocNotes;
  
	  
  @Column(name = "\"BrowseLocationDBslist\"", nullable = true )
  private String browseLocationDBslist;
  
	  
  @Column(name = "\"LocalAreaslist\"", nullable = true )
  private String localAreaslist;
  
	  
  @Column(name = "\"AbroadCountryList\"", nullable = true )
  private String abroadCountryList;
  
	  
  @Column(name = "\"LocationslistLocal\"", nullable = true )
  private String locationslistLocal;
  
	  
  @Column(name = "\"LocationListAbroad\"", nullable = true )
  private String locationListAbroad;
  
	  
  @Column(name = "\"FilmShootCompatable\"", nullable = true )
  private Boolean filmShootCompatable;
  
	  
  @Column(name = "\"LogisticsDetails\"", nullable = true )
  private String logisticsDetails;
  
	  
  @Column(name = "\"LocationPhotoswithNotes\"", nullable = true )
  private String locationPhotoswithNotes;
  
	  
  @Column(name = "\"FinalizedShootLocations\"", nullable = true )
  private String finalizedShootLocations;
  
	  
  @Column(name = "\"Permits\"", nullable = true )
  private String permits;
  
	  
  @Column(name = "\"AgreementsWithPropOwner\"", nullable = true )
  private String agreementsWithPropOwner;
  
	  
  @Column(name = "\"FilmShootCompatablePermission\"", nullable = true )
  private String filmShootCompatablePermission;
  
	  
  @Column(name = "\"LocationCompatableNotes\"", nullable = true )
  private String locationCompatableNotes;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "ScoutingLocations [" 
  + "ScoutLocID= " + scoutLocID  + ", " 
  + "ScriptAnalysisLocNotes= " + scriptAnalysisLocNotes  + ", " 
  + "BrowseLocationDBslist= " + browseLocationDBslist  + ", " 
  + "LocalAreaslist= " + localAreaslist  + ", " 
  + "AbroadCountryList= " + abroadCountryList  + ", " 
  + "LocationslistLocal= " + locationslistLocal  + ", " 
  + "LocationListAbroad= " + locationListAbroad  + ", " 
  + "FilmShootCompatable= " + filmShootCompatable  + ", " 
  + "LogisticsDetails= " + logisticsDetails  + ", " 
  + "LocationPhotoswithNotes= " + locationPhotoswithNotes  + ", " 
  + "FinalizedShootLocations= " + finalizedShootLocations  + ", " 
  + "Permits= " + permits  + ", " 
  + "AgreementsWithPropOwner= " + agreementsWithPropOwner  + ", " 
  + "FilmShootCompatablePermission= " + filmShootCompatablePermission  + ", " 
  + "LocationCompatableNotes= " + locationCompatableNotes 
 + "]";
	}
	
}