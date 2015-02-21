package be.ibizz.hackathon.repository;

import be.ibizz.hackathon.domain.City;
import be.ibizz.hackathon.util.loader.CustomDataLoader;
import org.ektorp.CouchDbConnector;
import org.ektorp.dataload.DataLoader;
import org.ektorp.support.CouchDbRepositorySupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Reader;

@Repository
public class CityRepository extends CouchDbRepositorySupport<City> implements DataLoader {
  private static final Logger LOGGER = LoggerFactory.getLogger(CityRepository.class);
  private final static String[] INITIAL_DATA_PATH = {"classpath:/database/postcodes.json"};

  @Autowired
  public CityRepository(CouchDbConnector db) {
    super(City.class, db);
    initStandardDesignDocument();
  }

  @Override
  public void loadInitialData(Reader in) {
    new CustomDataLoader(db).loadCities(in);
  }

  @Override
  public void allDataLoaded() {
    LOGGER.info("Finished initial City data upload");
  }

  @Override
  public String[] getDataLocations() {
    return INITIAL_DATA_PATH;
  }

}