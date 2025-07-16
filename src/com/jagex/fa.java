package com.jagex;/* fa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class fa extends SpriteToolkit implements Interface25, Interface8_Impl1_Impl1 {
	boolean aBoolean8978 = false;
	long nativeid;

	public void ma(boolean bool) {
		M(this.nativeid, bool);
	}

	fa(SSEGraphicsToolkit var_SSEGraphicsToolkit, int[] is, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		RA(var_SSEGraphicsToolkit, is, i, i_0_, i_1_, i_2_, bool);
	}

	native void F(long l, int[] is);

	fa(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i, int i_3_, int i_4_, int i_5_, boolean bool) {
		K(var_SSEGraphicsToolkit, i, i_3_, i_4_, i_5_, bool);
	}

	native void UA(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i, int i_6_);

	public int p() {
		return da(this.nativeid);
	}

	native void EA(SSEGraphicsToolkit var_SSEGraphicsToolkit, int[] is, byte[] is_7_, byte[] is_8_, int i, int i_9_, int i_10_, int i_11_);

	native void ea(long l, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_);

	public int f() {
		return GA(this.nativeid);
	}

	native void M(long l, boolean bool);

	public void method621(int i, int i_17_, int i_18_, int i_19_) {
		U(this.nativeid, i, i_17_, i_18_, i_19_);
	}

	native void U(long l, int i, int i_20_, int i_21_, int i_22_);

	public void method622(int[] is) {
		F(this.nativeid, is);
	}

	native void dd(long l, int i, int i_23_, long l_24_, int i_25_, int i_26_);

    native int da(long l);

    native int WA(long l);

	public void b() {
		/* empty */
	}

	public int getHeight() {
		return GA(this.nativeid);
	}

    native int ba(long l);

    public int a() {
		return da(this.nativeid);
	}

	public void method675(int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		ea(this.nativeid, i, i_42_, i_43_, i_44_, i_45_, i_46_);
	}

    public void method632(int i, int i_47_, int i_48_) {
		j(this.nativeid, i, i_47_, i_48_);
	}

	native void j(long l, int i, int i_49_, int i_50_);

    native void Y(long l, int i, int i_56_, int i_57_, int i_58_, int i_59_);

	public void method654(int i, int i_60_, ToolkitLoader toolkitLoader, int i_61_, int i_62_) {
		o(this.nativeid, i, i_60_, ((wa) toolkitLoader).nativeid, i_61_, i_62_);
	}

	native void o(long l, int i, int i_63_, long l_64_, int i_65_, int i_66_);

    native void aa(long l, int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_);

	public void method694(int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_) {
		aa(this.nativeid, i, i_77_, i_78_, i_79_, i_80_, i_81_, i_82_);
	}

    void method642(float f, float f_87_, float f_88_, float f_89_, float f_90_, float f_91_, int i, int i_92_, int i_93_, int i_94_) {
		e(this.nativeid, f, f_87_, f_88_, f_89_, f_90_, f_91_, i, i_92_, i_93_, i_94_);
	}

	native void ha(long l, int i, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_);

	void method644(float f, float f_102_, float f_103_, float f_104_, float f_105_, float f_106_, int i, ToolkitLoader toolkitLoader, int i_107_, int i_108_) {
		FA(this.nativeid, f, f_102_, f_103_, f_104_, f_105_, f_106_, i, ((wa) toolkitLoader).nativeid, i_107_, i_108_, this.aBoolean8978);
	}

	native void FA(long l, float f, float f_109_, float f_110_, float f_111_, float f_112_, float f_113_, int i, long l_114_, int i_115_, int i_116_, boolean bool);

	public void draw(int i, int i_117_, int i_118_, int i_119_, int i_120_) {
		Y(this.nativeid, i, i_117_, i_118_, i_119_, i_120_);
	}

    public int getPaddedWidth() {
		return WA(this.nativeid);
	}

    void method635(int i, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_) {
		ha(this.nativeid, i, i_127_, i_128_, i_129_, i_130_, i_131_, i_132_, i_133_);
	}

    fa(SSEGraphicsToolkit var_SSEGraphicsToolkit, int[] is, byte[] is_155_, byte[] is_156_, int i, int i_157_, int i_158_, int i_159_) {
		EA(var_SSEGraphicsToolkit, is, is_155_, is_156_, i, i_157_, i_158_, i_159_);
	}

	public int i() {
		return da(this.nativeid);
	}

	public int k() {
		return GA(this.nativeid);
	}

	public void d() {
		/* empty */
	}

    public void x() {
		/* empty */
	}

	public Interface8_Impl1_Impl1 method627() {
		return this.aBoolean8978 ? this : null;
	}

    native void dc(long l, int i, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_);

	fa(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i, int i_175_, boolean bool) {
		this.aBoolean8978 = bool;
		UA(var_SSEGraphicsToolkit, i, i_175_);
	}

	public void u() {
		/* empty */
	}

    native void dn(long l, int i, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_, int i_181_);

	native int GA(long l);

    public int getWidth() {
		return da(this.nativeid);
	}

    native void cr(long l, int i, int i_234_, int i_235_, int i_236_);

    native void RA(SSEGraphicsToolkit var_SSEGraphicsToolkit, int[] is, int i, int i_237_, int i_238_, int i_239_, boolean bool);

    native void e(long l, float f, float f_254_, float f_255_, float f_256_, float f_257_, float f_258_, int i, int i_259_, int i_260_, int i_261_);

	public void z(boolean bool) {
		M(this.nativeid, bool);
	}

	native void cn(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i, int i_262_);

	native void ch(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i, int i_263_);

	native void ct(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i, int i_264_);

	native void cc(SSEGraphicsToolkit var_SSEGraphicsToolkit, int[] is, int i, int i_265_, int i_266_, int i_267_, boolean bool);

	native void ca(SSEGraphicsToolkit var_SSEGraphicsToolkit, int[] is, byte[] is_268_, byte[] is_269_, int i, int i_270_, int i_271_, int i_272_);

	native void ci(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i, int i_273_, int i_274_, int i_275_, boolean bool);

	native void ce(long l, int i, int i_276_, int i_277_, int i_278_);

	native void cb(long l, int i, int i_279_, int i_280_, int i_281_);

	public int getPaddedHeight() {
		return ba(this.nativeid);
	}

	native int cu(long l);

	native int cp(long l);

	native int cq(long l);

	native int cf(long l);

	native int dh(long l);

	native void dg(long l, int i, int i_282_, int i_283_);

	native void method_do(long l, int i, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_);

	native void dq(long l, int i, int i_290_, int i_291_, int i_292_, int i_293_);

	native void ds(long l, int i, int i_294_, long l_295_, int i_296_, int i_297_);

	native void dp(long l, int i, int i_298_, long l_299_, int i_300_, int i_301_);

    native void dx(long l, int i, int i_302_, long l_303_, int i_304_, int i_305_);

	native void K(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i, int i_306_, int i_307_, int i_308_, boolean bool);

	native void dk(long l, int i, int i_309_, int i_310_, int i_311_, int i_312_, int i_313_, int i_314_, int i_315_);

	native void db(long l, int i, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_, int i_322_);

	native void dl(long l, int i, int i_323_, int i_324_);

    native void dm(long l, float f, float f_325_, float f_326_, float f_327_, float f_328_, float f_329_, int i, long l_330_, int i_331_, int i_332_, boolean bool);
}
