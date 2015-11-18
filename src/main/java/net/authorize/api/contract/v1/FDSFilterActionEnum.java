//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.18 at 01:35:18 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FDSFilterActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FDSFilterActionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reject"/>
 *     &lt;enumeration value="decline"/>
 *     &lt;enumeration value="hold"/>
 *     &lt;enumeration value="authAndHold"/>
 *     &lt;enumeration value="report"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FDSFilterActionEnum")
@XmlEnum
public enum FDSFilterActionEnum {

    @XmlEnumValue("reject")
    REJECT("reject"),
    @XmlEnumValue("decline")
    DECLINE("decline"),
    @XmlEnumValue("hold")
    HOLD("hold"),
    @XmlEnumValue("authAndHold")
    AUTH_AND_HOLD("authAndHold"),
    @XmlEnumValue("report")
    REPORT("report");
    private final String value;

    FDSFilterActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FDSFilterActionEnum fromValue(String v) {
        for (FDSFilterActionEnum c: FDSFilterActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
