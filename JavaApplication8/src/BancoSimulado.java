
import modelo.Usuario;
import java.util.ArrayList;
import modelo.Clientes;
import modelo.Produto;



public class BancoSimulado {

    public static ArrayList<Clientes> clientes = new ArrayList<>();

    public static ArrayList<Produto> produtos = new ArrayList<>();

    public static ArrayList<Usuario> usuario = new ArrayList<>();

    public static int idCliente = 1;

    public static int idProduto = 1;


    static {

        clientes.add(new Clientes(
                idCliente++,
                "João Silva",
                "775.368.852-91",
                "joao.silva@email.com"
            )
        );

        clientes.add(new Clientes(
                idCliente++,
                "Maria Souza",
                "895.800.112-11",
                "maria.souza@email.com"
            )
        );
        
        clientes.add(new Clientes(
                idCliente++,
                "Pedro Souza",
                "000.8d0.662-11",
                "Pedro.souza@email.com"
            )
        );
        
         clientes.add(new Clientes(
                idCliente++,
                "Luciana Alvarenga",
                "000.888.662-88",
                "luciana.alvarenga@email.com"
            )
        );
              

        produtos.add(
            new Produto(
                idProduto++,
                "Placa Principal",
                825.90,
                3    
            )
        );

        produtos.add(
            new Produto(
                idProduto++,
                "Memoria RAM 16GB",
                274.55,
                5
            )
        );

        produtos.add(
            new Produto(
                idProduto++,
                "SSD 1TB",
                515.26,
                1
            )
        );
     
    }

}