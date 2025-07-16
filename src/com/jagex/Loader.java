package com.jagex;

import com.gui.SyncbotPanel;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Properties;

@SuppressWarnings("serial")
public class Loader extends Applet implements ActionListener {

	public static final int REVISION = 718;
	public static final int LOBBY_PORT = 43594;
	public static Properties client_parameters = new Properties();
	public static boolean useIsaac;
	public static String IP = "vengium.onthewifi.com";
	//public static String IP = "127.0.0.1";
	public static boolean OLDSCHOOL_RSMVER = true;
	public static boolean LOBBY_ENABLED;
	public static boolean DISABLE_XTEA_CRASH = true;
	public static boolean DISABLE_USELESS_PACKETS = false;
	public static boolean DISABLE_RSA;
	public static String LOBBY_IP = "127.0.0.1";
	public static int SUB_REVISION = 3;
	//public static JMenuBar menuBar;
	public static JFrame frame;
	public JPanel mainPanel = new JPanel();
	JTabbedPane tabbedPane = new JTabbedPane();
	SyncbotPanel syncbotPanel = new SyncbotPanel();
	//private JMenu file, syncbot;
	private JMenuItem test, botpanel;

	public static void main(String[] strings) throws Exception {
		Loader loader = new Loader();
		loader.doFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void init() {
		doApplet();
	}

	void doApplet() {
		setParams();
		startClient();
	}

	public void doFrame() {
		setParams();
		addComponents();
		startClient();
	}

	void setParams() {
		client_parameters.put("separate_jvm", "true");
		client_parameters.put("boxbgcolor", "blue");
		client_parameters.put("image", "http://www.runescape.com/img/game/splash2.gif");
		client_parameters.put("centerimage", "true");
		client_parameters.put("boxborder", "true");
		client_parameters.put("java_arguments", "-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
		client_parameters.put("27", "0");
		client_parameters.put("1", "0");
		client_parameters.put("16", "false");
		client_parameters.put("17", "false");
		client_parameters.put("21", "1"); // WORLD ID
		client_parameters.put("30", "false");
		client_parameters.put("20", LOBBY_IP);
		client_parameters.put("29", "");
		client_parameters.put("11", "true");
		client_parameters.put("25", "1378752098");
		client_parameters.put("28", "0");
		client_parameters.put("8", ".runescape.com");
		client_parameters.put("23", "false");
		client_parameters.put("32", "0");
		client_parameters.put("15", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
		client_parameters.put("0", "IjGJjn4L3q5lRpOR9ClzZQ");
		client_parameters.put("2", "");
		client_parameters.put("4", "1"); // WORLD ID
		client_parameters.put("14", "");
		client_parameters.put("5", "8194");
		client_parameters.put("-1", "QlwePyRU5GcnAn1lr035ag");
		client_parameters.put("6", "0");
		client_parameters.put("24", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
		client_parameters.put("3", "hAJWGrsaETglRjuwxMwnlA/d5W6EgYWx");
		client_parameters.put("12", "false");
		client_parameters.put("13", "0");
		client_parameters.put("26", "0");
		client_parameters.put("9", "77");
		client_parameters.put("22", "false");
		client_parameters.put("18", "false");
		client_parameters.put("33", "");
		client_parameters.put("haveie6", "false");
	}

	void addComponents() {
		frame = new JFrame("Vengium Test Project");
		frame.setLayout(new BorderLayout());

		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(this);

		tabbedPane.setPreferredSize(new Dimension(1000, 650));
		tabbedPane.add("Main Game", mainPanel);
		tabbedPane.add("Synbot Panel", syncbotPanel);

		frame.add(tabbedPane);
	}

	void startClient() {
		try {
			GameClient client = new GameClient();
			client.supplyApplet(this);

			client.init();
			client.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public String getParameter(String string) {
		return (String) client_parameters.get(string);
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public URL getCodeBase() {
		URL url;
		try {
			url = new URL("http://" + IP);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return url;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int action = Integer.parseInt(e.getActionCommand());
		switch (action) {
		case 1:
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			break;

		}
	}
}
