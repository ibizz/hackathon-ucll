package be.ibizz.hackathon.service;

import be.ibizz.hackathon.domain.BreadMachine;
import be.ibizz.hackathon.domain.City;
import be.ibizz.hackathon.repository.BreadMachineRepository;
import be.ibizz.hackathon.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CloudantService implements DataStoreService {
  private Logger LOGGER = LoggerFactory.getLogger(CloudantService.class);
  private BreadMachineRepository breadMachineRepository;
  private CityRepository cityRepository;

  @Autowired
  public CloudantService(BreadMachineRepository breadMachineRepository, CityRepository cityRepository) {
    this.breadMachineRepository = breadMachineRepository;
    this.cityRepository = cityRepository;
  }

  @Override
  public List<BreadMachine> findAllBreadMachines() {
    return breadMachineRepository.getAll();
  }

  @Override
  public List<BreadMachine> findBreadMachinesInCity(String postCode) {
    return breadMachineRepository.findByPostcode(postCode);
  }

  @Override
  public List<City> findAllCities() {
    return cityRepository.getAll();
  }

  @Override
  public BreadMachine createBreadMachine(BreadMachine breadMachine) {
    breadMachine.setId(UUID.randomUUID().toString());
    LOGGER.debug("Creating broodautomaat: {}", breadMachine);

    breadMachineRepository.add(breadMachine);
    return breadMachine;
  }

}