package com.mycompany.group234.integrationtest;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.group234.SpringApp;
import org.apache.olingo.commons.api.http.HttpStatusCode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.context.WebApplicationContext;

import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.element.Node;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SpringApp.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = { "spring.config.location=classpath:application-test.yml" })
class ControllerTest {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  private final ObjectMapper mapper = new ObjectMapper();

  @Autowired
  private WebApplicationContext context;
  @LocalServerPort
  private int port;

  @BeforeEach
  void setup() {
    RestAssuredMockMvc.webAppContextSetup(context);
  }

  
  
   private JsonNode getJSONFromFile(String filePath) throws IOException {
    try(InputStream in=Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath)){
      JsonNode jsonNode = mapper.readValue(in, JsonNode.class);
      return jsonNode;
    }
    catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  
  private String getPayload(String filePath) throws IOException {
	  String jsonString = mapper.writeValueAsString( getJSONFromFile(filePath) );
	  return jsonString;
  }

  @Test
  void testRetrieveServiceDocument() {
    final String xml = given()
        .accept(ContentType.XML)
        .when()
        .get("/generated_app/")
        .then()
        .statusCode(HttpStatusCode.OK.getStatusCode())
        .contentType(ContentType.XML)
        .extract()
        .asString();

    final XmlPath path = new XmlPath(xml);
    final Collection<Node> n = ((Node) ((Node) path.get("service")).get("workspace")).get("collection");
    assertNotNull(n);
    assertFalse(n.isEmpty());
  }

  @Test
  void  testRetrieveMetadataDocument() {
    final String xml = given()
        .when()
        .get("/generated_app/$metadata")
        .then()
        .statusCode(HttpStatusCode.OK.getStatusCode())
        .contentType(ContentType.XML)
        .extract()
        .asString();

    final XmlPath path = new XmlPath(xml);
    final Node n = ((Node) ((Node) path.get("edmx:Ed mx")).get("DataServices")).get("Schema");
    assertNotNull(n);
    assertEquals("generated_app", n.getAttribute("Namespace"));
    assertNotNull(n.get("EntityContainer"));
  }

	

	
  @Test
  void  testCreateCreatingBudgetInstance() throws IOException {
    given()
        .contentType("application/json")
        .body(getPayload("CreatingBudgetInstance.json"))
        .when()
        .post("/generated_app/CreatingBudgets")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
    
  }
	
	
  
   
  
   @Test
  public void testSystemFilterOptionsCreatingBudget() throws IOException {
  
  given()
        .contentType("application/json")
        .body(getPayload("CreatingBudgetInstance.json"))
        .when()
        .post("/generated_app/CreatingBudgets")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
   given()
            .when()
            .get("/generated_app/CreatingBudgets?$top=1")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body("value.get(0).BudgetID", equalTo("<<replace_with_keyFieldValue>>"))
            .body("value.size()", is(1));
    given()
            .when()
            .get("/generated_app/CreatingBudgets/$count")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body(is("1"));
            
            
    
    } 
	
	

	
  @Test
  void  testCreateCastingInstance() throws IOException {
    given()
        .contentType("application/json")
        .body(getPayload("CastingInstance.json"))
        .when()
        .post("/generated_app/Castings")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
    
  }
	
	
  
   
  
   @Test
  public void testSystemFilterOptionsCasting() throws IOException {
  
  given()
        .contentType("application/json")
        .body(getPayload("CastingInstance.json"))
        .when()
        .post("/generated_app/Castings")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
   given()
            .when()
            .get("/generated_app/Castings?$top=1")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body("value.get(0).CastingID", equalTo("<<replace_with_keyFieldValue>>"))
            .body("value.size()", is(1));
    given()
            .when()
            .get("/generated_app/Castings/$count")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body(is("1"));
            
            
    
    } 
	
	

	
  @Test
  void  testCreateCrewInstance() throws IOException {
    given()
        .contentType("application/json")
        .body(getPayload("CrewInstance.json"))
        .when()
        .post("/generated_app/Crews")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
    
  }
	
	
  
   
  
   @Test
  public void testSystemFilterOptionsCrew() throws IOException {
  
  given()
        .contentType("application/json")
        .body(getPayload("CrewInstance.json"))
        .when()
        .post("/generated_app/Crews")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
   given()
            .when()
            .get("/generated_app/Crews?$top=1")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body("value.get(0).CrewID", equalTo("<<replace_with_keyFieldValue>>"))
            .body("value.size()", is(1));
    given()
            .when()
            .get("/generated_app/Crews/$count")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body(is("1"));
            
            
    
    } 
	
	

	
  @Test
  void  testCreateOrganisingLogisticsInstance() throws IOException {
    given()
        .contentType("application/json")
        .body(getPayload("OrganisingLogisticsInstance.json"))
        .when()
        .post("/generated_app/OrganisingLogistics")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
    
  }
	
	
  
   
  
   @Test
  public void testSystemFilterOptionsOrganisingLogistics() throws IOException {
  
  given()
        .contentType("application/json")
        .body(getPayload("OrganisingLogisticsInstance.json"))
        .when()
        .post("/generated_app/OrganisingLogistics")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
   given()
            .when()
            .get("/generated_app/OrganisingLogistics?$top=1")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body("value.get(0).LogisticsID", equalTo("<<replace_with_keyFieldValue>>"))
            .body("value.size()", is(1));
    given()
            .when()
            .get("/generated_app/OrganisingLogistics/$count")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body(is("1"));
            
            
    
    } 
	
	

	
  @Test
  void  testCreateScoutingLocationsInstance() throws IOException {
    given()
        .contentType("application/json")
        .body(getPayload("ScoutingLocationsInstance.json"))
        .when()
        .post("/generated_app/ScoutingLocations")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
    
  }
	
	
  
   
  
   @Test
  public void testSystemFilterOptionsScoutingLocations() throws IOException {
  
  given()
        .contentType("application/json")
        .body(getPayload("ScoutingLocationsInstance.json"))
        .when()
        .post("/generated_app/ScoutingLocations")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
   given()
            .when()
            .get("/generated_app/ScoutingLocations?$top=1")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body("value.get(0).ScoutLocID", equalTo("<<replace_with_keyFieldValue>>"))
            .body("value.size()", is(1));
    given()
            .when()
            .get("/generated_app/ScoutingLocations/$count")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body(is("1"));
            
            
    
    } 
	
	

	
  @Test
  void  testCreateProducerRaiseFundsInstance() throws IOException {
    given()
        .contentType("application/json")
        .body(getPayload("ProducerRaiseFundsInstance.json"))
        .when()
        .post("/generated_app/ProducerRaiseFunds")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
    
  }
	
	
  
   
  
   @Test
  public void testSystemFilterOptionsProducerRaiseFunds() throws IOException {
  
  given()
        .contentType("application/json")
        .body(getPayload("ProducerRaiseFundsInstance.json"))
        .when()
        .post("/generated_app/ProducerRaiseFunds")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
   given()
            .when()
            .get("/generated_app/ProducerRaiseFunds?$top=1")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body("value.get(0).FundsID", equalTo("<<replace_with_keyFieldValue>>"))
            .body("value.size()", is(1));
    given()
            .when()
            .get("/generated_app/ProducerRaiseFunds/$count")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body(is("1"));
            
            
    
    } 
	
	

	
  @Test
  void  testCreatePreProductionInstance() throws IOException {
    given()
        .contentType("application/json")
        .body(getPayload("PreProductionInstance.json"))
        .when()
        .post("/generated_app/PreProductions")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
    
  }
	
	
  
   
  
   @Test
  public void testSystemFilterOptionsPreProduction() throws IOException {
  
  given()
        .contentType("application/json")
        .body(getPayload("PreProductionInstance.json"))
        .when()
        .post("/generated_app/PreProductions")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
   given()
            .when()
            .get("/generated_app/PreProductions?$top=1")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body("value.get(0).PreProductionID", equalTo("<<replace_with_keyFieldValue>>"))
            .body("value.size()", is(1));
    given()
            .when()
            .get("/generated_app/PreProductions/$count")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body(is("1"));
            
            
    
    } 
	
	

	
  @Test
  void  testCreateProductionActualFilmingInstance() throws IOException {
    given()
        .contentType("application/json")
        .body(getPayload("ProductionActualFilmingInstance.json"))
        .when()
        .post("/generated_app/ProductionActualFilmings")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
    
  }
	
	
  
   
  
   @Test
  public void testSystemFilterOptionsProductionActualFilming() throws IOException {
  
  given()
        .contentType("application/json")
        .body(getPayload("ProductionActualFilmingInstance.json"))
        .when()
        .post("/generated_app/ProductionActualFilmings")
        .then()
        .statusCode(HttpStatusCode.CREATED.getStatusCode());
   given()
            .when()
            .get("/generated_app/ProductionActualFilmings?$top=1")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body("value.get(0).FilmID", equalTo("<<replace_with_keyFieldValue>>"))
            .body("value.size()", is(1));
    given()
            .when()
            .get("/generated_app/ProductionActualFilmings/$count")
            .then()
            .statusCode(HttpStatusCode.fromStatusCode(200).getStatusCode())
            .body(is("1"));
            
            
    
    } 
	
           
       
  
  
  
  
 
  @AfterEach
  void  teardown() {
    jdbcTemplate.execute("DELETE FROM generated_app.CreatingBudget");
    jdbcTemplate.execute("DELETE FROM generated_app.Casting");
    jdbcTemplate.execute("DELETE FROM generated_app.Crew");
    jdbcTemplate.execute("DELETE FROM generated_app.OrganisingLogistics");
    jdbcTemplate.execute("DELETE FROM generated_app.ScoutingLocations");
    jdbcTemplate.execute("DELETE FROM generated_app.ProducerRaiseFunds");
    jdbcTemplate.execute("DELETE FROM generated_app.PreProduction");
    jdbcTemplate.execute("DELETE FROM generated_app.ProductionActualFilming");
     jdbcTemplate.execute("DELETE FROM generated_app.PreProductionHiringCrew");
     jdbcTemplate.execute("DELETE FROM generated_app.PreProductionCastingActors");
     jdbcTemplate.execute("DELETE FROM generated_app.PreProductionFilming");
     jdbcTemplate.execute("DELETE FROM generated_app.PreProductionLocations");

    RestAssuredMockMvc.reset();
  }
}
