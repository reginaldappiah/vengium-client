package com.jagex;/* Class298_Sub51_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub51_Sub4 extends Widget {
	Class400 aClass400_9779;

	public boolean method3573() {
			Class365_Sub1_Sub4_Sub1 class365_sub1_sub4_sub1 = this.aClass400_9779.method4927();
			if (class365_sub1_sub4_sub1 != null) {
				ToMoveScripts.method1064(CS2Context.aClass502_6731, -1617025021 * interfaceID, -1, class365_sub1_sub4_sub1);
				return true;
			}
			return false;
		}

	public Class298_Sub51_Sub4(int interfaceId, int clipped, Class400 class400) {
		super(interfaceId, clipped);
		this.aClass400_9779 = class400;
	}
}
