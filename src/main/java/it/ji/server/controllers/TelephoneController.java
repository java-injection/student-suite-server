package it.ji.server.controllers;

import it.ji.server.models.Telephone;
import it.ji.server.services.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(path = "api/v1/telephones")
public class TelephoneController {

    private final TelephoneService telephoneService;

    @Autowired
    public TelephoneController(TelephoneService telephoneService) {
        this.telephoneService = telephoneService;
    }

    @GetMapping
    public List<Telephone> getAllStudents() {
        return telephoneService.getAllTelephones();
    }
}
