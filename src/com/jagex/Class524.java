package com.jagex;/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class524 implements Runnable {
	volatile String hostName;
	InetAddress inetAddress;

	public String getAddressHostName() {
			return this.hostName;
	}

	Class524(int addressHash) throws UnknownHostException {
		this.inetAddress = InetAddress.getByAddress(new byte[] { (byte) (addressHash >> 24 & 0xff), (byte) (addressHash >> 16 & 0xff), (byte) (addressHash >> 8 & 0xff), (byte) (addressHash & 0xff) });
	}

	public void run() {
			this.hostName = this.inetAddress.getHostName();
	}
}
