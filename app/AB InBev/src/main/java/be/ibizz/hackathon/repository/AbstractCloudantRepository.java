package be.ibizz.hackathon.repository;

import java.io.Reader;

import org.ektorp.CouchDbConnector;
import org.ektorp.dataload.DataLoader;
import org.ektorp.support.CouchDbRepositorySupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import be.ibizz.hackathon.util.loader.CustomDataLoader;

public abstract class AbstractCloudantRepository<T> extends CouchDbRepositorySupport<T> implements DataLoader  {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountRepository.class);
	private String dataFile;
	
	protected AbstractCloudantRepository(Class<T> type, CouchDbConnector db, String dataFile) {
		super(type, db);
		this.dataFile = dataFile;
		initStandardDesignDocument();
	}

	@Override
	public void loadInitialData(Reader in) {
	    new CustomDataLoader(db).load(in, type);
	}
	
	@Override
	public void allDataLoaded() {
		LOGGER.info("Uploaded '{}'", dataFile);
	}
	
	@Override
	public String[] getDataLocations() {
		return new String[]{dataFile};
	}
	
}
