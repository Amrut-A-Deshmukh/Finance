package com.finance.invoice.service;

import com.finance.invoice.entity.Client;
import com.finance.invoice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClientServiceImpl implements ClientService
{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client)
    {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> fetchClientList()
    {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client updateClient(Client client, Long clientId)
    {
        Client clientDb = clientRepository.findById(clientId).get();

        if(Objects.nonNull(client.getClientName()) && !"".equalsIgnoreCase(client.getClientName()))
        {
            clientDb.setClientName(client.getClientName());
        }
        if(Objects.nonNull(client.getClientAddress()) && !"".equalsIgnoreCase(client.getClientAddress()))
        {
            clientDb.setClientAddress(client.getClientAddress());
        }
        if(Objects.nonNull(client.getClientEmail()) && !"".equalsIgnoreCase(client.getClientEmail()))
        {
            clientDb.setClientEmail(client.getClientEmail());
        }
        if(Objects.nonNull(client.getClientMobileNumber()) && !"".equalsIgnoreCase(client.getClientMobileNumber()))
        {
            clientDb.setClientMobileNumber(client.getClientMobileNumber());
        }
        if(Objects.nonNull(client.getClientLoanAccountNumber()) && !"".equalsIgnoreCase(client.getClientLoanAccountNumber()))
        {
            clientDb.setClientLoanAccountNumber(client.getClientLoanAccountNumber());
        }
        if(Objects.nonNull(client.getClientLoanInformation()) && !"".equalsIgnoreCase(client.getClientLoanInformation()))
        {
            clientDb.setClientLoanInformation(client.getClientLoanInformation());
        }
        if(Objects.nonNull(client.getClientUsername()) && !"".equalsIgnoreCase(client.getClientUsername()))
        {
            clientDb.setClientUsername(client.getClientUsername());
        }
        if(Objects.nonNull(client.getClientPassword()) && !"".equalsIgnoreCase(client.getClientPassword()))
        {
            clientDb.setClientPassword(client.getClientPassword());
        }

        return clientRepository.save(clientDb);
    }

    @Override
    public void deleteClientById(Long clientID)
    {
        clientRepository.deleteById(clientID);
    }
}
