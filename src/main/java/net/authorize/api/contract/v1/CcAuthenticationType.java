//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.03 at 05:32:06 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccAuthenticationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccAuthenticationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardholderAuthenticationValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccAuthenticationType", propOrder = {
    "authenticationIndicator",
    "cardholderAuthenticationValue"
})
public class CcAuthenticationType {

    @XmlElement(required = true)
    protected String authenticationIndicator;
    @XmlElement(required = true)
    protected String cardholderAuthenticationValue;

    /**
     * Gets the value of the authenticationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationIndicator() {
        return authenticationIndicator;
    }

    /**
     * Sets the value of the authenticationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationIndicator(String value) {
        this.authenticationIndicator = value;
    }

    /**
     * Gets the value of the cardholderAuthenticationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderAuthenticationValue() {
        return cardholderAuthenticationValue;
    }

    /**
     * Sets the value of the cardholderAuthenticationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderAuthenticationValue(String value) {
        this.cardholderAuthenticationValue = value;
    }

}
