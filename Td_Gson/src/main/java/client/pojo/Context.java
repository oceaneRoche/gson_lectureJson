package client.pojo;

import com.google.gson.annotations.SerializedName;

public class Context{

	@SerializedName("tenant-id")
	private String tenantId;

	public String getTenantId(){
		return tenantId;
	}
}