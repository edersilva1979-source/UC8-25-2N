package banco;

import java.util.ArrayList;
import modelo.Cliente;

public class BancoSimulado {
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    
    public static int idCliente = 1;
    
    static {

        clientes.add(new Cliente(
                idCliente++,
                "João Silva",
                "775.368.852-91",
                "joao.silva@email.com"
            )
        );
        clientes.add(new Cliente(
                idCliente++,
                "Maria Silva",
                "656.000.654-91",
                "maria.silva@email.com"
            )
        );
        clientes.add(new Cliente(
                idCliente++,
                "Pedro Barbosa",
                "555.123.654-34",
                "pedro.barbosa@email.com"
            )
        );
        
        clientes.add(new Cliente(
                idCliente++,
                "Jose Nogueira",
                "666.888.654-99",
                "jose.nogueira@email.com"
            )
        );
        
              clientes.add(new Cliente(
                idCliente++,
                "Marina Pia",
                "777.555.4444-00",
                "marina.pia@email.com"
            )
        );
    }
}
