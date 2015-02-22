package be.ibizz.hackathon.service;

import be.ibizz.hackathon.domain.Broodautomaat;
import be.ibizz.hackathon.domain.Gemeente;

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

  @Override
  public List<Broodautomaat> findBroodautomatenInGemeente(String postCode) {
    return null;
  }

  @Override
  public List<Gemeente> findAllGemeenten() {
    return null;
  }

  @Override
  public Broodautomaat createBroodautomaat(Broodautomaat nieuweBroodautomaat) {
    return null;
  }

  @Override
  public Broodautomaat updateBroodautomaat(Broodautomaat broodautomaat) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public Broodautomaat getBroodautomaat(String id) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

}
