//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentTransactionInformation32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransactionInformation32">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxlStsId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="RslvdCase" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}Case2" minOccurs="0"/>
 *         &lt;element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="TxCxlSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}CancellationIndividualStatus1Code" minOccurs="0"/>
 *         &lt;element name="CxlStsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}CancellationStatusReasonInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrgnlInstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="OrgnlReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}ISODate" minOccurs="0"/>
 *         &lt;element name="OrgnlReqdColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}ISODate" minOccurs="0"/>
 *         &lt;element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}OriginalTransactionReference13" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransactionInformation32", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03", propOrder = {
    "cxlStsId",
    "rslvdCase",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "txCxlSts",
    "cxlStsRsnInves",
    "orgnlInstdAmt",
    "orgnlReqdExctnDt",
    "orgnlReqdColltnDt",
    "orgnlTxRef"
})
public class PaymentTransactionInformation32
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CxlStsId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected String cxlStsId;
    @XmlElement(name = "RslvdCase", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected Case2 rslvdCase;
    @XmlElement(name = "OrgnlInstrId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected String orgnlEndToEndId;
    @XmlElement(name = "TxCxlSts", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected CancellationIndividualStatus1Code txCxlSts;
    @XmlElement(name = "CxlStsRsnInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected List<CancellationStatusReasonInformation1> cxlStsRsnInves;
    @XmlElement(name = "OrgnlInstdAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected ActiveOrHistoricCurrencyAndAmount orgnlInstdAmt;
    @XmlElement(name = "OrgnlReqdExctnDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected XMLGregorianCalendar orgnlReqdExctnDt;
    @XmlElement(name = "OrgnlReqdColltnDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected XMLGregorianCalendar orgnlReqdColltnDt;
    @XmlElement(name = "OrgnlTxRef", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected OriginalTransactionReference13 orgnlTxRef;

    /**
     * Gets the value of the cxlStsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlStsId() {
        return cxlStsId;
    }

    /**
     * Sets the value of the cxlStsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlStsId(String value) {
        this.cxlStsId = value;
    }

    /**
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case2 }
     *     
     */
    public Case2 getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case2 }
     *     
     */
    public void setRslvdCase(Case2 value) {
        this.rslvdCase = value;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Gets the value of the txCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationIndividualStatus1Code }
     *     
     */
    public CancellationIndividualStatus1Code getTxCxlSts() {
        return txCxlSts;
    }

    /**
     * Sets the value of the txCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationIndividualStatus1Code }
     *     
     */
    public void setTxCxlSts(CancellationIndividualStatus1Code value) {
        this.txCxlSts = value;
    }

    /**
     * Gets the value of the cxlStsRsnInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlStsRsnInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlStsRsnInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationStatusReasonInformation1 }
     * 
     * 
     */
    public List<CancellationStatusReasonInformation1> getCxlStsRsnInves() {
        if (cxlStsRsnInves == null) {
            cxlStsRsnInves = new ArrayList<CancellationStatusReasonInformation1>();
        }
        return this.cxlStsRsnInves;
    }

    /**
     * Gets the value of the orgnlInstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOrgnlInstdAmt() {
        return orgnlInstdAmt;
    }

    /**
     * Sets the value of the orgnlInstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setOrgnlInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlInstdAmt = value;
    }

    /**
     * Gets the value of the orgnlReqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlReqdExctnDt() {
        return orgnlReqdExctnDt;
    }

    /**
     * Sets the value of the orgnlReqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlReqdExctnDt(XMLGregorianCalendar value) {
        this.orgnlReqdExctnDt = value;
    }

    /**
     * Gets the value of the orgnlReqdColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlReqdColltnDt() {
        return orgnlReqdColltnDt;
    }

    /**
     * Sets the value of the orgnlReqdColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlReqdColltnDt(XMLGregorianCalendar value) {
        this.orgnlReqdColltnDt = value;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference13 }
     *     
     */
    public OriginalTransactionReference13 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference13 }
     *     
     */
    public void setOrgnlTxRef(OriginalTransactionReference13 value) {
        this.orgnlTxRef = value;
    }

}
