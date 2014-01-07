package com.baobaotao.placeholder;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

import sun.misc.BASE64Encoder;

public class DESUtils {
    private static Key key;
    private static String KEY_STR = "myKey";
    
    static {
        try {
            KeyGenerator generator = KeyGenerator.getInstance("DES");
            generator.init(new SecureRandom(KEY_STR.getBytes()));
            key = generator.generateKey();
            generator = null;
        } catch (NoSuchAlgorithmException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
    
    
    public static String getEncryptString(String str){
        BASE64Encoder base64Encoder = new BASE64Encoder();
        try {
            byte[] strBytes = str.getBytes();
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptStrBytes = cipher.doFinal(strBytes);
            return base64Encoder.encode(encryptStrBytes);
            
        } catch (NoSuchAlgorithmException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (BadPaddingException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        return null;
        
    }
    
    public static void main(String[] args){
        System.out.println(getEncryptString("123456789a"));
    }
    
}
