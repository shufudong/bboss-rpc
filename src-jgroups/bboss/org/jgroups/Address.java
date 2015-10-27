// $Id: Address.java,v 1.6 2009/04/09 09:11:29 belaban Exp $

package bboss.org.jgroups;

import java.io.Externalizable;

import bboss.org.jgroups.util.Streamable;



/**
 * Abstract address. Used to identify members on a group to send messages to.
 * Addresses are mostly generated by the bottom-most (transport) layers (e.g. UDP, TCP, LOOPBACK).
 * @author Bela Ban
 */
public interface Address extends Externalizable, Streamable, Comparable<Address>, Cloneable { // todo: remove Externalizable
    // flags used for marshalling
    public static final byte NULL      = 1;
    public static final byte UUID_ADDR = 2;
    public static final byte IP_ADDR   = 4;

    /**
     * Checks whether this is an address that represents multiple destinations;
     * e.g., a class D address in the Internet.
     * @return true if this is a multicast address, false if it is a unicast address
     */
    boolean  isMulticastAddress();

    /** Returns serialized size of this address */
    int size();
}
