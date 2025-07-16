/* D3DLIGHT - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

public class D3DLIGHT {
	private D3DLIGHT() throws Throwable {
		throw new Error();
	}

	public static native long Create();

	public static native void Destroy(long l);

	public static native void SetType(long l, int i);

	public static native void SetAmbient(long l, float red, float green, float blue, float alpha);

	public static native void SetSpecular(long l, float red, float green, float blue, float alpha);

	public static native void SetDiffuse(long l, float red, float green, float blue, float alpha);

	public static native void SetPosition(long l, float x, float y, float z);

	public static native void SetDirection(long l, float f, float f_11_, float f_12_);

	public static native void SetAttenuation(long l, float f, float f_13_, float f_14_);

	public static native void SetSpotParams(long l, float f, float f_15_, float f_16_);

	public static native void SetRange(long l, float f);
}
