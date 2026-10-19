import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;
import com.edu.ec.tarea.Reserva;
import com.edu.ec.tarea.ReservaService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Juan Perez", "Laptop", 1250, "juan@gmail.com");// crear manualmente el objeto de la
                                                                                   // clase Pedido
        PedidoService pedidoService = new PedidoService();// crear manualmente el objeto de la clase PedidoService
        pedidoService.realizar(pedido);
        pedidoService = null;// El objeto sea elegible por el GC
        pedido = null;// El objeto sea elegible por el garbage collector
        //nueva rama

        System.out.println("\nEjemplo Tarea");

        Reserva reserva = new Reserva("Bryan","Suite",3,"099345687");
        ReservaService reservaService = new ReservaService();
        reservaService.reservar(reserva);

        



    }
}
