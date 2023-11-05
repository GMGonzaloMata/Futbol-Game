import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.game.Arbitro;
import com.game.Partido;

public class PartidoTest {

    @Test
    public void arbitrosPartido_Test(){
    Arbitro arbitro1 = new Arbitro();
    Arbitro arbitroAsistente = new Arbitro();
    Arbitro arbitroLinea1 = new Arbitro();
    Arbitro arbitroLinea2 = new Arbitro();
    List<Arbitro> arbitrosLinea = new ArrayList<>();
    arbitrosLinea.add(arbitroLinea1);
    arbitrosLinea.add(arbitroLinea2);
    Partido partido = new Partido();
    partido.setArbitro(arbitro1);
    partido.setArbitroAsistente(arbitroAsistente);
    partido.setArbitroLinea(arbitrosLinea);
}
}
