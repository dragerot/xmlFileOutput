//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCancellationRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCancellationRejection1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEGL"/>
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="CUST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentCancellationRejection1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
@XmlEnum
public enum PaymentCancellationRejection1Code {

    LEGL,
    AGNT,
    CUST;

    public String value() {
        return name();
    }

    public static PaymentCancellationRejection1Code fromValue(String v) {
        return valueOf(v);
    }

}