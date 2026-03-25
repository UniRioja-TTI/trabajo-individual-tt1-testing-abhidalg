package servicios;

import interfaces.InterfazEnviarEmails;
import modelo.Destinatario;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

@Service
public class EnviarEmails implements InterfazEnviarEmails {
    private  final Logger logger;

    public EnviarEmails(Logger logger) {
        this.logger = logger;
    }

    @Override
    public boolean enviarEmail(Destinatario dest, String email) {
        logger.info("Enviando email para " + dest);
        logger.info("Cuerpo del mensaje: " + email);
        return true;
    }
}
