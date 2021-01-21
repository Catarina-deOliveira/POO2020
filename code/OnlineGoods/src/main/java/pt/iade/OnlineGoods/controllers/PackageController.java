package pt.iade.OnlineGoods.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.OnlineGoods.models.Package;
import pt.iade.OnlineGoods.models.repositories.PackageRepository;

@RestController
@RequestMapping(path = "/api/encomenda")
public class PackageController {
    private Logger logger = LoggerFactory.getLogger(PackageController.class);
    @Autowired
    private PackageRepository packageRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Package> getPackages() {
        logger.info("Sending all packages");
        return packageRepository.findAll();
    }
}
