package jaxWs.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import jaxWs.service.StationWs;
import jaxWs.service.StationWsImpl;

public class StationClient {

	public static void main(String[] args) {
	

		   
		URL url = new URL("http://localhost:7779/service/hello?wsdl");
		
	        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
	        QName qname = new QName("http://ws.mkyong.com/", "StationWsImplService");

	        Service service = Service.create(url, qname);
	        StationWs ws = service.getPort(StationWs.class);
	        ws.creerCarburant("carb", "descr");
	}

}
