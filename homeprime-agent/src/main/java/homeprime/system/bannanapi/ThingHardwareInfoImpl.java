package homeprime.system.bannanapi;

import homeprime.core.exception.ThingException;
import homeprime.system.ThingHardwareInfo;

/**
 * Default implementation for thing hardware info data retrieval on Banana PI.
 *
 * @author Milan Ramljak
 *
 */
public class ThingHardwareInfoImpl implements ThingHardwareInfo {

    @Override
    public String getSerialNumber() throws ThingException {
        throw new ThingException("ERROR ThingHardwareInfoImpl.getSerialNumber() Not implemented for BannanaPi");
    }

    @Override
    public String getBoardType() throws ThingException {
        throw new ThingException("ERROR ThingHardwareInfoImpl.getBoardType() Not implemented for BannanaPi");
    }

    @Override
    public float getCpuTemperature() throws ThingException {
        throw new ThingException("ERROR ThingHardwareInfoImpl.getCPUTemperature() Not implemented for BannanaPi");
    }

}
