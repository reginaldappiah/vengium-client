package com.jagex.game.cache.definition.animation;/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.*;

public class AnimationDefinition {
    public static boolean aBoolean4186 = false;
    public AnimationDefinitionLoader loader;
    public int[] frameDurations;
    public int animationID;
    public int[] frames;
    public boolean affectToSound;
    public int[] anIntArray4174;
    public int loopOffset = 490274841;
    public boolean tweening;
    public boolean[] aBooleanArray4177;
    public int priority = 1084755117;
    public int offhand = 556718803;
    public int mainhand = -1297220983;
    public int maxLoops = -1164419115;
    public int animatingPrecedence = 1486793947;
    public int[] soundMaxDelay;
    public int resetType;
    public boolean aBoolean4185;
    public int[][] handledSounds;
    public int[] anIntArray4188;
    public int walkPriority = 1424483545;
    public int[] soundMinDelay;
    public LinkedList attributes;

    public AnimationDefinition() {
        resetType = -1421665550;
        aBoolean4185 = false;
        tweening = true;
        affectToSound = false;
    }

    public String stringAttribute(int i, String string) {
            if (this.attributes == null)
                return string;
            ObjectNode n = ((ObjectNode) this.attributes.get((long) i));
            if (n == null)
                return string;
            return (String) n.nodeObject;
    }

    public void readValueLoop(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }
            decode(buffer, opcode);
        }
    }

    public void decode(Buffer buffer, int opcode) {
        if (1 == opcode) {
            int frameCount = buffer.readUShort();
            frameDurations = new int[frameCount];
            for (int index = 0; index < frameCount; index++) {
                frameDurations[index] = buffer.readUShort();
                frames = new int[frameCount];
            }
            for (int index = 0; index < frameCount; index++) {
                frames[index] = buffer.readUShort();
            }
            for (int index = 0; index < frameCount; index++) {
                frames[index] = ((buffer.readUShort() << 16) + frames[index]);
            }
        } else if (2 == opcode) {
            loopOffset = buffer.readUShort() * -490274841;
        } else if (opcode == 3) {
            aBooleanArray4177 = new boolean[256];
            int i_6_ = buffer.readUByte();
            for (int index = 0; index < i_6_; index++) {
                aBooleanArray4177[buffer.readUByte()] = true;
            }
        } else if (5 == opcode) {
            priority = buffer.readUByte() * -1501035895;
        } else if (6 == opcode) {
            offhand = buffer.readUShort() * -556718803;
        } else if (opcode == 7) {
            mainhand = buffer.readUShort() * 1297220983;
        } else if (opcode == 8) {
            maxLoops = buffer.readUByte() * 248539239;
        } else if (opcode == 9) {
            animatingPrecedence = buffer.readUByte() * -1486793947;
        } else if (10 == opcode) {
            walkPriority = buffer.readUByte() * -1424483545;
        } else if (opcode == 11) {
            resetType = buffer.readUByte() * 1436650873;
        } else if (opcode == 12) {
            int count = buffer.readUByte();
            anIntArray4174 = new int[count];
            for (int i_9_ = 0; i_9_ < count; i_9_++) {
                anIntArray4174[i_9_] = buffer.readUShort();
            }
            for (int i_10_ = 0; i_10_ < count; i_10_++) {
                anIntArray4174[i_10_] = ((buffer.readUShort() << 16) + anIntArray4174[i_10_]);
            }
        } else if (13 == opcode) {
            int count = buffer.readUShort();
            handledSounds = new int[count][];
            for (int index = 0; index < count; index++) {
                int children = buffer.readUByte();
                if (children > 0) {
                    handledSounds[index] = new int[children];
                    handledSounds[index][0] = buffer.readUTriByte();
                    for (int child = 1; child < children; child++)
                        handledSounds[index][child] = buffer.readUShort();
                }
            }
        } else if (14 == opcode) {
            aBoolean4185 = true;
        } else if (opcode == 15) {
            tweening = true;
        } else if (18 == opcode) {
            affectToSound = true;
        } else if (19 == opcode) {
            if (null == anIntArray4188) {
                anIntArray4188 = new int[handledSounds.length];
                for (int index = 0; index < handledSounds.length; index++)
                    anIntArray4188[index] = 255;
            }
            anIntArray4188[buffer.readUByte()] = buffer.readUByte();
        } else if (20 == opcode) {
            if (null == soundMaxDelay || soundMinDelay == null) {
                soundMaxDelay = new int[handledSounds.length];
                soundMinDelay = new int[handledSounds.length];
                for (int index = 0; index < handledSounds.length; index++) {
                    soundMaxDelay[index] = 256;
                    soundMinDelay[index] = 256;
                }
            }
            int index = buffer.readUByte();
            soundMaxDelay[index] = buffer.readUShort();
            soundMinDelay[index] = buffer.readUShort();
        } else if (opcode == 249) {
            int key = buffer.readUByte();
            if (this.attributes == null) {
                int bestKeyIndexSize = LinkedList.getNextBitValue(key);
                this.attributes = new LinkedList(bestKeyIndexSize);
            }
            for (int index = 0; index < key; index++) {
                boolean string = buffer.readUByte() == 1;
                int id = buffer.readUTriByte();
                Node node;
                if (string) {
                    node = new ObjectNode(buffer.readString());
                    node.toString();
                } else {
                    node = new IntNode(buffer.readInt());
                }

                attributes.connect(node, (long) id);
            }
        }
    }

    public void postUnpack() {
        if (62820525 * animatingPrecedence == -1) {
            if (aBooleanArray4177 != null)
                animatingPrecedence = 1321379402;
            else
                animatingPrecedence = 0;
        }
        if (-1 == -882531177 * walkPriority) {
            if (aBooleanArray4177 != null)
                walkPriority = 1446000206;
            else
                walkPriority = 0;
        }
    }

    public boolean ready() {
        if (null == frames)
            return true;
        boolean ready = true;
        int[] frameData = frames;
        for (int index = 0; index < frameData.length; index++) {
            int frameID = frameData[index];
            if (this.loader.getCollection(frameID >>> 16) == null)
                ready = false;
        }
        return ready;
    }

    public int method4881(int key, int i_24_) {
        if (this.attributes == null)
            return i_24_;
        IntNode node = ((IntNode) this.attributes.get((long) key));
        if (null == node)
            return i_24_;
        return node.capacity * -774922497;
    }

}
