//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.29 at 09:39:42 AM CEST 
//


package simplenlg.xmlrealiser.wrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvPhraseSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvPhraseSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://code.google.com/p/simplenlg/schemas/version1}PhraseElement">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://code.google.com/p/simplenlg/schemas/version1}adjAdvPhraseAtts"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvPhraseSpec")
public class AdvPhraseSpec
    extends PhraseElement
{

    @XmlAttribute(name = "IS_COMPARATIVE")
    protected Boolean iscomparative;
    @XmlAttribute(name = "IS_SUPERLATIVE")
    protected Boolean issuperlative;

    /**
     * Gets the value of the iscomparative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISCOMPARATIVE() {
        return iscomparative;
    }

    /**
     * Sets the value of the iscomparative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISCOMPARATIVE(Boolean value) {
        this.iscomparative = value;
    }

    /**
     * Gets the value of the issuperlative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISSUPERLATIVE() {
        return issuperlative;
    }

    /**
     * Sets the value of the issuperlative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISSUPERLATIVE(Boolean value) {
        this.issuperlative = value;
    }

}
