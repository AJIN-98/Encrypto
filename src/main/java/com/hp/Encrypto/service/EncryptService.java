package com.hp.Encrypto.service;

import org.springframework.stereotype.Service;

import java.io.File;
@Service
public interface EncryptService {

    File EncryptFile(String key, File file);
    File DecryptFile(String key, File file);

    void FlushStorage();
}
