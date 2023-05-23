package dao.impl;


import dao.ClientDao;
import model.ClientDto;

import java.util.HashMap;
import java.util.Map;

public class ClientDaoImpl implements ClientDao {

    Map<String, Object> map = new HashMap<String, Object>();


    public ClientDto createClient(ClientDto client) {
        map.put(client.getId(), client);
        return client;
    }

    @Override
    public ClientDto getClient(String id) {
        try {
            return (ClientDto) map.get(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return new ClientDto("not found","not found","not found");
        }

    }

    @Override
    public void modificationClient(ClientDto client) {
        System.out.println("El cliente" + client.getFirstName()+ "fue modificado");

    }

    @Override
    public void deleteCliente(ClientDto client) {
        if(map.containsKey(client.getId())){
            map.remove(client.getId());
        }
        System.out.println("El cliente" + client + "fue eliminado");

    }




}
