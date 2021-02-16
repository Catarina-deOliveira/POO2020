package pt.iade.OnlineGoods.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.OnlineGoods.models.Package;
import pt.iade.OnlineGoods.models.exceptions.NotFoundException;
import pt.iade.OnlineGoods.models.repositories.PackageRepository;
import pt.iade.OnlineGoods.models.views.PackageInsertView;
import pt.iade.OnlineGoods.models.views.PackageView;

@RestController
@RequestMapping(path = "/api/package")
public class PackageController {
    private Logger logger = LoggerFactory.getLogger(PackageController.class);
    @Autowired
    private PackageRepository packageRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Package> getPackages() {
        logger.info("Sending all packages");
        return packageRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Package getPackage(@PathVariable int id) {
        logger.info("Sending package with id " + id);
        Optional<Package> _package = packageRepository.findById(id);
        if (_package.isEmpty())
            throw new NotFoundException("" + id, "Package", "id");
        else
            return _package.get();
    }

    @GetMapping(path = "/{id}/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<PackageView> getPackageInformation(@PathVariable int id) {
        logger.info("Sending info of package with client_id " + id);
        return packageRepository.findPackageInformation(id);
    }

    @PostMapping(path = "/{id}/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public int savePackageInformation(@PathVariable int id, @RequestBody PackageInsertView pacote) {
        logger.info("Saving new track on album with id: " + id);
        return packageRepository.savePackageInformation(pacote);
    }

}