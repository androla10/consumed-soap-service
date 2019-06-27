package pe.com.segdi.segappwsentidad.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pe.gob.segdi.wsentidad.ws.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class EntidadClient {

    private static final Logger logger = LoggerFactory.getLogger(EntidadClient.class);

    @Autowired
    private Entidad entidad;


    public List<EntidadBean> listarEntidad(){
        //return new ArrayList<>();
        return entidad.getListaEntidad(1);
        /*response.forEach(h-> {
            logger.info("Entidad Encontrada :: {}", h.getVnoment());
        });*/
    }
}
