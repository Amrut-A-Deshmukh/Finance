package com.finance.invoice.controller;

import com.finance.invoice.entity.Client;
import com.finance.invoice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController
{
    @Autowired private ClientService clientService;

    @PostMapping("/clients")
    public Client saveClient(@RequestBody Client client)
    {
        return clientService.saveClient(client);
    }

    @GetMapping("/clients")
    public List<Client> fetchClientList()
    {
        return clientService.fetchClientList();
    }

    @PutMapping("/clients/{id}")
    public Client updateClient(@RequestBody Client client, @PathVariable("id") Long clientId)
    {
        return clientService.updateClient(client, clientId);
    }

    @DeleteMapping("/clients/{id}")
    public String deleteClientById(@PathVariable("id") Long clientId)
    {
        clientService.deleteClientById(clientId);
        return "Deleted Successfully";
    }
}
