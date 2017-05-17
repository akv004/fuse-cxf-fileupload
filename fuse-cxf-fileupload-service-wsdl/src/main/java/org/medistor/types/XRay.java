
package org.medistor.types;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xRayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xRayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imageData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xRayType", propOrder = {
    "patientName",
    "patientNumber",
    "imageData"
})
@XmlRootElement(name = "xRay")
public class XRay
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String patientName;
    protected int patientNumber;
    @XmlElement(required = true)
    protected byte[] imageData;

    /**
     * Gets the value of the patientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * Sets the value of the patientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientName(String value) {
        this.patientName = value;
    }

    /**
     * Gets the value of the patientNumber property.
     * 
     */
    public int getPatientNumber() {
        return patientNumber;
    }

    /**
     * Sets the value of the patientNumber property.
     * 
     */
    public void setPatientNumber(int value) {
        this.patientNumber = value;
    }

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageData(byte[] value) {
        this.imageData = ((byte[]) value);
    }

}
