package banco;

import java.util.ArrayList;
import modelo.Produto;

public class BancoSimulado {
    public static ArrayList<Produto> produtos = new ArrayList<>();
    
    public static int idProduto = 1;
    
    static {

        produtos.add(new Produto(
                idProduto++,
                "Placa Mae PC",
                599.00,
                2
            )
        );
        
        produtos.add(new Produto(
                idProduto++,
                "Memoria RAM 16GB",
                187.75,
                12
            )
        );
        produtos.add(new Produto(
                idProduto++,
                "SSD 160GB",
                381.5,
                8
            )
        );       
    }
}