package client.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("correlation_ids")
	private List<String> correlationIds;

	@SerializedName("@type")
	private String type;

	@SerializedName("end_device_ids")
	private EndDeviceIds endDeviceIds;

	@SerializedName("received_at")
	private String receivedAt;

	@SerializedName("uplink_message")
	private UplinkMessage uplinkMessage;

	public List<String> getCorrelationIds(){
		return correlationIds;
	}

	public String getType(){
		return type;
	}

	public EndDeviceIds getEndDeviceIds(){
		return endDeviceIds;
	}

	public String getReceivedAt(){
		return receivedAt;
	}

	public UplinkMessage getUplinkMessage(){
		return uplinkMessage;
	}
}