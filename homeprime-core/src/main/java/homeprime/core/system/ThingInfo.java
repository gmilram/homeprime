package homeprime.core.system;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import homeprime.core.properties.ThingProperties;

/**
 * Handles response of Thing root rest url i.e. <ip>:<port>/
 * 
 * @author Milan Ramljak
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "version", "uuid" })
public class ThingInfo {

	@JsonProperty("version")
	private String version;
	@JsonProperty("uuid")
	private String uuid;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * @return version of Thing service
	 */
	@JsonProperty("version")
	public String getVersion() {
		return ThingProperties.getInstance().getThingVersion();
	}

	/**
	 * @param version The version
	 */
	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return UUID assigned to this thing
	 */
	@JsonProperty("uuid")
	public String getUUID() {
		return ThingProperties.getInstance().getUUID();
	}

	/**
	 * @param uuid The uuid
	 */
	@JsonProperty("uuid")
	public void setUuid(String uuid) {
		this.uuid = uuid;
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