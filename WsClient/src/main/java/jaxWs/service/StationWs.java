/**
 * StationWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxWs.service;

public interface StationWs extends java.rmi.Remote {
    public java.lang.Object[] getAllStations() throws java.rmi.RemoteException;
    public void deleteStation(jaxWs.service.Station arg0) throws java.rmi.RemoteException;
    public jaxWs.service.Carburant findCarburant(int arg0) throws java.rmi.RemoteException;
    public jaxWs.service.Carburant creerCarburant(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public jaxWs.service.Station creerStation(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public jaxWs.service.Station findStation(int arg0) throws java.rmi.RemoteException;
    public java.lang.String updateStation(jaxWs.service.Station arg0) throws java.rmi.RemoteException;
    public java.lang.String updateCarburant(jaxWs.service.Carburant arg0) throws java.rmi.RemoteException;
    public jaxWs.service.HistoCarb findHistoCarb(int arg0) throws java.rmi.RemoteException;
    public jaxWs.service.HistoCarb creerHistoCarb(java.util.Calendar arg0, float arg1, jaxWs.service.Station arg2, jaxWs.service.Carburant arg3) throws java.rmi.RemoteException;
    public void deleteCarburant(jaxWs.service.Carburant arg0) throws java.rmi.RemoteException;
    public void deleteHistoCarb(jaxWs.service.HistoCarb arg0) throws java.rmi.RemoteException;
    public java.lang.Object[] getAllHistoCarbs() throws java.rmi.RemoteException;
    public java.lang.String updateHistoCarb(jaxWs.service.HistoCarb arg0) throws java.rmi.RemoteException;
    public java.lang.Object[] getAllCarburants() throws java.rmi.RemoteException;
}
