package pe.com.segdi.segappwsentidad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tempuri.CalculatorSoap;
import pe.com.segdi.segappwsentidad.client.EntidadClient;

@SpringBootApplication
public class SegAppWsEntidadApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(SegAppWsEntidadApplication.class);

    @Autowired
    private CalculatorSoap calculatorSoap;

    @Autowired
    private EntidadClient entidadClient;

    public static void main(String[] args) {
        SpringApplication.run(SegAppWsEntidadApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Integer result = calculatorSoap.add(1,1);
        logger.info("Resultado :: {} ", result);


        entidadClient.listarEntidad().forEach(h-> {
            logger.info(h.getVrucent());
        });
    }
}
