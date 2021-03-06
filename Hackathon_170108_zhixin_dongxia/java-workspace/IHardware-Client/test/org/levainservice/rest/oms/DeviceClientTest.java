package org.levainservice.rest.oms;

import org.junit.Test;
import org.levainservice.rest.Response;
import org.levainservice.service.oms.model.Device;

import com.google.gson.Gson;

public class DeviceClientTest {
	DeviceClient client = new DeviceClient();
	
	@Test
	public void testInsert() {
		Device d = new Device();
		d.setUserId(148350178692771369L);
		d.setDeviceSerialNo("OMS-0005");
		d.setDevicePos("湖南电信-rest-3309");
		
		Response r = client.insert(d);
		System.out.println(new Gson().toJson(r));
	}

	@Test
	public void testListDevices() {
		Response r = client.listDevices(1);
		System.out.println(new Gson().toJson(r));
	}

}
