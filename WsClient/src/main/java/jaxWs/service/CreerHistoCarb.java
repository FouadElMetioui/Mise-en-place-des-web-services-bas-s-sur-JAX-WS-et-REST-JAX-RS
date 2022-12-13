/**
 * CreerHistoCarb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxWs.service;

public class CreerHistoCarb  implements java.io.Serializable {
    private java.util.Calendar arg0;

    private float arg1;

    private jaxWs.service.Station arg2;

    private jaxWs.service.Carburant arg3;

    public CreerHistoCarb() {
    }

    public CreerHistoCarb(
           java.util.Calendar arg0,
           float arg1,
           jaxWs.service.Station arg2,
           jaxWs.service.Carburant arg3) {
           this.arg0 = arg0;
           this.arg1 = arg1;
           this.arg2 = arg2;
           this.arg3 = arg3;
    }


    /**
     * Gets the arg0 value for this CreerHistoCarb.
     * 
     * @return arg0
     */
    public java.util.Calendar getArg0() {
        return arg0;
    }


    /**
     * Sets the arg0 value for this CreerHistoCarb.
     * 
     * @param arg0
     */
    public void setArg0(java.util.Calendar arg0) {
        this.arg0 = arg0;
    }


    /**
     * Gets the arg1 value for this CreerHistoCarb.
     * 
     * @return arg1
     */
    public float getArg1() {
        return arg1;
    }


    /**
     * Sets the arg1 value for this CreerHistoCarb.
     * 
     * @param arg1
     */
    public void setArg1(float arg1) {
        this.arg1 = arg1;
    }


    /**
     * Gets the arg2 value for this CreerHistoCarb.
     * 
     * @return arg2
     */
    public jaxWs.service.Station getArg2() {
        return arg2;
    }


    /**
     * Sets the arg2 value for this CreerHistoCarb.
     * 
     * @param arg2
     */
    public void setArg2(jaxWs.service.Station arg2) {
        this.arg2 = arg2;
    }


    /**
     * Gets the arg3 value for this CreerHistoCarb.
     * 
     * @return arg3
     */
    public jaxWs.service.Carburant getArg3() {
        return arg3;
    }


    /**
     * Sets the arg3 value for this CreerHistoCarb.
     * 
     * @param arg3
     */
    public void setArg3(jaxWs.service.Carburant arg3) {
        this.arg3 = arg3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreerHistoCarb)) return false;
        CreerHistoCarb other = (CreerHistoCarb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arg0==null && other.getArg0()==null) || 
             (this.arg0!=null &&
              this.arg0.equals(other.getArg0()))) &&
            this.arg1 == other.getArg1() &&
            ((this.arg2==null && other.getArg2()==null) || 
             (this.arg2!=null &&
              this.arg2.equals(other.getArg2()))) &&
            ((this.arg3==null && other.getArg3()==null) || 
             (this.arg3!=null &&
              this.arg3.equals(other.getArg3())));
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
        if (getArg0() != null) {
            _hashCode += getArg0().hashCode();
        }
        _hashCode += new Float(getArg1()).hashCode();
        if (getArg2() != null) {
            _hashCode += getArg2().hashCode();
        }
        if (getArg3() != null) {
            _hashCode += getArg3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreerHistoCarb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.jaxWs/", "creerHistoCarb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg0");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.jaxWs/", "station"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.jaxWs/", "carburant"));
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
