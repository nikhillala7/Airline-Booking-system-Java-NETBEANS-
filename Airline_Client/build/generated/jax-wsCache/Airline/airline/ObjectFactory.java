
package airline;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the airline package. 
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

    private final static QName _AvailableTicket_QNAME = new QName("http://Airline/", "available_ticket");
    private final static QName _CancelTicketResponse_QNAME = new QName("http://Airline/", "cancel_ticketResponse");
    private final static QName _BookTicketResponse_QNAME = new QName("http://Airline/", "book_ticketResponse");
    private final static QName _CancelTicket_QNAME = new QName("http://Airline/", "cancel_ticket");
    private final static QName _CustomerHistoryResponse_QNAME = new QName("http://Airline/", "customer_historyResponse");
    private final static QName _AvailableTicketResponse_QNAME = new QName("http://Airline/", "available_ticketResponse");
    private final static QName _CustomerHistory_QNAME = new QName("http://Airline/", "customer_history");
    private final static QName _Hello_QNAME = new QName("http://Airline/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://Airline/", "helloResponse");
    private final static QName _BookTicket_QNAME = new QName("http://Airline/", "book_ticket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: airline
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CustomerHistory }
     * 
     */
    public CustomerHistory createCustomerHistory() {
        return new CustomerHistory();
    }

    /**
     * Create an instance of {@link AvailableTicketResponse }
     * 
     */
    public AvailableTicketResponse createAvailableTicketResponse() {
        return new AvailableTicketResponse();
    }

    /**
     * Create an instance of {@link BookTicket }
     * 
     */
    public BookTicket createBookTicket() {
        return new BookTicket();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CancelTicketResponse }
     * 
     */
    public CancelTicketResponse createCancelTicketResponse() {
        return new CancelTicketResponse();
    }

    /**
     * Create an instance of {@link AvailableTicket }
     * 
     */
    public AvailableTicket createAvailableTicket() {
        return new AvailableTicket();
    }

    /**
     * Create an instance of {@link CustomerHistoryResponse }
     * 
     */
    public CustomerHistoryResponse createCustomerHistoryResponse() {
        return new CustomerHistoryResponse();
    }

    /**
     * Create an instance of {@link CancelTicket }
     * 
     */
    public CancelTicket createCancelTicket() {
        return new CancelTicket();
    }

    /**
     * Create an instance of {@link BookTicketResponse }
     * 
     */
    public BookTicketResponse createBookTicketResponse() {
        return new BookTicketResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "available_ticket")
    public JAXBElement<AvailableTicket> createAvailableTicket(AvailableTicket value) {
        return new JAXBElement<AvailableTicket>(_AvailableTicket_QNAME, AvailableTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "cancel_ticketResponse")
    public JAXBElement<CancelTicketResponse> createCancelTicketResponse(CancelTicketResponse value) {
        return new JAXBElement<CancelTicketResponse>(_CancelTicketResponse_QNAME, CancelTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "book_ticketResponse")
    public JAXBElement<BookTicketResponse> createBookTicketResponse(BookTicketResponse value) {
        return new JAXBElement<BookTicketResponse>(_BookTicketResponse_QNAME, BookTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "cancel_ticket")
    public JAXBElement<CancelTicket> createCancelTicket(CancelTicket value) {
        return new JAXBElement<CancelTicket>(_CancelTicket_QNAME, CancelTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "customer_historyResponse")
    public JAXBElement<CustomerHistoryResponse> createCustomerHistoryResponse(CustomerHistoryResponse value) {
        return new JAXBElement<CustomerHistoryResponse>(_CustomerHistoryResponse_QNAME, CustomerHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "available_ticketResponse")
    public JAXBElement<AvailableTicketResponse> createAvailableTicketResponse(AvailableTicketResponse value) {
        return new JAXBElement<AvailableTicketResponse>(_AvailableTicketResponse_QNAME, AvailableTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "customer_history")
    public JAXBElement<CustomerHistory> createCustomerHistory(CustomerHistory value) {
        return new JAXBElement<CustomerHistory>(_CustomerHistory_QNAME, CustomerHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airline/", name = "book_ticket")
    public JAXBElement<BookTicket> createBookTicket(BookTicket value) {
        return new JAXBElement<BookTicket>(_BookTicket_QNAME, BookTicket.class, null, value);
    }

}
