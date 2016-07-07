//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.27 at 07:14:33 PM PDT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Uniformed Services Person  or Military Services Person - This class represents information about a person while in the role of a member of the United States Uniformed Services, which includes military and Public Health Service members.
 * 
 * <p>Java class for USUniformedServicesPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USUniformedServicesPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="militarybranch" type="{http://www.mycompany.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="militaryrank" type="{http://www.mycompany.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="militarystatus" type="{http://www.mycompany.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="militarygrade" type="{http://www.mycompany.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.mycompany.com}TimeInterval" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USUniformedServicesPerson", propOrder = {
    "militarybranch",
    "militaryrank",
    "militarystatus",
    "militarygrade",
    "effectivedaterange"
})
@XmlRootElement(name = "USUniformedServicesPerson")
public class USUniformedServicesPerson
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code militarybranch;
    protected Code militaryrank;
    protected Code militarystatus;
    protected Code militarygrade;
    protected TimeInterval effectivedaterange;

    /**
     * Gets the value of the militarybranch property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMilitarybranch() {
        return militarybranch;
    }

    /**
     * Sets the value of the militarybranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMilitarybranch(Code value) {
        this.militarybranch = value;
    }

    /**
     * Gets the value of the militaryrank property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMilitaryrank() {
        return militaryrank;
    }

    /**
     * Sets the value of the militaryrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMilitaryrank(Code value) {
        this.militaryrank = value;
    }

    /**
     * Gets the value of the militarystatus property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMilitarystatus() {
        return militarystatus;
    }

    /**
     * Sets the value of the militarystatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMilitarystatus(Code value) {
        this.militarystatus = value;
    }

    /**
     * Gets the value of the militarygrade property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMilitarygrade() {
        return militarygrade;
    }

    /**
     * Sets the value of the militarygrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMilitarygrade(Code value) {
        this.militarygrade = value;
    }

    /**
     * Gets the value of the effectivedaterange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getEffectivedaterange() {
        return effectivedaterange;
    }

    /**
     * Sets the value of the effectivedaterange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setEffectivedaterange(TimeInterval value) {
        this.effectivedaterange = value;
    }

}