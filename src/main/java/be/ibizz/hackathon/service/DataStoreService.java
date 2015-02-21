package be.ibizz.hackathon.service;

import be.ibizz.hackathon.domain.BreadMachine;
import be.ibizz.hackathon.domain.City;

import java.util.List;

/**
 * Dit is een standaard java interface klasse. We doen hier niets specifiek.
 * <p>
 * Deze interface zorgt voor een contract tussen implementatie en de klasse waarin
 * de functionaliteit wordt opgeroepen.
 */
public interface DataStoreService {

  List<BreadMachine> findAllBreadMachines();

  List<BreadMachine> findBreadMachinesInCity(String postCode);

  List<City> findAllCities();

  BreadMachine createBreadMachine(BreadMachine breadMachine);

}