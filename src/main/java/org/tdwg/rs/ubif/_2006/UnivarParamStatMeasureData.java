//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:21:36 AM MST 
//


package org.tdwg.rs.ubif._2006;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A univariate statistical measure (with 1 parameter) plus a numeric value
 * 
 * <p>Java class for UnivarParamStatMeasureData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnivarParamStatMeasureData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rs.tdwg.org/UBIF/2006/}UnivarParamStatMeasure">
 *       &lt;attribute name="par" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="significant" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnivarParamStatMeasureData")
@XmlSeeAlso({
    PMeasureMarkup.class
})
public class UnivarParamStatMeasureData
    extends UnivarParamStatMeasure
{

    @XmlAttribute(name = "par", required = true)
    protected double par;
    @XmlAttribute(name = "value", required = true)
    protected double value;
    @XmlAttribute(name = "significant")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger significant;

    /**
     * Gets the value of the par property.
     * 
     */
    public double getPar() {
        return par;
    }

    /**
     * Sets the value of the par property.
     * 
     */
    public void setPar(double value) {
        this.par = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the significant property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSignificant() {
        return significant;
    }

    /**
     * Sets the value of the significant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSignificant(BigInteger value) {
        this.significant = value;
    }

}
