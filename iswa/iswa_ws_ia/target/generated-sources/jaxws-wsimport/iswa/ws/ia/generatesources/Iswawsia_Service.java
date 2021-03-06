
package iswa.ws.ia.generatesources;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "iswawsia", targetNamespace = "http://code.source.ia.ws.iswa/", wsdlLocation = "http://localhost:8080/iswawsia/iswawsia?wsdl")
public class Iswawsia_Service
    extends Service
{

    private final static URL ISWAWSIA_WSDL_LOCATION;
    private final static WebServiceException ISWAWSIA_EXCEPTION;
    private final static QName ISWAWSIA_QNAME = new QName("http://code.source.ia.ws.iswa/", "iswawsia");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/iswawsia/iswawsia?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISWAWSIA_WSDL_LOCATION = url;
        ISWAWSIA_EXCEPTION = e;
    }

    public Iswawsia_Service() {
        super(__getWsdlLocation(), ISWAWSIA_QNAME);
    }

    public Iswawsia_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns Iswawsia
     */
    @WebEndpoint(name = "iswawsiaport")
    public Iswawsia getIswawsiaport() {
        return super.getPort(new QName("http://code.source.ia.ws.iswa/", "iswawsiaport"), Iswawsia.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Iswawsia
     */
    @WebEndpoint(name = "iswawsiaport")
    public Iswawsia getIswawsiaport(WebServiceFeature... features) {
        return super.getPort(new QName("http://code.source.ia.ws.iswa/", "iswawsiaport"), Iswawsia.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISWAWSIA_EXCEPTION!= null) {
            throw ISWAWSIA_EXCEPTION;
        }
        return ISWAWSIA_WSDL_LOCATION;
    }

}
