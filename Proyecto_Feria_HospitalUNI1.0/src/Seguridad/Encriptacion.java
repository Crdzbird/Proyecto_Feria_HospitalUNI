/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad;

import java.math.BigInteger;

/**
 *
 * @author crdzbird
 */
public class Encriptacion {

    private BigInteger p;
    private BigInteger q;
    private BigInteger N;
    private BigInteger phi;
    private BigInteger e;
    private BigInteger d;
    private int bitlength = 1024;
    private int blocksize = 256;
    
    
    
//        String teststring;
//        System.out.println("Enter the plain text:");
//        teststring = in.readLine();
//        System.out.println("Encrypting String: " + teststring);
//        System.out.println("String in Bytes: " + bytesToString(teststring.getBytes()));
//
//        // encrypt
//        byte[] encrypted = rsa.encrypt(teststring.getBytes());
//        System.out.println("Encrypted String in Bytes: " + bytesToString(encrypted));
//
//        // decrypt
//        byte[] decrypted = rsa.decrypt(encrypted);
//        System.out.println("Decrypted String in Bytes: " + bytesToString(decrypted));
//
//        System.out.println("Decrypted String: " + new String(decrypted));
    

    private static String bytesToString(byte[] encrypted) {
        String contenido = "";
        for (byte b : encrypted) {
            contenido += Byte.toString(b);
        }
        return contenido;
    }

    //Encrypt message
    public byte[] encrypt(byte[] message) {
        return (new BigInteger(message)).modPow(e, N).toByteArray();
    }

// Decrypt message
    public byte[] decrypt(byte[] message) {
        return (new BigInteger(message)).modPow(d, N).toByteArray();
    }

}
