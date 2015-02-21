package be.ibizz.hackathon.controller;

import be.ibizz.hackathon.domain.Gemeente;
import be.ibizz.hackathon.service.DataStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GemeenteController {
  @Autowired
  private DataStoreService dataStoreService;

  @RequestMapping(value = "gemeente", method = RequestMethod.GET)
  public List<Gemeente> getAllGemeenten() {
    return dataStoreService.findAllGemeenten();
  }

}