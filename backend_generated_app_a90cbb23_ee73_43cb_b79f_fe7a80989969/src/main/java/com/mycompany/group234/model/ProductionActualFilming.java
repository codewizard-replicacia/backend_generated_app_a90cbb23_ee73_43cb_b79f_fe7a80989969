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

@Entity(name = "ProductionActualFilming")
@Table(name = "\"ProductionActualFilming\"", schema =  "\"generated_app\"")
@Data
                        
public class ProductionActualFilming {
	public ProductionActualFilming () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"FilmID\"", nullable = true )
  private Integer filmID;
	  
  @Column(name = "\"SceneID\"", nullable = true )
  private String sceneID;
  
	  
  @Column(name = "\"SceneSet\"", nullable = true )
  private String sceneSet;
  
	  
  @Column(name = "\"SceneLoc\"", nullable = true )
  private String sceneLoc;
  
	  
  @Column(name = "\"SceneCasting\"", nullable = true )
  private String sceneCasting;
  
	  
  @Column(name = "\"SceneScheduleDtTime\"")
  @Temporal(value = TemporalType.DATE)
  private Date sceneScheduleDtTime;  
  
	  
  @Column(name = "\"CostumeDesigner\"", nullable = true )
  private Boolean costumeDesigner;
  
	  
  @Column(name = "\"HairStylistForLeads\"", nullable = true )
  private String hairStylistForLeads;
  
	  
  @Column(name = "\"MakeupArtistforLeadroles\"", nullable = true )
  private String makeupArtistforLeadroles;
  
	  
  @Column(name = "\"MakeupArtistforActors\"", nullable = true )
  private String makeupArtistforActors;
  
	  
  @Column(name = "\"HairstylistForActors\"", nullable = true )
  private String hairstylistForActors;
  
	  
  @Column(name = "\"Lightboy\"", nullable = true )
  private String lightboy;
  
	  
  @Column(name = "\"ScreenScriptPg\"", nullable = true )
  private String screenScriptPg;
  
	  
  @Column(name = "\"RetakesCount\"", nullable = true )
  private String retakesCount;
  
	  
  @Column(name = "\"Dailoguehelper\"", nullable = true )
  private String dailoguehelper;
  
	  
  @Column(name = "\"FinalizedRetake\"", nullable = true )
  private String finalizedRetake;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "ProductionActualFilming [" 
  + "FilmID= " + filmID  + ", " 
  + "SceneID= " + sceneID  + ", " 
  + "SceneSet= " + sceneSet  + ", " 
  + "SceneLoc= " + sceneLoc  + ", " 
  + "SceneCasting= " + sceneCasting  + ", " 
  + "SceneScheduleDtTime= " + sceneScheduleDtTime  + ", " 
  + "CostumeDesigner= " + costumeDesigner  + ", " 
  + "HairStylistForLeads= " + hairStylistForLeads  + ", " 
  + "MakeupArtistforLeadroles= " + makeupArtistforLeadroles  + ", " 
  + "MakeupArtistforActors= " + makeupArtistforActors  + ", " 
  + "HairstylistForActors= " + hairstylistForActors  + ", " 
  + "Lightboy= " + lightboy  + ", " 
  + "ScreenScriptPg= " + screenScriptPg  + ", " 
  + "RetakesCount= " + retakesCount  + ", " 
  + "Dailoguehelper= " + dailoguehelper  + ", " 
  + "FinalizedRetake= " + finalizedRetake 
 + "]";
	}
	
}