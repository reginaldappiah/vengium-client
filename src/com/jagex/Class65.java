package com.jagex;/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class65 {
	public static int[] anIntArray658 = { 3, 7, 15 };
	public static int[] anIntArray663 = { 2047, 16383, 65535 };
	static FontToolkit aClass264_664;

	Class65() throws Throwable {
		throw new Error();
	}

	public static void method761(IComponentDefinitionCollection IComponentDefinitionCollection, IComponentDefinition componentDefinition, boolean bool) {
			IComponentDefinition.method1282(IComponentDefinitionCollection.componentDefinitions, componentDefinition, bool);
	}

	public static boolean method762(String string, int i, String string_0_) {
		try {
			if (i == 0) {
				boolean bool;
				try {
					if (!Class82_Sub8.operatingSystem.startsWith("win"))
						throw new Exception();
					if (!string.startsWith("http://") && !string.startsWith("https://"))
						throw new Exception();
					String string_2_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (int i_3_ = 0; i_3_ < string.length(); i_3_++) {
						if (string_2_.indexOf(string.charAt(i_3_)) == -1)
							throw new Exception();
					}
					Runtime.getRuntime().exec(new StringBuilder().append("cmd /c start \"j\" \"").append(string).append("\"").toString());
					bool = true;
				} catch (Throwable throwable) {
					return false;
				}
				return bool;
			}
			if (1 == i) {
				boolean bool;
				try {
					Object object = Class466.method6022(GameClient.applet, string_0_, (new Object[] { new URL(GameClient.applet.getCodeBase(), string).toString() }));
					bool = null != object;
				} catch (Throwable throwable) {
					return false;
				}
				return bool;
			}
			if (2 == i) {
				boolean bool;
				try {
					GameClient.applet.getAppletContext().showDocument(new URL(GameClient.applet.getCodeBase(), string), "_blank");
					bool = true;
				} catch (Exception exception) {
					return false;
				}
				return bool;
			}
			if (i == 3) {
				try {
					Class466.method6021(GameClient.applet, "loggedout");
				} catch (Throwable throwable) {
					/* empty */
				}
				boolean bool;
				try {
					GameClient.applet.getAppletContext().showDocument(new URL(GameClient.applet.getCodeBase(), string), "_top");
					bool = true;
				} catch (Exception exception) {
					return false;
				}
				return bool;
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cq.p(").append(')').toString());
		}
	}
}
