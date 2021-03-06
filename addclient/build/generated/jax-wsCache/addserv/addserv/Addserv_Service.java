
package addserv;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "addserv", targetNamespace = "http://addserv/", wsdlLocation = "http://localhost:8080/addserv/addserv?wsdl")
public class Addserv_Service
    extends Service
{

    private final static URL ADDSERV_WSDL_LOCATION;
    private final static WebServiceException ADDSERV_EXCEPTION;
    private final static QName ADDSERV_QNAME = new QName("http://addserv/", "addserv");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/addserv/addserv?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDSERV_WSDL_LOCATION = url;
        ADDSERV_EXCEPTION = e;
    }

    public Addserv_Service() {
        super(__getWsdlLocation(), ADDSERV_QNAME);
    }

    public Addserv_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDSERV_QNAME, features);
    }

    public Addserv_Service(URL wsdlLocation) {
        super(wsdlLocation, ADDSERV_QNAME);
    }

    public Addserv_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDSERV_QNAME, features);
    }

    public Addserv_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Addserv_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Addserv
     */
    @WebEndpoint(name = "addservPort")
    public Addserv getAddservPort() {
        return super.getPort(new QName("http://addserv/", "addservPort"), Addserv.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Addserv
     */
    @WebEndpoint(name = "addservPort")
    public Addserv getAddservPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://addserv/", "addservPort"), Addserv.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDSERV_EXCEPTION!= null) {
            throw ADDSERV_EXCEPTION;
        }
        return ADDSERV_WSDL_LOCATION;
    }

}
