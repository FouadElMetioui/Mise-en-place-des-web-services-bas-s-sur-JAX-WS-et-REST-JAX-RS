package jaxWs.service;

import javax.xml.ws.Endpoint;

import jaxWs.dao.DatabaseOperations;

public class StationPublisher {

	
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:7779/service/hello",new StationWsImpl());
	
	}
 
}
