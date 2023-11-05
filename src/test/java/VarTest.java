import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.game.AVAR;
import com.game.AsistenteDeVideo;
import com.game.Equipo;
import com.game.Estadio;
import com.game.IJugador;
import com.game.IntegranteDelVar;
import com.game.Jugador;
import com.game.Partido;
import com.game.TarjetaAmarilla;
import com.game.TarjetaRoja;
import com.game.Var;

public class VarTest {
    @Test
    public void el_var_obtiene_solo_tarjetas_amarillas_del_partido_parcial_ejercicio_ejemplo_08()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");        
       
        Jugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        Jugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);  
        Jugador jugadorBoca19 = new Jugador("Valentin Barco", 19);

        boca.agregar(jugadorBoca6);            
        boca.agregar(jugadorBoca10);      
        boca.agregar(jugadorBoca19);        

        Jugador jugadorPalmeiras10 = new Jugador("Rony", 10);

        palmeiras.agregar(jugadorPalmeiras10);

        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    

        TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DePalmeiras = new TarjetaAmarilla(jugadorPalmeiras10);

        partido.agregar(tarjetaRojaParaJugador6DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DePalmeiras);

        Var elVar  = new Var(partido);

        assertEquals(3, partido.tarjetasCantidad());    
       
        assertEquals(1, elVar.cantidadTarjetasRojas());        
        assertEquals(2, elVar.cantidadTarjetasAmarillas());
    }

     @Test
    public void el_var_obtiene_solo_tarjetas_de_un_equipo_parcial_ejercicio_ejemplo_08(){        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");        
       
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        IJugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);  
        IJugador jugadorBoca19 = new Jugador("Valentin Barco", 19);

        boca.agregar(jugadorBoca6);            
        boca.agregar(jugadorBoca10);      
        boca.agregar(jugadorBoca19);        

        IJugador jugadorPalmeiras10 = new Jugador("Rony", 10);

        palmeiras.agregar(jugadorPalmeiras10);

        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    

        TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DePalmeiras = new TarjetaAmarilla(jugadorPalmeiras10);

        partido.agregar(tarjetaRojaParaJugador6DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DePalmeiras);

        Var elVar  = new Var(partido);

        assertEquals(3, partido.tarjetasCantidad());    
        assertEquals(2, elVar.cantidadTarjetas(boca));        
        assertEquals(1, elVar.cantidadTarjetas(palmeiras));
 
    }

    @Test
    public void integrantesDelVar_Test(){
        IntegranteDelVar asistenteDeVideo = new AsistenteDeVideo();
        IntegranteDelVar AVAR1 = new AVAR();
        IntegranteDelVar AVAR2 = new AVAR();
        IntegranteDelVar AVAR3 = new AVAR();
        List<IntegranteDelVar> listAVAR = new ArrayList<>();
        listAVAR.add(AVAR1);
        listAVAR.add(AVAR2);
        listAVAR.add(AVAR3);
        Var var = new Var();
        var.setAsistenteDeVideo(asistenteDeVideo);
        var.setaVar(listAVAR);
    }
}
