package homeprime.system.raspberrypi;

import java.io.File;

import homeprime.core.exception.ThingException;
import homeprime.system.ThingDiskInfo;

/**
 * Default implementation for thing system info data retrieval on Raspberry PI.
 * 
 * @author Milan Ramljak
 * 
 */
public class ThingDiskInfoImpl implements ThingDiskInfo {

	@Override
	public long getTotalDiskSpace() throws ThingException {
		return new Long(new File("/").getTotalSpace());
	}

	@Override
	public long getUsedDiskSpace() throws ThingException {
		return getTotalDiskSpace() - getFreeDiskSpace();
	}

	@Override
	public long getFreeDiskSpace() throws ThingException {
		return new Long(new File("/").getFreeSpace());
	}

}
