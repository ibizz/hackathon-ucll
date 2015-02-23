package be.ibizz.hackathon.service;

import be.ibizz.hackathon.domain.Broodautomaat;
import be.ibizz.hackathon.domain.Gemeente;

import java.util.List;

public interface DataStoreService {

  List<Broodautomaat> getBroodautomaten();

  List<Broodautomaat> findBroodautomatenInGemeente(String postCode);

  List<Gemeente> findAllGemeenten();

  Broodautomaat createBroodautomaat(Broodautomaat nieuweBroodautomaat);

  Broodautomaat updateBroodautomaat(Broodautomaat broodautomaat);

  Broodautomaat getBroodautomaat(String id);

}