package be.ibizz.hackathon.controller;

import be.ibizz.hackathon.domain.Broodautomaat;
import be.ibizz.hackathon.service.DataStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BroodautomaatController {
  @Autowired
  private DataStoreService dataStoreService;

  @RequestMapping(value = "/broodautomaat", method = RequestMethod.GET)
  public List<Broodautomaat> findMachines(@RequestParam(value = "postcode", required = false) String postcode) {
    List<Broodautomaat> broodautomaten;
    if (StringUtils.isEmpty(postcode)) {
      broodautomaten = dataStoreService.getBroodautomaten();
    } else {
      broodautomaten = dataStoreService.findBroodautomatenInGemeente(postcode);
    }

    return broodautomaten;
  }

  @RequestMapping(method = RequestMethod.POST)
  public Broodautomaat addMachine(Broodautomaat broodautomaat) {
    return dataStoreService.createBroodautomaat(broodautomaat);
  }

}