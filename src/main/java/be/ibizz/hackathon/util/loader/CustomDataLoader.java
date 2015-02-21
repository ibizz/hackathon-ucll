package be.ibizz.hackathon.util.loader;

import be.ibizz.hackathon.domain.BreadMachine;
import be.ibizz.hackathon.domain.City;
import com.google.gson.*;
import org.ektorp.CouchDbConnector;
import org.ektorp.DocumentOperationResult;
import org.ektorp.support.CouchDbDocument;
import org.ektorp.util.Exceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class CustomDataLoader {
  private static final Logger LOGGER = LoggerFactory.getLogger(CustomDataLoader.class);
  private CouchDbConnector db;

  public CustomDataLoader(CouchDbConnector db) {
    this.db = db;
  }

  /**
   * Reads documents from the reader and stores them in the database.
   *
   * @param in
   */
  public void loadCities(Reader in) {
    try {
      doLoadCity(in);
    } catch (Exception e) {
      throw Exceptions.propagate(e);
    }
  }

  public void loadBroodmachines(Reader in) {
    try {
      doLoad(in);
    } catch (Exception e) {
      throw Exceptions.propagate(e);
    }
  }

  private void doLoad(Reader in) throws IOException {
    Set<String> allIds = new HashSet<>(db.getAllDocIds());

    JsonParser parser = new JsonParser();
    JsonObject jsonObject = parser.parse(in).getAsJsonObject();
    JsonArray results = jsonObject.get("docs").getAsJsonArray();

    List<CouchDbDocument> documents = new ArrayList<>();
    for (JsonElement element : results) {
      BreadMachine couchDbDocument = new Gson().fromJson(element, BreadMachine.class);

      couchDbDocument.setId(UUID.randomUUID().toString());
      if (!allIds.contains(couchDbDocument.getId())) {
        allIds.add(couchDbDocument.getId());
        documents.add(couchDbDocument);
      } else {
        LOGGER.warn("This ID ({}) already exists in Cloudant", couchDbDocument.getId());
      }
    }

    List<DocumentOperationResult> saveResult = db.executeBulk(documents);
    if (saveResult.isEmpty()) {
      LOGGER.info("Successfully added {} documents", documents.size());
    } else {
      LOGGER.warn("Only added {} of {} documents succesfully",  documents.size() - saveResult.size(), documents.size());
    }
  }

  private void doLoadCity(Reader in) throws IOException {
    Set<String> allIds = new HashSet<>(db.getAllDocIds());

    JsonParser parser = new JsonParser();
    JsonObject jsonObject = parser.parse(in).getAsJsonObject();
    JsonArray results = jsonObject.get("docs").getAsJsonArray();

    List<CouchDbDocument> documents = new ArrayList<>();
    for (JsonElement element : results) {
      City couchDbDocument = new Gson().fromJson(element, City.class);

      couchDbDocument.setId(UUID.randomUUID().toString());
      if (!allIds.contains(couchDbDocument.getId())) {
        allIds.add(couchDbDocument.getId());
        documents.add(couchDbDocument);
      } else {
        LOGGER.warn("This ID ({}) already exists in Cloudant", couchDbDocument.getId());
      }
    }

    List<DocumentOperationResult> errors = db.executeBulk(documents);
    if (errors.isEmpty()) {
      LOGGER.info("Successfully added {} documents", documents.size());
    } else {
      LOGGER.warn("Only added {} of {} documents succesfully",  documents.size() - errors.size(), documents.size());
    }
  }
}
