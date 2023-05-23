import dao.ClientDao;
import dao.impl.ClientDaoImpl;
import model.ClientDto;

public class App {
    public static void main(String[] args) {

        ClientDao clientDao = (ClientDao) new ClientDaoImpl();

        ClientDto client3 = clientDao.createClient(new ClientDto("001","Diana", "Basabe"));
        ClientDto client1 = clientDao.createClient(new ClientDto("888","Mario","Lopez"));
        ClientDto client7 = clientDao.createClient(new ClientDto());

        System.out.println(client3);

        clientDao.deleteCliente(client3);

        //validacion
        ClientDto client2 = clientDao.getClient("898");
        if (client2 == null){
            client2 = new ClientDto("not found","not found","not found");
            System.out.println("Esto es nulo");
        }


    }
}