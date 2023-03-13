package com.finance.invoice.service;

import com.finance.invoice.entity.Client;

import java.util.List;

public interface ClientService {
    Client saveClient(Client client);

    List<Client> fetchClientList();

    Client updateClient(Client client, Long clientId);

    void deleteClientById(Long clientID);
}
