
package iswa.ws.ia.generatesources;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "iswawsia", targetNamespace = "http://iswa.ws.ia.source.code")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Iswawsia {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFicheEleve", targetNamespace = "http://iswa.ws.ia.source.code", className = "iswa.ws.ia.generatesources.GetFicheEleve")
    @ResponseWrapper(localName = "getFicheEleveResponse", targetNamespace = "http://iswa.ws.ia.source.code", className = "iswa.ws.ia.generatesources.GetFicheEleveResponse")
    public int getFicheEleve(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setFicheEleve", targetNamespace = "http://iswa.ws.ia.source.code", className = "iswa.ws.ia.generatesources.SetFicheEleve")
    @ResponseWrapper(localName = "setFicheEleveResponse", targetNamespace = "http://iswa.ws.ia.source.code", className = "iswa.ws.ia.generatesources.SetFicheEleveResponse")
    public void setFicheEleve(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addNewEleve", targetNamespace = "http://iswa.ws.ia.source.code", className = "iswa.ws.ia.generatesources.AddNewEleve")
    @ResponseWrapper(localName = "addNewEleveResponse", targetNamespace = "http://iswa.ws.ia.source.code", className = "iswa.ws.ia.generatesources.AddNewEleveResponse")
    public void addNewEleve(
        @WebParam(name = "arg0", targetNamespace = "")
        Eleve arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns iswa.ws.ia.generatesources.Eleve
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEleveDifficulty", targetNamespace = "http://iswa.ws.ia.source.code", className = "iswa.ws.ia.generatesources.GetEleveDifficulty")
    @ResponseWrapper(localName = "getEleveDifficultyResponse", targetNamespace = "http://iswa.ws.ia.source.code", className = "iswa.ws.ia.generatesources.GetEleveDifficultyResponse")
    public Eleve getEleveDifficulty(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
