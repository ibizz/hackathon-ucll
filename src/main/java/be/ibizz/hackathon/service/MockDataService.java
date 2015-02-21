package be.ibizz.hackathon.service;

import be.ibizz.hackathon.domain.BreadMachine;
import be.ibizz.hackathon.domain.City;

import java.util.List;

public class MockDataService implements DataStoreService {
  @Override
  public List<BreadMachine> findAllBreadMachines() {
    return null;
  }

  @Override
  public List<BreadMachine> findBreadMachinesInCity(String postCode) {
    return null;
  }

  @Override
  public List<City> findAllCities() {
    return null;
  }

  @Override
  public BreadMachine createBreadMachine(BreadMachine breadMachine) {
    return null;
  }
}
