//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 10:39:43 PM MSK 
//


package by.it.prigozhanov.jd02_09;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Model complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Model">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HP" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="FuelConsumption" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Seats" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Doors" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="LuggageCapacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Model", propOrder = {
    "name",
    "hp",
    "fuelConsumption",
    "seats",
    "doors",
    "luggageCapacity"
})
public class Model {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "HP", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger hp;
    @XmlElement(name = "FuelConsumption", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fuelConsumption;
    @XmlElement(name = "Seats", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger seats;
    @XmlElement(name = "Doors", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger doors;
    @XmlElement(name = "LuggageCapacity", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger luggageCapacity;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHP() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHP(BigInteger value) {
        this.hp = value;
    }

    /**
     * Gets the value of the fuelConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Sets the value of the fuelConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFuelConsumption(BigInteger value) {
        this.fuelConsumption = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeats(BigInteger value) {
        this.seats = value;
    }

    /**
     * Gets the value of the doors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoors() {
        return doors;
    }

    /**
     * Sets the value of the doors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoors(BigInteger value) {
        this.doors = value;
    }

    /**
     * Gets the value of the luggageCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLuggageCapacity() {
        return luggageCapacity;
    }

    /**
     * Sets the value of the luggageCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLuggageCapacity(BigInteger value) {
        this.luggageCapacity = value;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", fuelConsumption=" + fuelConsumption +
                ", seats=" + seats +
                ", doors=" + doors +
                ", luggageCapacity=" + luggageCapacity +
                '}';
    }
}
