package be.ibizz.hackathon.repository;

import be.ibizz.hackathon.domain.BreadMachine;
import be.ibizz.hackathon.util.loader.CustomDataLoader;
import org.ektorp.CouchDbConnector;
import org.ektorp.dataload.DataLoader;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.GenerateView;
import org.ektorp.support.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Reader;
import java.util.List;

@Repository
@View(name = "all", map = "function(doc) { if (doc.type == 'broodautomaat' ) emit( null, doc )}")
public class BreadMachineRepository extends CouchDbRepositorySupport<BreadMachine> implements DataLoader {
  private static final Logger LOGGER = LoggerFactory.getLogger(CityRepository.class);
  private final static String[] INITIAL_DATA_PATH = {"classpath:/database/broodautomaat.json"};

  @Autowired
  public BreadMachineRepository(CouchDbConnector db) {
    super(BreadMachine.class, db);
    initStandardDesignDocument();
  }

  @GenerateView(field = "postcode")
  public List<BreadMachine> findByPostcode(String postcode) {
    return queryView("by_postcode", postcode);
  }

  @Override
  public void loadInitialData(Reader in) {
    new CustomDataLoader(db).loadBroodmachines(in);
  }

  @Override
  public void allDataLoaded() {
    LOGGER.info("Finished initial Broodautomaat data upload");
  }

  @Override
  public String[] getDataLocations() {
    return INITIAL_DATA_PATH;
  }



}