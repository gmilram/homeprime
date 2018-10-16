package homeprime.items.contact.config.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

import homeprime.core.logger.IoTLogger;

/**
 * Types of contact connection status.
 * 
 * @author Milan Ramljak
 * 
 */
public enum ContactConnectionType {

	/**
	 * Defines contact which is physically connected to thing.
	 */
	Connected,
	/**
	 * Defines a contact which is not physically connected to thing
	 */
	NotConnected,
	/**
	 * A placeholder for cases where contact type is not valid.
	 */
	Unknown;

	@JsonCreator
	public static ContactConnectionType fromString(String cotactConnectionType) {
		try {
			return valueOf(cotactConnectionType);
		} catch (Exception e) {
			IoTLogger.getInstance()
					.error("Contact status type: " + cotactConnectionType + " is not supported, returning Unknown");
		}
		return ContactConnectionType.Unknown;
	}

}
