package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ContactoSim implements InterfazContactoSim {
    private Map<Integer, DatosSolicitud> datosSolicitud = new HashMap<>();
    private List<Entidad> entidades = Arrays.asList(new Entidad(1, "E1"),
            new Entidad(2, "E2"),
            new Entidad(3, "E3"),
            new Entidad(4, "E4"));

    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        int token = new  Random().nextInt(1000000);
        datosSolicitud.put(token, sol);
        return token;
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null;
    }

    @Override
    public List<Entidad> getEntities() {
        return entidades;
    }

    @Override
    public boolean isValidEntityId(int id) {
        return entidades.stream().anyMatch(entidad -> entidad.getId() == id);
    }
}
