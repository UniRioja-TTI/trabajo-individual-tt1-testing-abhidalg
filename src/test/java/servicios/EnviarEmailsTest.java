package servicios;

import modelo.Destinatario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class EnviarEmailsTest {
    private EnviarEmails testEmails;
    private Logger testLogger;

    @BeforeEach
    void setUp() {
        testLogger = LoggerFactory.getLogger("TestLogger".getClass());
        testEmails = new EnviarEmails(testLogger);
    }

    @Test
    void enviarEmail() {
        Destinatario destinatario = new Destinatario();
        String mensaje = "Prueba de TDD";
        boolean resultado = testEmails.enviarEmail(destinatario, mensaje);
        assertTrue(resultado);
    }
}