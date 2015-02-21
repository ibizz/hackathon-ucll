package be.ibizz.hackathon.controller;

import be.ibizz.hackathon.domain.BreadMachine;
import be.ibizz.hackathon.service.DataStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/breadmachine")
public class BreadMachineController {
  @Autowired
  private DataStoreService dataStoreService;

  @RequestMapping(method = RequestMethod.GET)
  public List<BreadMachine> findMachines(@RequestParam(value = "zipCode", required = false) String zipCode) {
    List<BreadMachine> broodautomaten;
    if (StringUtils.isEmpty(zipCode)) {
      broodautomaten = dataStoreService.findAllBreadMachines();
    } else {
      broodautomaten = dataStoreService.findBreadMachinesInCity(zipCode);
    }

    return broodautomaten;
  }

  @RequestMapping(method = RequestMethod.POST)
  public BreadMachine addMachine(BreadMachine breadMachine) {
    return dataStoreService.createBreadMachine(breadMachine);
  }
}