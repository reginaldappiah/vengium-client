package com.jagex;/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

public class Class48 {
    static int[] params = new int[2];
    int shaderType;
    OpenGLGraphicsToolkit toolkit;

    Class48(OpenGLGraphicsToolkit graphicsToolkit, int shaderType) {
        this.toolkit = graphicsToolkit;
        this.shaderType = shaderType;
    }

    static Class48 method526(OpenGLGraphicsToolkit toolkit, int type, String string) {
        int shaderType = OpenGL.glCreateShader(type);
        OpenGL.glShaderSource(shaderType, string);
        OpenGL.glCompileShader(shaderType);
        OpenGL.glGetShaderiv(shaderType, 35713, params, 0);
        if (params[0] == 0) {
            if (params[0] == 0)
                OpenGL.glGetShaderiv(shaderType, 35716, params, 1);
            if (params[1] > 1) {
                byte[] is = new byte[params[1]];
                OpenGL.glGetShaderInfoLog(shaderType, params[1], params, 0, is, 0);
            }
            if (params[0] == 0) {
                OpenGL.glDeleteShader(shaderType);
                return null;
            }
        }
        return new Class48(toolkit, shaderType);
    }
}
