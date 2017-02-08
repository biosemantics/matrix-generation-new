//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.18 at 10:21:36 AM MST 
//


package org.tdwg.rs.ubif._2006;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Expressing taxon rank as code (enumerated vocabulary), simple free-form text (perhaps interpreted), or verbatim (uninterpreted original version). At least one attribute should be present; this can not be validated by the schema (external validation).
 * 
 * <p>Java class for TaxonomicRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxonomicRank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rs.tdwg.org/UBIF/2006/}AbstractStringOrCode">
 *       &lt;attribute name="code" type="{http://rs.tdwg.org/UBIF/2006/}TaxonomicRankEnum" default="any_rank" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxonomicRank")
public class TaxonomicRank
    extends AbstractStringOrCode
{


}
