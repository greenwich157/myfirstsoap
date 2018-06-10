package com.myfirstsoap.activate;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2018-06-10T19:28:21.441+08:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "ActivationService", 
                  wsdlLocation = "file:/Users/louislai/Documents/workspace-sts-3.9.3.RELEASE/MyFirstSoap/src/main/resources/wsdl/ActivationService.wsdl",
                  targetNamespace = "http://myfirstsoap.com/activate/") 
public class ActivationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://myfirstsoap.com/activate/", "ActivationService");
    public final static QName ActivationSOAP = new QName("http://myfirstsoap.com/activate/", "ActivationSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/louislai/Documents/workspace-sts-3.9.3.RELEASE/MyFirstSoap/src/main/resources/wsdl/ActivationService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ActivationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/louislai/Documents/workspace-sts-3.9.3.RELEASE/MyFirstSoap/src/main/resources/wsdl/ActivationService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ActivationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ActivationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ActivationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ActivationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ActivationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ActivationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Activation
     */
    @WebEndpoint(name = "ActivationSOAP")
    public Activation getActivationSOAP() {
        return super.getPort(ActivationSOAP, Activation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Activation
     */
    @WebEndpoint(name = "ActivationSOAP")
    public Activation getActivationSOAP(WebServiceFeature... features) {
        return super.getPort(ActivationSOAP, Activation.class, features);
    }

}