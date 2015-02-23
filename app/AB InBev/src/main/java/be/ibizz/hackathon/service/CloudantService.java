package be.ibizz.hackathon.service;

import be.ibizz.hackathon.domain.Broodautomaat;
import be.ibizz.hackathon.repository.BroodautomaatRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudantService implements DataStoreService {
  private Logger LOGGER = LoggerFactory.getLogger(CloudantService.class);
  private BroodautomaatRepository automaatRepository;

  @Autowired
  public CloudantService(BroodautomaatRepository automaatRepository) {
    this.automaatRepository = automaatRepository;
  }

  @Override
  public List<Broodautomaat> getBroodautomaten() {
    return automaatRepository.getAll();
  }

}