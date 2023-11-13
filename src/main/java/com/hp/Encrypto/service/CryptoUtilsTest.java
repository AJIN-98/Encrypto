package com.hp.Encrypto.service;

import com.hp.Encrypto.Exception.CryptoException;
import com.hp.Encrypto.utils.CryptoUtils;

import java.io.File;

public class CryptoUtilsTest {
    public static void main(String[] args) {
        String key = "Mary has one cat";
        File inputFile = new File("src/main/resources/files/test.txt");
        File encryptedFile = new File("src/main/resources/files/enc/test.txt");
        File decryptedFile = new File("src/main/resources/files/unenc/test.txt");

        try {
            CryptoUtils.encrypt(key, inputFile, encryptedFile);
            CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
