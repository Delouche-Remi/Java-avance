/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propriétaire
 */

import com.cesi.javamaven.repository.ClientRepository;
import com.cesi.javamaven.controller.ClientController;


public class ClientControllerTest {
    @Test
    public void deleteOneClientTest() {
        int clientId = 21;
        ResponseEntity<Retour> retour = ClientController.deleteClient(clientId);

        Client clientFromRepo = ClientRepository.findById(clientId).get();

        assertThat(retour.getBody().getMessage()).isEqualTo("Merci de supprimer les comptes courants et/ou épargnes de ce client avant de le supprimer");
    }
}
