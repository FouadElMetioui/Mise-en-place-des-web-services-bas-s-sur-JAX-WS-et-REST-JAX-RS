package jaxWs.service;

public class StationWsProxy implements jaxWs.service.StationWs {
  private String _endpoint = null;
  private jaxWs.service.StationWs stationWs = null;
  
  public StationWsProxy() {
    _initStationWsProxy();
  }
  
  public StationWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initStationWsProxy();
  }
  
  private void _initStationWsProxy() {
    try {
      stationWs = (new jaxWs.service.StationWsImplServiceLocator()).getStationWsImplPort();
      if (stationWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stationWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stationWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stationWs != null)
      ((javax.xml.rpc.Stub)stationWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public jaxWs.service.StationWs getStationWs() {
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs;
  }
  
  public java.lang.Object[] getAllStations() throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.getAllStations();
  }
  
  public void deleteStation(jaxWs.service.Station arg0) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    stationWs.deleteStation(arg0);
  }
  
  public jaxWs.service.Carburant findCarburant(int arg0) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.findCarburant(arg0);
  }
  
  public jaxWs.service.Carburant creerCarburant(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.creerCarburant(arg0, arg1);
  }
  
  public jaxWs.service.Station creerStation(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.creerStation(arg0, arg1);
  }
  
  public jaxWs.service.Station findStation(int arg0) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.findStation(arg0);
  }
  
  public java.lang.String updateStation(jaxWs.service.Station arg0) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.updateStation(arg0);
  }
  
  public java.lang.String updateCarburant(jaxWs.service.Carburant arg0) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.updateCarburant(arg0);
  }
  
  public jaxWs.service.HistoCarb findHistoCarb(int arg0) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.findHistoCarb(arg0);
  }
  
  public jaxWs.service.HistoCarb creerHistoCarb(java.util.Calendar arg0, float arg1, jaxWs.service.Station arg2, jaxWs.service.Carburant arg3) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.creerHistoCarb(arg0, arg1, arg2, arg3);
  }
  
  public void deleteCarburant(jaxWs.service.Carburant arg0) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    stationWs.deleteCarburant(arg0);
  }
  
  public void deleteHistoCarb(jaxWs.service.HistoCarb arg0) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    stationWs.deleteHistoCarb(arg0);
  }
  
  public java.lang.Object[] getAllHistoCarbs() throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.getAllHistoCarbs();
  }
  
  public java.lang.String updateHistoCarb(jaxWs.service.HistoCarb arg0) throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.updateHistoCarb(arg0);
  }
  
  public java.lang.Object[] getAllCarburants() throws java.rmi.RemoteException{
    if (stationWs == null)
      _initStationWsProxy();
    return stationWs.getAllCarburants();
  }
  
  
}