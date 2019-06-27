package pe.com.segdi.segappwsentidad.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.com.segdi.segappwsentidad.client.EntidadClient;
import pe.gob.segdi.wsentidad.ws.EntidadBean;

import java.util.List;

@Controller
@RequestMapping("/api/entidad")
public class EntidadController {

    protected final EntidadClient entidadClient;

    public EntidadController(EntidadClient entidadClient){
        this.entidadClient = entidadClient;
    }

    @RequestMapping(value = "/listarEntidades", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<EntidadBean> listarEntidades(){
        return this.entidadClient.listarEntidad();
    }
}
