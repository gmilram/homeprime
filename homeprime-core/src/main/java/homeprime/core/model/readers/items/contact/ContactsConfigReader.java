package homeprime.core.model.readers.items.contact;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import homeprime.core.exception.ThingException;
import homeprime.core.logger.IoTLogger;
import homeprime.core.properties.ThingProperties;
import homeprime.core.utils.ThingUtils;
import homeprime.items.contact.config.pojos.ContactSensor;
import homeprime.items.contact.config.pojos.ContactSensors;

/**
 * Reader of contacts configuration file into JSON POJO object.
 *
 * @author Milan Ramljak
 *
 */
public class ContactsConfigReader {

    /**
     * File describing contact items.
     */
    public static final String CONTACTS_CONFIGURATION_FILE_NAME = "contacts.json";
    private static String contactSensors = null;

    /**
     * Hidden constructor.
     */
    private ContactsConfigReader() {
    }

    public static ContactSensors getContactSensors() throws ThingException {
        try {
            if (contactSensors == null) {
                contactSensors = ThingUtils
                        .readFile(ThingProperties.getInstance().getItemsRootPath() + CONTACTS_CONFIGURATION_FILE_NAME);
            }
            final ObjectMapper mapper = new ObjectMapper();
            final ContactSensors tempContactSensorsPojo = mapper.readValue(contactSensors, ContactSensors.class);
            return tempContactSensorsPojo;
        } catch (IOException e) {
            throw new ThingException("ERROR ContactsConfigReader.getContactSensors() Failed to parse "
                    + CONTACTS_CONFIGURATION_FILE_NAME, e);
        }
    }

    /**
     * Force that next getContactSensors method call reads configuration again.
     */
    public static void reloadConfig() {
        contactSensors = null;
    }

    /**
     * Get list of contact sensors.
     *
     * @return list of contact sensors or empty list if no contacts or exception.
     */
    public static List<ContactSensor> getContacts() {
        final List<ContactSensor> contacts = new ArrayList<ContactSensor>();
        ContactSensors contactSensorsPojo = null;
        try {
            contactSensorsPojo = getContactSensors();
        } catch (ThingException e) {
            IoTLogger.getInstance().error("ERROR Cannot read contacts configuration.");
        }
        if (contactSensorsPojo != null) {
            contacts.addAll(contactSensorsPojo.getContacts());
        }
        return contacts;
    }

}
