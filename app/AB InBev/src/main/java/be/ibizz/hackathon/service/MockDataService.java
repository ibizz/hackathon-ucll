package be.ibizz.hackathon.service;

import be.ibizz.hackathon.domain.Broodautomaat;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MockDataService implements DataStoreService {
  @Override
  public List<Broodautomaat> getBroodautomaten() {
    List<Broodautomaat> broodautomaten = new ArrayList<>();
    Broodautomaat automaat = new Broodautomaat();
    automaat.setId(UUID.randomUUID().toString());
    automaat.setType("broodautomaat");
    return null;
  }

}
