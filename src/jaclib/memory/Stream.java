/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
	private Buffer a;
	private int offset;
	private int b;
	private int p;
	private byte[] stream;
	private static boolean k = getLSB(-65536) == -1;

	public Stream() {
		this(10000);
	}

	private Stream(int capacity) {
		this.stream = new byte[capacity];
	}

	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.a());
	}

	public Stream(Buffer buffer, int stream, int offset) {
		this(buffer.a() < 10000 ? buffer.a() : 10000);
		a(buffer, stream, offset);
	}

	private void a(Buffer buffer, int i, int i_1_) {
		x();
		a = buffer;
		b = i * -1137521459;
		offset = 193942853 * (i_1_ + i);
		if (-1084754547 * offset > buffer.a())
			throw new RuntimeException();
	}

	public int f() {
		return -846880739 * p + -1626734587 * b;
	}

	public void b(int i) {
		x();
		b = -1137521459 * i;
	}

	public void p(int offset) {
		if (p * -846880739 >= this.stream.length)
			x();
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) offset;
	}

	public void i(int offset) {
		if (3 + -846880739 * p >= this.stream.length)
			x();
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) offset;
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 8);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 16);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 24);
	}

	public void k(int offset) {
		if (3 + p * -846880739 >= this.stream.length)
			x();
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 16);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 8);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) offset;
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 24);
	}

	public void d(float f) {
		if (-846880739 * p + 3 >= this.stream.length)
			x();
		int offset = floatToRawIntBits(f);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 24);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 16);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 8);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) offset;
	}

	public void u(float f) {
		if (3 + p * -846880739 >= this.stream.length)
			x();
		int offset = floatToRawIntBits(f);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) offset;
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 8);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 16);
		this.stream[(p += -1413864907) * -846880739 - 1] = (byte) (offset >> 24);
	}

	public void x() {
		if (p * -846880739 > 0) {
			if (p * -846880739 + -1626734587 * b > -1084754547 * offset)
				throw new RuntimeException();
			a.b(stream, 0, -1626734587 * b, -846880739 * p);
			b += p * -1589488839;
			p = 0;
		}
	}

	public static final boolean r() {
		return k;
	}

	public static native int floatToRawIntBits(float f);

	private static final native byte getLSB(int i);
}
