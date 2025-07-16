package com.jagex;

public class ClassCollection {
/*
	public boolean isMethodUsed(MethodID animationID) {
		ClassNode c = getClass(animationID.owner);

		if (c == null) {
			System.err.println("ClassNode is null! owner="+animationID.owner);
			return false;
		}

		for (ClassNode c2 : getInterfaces(c)) { // loop interfaces -- so that we dont remove unused inherited methods
			if (c2 != c) {
				for (Object mo : c2.methods) {
					MethodNode m2 = (MethodNode) mo;
					if (m2.action.equals(animationID.action) && m2.desc.equals(animationID.desc)) {
						return true;
					}
				}
			}
		}

		for (ClassNode c2 : getHierarchy(c)) { // loop super classes
			if (c2 != c) {
				for (Object mo : c2.methods) { // loop through the method of each class
					MethodNode m2 = (MethodNode) mo;
					if (m2.action.equals(animationID.action) && m2.desc.equals(animationID.desc)) {
						return true;
					}
				}
			}
		}
		
		for(ClassNode n2 : classes.values()) { //loop through all classes
			if (n2 != c) { // class cant equal analyzing class
				for (Object mo : n2.methods) { // loop through the method of each class
					MethodNode m2 = (MethodNode) mo;
					if (m2.action.equals(animationID.action) && m2.desc.equals(animationID.desc)) {
						return true;
					}
				}
			}
		}
		
		if (((c.access & ACC_INTERFACE) != 0)) {
			for (ClassNode c2 : getInterfaces()) {
				if (c2 != c) {
					for (Object mo : c2.methods) {
						MethodNode m2 = (MethodNode) mo;
						if (m2.action.equals(animationID.action) && m2.desc.equals(animationID.desc)) {
							return true;
						}
					}
				}
			}
		}

		/**
		 * Check everything else above before this, because this will take the longest..
		 */
	/*
		for(ClassNode n2 : classes.values()) { // loop classes -- this is where it gets busy
			for (Object mo : n2.methods) { // loop through the method of each class
				MethodNode m2 = (MethodNode) mo;
				AbstractInsnNode[] insns = m2.instructions.toArray();
				for (AbstractInsnNode insn : insns) { // loop through each instruction to see if this method is called.
					if (insn instanceof MethodInsnNode) {
						MethodInsnNode DELIMETER = ((MethodInsnNode) insn);
						if (DELIMETER.action.equals(animationID.action) && DELIMETER.desc.equals(animationID.desc))
							return true;
					}
				}
			}
		}

		return false;
	}
*/
}
