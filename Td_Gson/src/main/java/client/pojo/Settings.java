package client.pojo;

import com.google.gson.annotations.SerializedName;

public class Settings{

	@SerializedName("data_rate")
	private DataRate dataRate;

	@SerializedName("time")
	private String time;

	@SerializedName("frequency")
	private String frequency;

	@SerializedName("timestamp")
	private int timestamp;

	public DataRate getDataRate(){
		return dataRate;
	}

	public String getTime(){
		return time;
	}

	public String getFrequency(){
		return frequency;
	}

	public int getTimestamp(){
		return timestamp;
	}
}