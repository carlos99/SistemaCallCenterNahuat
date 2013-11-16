/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.backing.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author joshy
 */
@ManagedBean
@RequestScoped
public class plugin implements Serializable {

    public static final javax.faces.application.FacesMessage.Severity mInfo = FacesMessage.SEVERITY_INFO;
    public static final javax.faces.application.FacesMessage.Severity mWarn = FacesMessage.SEVERITY_WARN;
    public static final javax.faces.application.FacesMessage.Severity mError = FacesMessage.SEVERITY_ERROR;
    public static final String propertiesData = "data.properties";
    // variables
    BufferedReader bufferUrl = null;

    /** Creates a new instance of plugin */
    public plugin() {
    }

    //<editor-fold defaultstate="collapsed" desc="setters and getters">
    public BufferedReader getBufferUrl() {
        return bufferUrl;
    }

    public void setBufferUrl(BufferedReader bufferUrl) {
        this.bufferUrl = bufferUrl;
    }
    //</editor-fold>

    public static void message(javax.faces.application.FacesMessage.Severity type, String title, String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(type, title, message));
    }

    public static void message(javax.faces.application.FacesMessage.Severity type, String title) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(type, title, null));
    }

    public  static void messageError(String text) {
        message(mError, text);
    }

    public Properties getProperties(String file) {
        try {
            //se crea una instancia a la clase Properties
            Properties propiedades = new Properties();
            //se leen el archivo .properties
            propiedades.load(getClass().getResourceAsStream(file));
            //si el archivo de propiedades NO esta vacio retornan las propiedes leidas
            if (!propiedades.isEmpty()) {
                return propiedades;
            } else {//sino  retornara NULL
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public String getUrl(String url) { // obtiene contenido de una URL
        String response = "";
        try {
            URL urlRequest = new URL(url);
            bufferUrl = new BufferedReader(new InputStreamReader(urlRequest.openStream()));
            return response = "successful";
        } catch (MalformedURLException ex) {
            response = "MalformedURLException " + ex.getMessage();
        } catch (IOException ioe) {
            response = "IOException " + ioe.getMessage();
        }
        return response;
    }

    public String newFile(BufferedReader from, String name) {
        try {
            File file = new File(name);
            String test = "";
            PrintWriter writeFile = new PrintWriter(new FileWriter(file));
            while ((test = from.readLine()) != null) {
                writeFile.println(test);
            }
            from.close();
            writeFile.flush();
            writeFile.close();
            return "successful";
        } catch (Exception ex) {
            return "newFile " + ex.getMessage();
        }
    }

    public String executeCommand(String command) {  //reiniciar conexiones de kannel 'core'
        String s = "", response = "";
        try {
            // Ejcutamos el comando
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            // Leemos la salida del comando
            while ((s = stdInput.readLine()) != null) {
                response = response + " " + s;
            } // Leemos los errores si los hubiera
            while ((s = stdError.readLine()) != null) {
                response = response + " " + s;
            }
            stdInput.close();
            stdError.close();
            p.destroy();
            //System.exit(0);
        } catch (IOException ee) {
            response = "Error " + ee.getMessage();
        }
        return response;
    }

    public static String avoidSQL(String data) {
        String replace[] = {"'", "\"", "´", "`", ";", ":", "/", "\\", "=", "#", "*", "%", "[", "]", "_", "-", "$", "<", ">"};
        data = data.trim();
        for (String re : replace) {
            data = data.replace(re, "");
        }
        return data;
    }

    public static void redirec(String pagina) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(pagina);
        } catch (IOException ex) {
            message(mError, "kadmin error: " + ex.getMessage());
        }
    }

    public static String md5(String word) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(word.getBytes(Charset.forName("UTF8")));
            final byte[] resultByte = messageDigest.digest();
            word = new String(ConvByteToHex(resultByte));
            return word;
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }

    public static char[] ConvByteToHex(byte[] datos) {
        String resultado = "";
        ByteArrayInputStream input = new ByteArrayInputStream(datos);
        String cadAux;
        int leido = input.read();
        while (leido != -1) {
            cadAux = Integer.toHexString(leido);
            if (cadAux.length() < 2) //Hay que añadir un 0 
            {
                resultado += "0";
            }
            resultado += cadAux;
            leido = input.read();
        }
        return resultado.toCharArray();
    }

    public static byte[] convHexToByte(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }
}
