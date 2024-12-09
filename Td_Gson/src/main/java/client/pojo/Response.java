package client.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("correlation_ids")
	private List<String> correlationIds;

	@SerializedName("unique_id")
	private String uniqueId;

	@SerializedName("data")
	private Data data;

	@SerializedName("visibility")
	private Visibility visibility;

	@SerializedName("identifiers")
	private List<IdentifiersItem> identifiers;

	@SerializedName("origin")
	private String origin;

	@SerializedName("name")
	private String name;

	@SerializedName("context")
	private Context context;

	@SerializedName("time")
	private String time;

	public List<String> getCorrelationIds(){
		return correlationIds;
	}

	public String getUniqueId(){
		return uniqueId;
	}

	public Data getData(){
		return data;
	}

	public Visibility getVisibility(){
		return visibility;
	}

	public List<IdentifiersItem> getIdentifiers(){
		return identifiers;
	}

	public String getOrigin(){
		return origin;
	}

	public String getName(){
		return name;
	}

	public Context getContext(){
		return context;
	}

	public String getTime(){
		return time;
	}
}