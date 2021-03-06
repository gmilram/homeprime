package homeprime.items.temperature.config.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "temperatureSensors" })
public class TemperatureSensors {

	@JsonProperty("temperatureSensors")
	private List<TemperatureSensor> temperatureSensors = new ArrayList<TemperatureSensor>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The temperatureSensors
	 */
	@JsonProperty("temperatureSensors")
	public List<TemperatureSensor> getTemperatureSensors() {
		return temperatureSensors;
	}

	/**
	 * 
	 * @param temperatureSensors The temperatureSensors
	 */
	@JsonProperty("temperatureSensors")
	public void setTemperatureSensors(List<TemperatureSensor> temperatureSensors) {
		this.temperatureSensors = temperatureSensors;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}