
package iswawsia_package;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iswawsia_package package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFicheEleveResponse_QNAME = new QName("http://iswa.ws.ia.source.code", "getFicheEleveResponse");
    private final static QName _SetFicheEleveResponse_QNAME = new QName("http://iswa.ws.ia.source.code", "setFicheEleveResponse");
    private final static QName _AddNewEleve_QNAME = new QName("http://iswa.ws.ia.source.code", "addNewEleve");
    private final static QName _GetEleveDifficulty_QNAME = new QName("http://iswa.ws.ia.source.code", "getEleveDifficulty");
    private final static QName _GetEleveDifficultyResponse_QNAME = new QName("http://iswa.ws.ia.source.code", "getEleveDifficultyResponse");
    private final static QName _GetFicheEleve_QNAME = new QName("http://iswa.ws.ia.source.code", "getFicheEleve");
    private final static QName _SetFicheEleve_QNAME = new QName("http://iswa.ws.ia.source.code", "setFicheEleve");
    private final static QName _AddNewEleveResponse_QNAME = new QName("http://iswa.ws.ia.source.code", "addNewEleveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iswawsia_package
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetFicheEleveResponse }
     * 
     */
    public SetFicheEleveResponse createSetFicheEleveResponse() {
        return new SetFicheEleveResponse();
    }

    /**
     * Create an instance of {@link SetFicheEleve }
     * 
     */
    public SetFicheEleve createSetFicheEleve() {
        return new SetFicheEleve();
    }

    /**
     * Create an instance of {@link GetFicheEleve }
     * 
     */
    public GetFicheEleve createGetFicheEleve() {
        return new GetFicheEleve();
    }

    /**
     * Create an instance of {@link GetEleveDifficultyResponse }
     * 
     */
    public GetEleveDifficultyResponse createGetEleveDifficultyResponse() {
        return new GetEleveDifficultyResponse();
    }

    /**
     * Create an instance of {@link GetFicheEleveResponse }
     * 
     */
    public GetFicheEleveResponse createGetFicheEleveResponse() {
        return new GetFicheEleveResponse();
    }

    /**
     * Create an instance of {@link GetEleveDifficulty }
     * 
     */
    public GetEleveDifficulty createGetEleveDifficulty() {
        return new GetEleveDifficulty();
    }

    /**
     * Create an instance of {@link AddNewEleveResponse }
     * 
     */
    public AddNewEleveResponse createAddNewEleveResponse() {
        return new AddNewEleveResponse();
    }

    /**
     * Create an instance of {@link Eleve }
     * 
     */
    public Eleve createEleve() {
        return new Eleve();
    }

    /**
     * Create an instance of {@link AddNewEleve }
     * 
     */
    public AddNewEleve createAddNewEleve() {
        return new AddNewEleve();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFicheEleveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iswa.ws.ia.source.code", name = "getFicheEleveResponse")
    public JAXBElement<GetFicheEleveResponse> createGetFicheEleveResponse(GetFicheEleveResponse value) {
        return new JAXBElement<GetFicheEleveResponse>(_GetFicheEleveResponse_QNAME, GetFicheEleveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFicheEleveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iswa.ws.ia.source.code", name = "setFicheEleveResponse")
    public JAXBElement<SetFicheEleveResponse> createSetFicheEleveResponse(SetFicheEleveResponse value) {
        return new JAXBElement<SetFicheEleveResponse>(_SetFicheEleveResponse_QNAME, SetFicheEleveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewEleve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iswa.ws.ia.source.code", name = "addNewEleve")
    public JAXBElement<AddNewEleve> createAddNewEleve(AddNewEleve value) {
        return new JAXBElement<AddNewEleve>(_AddNewEleve_QNAME, AddNewEleve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEleveDifficulty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iswa.ws.ia.source.code", name = "getEleveDifficulty")
    public JAXBElement<GetEleveDifficulty> createGetEleveDifficulty(GetEleveDifficulty value) {
        return new JAXBElement<GetEleveDifficulty>(_GetEleveDifficulty_QNAME, GetEleveDifficulty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEleveDifficultyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iswa.ws.ia.source.code", name = "getEleveDifficultyResponse")
    public JAXBElement<GetEleveDifficultyResponse> createGetEleveDifficultyResponse(GetEleveDifficultyResponse value) {
        return new JAXBElement<GetEleveDifficultyResponse>(_GetEleveDifficultyResponse_QNAME, GetEleveDifficultyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFicheEleve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iswa.ws.ia.source.code", name = "getFicheEleve")
    public JAXBElement<GetFicheEleve> createGetFicheEleve(GetFicheEleve value) {
        return new JAXBElement<GetFicheEleve>(_GetFicheEleve_QNAME, GetFicheEleve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFicheEleve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iswa.ws.ia.source.code", name = "setFicheEleve")
    public JAXBElement<SetFicheEleve> createSetFicheEleve(SetFicheEleve value) {
        return new JAXBElement<SetFicheEleve>(_SetFicheEleve_QNAME, SetFicheEleve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewEleveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iswa.ws.ia.source.code", name = "addNewEleveResponse")
    public JAXBElement<AddNewEleveResponse> createAddNewEleveResponse(AddNewEleveResponse value) {
        return new JAXBElement<AddNewEleveResponse>(_AddNewEleveResponse_QNAME, AddNewEleveResponse.class, null, value);
    }

}
