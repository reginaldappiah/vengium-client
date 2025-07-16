package com.jagex;/* Connection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class LoginConnection {
    public static LoginConnection LOGIN_REQUEST = new LoginConnection(14);
    public static LoginConnection UPDATE = new LoginConnection(15);
    public static LoginConnection newLoginConnectionLoginInit = new LoginConnection(16);
    public static LoginConnection newLoginConnectionLoginLobby = new LoginConnection(19);
    public static LoginConnection aLoginConnection_2407 = new LoginConnection(23);
    public static LoginConnection aLoginConnection_2412 = new LoginConnection(24);
    public static LoginConnection aLoginConnection_2419 = new LoginConnection(26);
    public static LoginConnection aLoginConnection_2414 = new LoginConnection(27);
    public static LoginConnection aLoginConnection_2415 = new LoginConnection(28);
    public static LoginConnection initSocialGameconnection = new LoginConnection(29);
    public static LoginConnection SOCIAL_LOGIN = new LoginConnection(30);
    static LoginConnection[] loginConnections = new LoginConnection[32];

    static {
        LoginConnection[] loginConnections = LoginConnection.getConnection();
        for (int i = 0; i < loginConnections.length; i++)
            LoginConnection.loginConnections[-1813470547 * loginConnections[i].type] = loginConnections[i];
    }

    public int type;

    LoginConnection(int type) {
        this.type = type * 876548389;
    }

    static LoginConnection[] getConnection() {
        return (new LoginConnection[]{UPDATE, LOGIN_REQUEST, aLoginConnection_2412, aLoginConnection_2407, aLoginConnection_2419, aLoginConnection_2414, newLoginConnectionLoginLobby, SOCIAL_LOGIN, initSocialGameconnection, newLoginConnectionLoginInit, aLoginConnection_2415});
    }
}
