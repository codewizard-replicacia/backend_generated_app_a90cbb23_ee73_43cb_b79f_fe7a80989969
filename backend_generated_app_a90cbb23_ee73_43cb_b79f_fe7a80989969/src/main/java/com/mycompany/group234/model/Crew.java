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

@Entity(name = "Crew")
@Table(name = "\"Crew\"", schema =  "\"generated_app\"")
@Data
                        
public class Crew {
	public Crew () {   
  }
	  
  @Column(name = "\"DirectorOfCinematography\"", nullable = true )
  private String directorOfCinematography;
  
	  
  @Column(name = "\"CameraOperator1\"", nullable = true )
  private String cameraOperator1;
  
	  
  @Column(name = "\"CameraOperator2\"", nullable = true )
  private String cameraOperator2;
  
	  
  @Column(name = "\"Cameraboy1\"", nullable = true )
  private String cameraboy1;
  
	  
  @Column(name = "\"Cameraboy2\"", nullable = true )
  private String cameraboy2;
  
	  
  @Column(name = "\"Lightboy1\"", nullable = true )
  private String lightboy1;
  
	  
  @Column(name = "\"Lightboy2\"", nullable = true )
  private String lightboy2;
  
	  
  @Column(name = "\"Frameboy1\"", nullable = true )
  private String frameboy1;
  
	  
  @Column(name = "\"Frameboy2\"", nullable = true )
  private String frameboy2;
  
	  
  @Column(name = "\"ArtDirector\"", nullable = true )
  private String artDirector;
  
	  
  @Column(name = "\"SetDecorator1\"", nullable = true )
  private String setDecorator1;
  
	  
  @Column(name = "\"SetDecorator2\"", nullable = true )
  private String setDecorator2;
  
	  
  @Column(name = "\"SetDecorator3\"", nullable = true )
  private String setDecorator3;
  
	  
  @Column(name = "\"PropertyMaster1\"", nullable = true )
  private String propertyMaster1;
  
	  
  @Column(name = "\"PropertyMaster2\"", nullable = true )
  private String propertyMaster2;
  
	  
  @Column(name = "\"PropertyMaser3\"", nullable = true )
  private String propertyMaser3;
  
	  
  @Column(name = "\"CostumeDesigner1\"", nullable = true )
  private String costumeDesigner1;
  
	  
  @Column(name = "\"CostumeDesigner2\"", nullable = true )
  private String costumeDesigner2;
  
	  
  @Column(name = "\"CostumeDesigner3\"", nullable = true )
  private String costumeDesigner3;
  
	  
  @Column(name = "\"WadrobeAssistant1\"", nullable = true )
  private String wadrobeAssistant1;
  
	  
  @Column(name = "\"WadrobeAssitant2\"", nullable = true )
  private String wadrobeAssitant2;
  
	  
  @Column(name = "\"MakeupArtistforLeadroles\"", nullable = true )
  private String makeupArtistforLeadroles;
  
	  
  @Column(name = "\"MakeupArtistforActors\"", nullable = true )
  private String makeupArtistforActors;
  
	  
  @Column(name = "\"HairStylistsLeadRoles\"", nullable = true )
  private String hairStylistsLeadRoles;
  
	  
  @Column(name = "\"HairStylistsActors\"", nullable = true )
  private String hairStylistsActors;
  
	  
  @Column(name = "\"SoundMixer\"", nullable = true )
  private String soundMixer;
  
	  
  @Column(name = "\"BoomOperator\"", nullable = true )
  private String boomOperator;
  
	  
  @Column(name = "\"SoundRecordist1\"", nullable = true )
  private String soundRecordist1;
  
	  
  @Column(name = "\"SoundRecordist2\"", nullable = true )
  private String soundRecordist2;
  
	  
  @Column(name = "\"GripPerson1\"", nullable = true )
  private String gripPerson1;
  
	  
  @Column(name = "\"GripPerson2\"", nullable = true )
  private String gripPerson2;
  
	  
  @Column(name = "\"Electrician1\"", nullable = true )
  private String electrician1;
  
	  
  @Column(name = "\"Editor1\"", nullable = true )
  private String editor1;
  
	  
  @Column(name = "\"Editor2\"", nullable = true )
  private String editor2;
  
	  
  @Column(name = "\"VFXBrand\"", nullable = true )
  private String vFXBrand;
  
	  
  @Column(name = "\"VFXSupervisor\"", nullable = true )
  private String vFXSupervisor;
  
	  
  @Column(name = "\"VFXTechnician1\"", nullable = true )
  private String vFXTechnician1;
  
	  
  @Column(name = "\"VFXTechnician2\"", nullable = true )
  private String vFXTechnician2;
  
	  
  @Column(name = "\"VFXArtist1\"", nullable = true )
  private String vFXArtist1;
  
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"CrewID\"", nullable = true )
  private Integer crewID;
	  
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
	return "Crew [" 
  + "DirectorOfCinematography= " + directorOfCinematography  + ", " 
  + "CameraOperator1= " + cameraOperator1  + ", " 
  + "CameraOperator2= " + cameraOperator2  + ", " 
  + "Cameraboy1= " + cameraboy1  + ", " 
  + "Cameraboy2= " + cameraboy2  + ", " 
  + "Lightboy1= " + lightboy1  + ", " 
  + "Lightboy2= " + lightboy2  + ", " 
  + "Frameboy1= " + frameboy1  + ", " 
  + "Frameboy2= " + frameboy2  + ", " 
  + "ArtDirector= " + artDirector  + ", " 
  + "SetDecorator1= " + setDecorator1  + ", " 
  + "SetDecorator2= " + setDecorator2  + ", " 
  + "SetDecorator3= " + setDecorator3  + ", " 
  + "PropertyMaster1= " + propertyMaster1  + ", " 
  + "PropertyMaster2= " + propertyMaster2  + ", " 
  + "PropertyMaser3= " + propertyMaser3  + ", " 
  + "CostumeDesigner1= " + costumeDesigner1  + ", " 
  + "CostumeDesigner2= " + costumeDesigner2  + ", " 
  + "CostumeDesigner3= " + costumeDesigner3  + ", " 
  + "WadrobeAssistant1= " + wadrobeAssistant1  + ", " 
  + "WadrobeAssitant2= " + wadrobeAssitant2  + ", " 
  + "MakeupArtistforLeadroles= " + makeupArtistforLeadroles  + ", " 
  + "MakeupArtistforActors= " + makeupArtistforActors  + ", " 
  + "HairStylistsLeadRoles= " + hairStylistsLeadRoles  + ", " 
  + "HairStylistsActors= " + hairStylistsActors  + ", " 
  + "SoundMixer= " + soundMixer  + ", " 
  + "BoomOperator= " + boomOperator  + ", " 
  + "SoundRecordist1= " + soundRecordist1  + ", " 
  + "SoundRecordist2= " + soundRecordist2  + ", " 
  + "GripPerson1= " + gripPerson1  + ", " 
  + "GripPerson2= " + gripPerson2  + ", " 
  + "Electrician1= " + electrician1  + ", " 
  + "Editor1= " + editor1  + ", " 
  + "Editor2= " + editor2  + ", " 
  + "VFXBrand= " + vFXBrand  + ", " 
  + "VFXSupervisor= " + vFXSupervisor  + ", " 
  + "VFXTechnician1= " + vFXTechnician1  + ", " 
  + "VFXTechnician2= " + vFXTechnician2  + ", " 
  + "VFXArtist1= " + vFXArtist1  + ", " 
  + "CrewID= " + crewID  + ", " 
  + "MobileNumber= " + mobileNumber  + ", " 
  + "Address= " + address  + ", " 
  + "Compensation= " + compensation  + ", " 
  + "Agreement= " + agreement  + ", " 
  + "Dates= " + dates 
 + "]";
	}
	
}