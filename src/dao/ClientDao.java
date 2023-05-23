package dao;

import model.ClientDto;

public interface ClientDao {

    ClientDto createClient(ClientDto client);

    ClientDto getClient(String id);

    void modificationClient(ClientDto client);

    void deleteCliente(ClientDto client);

}
