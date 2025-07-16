package com.jagex;/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class NodeCollection {
	public Node DELIMETER = new Node();
	Node active;

	public Node method5964(int i) {
		try {
			Node class298 = DELIMETER.next;
			if (class298 == DELIMETER) {
				this.active = null;
				return null;
			}
			this.active = class298.next;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.d(").append(')').toString());
		}
	}

	public void method5965(Node class298, int i) {
		try {
			if (null != class298.next)
				class298.unlink();
			class298.next = DELIMETER;
			class298.previous = DELIMETER.previous;
			class298.next.previous = class298;
			class298.previous.next = class298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.b(").append(')').toString());
		}
	}

	public Node method5966(byte i) {
		try {
			Node class298 = this.active;
			if (DELIMETER == class298) {
				this.active = null;
				return null;
			}
			this.active = class298.next;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.posX(").append(')').toString());
		}
	}

	public Node head() {
		try {
			Node class298 = DELIMETER.previous;
			if (class298 == DELIMETER) {
				this.active = null;
				return null;
			}
			this.active = class298.previous;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.k(").append(')').toString());
		}
	}

	public void pushBack(Node class298) {
		try {
			if (class298.next != null)
				class298.unlink();
			class298.next = DELIMETER.next;
			class298.previous = DELIMETER;
			class298.next.previous = class298;
			class298.previous.next = class298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.f(").append(')').toString());
		}
	}

	public Node next() {
		try {
			Node class298 = this.active;
			if (class298 == DELIMETER) {
				this.active = null;
				return null;
			}
			this.active = class298.previous;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.u(").append(')').toString());
		}
	}

	public boolean method5970(byte i) {
		try {
			return DELIMETER.previous == DELIMETER;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.r(").append(')').toString());
		}
	}

	public Node method5971(int i) {
		try {
			Node class298 = DELIMETER.previous;
			if (DELIMETER == class298)
				return null;
			class298.unlink();
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.i(").append(')').toString());
		}
	}

	public void method5972(int i) {
		try {
			for (;;) {
				Node class298 = DELIMETER.previous;
				if (DELIMETER == class298) {
					if (i < -824427525)
						break;
					return;
				}
				class298.unlink();
			}
			this.active = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.a(").append(')').toString());
		}
	}

	public NodeCollection() {
		DELIMETER.previous = DELIMETER;
		DELIMETER.next = DELIMETER;
	}

	public static void method5973(Cacheable class298_sub37, Cacheable class298_sub37_0_, int i) {
		try {
			if (class298_sub37.prev_cache != null)
				class298_sub37.unlinkCache();
			class298_sub37.prev_cache = class298_sub37_0_;
			class298_sub37.next_cache = class298_sub37_0_.next_cache;
			class298_sub37.prev_cache.next_cache = class298_sub37;
			class298_sub37.next_cache.prev_cache = class298_sub37;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.p(").append(')').toString());
		}
	}

	static final void method5974(ScriptRuntime runtime) {
		try {
			if (null != StaticMethods.aClanChannelChat_4084) {
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
				runtime.clanChannelChat = StaticMethods.aClanChannelChat_4084;
			} else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.xx(").append(')').toString());
		}
	}

	static final void method5975(ScriptRuntime class403, byte i) {
		try {
			boolean bool = true;
			if (GameClient.aBoolean8638) {
				try {
					Object object = Class212.aClass212_2429.method1954();
					if (object != null)
						bool = ((Boolean) object).booleanValue();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.ank(").append(')').toString());
		}
	}

	static final void method5976(ScriptRuntime class403, byte i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ENTER_LONG_TEXT_PACKET, ConnectionType.gameConnection.encryptor);
			outgoingPacketBuffer.payload.writeByte(string.length() + 1);
			outgoingPacketBuffer.payload.writeString(string);
			ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sw.sf(").append(')').toString());
		}
	}
}
