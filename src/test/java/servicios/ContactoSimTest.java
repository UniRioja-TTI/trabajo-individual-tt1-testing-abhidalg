package servicios;

import static org.junit.jupiter.api.Assertions.*;

import modelo.DatosSolicitud;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class ContactoSimTest {

    private ContactoSim servicio;

    @BeforeEach
    void setUp() {
        // Arrange: Instanciamos la clase antes de cada test [cite: 69, 70]
        servicio = new ContactoSim();
    }

    @Test
    void testGetEntities() {
        // Act: Realizamos la acción [cite: 71]
        var resultado = servicio.getEntities();

        // Assert: Comprobamos el resultado [cite: 72, 73]
        assertNotNull(resultado, "La lista de entidades no debería ser nula");
    }

    @Test
    void testSolicitarSimulation() {
        ContactoSim contactoSim = new ContactoSim();
        DatosSolicitud sol = new DatosSolicitud(new HashMap<>());
        int token = servicio.solicitarSimulation(sol);
        assertTrue(token > 0, "El token no puede ser negativo");
    }
}