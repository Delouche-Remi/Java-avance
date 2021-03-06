package com.cesi.javamaven.Controller;

import com.cesi.javamaven.repository.ClientRepository;
import com.cesi.javamaven.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class ClientController {
  @Autowired // This means to get the bean called clientRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private ClientRepository clientRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewClient (@RequestParam Integer id
      , @RequestParam String indentifiant
      , @RequestParam String nom
      , @RequestParam String prenom) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Client n = new Client();
    n.setId(id);
    n.setIdentifiant(identifiant);
    n.setNom(nom);
    n.setPrenom(prenom);
    clientRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Client> getAllClients() {
    // This returns a JSON or XML with the clients
    return clientRepository.findAll();
  }
}