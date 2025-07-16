package com.jagex;/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.game.cache.config.Js5Configs;
import com.jagex.network.IncommingPacket;
import com.jagex.utils.TimeUtils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.util.Iterator;

public class Class460 implements Iterator {
	LinkedList list;
	Node aClass298_5676;
	int anInt5677;
	Node aClass298_5678 = null;

	public boolean hasNext() {
		try {
			if ((this.list.table[1772241843 * this.anInt5677 - 1]) != this.aClass298_5676)
				return true;
			while (this.anInt5677 * 1772241843 < 577108745 * (this.list.capacity)) {
				if ((this.list.table[((this.anInt5677 += -317185157) * 1772241843 - 1)].previous) != (this.list.table[this.anInt5677 * 1772241843 - 1])) {
					this.aClass298_5676 = (this.list.table[this.anInt5677 * 1772241843 - 1].previous);
					return true;
				}
				this.aClass298_5676 = (this.list.table[1772241843 * this.anInt5677 - 1]);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sy.hasNext(").append(')').toString());
		}
	}

	void method5978(int i) {
		try {
			this.aClass298_5676 = (this.list.table[0].previous);
			this.anInt5677 = -317185157;
			this.aClass298_5678 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sy.d(").append(')').toString());
		}
	}

	public Class460(LinkedList list) {
		this.list = list;
		method5978(-751580615);
	}

	public void remove() {
		try {
			if (this.aClass298_5678 == null)
				throw new IllegalStateException();
			this.aClass298_5678.unlink();
			this.aClass298_5678 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sy.remove(").append(')').toString());
		}
	}

	public Object next() {
		try {
			if ((this.list.table[this.anInt5677 * 1772241843 - 1]) != this.aClass298_5676) {
				Node class298 = this.aClass298_5676;
				this.aClass298_5676 = class298.previous;
				this.aClass298_5678 = class298;
				return class298;
			}
			while_106_: do {
				Node class298;
				do {
					if (this.anInt5677 * 1772241843 >= (577108745 * (this.list.capacity)))
						break while_106_;
					class298 = (this.list.table[((this.anInt5677 += -317185157) * 1772241843) - 1].previous);
				} while (class298 == (this.list.table[this.anInt5677 * 1772241843 - 1]));
				this.aClass298_5676 = class298.previous;
				this.aClass298_5678 = class298;
				return class298;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sy.next(").append(')').toString());
		}
	}

	public Node method5979(int i) {
		try {
			method5978(-751580615);
			return (Node) next();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sy.u(").append(')').toString());
		}
	}

	static final void pulseLogin() {
			if (1 != Class360.loginStep * -707576455 && 100 != Class360.loginStep * -707576455) {
				do {
					try {
						int maximumTicks;
						if (0 == 1820934059 * Class360.loginErrors)
							maximumTicks = 250;
						else
							maximumTicks = 2000;
						if (Class360.socialNetworkLogin && Class360.loginStep * -707576455 >= 62)
							maximumTicks = 6000;
						if (-122629167 * Class360.loginType != 264 || (203 != Class360.loginStep * -707576455 && 42 != -1372893999 * Class360.anInt3871))
							Class360.loginTicks += -975705897;
						if (-1937798425 * Class360.loginTicks > maximumTicks) {
							Class360.activeConnection.stopConnection();
							if (Class360.loginErrors * 1820934059 < 3) {
								if (264 == Class360.loginType * -122629167)
									Class474.activeConnectionInfo.method6058();
								else
									Class241.lobbyConnectionInfo.method6058();
								Class360.loginTicks = 0;
								Class360.loginErrors += -72367357;
								Class360.loginStep = -455386772;
							} else {
								Class360.loginStep = -395862839;
								Class78.method845(-5);
								break;
							}
						}
						if (12 == Class360.loginStep * -707576455) {
							if (264 == -122629167 * Class360.loginType) {
								Class360.activeConnection.init(Class264_Sub4.method2515(Class474.activeConnectionInfo.createSocket(), 15000), Class474.activeConnectionInfo.host);
							} else {
								Class360.activeConnection.init(Class264_Sub4.method2515(Class241.lobbyConnectionInfo.createSocket(), 15000), Class241.lobbyConnectionInfo.host);
							}
							Class360.activeConnection.dropFrames();
							OutgoingPacketBuffer frame = StaticMethods.empty();
							if (Class360.socialNetworkLogin) {
								frame.payload.writeByte((LoginConnection.initSocialGameconnection.type * -1813470547));
								frame.payload.writeShort(0);
								int i_1_ = 385051775 * (frame.payload.offset);
								frame.payload.writeInt(Loader.REVISION);
								if (Loader.SUB_REVISION != -1) {
									frame.payload.writeInt(Loader.SUB_REVISION);
								}
								if (-122629167 * Class360.loginType == 264) {
									frame.payload.writeByte((5 == GameClient.gameState * -1233866115 ? 1 : 0));
								}
								
								Buffer buffer = Class322.withXtea();
								buffer.writeByte((2084404473 * (Class360.socialNetworkId)));
								buffer.writeShort((int) (Math.random() * 9.9999999E7));
								buffer.writeByte(GameLanguage.CURRENT_LANGUAGE.getID());
								buffer.writeInt((GameClient.offiliateId * -1154804873));
								for (int i_2_ = 0; i_2_ < 6; i_2_++)
									buffer.writeInt((int) (Math.random() * 9.9999999E7));
								buffer.writeLong(GameClient.clientKey * -8380697455384249973L);
								buffer.writeByte((-937307905 * (GameClient.game.id)));
								buffer.writeByte((int) (Math.random() * 9.9999999E7));
								buffer.applyRSA((Class50.LOGIN_RSA_EXPONENT), (Class50.LOGIN_RSA_MODULUS));
								frame.payload.writeBytes(buffer.buffer, 0, 385051775 * buffer.offset);
								frame.payload.writeSizeShort(385051775 * (frame.payload.offset) - i_1_);
							} else
								frame.payload.writeByte((-1813470547 * LoginConnection.LOGIN_REQUEST.type));
							Class360.activeConnection.sendFrame(frame);
							Class360.activeConnection.flush();
							Class360.loginStep = 1009016718;
						}
						if (Class360.loginStep * -707576455 == 30) {
							if (!Class360.activeConnection.getStream().isAvailable(1)) {
								break;
							}
							
							Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 1);
							int response = ((Class360.activeConnection.bitsBuffer.buffer[0]) & 0xff);
							if (0 != response) {
								Class360.loginStep = -395862839;
								Class78.method845(response);
								Class360.activeConnection.stopConnection();
								StaticMethods.method4693();
								break;
							}
							if (Class360.socialNetworkLogin)
								Class360.loginStep = -238095732;
							else
								Class360.loginStep = 1898985570;
						}
						if (-707576455 * Class360.loginStep == 44) {
							if (!Class360.activeConnection.getStream().isAvailable(2))
								break;
							Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 2);
							Class360.activeConnection.bitsBuffer.offset = 0;
							Class360.activeConnection.bitsBuffer.offset = Class360.activeConnection.bitsBuffer.readUShort() * 116413311;
							Class360.loginStep = -1485208182;
						}
						if (Class360.loginStep * -707576455 == 58) {
							if (!Class360.activeConnection.getStream().isAvailable((385051775 * (Class360.activeConnection.bitsBuffer.offset))))
								break;
							Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, (385051775 * (Class360.activeConnection.bitsBuffer.offset)));
							Class360.activeConnection.bitsBuffer.decodeXtea(Buffer.xtea);
							Class360.activeConnection.bitsBuffer.offset = 0;
							String url = Class360.activeConnection.bitsBuffer.readJagString();
							Class360.activeConnection.bitsBuffer.offset = 0;
							String method = Class212.aClass212_2430.method1951();
							if (!GameClient.aBoolean8638 || !Class65.method762(url, 1, method))
								Class273.method2559(url, true, SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.OPENGLSPECIAL, method, GameClient.useJs, GameClient.aBoolean8651, -1487322449);
							Class360.loginStep = 1226307758;
						}
						if (Class360.loginStep * -707576455 == 62) {
							if (!Class360.activeConnection.getStream().isAvailable(1))
								break;
							Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 1);
							if (((Class360.activeConnection.bitsBuffer.buffer[0]) & 0xff) == 1)
								Class360.loginStep = 1562646664;
						}
						if (Class360.loginStep * -707576455 == 72) {
							if (!Class360.activeConnection.getStream().isAvailable(16))
								break;
							Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 16);
							Class360.activeConnection.bitsBuffer.offset = 1862612976;
							Class360.activeConnection.bitsBuffer.decodeXtea(Buffer.xtea);
							Class360.activeConnection.bitsBuffer.offset = 0;
							Class360.accountName = (Class360.activeConnection.bitsBuffer.readLong() * -2742373017286080113L);
							Class360.serverKey = (Class360.activeConnection.bitsBuffer.readLong() * 3207425516430892907L);
							Class360.loginStep = 1898985570;
						}
						if (-707576455 * Class360.loginStep == 82) {
							Class360.activeConnection.bitsBuffer.offset = 0;
							Class360.activeConnection.dropFrames();
							OutgoingPacketBuffer frame = StaticMethods.empty();
							RsBitsBuffer stream = frame.payload;
							if (264 == -122629167 * Class360.loginType) {
								LoginConnection type;
								if (Class360.socialNetworkLogin)
									type = LoginConnection.SOCIAL_LOGIN;
								else
									type = LoginConnection.newLoginConnectionLoginInit;
								stream.writeByte(-1813470547 * type.type);
								stream.writeShort(0);
								int start = (385051775 * stream.offset);
								int encryptedStart = (385051775 * stream.offset);
								if (!Class360.socialNetworkLogin) {
									stream.writeInt(Loader.REVISION);
									if (Loader.SUB_REVISION != -1) {
										stream.writeInt(Loader.SUB_REVISION);
									}
									stream.writeByte((GameClient.gameState * -1233866115 == 5 ? 1 : 0));
									Buffer buffer = GameClient.method6003();
									stream.writeBytes(buffer.buffer, 0, buffer.offset * 385051775);
									encryptedStart = (stream.offset * 385051775);
									stream.writeByte(((Class360.accountName * 122690138525332847L) == -1L ? 1 : 0));
									if ((Class360.accountName * 122690138525332847L) == -1L)
										stream.writeString(Class360.username);
									else
										stream.writeLong(122690138525332847L * Class360.accountName);
								}
								stream.writeByte(Class190.windowMode());
								stream.writeShort(-2110394505 * GameShell.canvasWidth);
								stream.writeShort((GameShell.canvasHeight * -1111710645));
								stream.writeByte(SettingsManager.settingsManager.multisample.getValue());
								Class10.setRandom(stream, (byte) 1); // writes
								// 24
								// bytes
								stream.writeString((GameClient.settings));
								stream.writeInt(-1154804873 * GameClient.offiliateId);
								Buffer buffer = SettingsManager.settingsManager.encode();
								stream.writeByte(385051775 * buffer.offset);
								stream.writeBytes(buffer.buffer, 0, buffer.offset * 385051775);
								GameClient.sentPreferences = true;
								stream.writeInt(((GameClient.totalPacketCount) * -2059460167));
								stream.writeLong(GameClient.aLong8645 * -5648129435911399733L);
								stream.writeByte(null == GameClient.additionalInfo ? 0 : 1);
								if (GameClient.additionalInfo != null)
									stream.writeString(GameClient.additionalInfo);
								stream.writeByte((JS5NativeManager.nativeManager.isDefined("jagtheora") ? 1 : 0));
								stream.writeByte(((GameClient.aBoolean8638) ? 1 : 0));
								stream.writeByte(((GameClient.aBoolean8958) ? 1 : 0));
								stream.writeByte(((Class350.anInt3758) * -180909151));
								stream.writeInt(1886068421 * GameClient.anInt8654);
								stream.writeString((GameClient.aString8655));
								stream.writeByte((null == Class386.autoWorld || ((1606920449 * Class474.activeConnectionInfo.worldID) != (Class386.autoWorld.worldID * 1606920449))) ? 1 : 0);
								Js5CacheWrite.writeCacheCRCs(stream);
								stream.encodeXtea(Buffer.xtea, encryptedStart, 385051775 * stream.offset);
								stream.writeSizeShort((385051775 * stream.offset - start));
							} else { // LOBBY LOGIN
								LoginConnection type;
								if (Class360.socialNetworkLogin)
									type = LoginConnection.SOCIAL_LOGIN;
								else
									type = LoginConnection.newLoginConnectionLoginLobby;
								stream.writeByte(-1813470547 * type.type);
								stream.writeShort(0);
								int start = (385051775 * stream.offset);
								int encryptedStart = (385051775 * stream.offset);
								if (!Class360.socialNetworkLogin) {
									stream.writeInt(Loader.REVISION);
									if (Loader.SUB_REVISION != -1) {
										stream.writeInt(Loader.SUB_REVISION);
									}
									Buffer buffer = GameClient.method6003();
									stream.writeBytes(buffer.buffer, 0, buffer.offset * 385051775);
									encryptedStart = (stream.offset * 385051775);
									stream.writeByte((122690138525332847L * Class360.accountName) == -1L ? 1 : 0);
									if (-1L == (122690138525332847L * Class360.accountName))
										stream.writeString(Class360.username);
									else
										stream.writeLong(122690138525332847L * Class360.accountName);
								}
								stream.writeByte((-937307905 * GameClient.game.id));
								stream.writeByte(GameLanguage.CURRENT_LANGUAGE.getID());
								Class10.setRandom(stream, (byte) 1);
								stream.writeString((GameClient.settings));
								Buffer buffer = SettingsManager.settingsManager.encode();
								stream.writeByte(((buffer.offset) * 385051775));
								stream.writeBytes(buffer.buffer, 0, buffer.offset * 385051775);
								Buffer buf = (new Buffer(Class12.systemInfo.getEncodedSize()));
								Class12.systemInfo.writeMachineInformation(buf);
								stream.writeBytes(buf.buffer, 0, buf.buffer.length);
								stream.writeInt(-1154804873 * GameClient.offiliateId);
								stream.writeInt(((GameClient.anInt8654) * 1886068421));
								stream.writeString((GameClient.aString8655));
								Js5CacheWrite.writeCacheCRCs(stream);
								byte[] bs = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getHardwareAddress();
								stream.writeByte(bs.length);
								stream.writeBytes(bs, 0, bs.length);
								stream.encodeXtea(Buffer.xtea, encryptedStart, 385051775 * stream.offset);
								stream.writeSizeShort((385051775 * stream.offset - start));
							}
							Class360.activeConnection.sendFrame(frame);
							Class360.activeConnection.flush();
							Class360.activeConnection.encryptor = new IsaacCipher(Buffer.xtea);
							for (int index = 0; index < 4; index++)
								Buffer.xtea[index] += 50;
							Class360.activeConnection.decryptor = new IsaacCipher(Buffer.xtea);
							new IsaacCipher(Buffer.xtea);
							Class360.activeConnection.bitsBuffer.setCipher((Class360.activeConnection.decryptor));
							Buffer.xtea = null;
							Class360.loginStep = 1443598798;
						}
						if (94 == -707576455 * Class360.loginStep) {
							if (!Class360.activeConnection.getStream().isAvailable(1))
								break;
							Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 1);
							int loginOpcode = ((Class360.activeConnection.bitsBuffer.buffer[0]) & 0xff);
							if (21 == loginOpcode)
								Class360.loginStep = 2056752677;
							else if (29 == loginOpcode || 45 == loginOpcode) {
								FontManager.anInt1992 = 974522705 * loginOpcode;
								Class360.loginStep = -616044022;
							} else {
								if (loginOpcode == 1) {
									Class360.loginStep = -931578236;
									Class78.method845(loginOpcode);
									break;
								}
								if (loginOpcode == 2)
									Class360.loginStep = 1601365905;
								else if (15 == loginOpcode) {
									Class360.activeConnection.population = -1763582762;
									Class360.loginStep = 907883401;
								} else {
									if (loginOpcode == 23 && (1820934059 * Class360.loginErrors < 3)) {
										Class360.loginTicks = 0;
										Class360.loginErrors += -72367357;
										Class360.loginStep = -455386772;
										Class360.activeConnection.stopConnection();
									} else {
										if (loginOpcode == 42) {
											Class360.loginStep = 1244222307;
											Class78.method845(loginOpcode);
										} else {
											if (Class360.aBoolean3870 && !Class360.socialNetworkLogin && -1 != (2084404473 * Class360.socialNetworkId) && 35 == loginOpcode) {
												Class360.socialNetworkLogin = true;
												Class360.loginTicks = 0;
												Class360.loginStep = -455386772;
												Class360.activeConnection.stopConnection();
											} else {
												Class360.loginStep = -395862839;
												Class78.method845(loginOpcode);
												Class360.activeConnection.stopConnection();
												StaticMethods.method4693();
												break;
											}
											break;
										}
										break;
									}
									break;
								}
							}
						}
						if (Class360.loginStep * -707576455 == 117) {
							Class360.activeConnection.dropFrames();
							OutgoingPacketBuffer outgoingPacketBuffer = StaticMethods.empty();
							RsBitsBuffer rsBitsBuffer = outgoingPacketBuffer.payload;
							rsBitsBuffer.setCipher((Class360.activeConnection.encryptor));
							rsBitsBuffer.method3668((-1813470547 * (LoginConnection.aLoginConnection_2419.type)));
							Class360.activeConnection.sendFrame(outgoingPacketBuffer);
							Class360.activeConnection.flush();
							Class360.loginStep = 1443598798;
						} else if (125 == Class360.loginStep * -707576455) {
							if (Class360.activeConnection.getStream().isAvailable(1)) {
								Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 1);
								int i_13_ = (Class360.activeConnection.bitsBuffer.buffer[0]) & 0xff;
								Class360.anInt3908 = i_13_ * -1954130922;
								Class360.loginStep = -395862839;
								Class78.method845(21);
								Class360.activeConnection.stopConnection();
								StaticMethods.method4693();
							}
						} else if (-707576455 * Class360.loginStep == 203) {
							if (Class360.activeConnection.getStream().isAvailable(2)) {
								Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 2);
								Class360.anInt3866 = ((((Class360.activeConnection.bitsBuffer.buffer[0]) & 0xff) << 8) + ((Class360.activeConnection.bitsBuffer.buffer[1]) & 0xff)) * -1156978587;
								Class360.loginStep = 1443598798;
							}
						} else if (-707576455 * Class360.loginStep == 186) {
							if (29 == FontManager.anInt1992 * 1892081585) {
								if (!Class360.activeConnection.getStream().isAvailable(1))
									break;
								Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 1);
								Class360.anInt3910 = (1200969765 * ((Class360.activeConnection.bitsBuffer.buffer[0]) & 0xff));
							} else if (FontManager.anInt1992 * 1892081585 == 45) {
								if (!Class360.activeConnection.getStream().isAvailable(3))
									break;
								Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 3);
								Class360.anInt3910 = (1200969765 * ((Class360.activeConnection.bitsBuffer.buffer[0]) & 0xff));
								Class360.anInt3909 = (1719895145 * (((Class360.activeConnection.bitsBuffer.buffer[2]) & 0xff) + (((Class360.activeConnection.bitsBuffer.buffer[1]) & 0xff) << 8)));
							} else
								throw new IllegalStateException();
							Class360.loginStep = -395862839;
							Class78.method845(1892081585 * FontManager.anInt1992);
							Class360.activeConnection.stopConnection();
							StaticMethods.method4693();
						} else if (137 == Class360.loginStep * -707576455) { // if
																				// sucefull
																				// world
																				// login,
																				// entityIndex
																				// 2
							if (Class360.activeConnection.getStream().isAvailable(1)) {
								Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 1);
								Class360.loginConfigsSize = (1962471985 * ((Class360.activeConnection.bitsBuffer.buffer[0]) & 0xff));
								Class360.loginStep = 1541841972;
							}
						} else { // setting login configs tileSpacesOccupied
							if (-707576455 * Class360.loginStep == 148) { // if
																			// world
																			// login
								RsBitsBuffer stream = (Class360.activeConnection.bitsBuffer);
								if (264 == Class360.loginType * -122629167) { // world
																				// login,
																				// 264
									if (!Class360.activeConnection.getStream().isAvailable(-1359010095 * Class360.loginConfigsSize))
										break;
									Class360.activeConnection.getStream().readBytes(stream.buffer, 0, Class360.loginConfigsSize * -1359010095);
									stream.offset = 0;
									GameClient.localPrivilege = (stream.readUByte() * 1835619115);
									GameClient.anInt8932 = (stream.readUByte() * -418443653);
									GameClient.aBoolean8811 = stream.readUByte() == 1;
									GameClient.aBoolean8812 = stream.readUByte() == 1;
									GameClient.aBoolean8813 = stream.readUByte() == 1;
									GameClient.aBoolean8802 = stream.readUByte() == 1;
									GameClient.playerIndex = (stream.readUShort() * 1448461709);
									GameClient.aBoolean8807 = stream.readUByte() == 1;
									NotDefinition.anInt7456 = (stream.read24BitInteger() * 777394511);
									GameClient.isMemberWorld = stream.readUByte() == 1;
									StaticMethods.aString1369 = stream.readString();
									GameClient.myRegion.getObjectDefinitionLoader().method5790(GameClient.isMemberWorld, 915103443);
									Class62.aClass248_612.getGameMap().getObjectDefinitionLoader().method5790(GameClient.isMemberWorld, 915103443);
									Js5Configs.itemList.method6092(GameClient.isMemberWorld, 798055588);
									NPCDefinitionLoader.npcList.isMember(GameClient.isMemberWorld);
								} else { // lobby login
									if (!Class360.activeConnection.getStream().isAvailable(Class360.loginConfigsSize * -1359010095))
										break;
									Class360.activeConnection.getStream().readBytes(stream.buffer, 0, Class360.loginConfigsSize * -1359010095);
									stream.offset = 0;
									GameClient.localPrivilege = (stream.readUByte() * 1835619115);
									GameClient.anInt8932 = (stream.readUByte() * -418443653);
									GameClient.aBoolean8811 = stream.readUByte() == 1;
									NotDefinition.anInt7456 = (stream.read24BitInteger() * 777394511);
									Player.myPlayer.isMale = (byte) stream.readUByte();
									GameClient.aBoolean8812 = stream.readUByte() == 1;
									GameClient.aBoolean8813 = stream.readUByte() == 1;
									PaddedResourceWorker.aLong2748 = (stream.readLong() * 9182695496232067233L);
									IntNode.intNodeKey = (((-536549149186981023L * PaddedResourceWorker.aLong2748) - TimeUtils.getTime() - stream.method3601()) * -7894334964002250373L);
									int i_14_ = stream.readUByte();
									GameClient.aBoolean8807 = 0 != (i_14_ & 0x1);
									Class510.aBoolean6222 = 0 != (i_14_ & 0x2);
									StaticMethods.anInt4128 = (stream.readInt() * -1704395451);
									Class525.aBoolean6300 = stream.readUByte() == 1;
									Class100.anInt1079 = (stream.readInt() * -442700441);
									GameClient.anInt666 = (stream.readUShort() * -1652734029);
									StaticMethods.anInt2099 = (stream.readUShort() * 808373911);
									StaticMethods.anInt3190 = (stream.readUShort() * -591256495);
									StaticMethods.addressHash = (stream.readInt() * -1316190437);
									StockMarketListing.aClass524_2773 = new Class524(StaticMethods.addressHash * 2071493395);
									new Thread(StockMarketListing.aClass524_2773).start();
									Class95.anInt923 = (stream.readUByte() * 1240622393);
									StaticMethods.anInt6059 = (stream.readUShort() * 556974909);
									RenderContext.anInt6815 = (stream.readUShort() * 580840459);
									Class406.aBoolean5274 = stream.readUByte() == 1;
									Player.myPlayer.accountName = Player.myPlayer.displayName = Player.localDisplayName = stream.readJagString();
									Class95.anInt924 = (stream.readUByte() * 821936487); // TODO:
									Class216.anInt6659 = (stream.readInt() * 2029589759);
									GameClient.aBoolean8640 = stream.readUByte() == 1;
									Class386.autoWorld = new IPAddress();
									Class386.autoWorld.worldID = (stream.readUShort() * 348739329);
									if (65535 == 1606920449 * (Class386.autoWorld.worldID))
										Class386.autoWorld.worldID = -348739329;
									Class386.autoWorld.host = stream.readJagString();
									System.out.println("Address: " + Class386.autoWorld.host + " - world: " + ((Class386.autoWorld.worldID) * 1606920449));
									if (Class401.aClass401_6557 != StaticMethods.aClass401_2708) {
										Class386.autoWorld.anInt5954 = ((Class386.autoWorld.worldID) * -1670427267 + 815680320);
										Class386.autoWorld.anInt5955 = (-52655920 + (Class386.autoWorld.worldID) * 925746937);
									}
									if ((StaticMethods.aClass401_2708 != Class401.aClass401_6552) && ((StaticMethods.aClass401_2708 != Class401.aClass401_6554) || (1806357379 * GameClient.localPrivilege < 2)) && (Class474.activeConnectionInfo.method6057(Class474.aClass471_5976))) {
										Class380.method4678();
									}
								}
								if (GameClient.aBoolean8811 && !GameClient.aBoolean8813 || GameClient.aBoolean8807) {
									try {
										Class466.method6021((GameClient.applet), "zap");
									} catch (Throwable throwable) {
										if (GameClient.aBoolean8639) {
											try {
												GameClient.applet.getAppletContext().showDocument((new URL(GameClient.applet.getCodeBase(), "blank.ws")), "tbi");
											} catch (Exception exception) {
												/* empty */
											}
										}
									}
								} else {
									try {
										Class466.method6021((GameClient.applet), "unzap");
									} catch (Throwable throwable) {
										/* empty */
									}
								}
								if (Class401.aClass401_6557 == StaticMethods.aClass401_2708)
									Class212.aClass212_2422.method1952();
								if (264 == Class360.loginType * -122629167) // World
																			// login
									Class360.loginStep = -101133317;
								else { // Lobby login
									Class360.loginStep = -395862839;
									Class78.method845(2);
									ObjectDefinition.method5789();
									Class439.loadGameState(14);
									Class360.activeConnection.INCOMMING_PACKET = null;
									break;
								}
							}
							if (-707576455 * Class360.loginStep == 163) {
								if (!Class360.activeConnection.getStream().isAvailable(3))
									break;
								Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 3);
								Class360.loginStep = -952382928;
							}
							if (-707576455 * Class360.loginStep == 176) {
								RsBitsBuffer stream = (Class360.activeConnection.bitsBuffer);
								stream.offset = 0;
								if (stream.method3661()) {
									if (!Class360.activeConnection.getStream().isAvailable(1))
										break;
									Class360.activeConnection.getStream().readBytes(stream.buffer, 3, 1);
								}
								Class360.activeConnection.INCOMMING_PACKET = IncommingPacket.getIncommingPackets()[stream.readUnsignedSmart()]; // receives
																																								// packet
																																								// animationID
								Class360.activeConnection.population = (stream.readUShort() * -1265692267); // stream
																															// required
																															// tileSpacesOccupied,
																															// prob
																															// packet
																															// tileSpacesOccupied
								Class360.loginStep = 1878180878;
							}
							if (158 == -707576455 * Class360.loginStep) {
								if (Class360.activeConnection.getStream().isAvailable((-866602563 * (Class360.activeConnection.population)))) {
									Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, (-866602563 * (Class360.activeConnection.population)));
									Class360.activeConnection.bitsBuffer.offset = 0;
									int packetSize = ((Class360.activeConnection.population) * -866602563);
									Class360.loginStep = -395862839;
									Class78.method845(2);
									GameContext.method5579(-2092028687);
									Class51.decodeLswp((Class360.activeConnection.bitsBuffer), 837096225);
									int i_16_ = packetSize - (Class360.activeConnection.bitsBuffer.offset) * 385051775;
									RsBitsBuffer stream = new RsBitsBuffer(i_16_);
									System.arraycopy((Class360.activeConnection.bitsBuffer.buffer), ((Class360.activeConnection.bitsBuffer.offset) * 385051775), stream.buffer, 0, i_16_);
									Class360.activeConnection.bitsBuffer.offset += i_16_ * 116413311;
									if ((Class360.activeConnection.INCOMMING_PACKET) == IncommingPacket.LOAD_MAP_SCENE_DYNAMIC_PACKET)
										GameClient.myRegion.sendMapScene(new MapLoadBuffer((MapLoad.LOAD_MAP_SCENE_DYNAMIC), stream));
									else
										GameClient.myRegion.sendMapScene(new MapLoadBuffer((MapLoad.LOAD_MAP_SCENE_NORMAL), stream));
									if (packetSize != (Class360.activeConnection.bitsBuffer.offset) * 385051775)
										throw new RuntimeException(new StringBuilder().append(385051775 * (Class360.activeConnection.bitsBuffer.offset)).append(" ").append(packetSize).toString());
									Class360.activeConnection.INCOMMING_PACKET = null;
								}
							} else {
								if (193 != Class360.loginStep * -707576455)
									break;
								if (-2 == (-866602563 * (Class360.activeConnection.population))) {
									if (!Class360.activeConnection.getStream().isAvailable(2))
										break;
									Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, 2);
									Class360.activeConnection.bitsBuffer.offset = 0;
									Class360.activeConnection.population = (Class360.activeConnection.bitsBuffer.readUShort() * -1265692267);
								}
								if (Class360.activeConnection.getStream().isAvailable((-866602563 * (Class360.activeConnection.population)))) {
									Class360.activeConnection.getStream().readBytes((Class360.activeConnection.bitsBuffer.buffer), 0, (Class360.activeConnection.population) * -866602563);
									Class360.activeConnection.bitsBuffer.offset = 0;
									int i_17_ = ((Class360.activeConnection.population) * -866602563);
									Class360.loginStep = -395862839;
									Class78.method845(15);
									Class431.method5766();
									Class51.decodeLswp((Class360.activeConnection.bitsBuffer), 822397380);
									if ((385051775 * (Class360.activeConnection.bitsBuffer.offset)) != i_17_)
										throw new RuntimeException(new StringBuilder().append((Class360.activeConnection.bitsBuffer.offset) * 385051775).append(" ").append(i_17_).toString());
									Class360.activeConnection.INCOMMING_PACKET = null;
								}
							}
						}
					} catch (IOException ioexception) {
						Class360.activeConnection.stopConnection();
						if (1820934059 * Class360.loginErrors < 3) {
							if (264 == -122629167 * Class360.loginType)
								Class474.activeConnectionInfo.method6058();
							else
								Class241.lobbyConnectionInfo.method6058();
							Class360.loginTicks = 0;
							Class360.loginErrors += -72367357;
							Class360.loginStep = -455386772;
						} else {
							Class360.loginStep = -395862839;
							Class78.method845(-4);
							StaticMethods.method4693();
						}
						break;
					}
					break;
				} while (false);
			}
	}

	static void method5981(boolean socialNetworkLogin, boolean bool_18_, String username, String password, long accountName) {
		try {
			Class360.socialNetworkLogin = socialNetworkLogin;
			if (!bool_18_)
				Class360.socialNetworkId = -2035975497;
			Class360.aBoolean3870 = bool_18_;
			Class360.username = username;
			Class360.password = password;
			Class360.accountName = accountName * -2742373017286080113L;
			if (!Class360.aBoolean3870 && (Class360.username.equals("") || Class360.password.equals("")))
				Class78.method845(3);
			else {
				if (Class360.loginType * -122629167 != 136) {
					Class360.anInt3908 = 0;
					Class360.anInt3910 = -1200969765;
					Class360.anInt3909 = -1719895145;
				}
				Class360.activeConnection.aBoolean347 = false;
				Class78.method845(-3);
				Class360.loginStep = -455386772;
				Class360.loginTicks = 0;
				Class360.loginErrors = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sy.e(").append(')').toString());
		}
	}
}
