package be.ibizz.hackathon.controller;

import be.ibizz.hackathon.domain.Broodautomaat;
import be.ibizz.hackathon.service.DataStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/broodautomaat")
public class BroodautomaatController {
  @Autowired
  private DataStoreService dataStoreService;

  @RequestMapping(method = RequestMethod.GET)
  public List<Broodautomaat> findMachines(@RequestParam(value = "postcode", required = false) String postcode,
                                          @RequestParam(value = "beschikbaar", required = false) boolean beschikbaar) {
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

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Broodautomaat getBroodautomaat(@PathVariable("id") String id) {
    return dataStoreService.getBroodautomaat(id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.POST)
  public Broodautomaat updateBroodautomaat(@PathVariable("id") String id, Broodautomaat broodautomaat) {
    if (id.equals(broodautomaat.getId())) {
      return dataStoreService.updateBroodautomaat(broodautomaat);
    } else {
      throw new RuntimeException();
    }
  }

}