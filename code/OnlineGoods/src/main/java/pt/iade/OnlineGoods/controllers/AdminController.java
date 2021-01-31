package pt.iade.OnlineGoods.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.OnlineGoods.models.Admin;
import pt.iade.OnlineGoods.models.exceptions.NotFoundException;
import pt.iade.OnlineGoods.models.repositories.AdminRepository;

@RestController
@RequestMapping(path = "/api/admin")
public class AdminController {
    private Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Admin> getAdmins() {
        logger.info("Sending all admins");
        return adminRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Admin getAdmin(@PathVariable int id) {
        logger.info("Sending admin with id " + id);
        Optional<Admin> _admin = adminRepository.findById(id);
        if (_admin.isEmpty())
            throw new NotFoundException("" + id, "Admin", "id");
        else
            return _admin.get();
    }
}
