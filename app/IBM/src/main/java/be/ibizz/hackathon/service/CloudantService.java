package be.ibizz.hackathon.service;

import be.ibizz.hackathon.domain.Broodautomaat;
import be.ibizz.hackathon.domain.Gemeente;
import be.ibizz.hackathon.repository.BroodautomaatRepository;
import be.ibizz.hackathon.repository.GemeenteRepository;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class CloudantService implements DataStoreService {
  private Logger LOGGER = LoggerFactory.getLogger(CloudantService.class);
  private BroodautomaatRepository automaatRepository;
  private GemeenteRepository gemeenteRepository;

  @Autowired
  public CloudantService(BroodautomaatRepository automaatRepository, GemeenteRepository gemeenteRepository) {
    this.automaatRepository = automaatRepository;
    this.gemeenteRepository = gemeenteRepository;
  }

  @Override
  public List<Broodautomaat> getBroodautomaten() {
    return automaatRepository.getAll();
  }

  @Override
  public List<Broodautomaat> findBroodautomatenInGemeente(String postcode) {
    return automaatRepository.findByPostcode(postcode);
  }

  @Override
  public List<Gemeente> findAllGemeenten() {
    return gemeenteRepository.getAll();
  }

  @Override
  public Broodautomaat createBroodautomaat(Broodautomaat nieuweBroodautomaat) {
    nieuweBroodautomaat.setLaatsteUpdate(new Date());
    automaatRepository.add(nieuweBroodautomaat);

    LOGGER.debug("Created broodautomaat: {}", nieuweBroodautomaat);
    return nieuweBroodautomaat;
  }

  @Override
  public Broodautomaat updateBroodautomaat(Broodautomaat broodautomaat) {
    broodautomaat.setLaatsteUpdate(new Date());
    automaatRepository.update(broodautomaat);
    return automaatRepository.get(broodautomaat.getId());
  }

  @Override
  public Broodautomaat getBroodautomaat(String id) {
    return automaatRepository.get(id);
  }

}