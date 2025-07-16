package com.jagex;/* Class298_Sub37_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class MenuOption extends Cacheable {
    static int anInt5345;
    String action;
	int secondary;
	int cursor;
	int item;
	long primary;
	int componentID;
	int tertiary;
	boolean aBoolean9664;
	boolean aBoolean9665;
	long unlocker;
	String target;
	boolean independent;
	String aString9669;

	static void add(String action, String target, int cursor, int type, int item, long primary, int secondary, int tertiary, boolean bool, boolean bool_5_, long key, boolean independent) {
		try {
			if (!GameClient.menuOpen && -278777595 * Class436.menuOptionCount < 521) {
				cursor = cursor != -1 ? cursor : GameClient.targetLeaveCursor * -1808468501;
				MenuOption option = new MenuOption(action, target, cursor, type, item, primary, secondary, tertiary, bool, bool_5_, key, independent);
				Class282.method2618(option, 1640099092);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jw.posY(").append(')').toString());
		}
	}

	@Override
	public String toString() {
		return "MenuOption{" +
				"action='" + action + '\'' +
				", secondary=" + (secondary /622278169) +
				", cursor=" + (cursor /1854492667) +
				", item=" + (item /1821305099) +
				", primary=" + (primary /-4396451777151645697L) +
				", componentID=" + (componentID /233648799) +
				", tertiary=" + (tertiary /643860849) +
				", aBoolean9664=" + aBoolean9664 +
				", aBoolean9665=" + aBoolean9665 +
				", unlocker=" + (unlocker /-5795929892862797165L) +
				", target='" + target + '\'' +
				", independent=" + independent +
				", aString9669='" + aString9669 + '\'' +
				'}';
	}

	MenuOption(String target, String action, int cursor, int componentID, int item, long primary, int secondary, int tertiary, boolean bool, boolean bool_5_, long key, boolean independent) {
		this.action = action;
		this.target = target;
		this.cursor = 1854492667 * cursor;
		this.componentID = componentID * 233648799;
		this.item = item * 1821305099;
		this.primary = -4396451777151645697L * primary;
		this.secondary = secondary * 622278169;
		this.tertiary = 643860849 * tertiary;
		this.aBoolean9664 = bool;
		this.aBoolean9665 = bool_5_;
		this.unlocker = key * -5795929892862797165L;
		this.independent = independent;
	}
}
