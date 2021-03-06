//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CorrectivePaymentInitiation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectivePaymentInitiation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}CorrectiveGroupInformation1" minOccurs="0"/>
 *         &lt;element name="PmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="EndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}ActiveOrHistoricCurrencyAndAmount"/>
 *         &lt;element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}ISODate" minOccurs="0"/>
 *         &lt;element name="ReqdColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}ISODate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectivePaymentInitiation1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03", propOrder = {
    "grpHdr",
    "pmtInfId",
    "instrId",
    "endToEndId",
    "instdAmt",
    "reqdExctnDt",
    "reqdColltnDt"
})
public class CorrectivePaymentInitiation1
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GrpHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected CorrectiveGroupInformation1 grpHdr;
    @XmlElement(name = "PmtInfId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected String pmtInfId;
    @XmlElement(name = "InstrId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected String instrId;
    @XmlElement(name = "EndToEndId", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected String endToEndId;
    @XmlElement(name = "InstdAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03", required = true)
    protected ActiveOrHistoricCurrencyAndAmount instdAmt;
    @XmlElement(name = "ReqdExctnDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "ReqdColltnDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected XMLGregorianCalendar reqdColltnDt;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveGroupInformation1 }
     *     
     */
    public CorrectiveGroupInformation1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveGroupInformation1 }
     *     
     */
    public void setGrpHdr(CorrectiveGroupInformation1 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the pmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInfId() {
        return pmtInfId;
    }

    /**
     * Sets the value of the pmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInfId(String value) {
        this.pmtInfId = value;
    }

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.instdAmt = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the reqdColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdColltnDt() {
        return reqdColltnDt;
    }

    /**
     * Sets the value of the reqdColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdColltnDt(XMLGregorianCalendar value) {
        this.reqdColltnDt = value;
    }

}
