package com.jagex;/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class188 implements Iterator {
	int anInt1911;
	int anInt1912 = 0;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_1913;

	public void remove() {
		try {
			throw new UnsupportedOperationException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hw.remove(").append(')').toString());
		}
	}

	public boolean hasNext() {
		try {
			return (this.anInt1912 * -1320296169 < -400292665 * this.anAbstractQueue_Sub1_1913.anInt6314);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hw.hasNext(").append(')').toString());
		}
	}

	public Object next() {
		try {
			if (1539110513 * this.anInt1911 != -772584077 * (this.anAbstractQueue_Sub1_1913.anInt6316))
				throw new ConcurrentModificationException();
			if (this.anInt1912 * -1320296169 < (this.anAbstractQueue_Sub1_1913.anInt6314 * -400292665)) {
				Object object = (this.anAbstractQueue_Sub1_1913.aClass170Array6313[this.anInt1912 * -1320296169].anObject1738);
				this.anInt1912 += 1769301671;
				return object;
			}
			throw new NoSuchElementException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hw.next(").append(')').toString());
		}
	}

	Class188(AbstractQueue_Sub1 abstractqueue_sub1) {
		this.anInt1911 = (this.anAbstractQueue_Sub1_1913.anInt6316 * 266165283);
		this.anAbstractQueue_Sub1_1913 = abstractqueue_sub1;
	}

	static final void method1850(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class214.method1989(class105, IComponentDefinitionCollection, class403, (byte) 74);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hw.kq(").append(')').toString());
		}
	}

	static final void method1851(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			int i_0_ = (class403.integerStack[class403.integerStackOffset * 681479919]);
			int i_1_ = (class403.integerStack[1 + class403.integerStackOffset * 681479919]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method886(i_0_, i_1_, true);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hw.td(").append(')').toString());
		}
	}

	static final void method1852(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -1175642067;
			int i_2_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
			int i_3_ = (class403.integerStack[1 + 681479919 * class403.integerStackOffset]);
			int i_4_ = (class403.integerStack[class403.integerStackOffset * 681479919 + 2]);
			Class301_Sub1.method3713(4, i_2_ << 16 | i_3_, i_4_, "");
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hw.ald(").append(')').toString());
		}
	}
}
