package client.pojo;

import com.google.gson.annotations.SerializedName;

public class IdentifiersItem{

	@SerializedName("device_ids")
	private DeviceIds deviceIds;

	public DeviceIds getDeviceIds(){
		return deviceIds;
	}
}