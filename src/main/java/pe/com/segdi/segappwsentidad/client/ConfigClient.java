package pe.com.segdi.segappwsentidad.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.tempuri.CalculatorSoap;
import pe.gob.segdi.wsentidad.ws.Entidad;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class ConfigClient {

    @Value("${client.url}")
    private String address;


    /*@Bean(name = "entidadProxy")
    public JaxWsPortProxyFactoryBean entidadProxy() throws MalformedURLException {
        JaxWsPortProxyFactoryBean jaxWsProxyFactoryBean =
                new JaxWsPortProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceInterface(Entidad.class);
        jaxWsProxyFactoryBean.setEndpointAddress(address);
        jaxWsProxyFactoryBean.setServiceName("EntidadService");
        jaxWsProxyFactoryBean.setWsdlDocumentUrl(new URL("classpath:wsdl/Entidad.wsdl"));
        jaxWsProxyFactoryBean.setNamespaceUri("http://ws.wsentidad.segdi.gob.pe/");
        jaxWsProxyFactoryBean.setPortName("EntidadPort");
        return jaxWsProxyFactoryBean;
    }*/

    @Bean(name = "entidadProxy")
    public JaxWsPortProxyFactoryBean entidadProxy() throws MalformedURLException{
        JaxWsPortProxyFactoryBean jaxWsProxyFactoryBean =
                new JaxWsPortProxyFactoryBean();
        jaxWsProxyFactoryBean.setLookupServiceOnStartup(true);
        jaxWsProxyFactoryBean.setServiceInterface(Entidad.class);
        //jaxWsProxyFactoryBean.setEndpointAddress("https://svn.apache.org/repos/asf/airavata/sandbox/xbaya-web/test/Calculator.wsdl");
        jaxWsProxyFactoryBean.setEndpointAddress("http://200.48.76.125/wsentidad/Entidad");
        jaxWsProxyFactoryBean.setWsdlDocumentUrl(new URL("classpath:wsdl/Entidad.wsdl"));
        jaxWsProxyFactoryBean.setServiceName("EntidadService");
        jaxWsProxyFactoryBean.setNamespaceUri("http://ws.wsentidad.segdi.gob.pe/");
        //jaxWsProxyFactoryBean.setPortName("EntidadPort");
        return jaxWsProxyFactoryBean;
    }

    @Bean(name = "calculatorProxy")
    public JaxWsPortProxyFactoryBean calculatorProxy() throws MalformedURLException{
        JaxWsPortProxyFactoryBean jaxWsProxyFactoryBean =
                new JaxWsPortProxyFactoryBean();
        jaxWsProxyFactoryBean.setLookupServiceOnStartup(true);
        jaxWsProxyFactoryBean.setServiceInterface(CalculatorSoap.class);
        //jaxWsProxyFactoryBean.setEndpointAddress("https://svn.apache.org/repos/asf/airavata/sandbox/xbaya-web/test/Calculator.wsdl");
        jaxWsProxyFactoryBean.setEndpointAddress("http://www.dneonline.com/calculator.asmx");
        jaxWsProxyFactoryBean.setWsdlDocumentUrl(new URL("classpath:wsdl/Calculator.wsdl"));
        jaxWsProxyFactoryBean.setServiceName("Calculator");
        jaxWsProxyFactoryBean.setNamespaceUri("http://tempuri.org/");
        //jaxWsProxyFactoryBean.setPortName("EntidadPort");
        return jaxWsProxyFactoryBean;
    }
}
