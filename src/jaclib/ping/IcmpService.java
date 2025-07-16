/* IcmpService - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.ping;

public abstract class IcmpService implements Runnable {
	protected IcmpService() {
		/* empty */
	}

	protected abstract void notify(int mousePositionHash);

	protected abstract void notify(int mousePositionHash, int type, int rotation);

	public native void run();

	public native void quit();

	public static native boolean available();

	public native void q();

	public native void n();

	protected abstract void a(int i);

	protected abstract void f(int i);

	protected abstract void b(int i, int i_2_, int i_3_);

	protected abstract void p(int mousePositionHash, int i_4_, int i_5_);
}
