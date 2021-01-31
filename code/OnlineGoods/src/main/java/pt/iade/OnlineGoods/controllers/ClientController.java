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

import pt.iade.OnlineGoods.models.Client;
import pt.iade.OnlineGoods.models.exceptions.NotFoundException;
import pt.iade.OnlineGoods.models.repositories.ClientRepository;

@RestController
@RequestMapping(path = "/api/client")
public class ClientController {
    private Logger logger = LoggerFactory.getLogger(ClientController.class);
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Client> getClients() {
        logger.info("Sending all clients");
        return clientRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Client getClient(@PathVariable int id) {
        logger.info("Sending client with id " + id);
        Optional<Client> _client = clientRepository.findById(id);
        if (_client.isEmpty())
            throw new NotFoundException("" + id, "Client", "id");
        else
            return _client.get();
    }
}
