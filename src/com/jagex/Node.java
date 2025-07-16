package com.jagex;/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node {
	public long key;
	public Node next;
	public Node previous;

	public void unlink() {
			if (next != null) {
				next.previous = previous;
				previous.next = next;
				previous = null;
				next = null;
			}
	}

	public boolean isNextAvailable() {
            return next != null;
	}

}
