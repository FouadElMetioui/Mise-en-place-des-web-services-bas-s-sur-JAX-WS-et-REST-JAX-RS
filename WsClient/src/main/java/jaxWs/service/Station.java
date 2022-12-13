/**
 * Station.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxWs.service;

public class Station  implements java.io.Serializable {
    private java.lang.String adress;

    private int codeSta;

    private java.lang.String nom;

    public Station() {
    }

    public Station(
           java.lang.String adress,
           java.lang.String nom) {
           this.adress = adress;
           this.codeSta = codeSta;
           this.nom = nom;
    }


    /**
     * Gets the adress value for this Station.
     * 
     * @return adress
     */
    public java.lang.String getAdress() {
        return adress;
    }


    /**
     * Sets the adress value for this Station.
     * 
     * @param adress
     */
    public void setAdress(java.lang.String adress) {
        this.adress = adress;
    }


    /**
     * Gets the codeSta value for this Station.
     * 
     * @return codeSta
     */
    public int getCodeSta() {
        return codeSta;
    }


    /**
     * Sets the codeSta value for this Station.
     * 
     * @param codeSta
     */
    public void setCodeSta(int codeSta) {
        this.codeSta = codeSta;
    }


    /**
     * Gets the nom value for this Station.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Station.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Station)) return false;
        Station other = (Station) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adress==null && other.getAdress()==null) || 
             (this.adress!=null &&
              this.adress.equals(other.getAdress()))) &&
            this.codeSta == other.getCodeSta() &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdress() != null) {
            _hashCode += getAdress().hashCode();
        }
        _hashCode += getCodeSta();
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Station.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.jaxWs/", "station"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeSta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codeSta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
