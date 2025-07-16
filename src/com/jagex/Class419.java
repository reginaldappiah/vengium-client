package com.jagex;/* Class419 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.network.OutgoingPacket;
import com.jagex.utils.CameraUtils;
import com.jagex.utils.TimeUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Class419 {
	static int anInt5341;

	Class419() throws Throwable {
		throw new Error();
	}

	public static void method5602(int[] keys, Object[] objects, int i, int i_0_) {
		try {
			if (i < i_0_) {
				int i_2_ = (i_0_ + i) / 2;
				int i_3_ = i;
				int i_4_ = keys[i_2_];
				keys[i_2_] = keys[i_0_];
				keys[i_0_] = i_4_;
				Object object = objects[i_2_];
				objects[i_2_] = objects[i_0_];
				objects[i_0_] = object;
				int i_5_ = 2147483647 == i_4_ ? 0 : 1;
				for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
					if (keys[i_6_] < (i_6_ & i_5_) + i_4_) {
						int i_7_ = keys[i_6_];
						keys[i_6_] = keys[i_3_];
						keys[i_3_] = i_7_;
						Object object_8_ = objects[i_6_];
						objects[i_6_] = objects[i_3_];
						objects[i_3_++] = object_8_;
					}
				}
				keys[i_0_] = keys[i_3_];
				keys[i_3_] = i_4_;
				objects[i_0_] = objects[i_3_];
				objects[i_3_] = object;
				method5602(keys, objects, i, i_3_ - 1);
				method5602(keys, objects, i_3_ + 1, i_0_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rj.posX(").append(')').toString());
		}
	}

	static boolean method5603(IComponentDefinition componentDefinition) {
		try {
			IComponentSettings IComponentSettings = GameClient.getComponentSettings(componentDefinition);
			if (IComponentSettings.method3493() > 0)
				return true;
			if (IComponentSettings.method3496())
				return true;
            return null != componentDefinition.aClass105_1233;
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rj.lo(").append(')').toString());
		}
	}

	static final void method5604(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = AwtMouse.mouse.method3878() ? 1 : 0;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = AwtMouse.mouse.method3887() ? 1 : 0;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = AwtMouse.mouse.method3880() ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rj.vg(").append(')').toString());
		}
	}

	public static void executeCommand(String commandString, boolean clientCommand, boolean unknown) {
		try {
			do {
				try {
					if (commandString.equalsIgnoreCase("commands") || commandString.equalsIgnoreCase("help")) {
						StaticMethods.sendConsoleMessage("commands - This command");
						StaticMethods.sendConsoleMessage("cls - Clear console");
						StaticMethods.sendConsoleMessage("displayfps - Toggle FPS and other information");
						StaticMethods.sendConsoleMessage("renderer - Print graphics renderer information");
						StaticMethods.sendConsoleMessage("heap - Print java memory information");
						StaticMethods.sendConsoleMessage("getcamerapos - Print location and direction of camera for use in bug reports");
					} else if (commandString.equalsIgnoreCase("cls")) {
						Class8.anInt102 = 0;
						Class8.anInt103 = 0;
					} else if (commandString.equalsIgnoreCase("displayfps")) {
						GameClient.viewingFPS = !GameClient.viewingFPS;
						if (GameClient.viewingFPS)
							StaticMethods.sendConsoleMessage("FPS on");
						else
							StaticMethods.sendConsoleMessage("FPS off");
					} else if (commandString.equals("renderer")) {
						ToolkitDesciption toolkitDesciption = GameClient.activeGraphicsToolkit.getDescription();
						StaticMethods.sendConsoleMessage(new StringBuilder().append("Toolkit Type: ").append(SettingsManager.settingsManager.toolkitSetting.getValue()).toString());
						StaticMethods.sendConsoleMessage(new StringBuilder().append("Vendor: ").append(toolkitDesciption.vendor * 267107087).toString());
						StaticMethods.sendConsoleMessage(new StringBuilder().append("Name: ").append(toolkitDesciption.renderer).toString());
						StaticMethods.sendConsoleMessage(new StringBuilder().append("Version: ").append(toolkitDesciption.version * 1959468245).toString());
						StaticMethods.sendConsoleMessage(new StringBuilder().append("Device: ").append(toolkitDesciption.device).toString());
						StaticMethods.sendConsoleMessage(new StringBuilder().append("Driver Version: ").append(toolkitDesciption.driverVersion * 703334160035735425L).toString());
					} else if (commandString.equals("heap"))
						StaticMethods.sendConsoleMessage(new StringBuilder().append("Heap: ").append(GameShell.maximumMemory * 1126040225).append("MB").toString());
					else {
						if (!commandString.equalsIgnoreCase("getcamerapos"))
							break;
						GameScene gameScene = GameClient.myRegion.getGameScene();

						StaticMethods.sendConsoleMessage(new StringBuilder().append("Pos: ").append(Player.myPlayer.plane).append(",").append(((-1740717447 * GameClient.camPosX >> 9) + gameScene.gameSceneBaseX * -1760580017) >> 6).append(",").append(((GameClient.camPosZ * -299812095 >> 9) + 283514611 * gameScene.gameSceneBaseY) >> 6).append(",").append((-1760580017 * gameScene.gameSceneBaseX + (-1740717447 * GameClient.camPosX >> 9)) & 0x3f).append(",").append((gameScene.gameSceneBaseY * 283514611 + (-299812095 * GameClient.camPosZ >> 9)) & 0x3f).append(" Height: ").append((Class356.getAverageHeight(GameClient.camPosX * -1740717447, GameClient.camPosZ * -299812095, (Player.myPlayer.plane), -1453034846)) - GameClient.camPosY * 1449634147).toString());

						StaticMethods.sendConsoleMessage(new StringBuilder().append("Look: ").append(Player.myPlayer.plane).append(",").append((-1125224763 * StaticMethods.anInt6292 + gameScene.gameSceneBaseX * -1760580017) >> 6).append(",").append((283514611 * gameScene.gameSceneBaseY + IPAddress.anInt5959 * -1758389953) >> 6).append(",").append((gameScene.gameSceneBaseX * -1760580017 + -1125224763 * StaticMethods.anInt6292) & 0x3f).append(",").append((283514611 * gameScene.gameSceneBaseY + -1758389953 * IPAddress.anInt5959) & 0x3f).append(" Height: ").append((Class356.getAverageHeight(StaticMethods.anInt6292 * -1125224763, -1758389953 * IPAddress.anInt5959, (Player.myPlayer.plane), -860898067)) - 771695069 * Class18.anInt255).toString());

					}
				} catch (Exception exception) {
					StaticMethods.sendConsoleMessage(Tradution.ERROR_EXECUTING_COMMAND.translate(GameLanguage.CURRENT_LANGUAGE));
				}
				return;
			} while (false);
			if (StaticMethods.aClass401_2708 != Class401.aClass401_6557 || 1806357379 * GameClient.localPrivilege >= 2) {
				try {
					if (commandString.equalsIgnoreCase("wm1")) {
						Class357.method4276(1, -1, -1, false);
						if (Class190.windowMode() == 1)
							StaticMethods.sendConsoleMessage("Success");
						else
							StaticMethods.sendConsoleMessage("Failure");
						return;
					}
					if (commandString.equalsIgnoreCase("wm2")) {
						Class357.method4276(2, -1, -1, false);
						if (Class190.windowMode() == 2)
							StaticMethods.sendConsoleMessage("Success");
						else
							StaticMethods.sendConsoleMessage("Failure");
						return;
					}
					if (GameClient.fullscreen && commandString.equalsIgnoreCase("wm3")) {
						Class357.method4276(3, 1024, 768, false);
						if (Class190.windowMode() == 3)
							StaticMethods.sendConsoleMessage("Success");
						else
							StaticMethods.sendConsoleMessage("Failure");
						return;
					}
					if (commandString.equalsIgnoreCase("tk0")) {
						Class370.loadingPleaseWait(ToolkitOption.PUREJAVA, false);
						if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.PUREJAVA) {
							StaticMethods.sendConsoleMessage("Success");
							SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.desiredToolkit), ToolkitOption.PUREJAVA);
							ToMoveSettings.encodeBuffer();
							GameClient.sentPreferences = false;
						} else
							StaticMethods.sendConsoleMessage("Failure");
						return;
					}
					if (commandString.equalsIgnoreCase("tk1")) {
						Class370.loadingPleaseWait(ToolkitOption.OPENGL, false);
						if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.OPENGL) {
							StaticMethods.sendConsoleMessage("Success");
							SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.desiredToolkit), ToolkitOption.OPENGL);
							ToMoveSettings.encodeBuffer();
							GameClient.sentPreferences = false;
						} else
							StaticMethods.sendConsoleMessage("Failure");
						return;
					}
					if (commandString.equalsIgnoreCase("tk2")) {
						Class370.loadingPleaseWait(ToolkitOption.SSE, false);
						if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.SSE) {
							StaticMethods.sendConsoleMessage("Success");
							SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.desiredToolkit), ToolkitOption.SSE);
							ToMoveSettings.encodeBuffer();
							GameClient.sentPreferences = false;
						} else
							StaticMethods.sendConsoleMessage("Failure");
						return;
					}
					if (commandString.equalsIgnoreCase("tk3")) {
						Class370.loadingPleaseWait(ToolkitOption.DIRECTXSPECIAL, false);
						if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.DIRECTXSPECIAL) {
							StaticMethods.sendConsoleMessage("Success");
							SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.desiredToolkit), ToolkitOption.DIRECTXSPECIAL);
							ToMoveSettings.encodeBuffer();
							GameClient.sentPreferences = false;
						} else
							StaticMethods.sendConsoleMessage("Failure");
						return;
					}
					if (commandString.equalsIgnoreCase("tk5")) {
						Class370.loadingPleaseWait(ToolkitOption.OPENGLSPECIAL, false);
						if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.OPENGLSPECIAL) {
							StaticMethods.sendConsoleMessage("Success");
							SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.desiredToolkit), ToolkitOption.OPENGLSPECIAL);
							ToMoveSettings.encodeBuffer();
							GameClient.sentPreferences = false;
						} else
							StaticMethods.sendConsoleMessage("Failure");
						return;
					}
					if (commandString.equalsIgnoreCase("clientdrop")) {
						if (0 == GameClient.gameState * -1233866115)
							SubIncommingPacket.method1923();
						else if (17 == -1233866115 * GameClient.gameState)
							ConnectionType.gameConnection.aBoolean347 = true;
						return;
					}
					if (commandString.equalsIgnoreCase("breakcon")) {
						ConnectionType[] connectionTypes = GameClient.aConnectionTypeArray8679;
						for (int i_10_ = 0; i_10_ < connectionTypes.length; i_10_++) {
							ConnectionType connectionType = connectionTypes[i_10_];
							if (connectionType.getStream() != null)
								connectionType.getStream().method3867((byte) 100);
						}
						PaddedResourceWorker.protocol.method2353((short) 2067);
						return;
					}
					if (commandString.startsWith("getclientvarpbit")) {
						int i_11_ = Integer.parseInt(commandString.substring(17));
						StaticMethods.sendConsoleMessage(new StringBuilder().append("varpbit=").append(Class128.playerVarsProvider.method250(i_11_)).toString());
						return;
					}
					if (commandString.startsWith("getclientvarp")) {
						int i_12_ = Integer.parseInt(commandString.substring(14));
						StaticMethods.sendConsoleMessage(new StringBuilder().append("varp=").append(Class128.playerVarsProvider.method252(i_12_)).toString());
						return;
					}
					if (commandString.startsWith("directlogin")) {
						String[] strings = (Class365_Sub1_Sub3_Sub1.method4508(commandString.substring(12), ' '));
						if (2 == strings.length)
							Class63.directLogin(strings[0], strings[1]);
						return;
					}
					if (commandString.startsWith("snlogin ")) {
						String[] strings = (Class365_Sub1_Sub3_Sub1.method4508(commandString.substring(8), ' '));
						int i_13_ = Integer.parseInt(strings[0]);
						Class124.method1385(i_13_, (byte) -22);
						return;
					}
					if (commandString.startsWith("setoutput ")) {
						File file = new File(commandString.substring(10));
						if (file.exists()) {
							file = new File(new StringBuilder().append(commandString.substring(10)).append(".").append(TimeUtils.getTime()).append(".log").toString());
							if (file.exists()) {
								StaticMethods.sendConsoleMessage("file already exists!");
								return;
							}
						}
						if (null != Class78.aFileOutputStream731) {
							Class78.aFileOutputStream731.close();
							Class78.aFileOutputStream731 = null;
						}
						try {
							Class78.aFileOutputStream731 = new FileOutputStream(file);
						} catch (FileNotFoundException filenotfoundexception) {
							StaticMethods.sendConsoleMessage(new StringBuilder().append("Could not create ").append(file.getName()).toString());
						} catch (SecurityException securityexception) {
							StaticMethods.sendConsoleMessage(new StringBuilder().append("Cannot write to ").append(file.getName()).toString());
						}
						return;
					}
					if (commandString.equals("closeoutput")) {
						if (Class78.aFileOutputStream731 != null)
							Class78.aFileOutputStream731.close();
						Class78.aFileOutputStream731 = null;
						return;
					}
					if (commandString.startsWith("runscript ")) {
						File file = new File(commandString.substring(10));
						if (!file.exists()) {
							StaticMethods.sendConsoleMessage("No such file");
							return;
						}
						byte[] is = StaticMethods.method4311(file);
						if (null == is) {
							StaticMethods.sendConsoleMessage("Failed to read file");
							return;
						}
						String[] strings = (Class365_Sub1_Sub3_Sub1.method4508((Class123.method1378(Class146.method1598(is, 1704231187), '\r', "", (short) 316)), '\n'));
						Class55.method606(strings, 408166320);
					}
					if (GameClient.gameState * -1233866115 == 0) {
						OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.COMMANDS_PACKET, (ConnectionType.gameConnection.encryptor));
						outgoingPacketBuffer.payload.writeByte(commandString.length() + 3);
						outgoingPacketBuffer.payload.writeByte(clientCommand ? 1 : 0);
						outgoingPacketBuffer.payload.writeByte(unknown ? 1 : 0);
						outgoingPacketBuffer.payload.writeString(commandString);
						ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
					}
				} catch (Exception exception) {
					StaticMethods.sendConsoleMessage(Tradution.ERROR_EXECUTING_COMMAND.translate(GameLanguage.CURRENT_LANGUAGE));
					return;
				}
			}
			if (GameClient.gameState * -1233866115 != 0)
				StaticMethods.sendConsoleMessage(new StringBuilder().append(Tradution.UNKNOWN_COMMAND.translate(GameLanguage.CURRENT_LANGUAGE)).append(commandString).toString());
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rj.t(").append(')').toString());
		}
	}
}
