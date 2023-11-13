package com.hp.Encrypto.service;

import com.hp.Encrypto.Exception.CryptoException;
import com.hp.Encrypto.utils.CryptoUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.File;
@Service
@Log4j2
public class EncryptServiceImpl implements EncryptService {
    @Override
    public File EncryptFile(String key,File inputFile) {
        File encryptedFile = new File("src/main/resources/files/enc/crypt.txt");
        try {
            CryptoUtils.encrypt(key, inputFile, encryptedFile);
        } catch (CryptoException ex) {
            log.info(ex.getMessage());
            ex.printStackTrace();
        }
        return encryptedFile;
    }

    @Override
    public File DecryptFile(String key,File inputFile) {
        File decryptedFile = new File("src/main/resources/files/enc/crypt.txt");
        try {
            CryptoUtils.encrypt(key, inputFile, decryptedFile);
        } catch (CryptoException ex) {
            log.info(ex.getMessage());
            ex.printStackTrace();
        }
        return decryptedFile;
    }

    @Override
    public void FlushStorage() {
        File recycle = new File("src/main/resources/files/enc/crypt.txt");
        recycle.delete();

    }
}
