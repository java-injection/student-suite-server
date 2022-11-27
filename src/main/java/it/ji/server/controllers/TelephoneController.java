package it.ji.server.controllers;

import it.ji.server.models.Telephone;
import it.ji.server.services.TelephoneService;
import it.ji.server.utils.Features;
import it.ji.server.utils.UnleashManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(path = "/search/{student_id}")
    public List<Telephone> getTelephonesByStudentId(@PathVariable("student_id") Long id) {
        if(UnleashManager.getInstance().isFeatureEnabled(Features.EXPERIMENTAL.getFeatureName())){
            System.out.println("Feature enabled: ["+Features.EXPERIMENTAL.getFeatureName()+"]");
            return telephoneService.getTelephonesByStudentId(id);
        }else{
            System.out.println("Feature disabled ["+Features.EXPERIMENTAL.getFeatureName()+"]");
            return telephoneService.getTelephonesByStudentId(4L);
        }
    }

}
