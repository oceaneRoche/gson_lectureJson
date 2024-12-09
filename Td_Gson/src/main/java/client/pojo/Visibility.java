package client.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Visibility{

	@SerializedName("rights")
	private List<String> rights;

	public List<String> getRights(){
		return rights;
	}
}