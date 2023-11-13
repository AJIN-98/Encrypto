package com.hp.Encrypto.service;

import com.hp.Encrypto.Exception.CryptoException;
import com.hp.Encrypto.utils.CryptoUtils;

import java.io.File;

public class EncryptServiceImpl implements EncryptService {
    @Override
    public File EncryptFile(String key,File inputFile) {
        File encryptedFile = new File("src/main/resources/files/enc/encrypted.txt");
        try {
            CryptoUtils.encrypt(key, inputFile, encryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return encryptedFile;
    }

    @Override
    public File DecryptFile(String key,File inputFile) {
        File decryptedFile = new File("src/main/resources/files/enc/decrypted.txt");
        try {
            CryptoUtils.encrypt(key, inputFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return decryptedFile;
    }

    @Override
    public void FlushStorage() {

    }
}
