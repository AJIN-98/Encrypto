package com.hp.Encrypto.controller;

import com.hp.Encrypto.service.EncryptService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/api/v1/crypto")
@RestController
public class CryptoController {
    @Autowired
    EncryptService encryptService;
    @PostMapping("/encrypt")
    public ResponseEntity<File> encrypt(
            @Validated @RequestParam("file") MultipartFile multipartFile,@RequestParam("key") String key ) throws IOException {
        File file = new File("src/main/resources/files/enc/crypt.txt");
        FileUtils.writeByteArrayToFile(file, multipartFile.getBytes());
        return ResponseEntity.ok(encryptService.EncryptFile(key, file));
    }
    @PostMapping("/decrypt")
    public ResponseEntity<File> decrypt(
            @Validated @RequestParam("file") MultipartFile multipartFile,@RequestParam("key") String key ) throws IOException {
        File file = new File("src/main/resources/files/enc/crypt.txt");
        FileUtils.writeByteArrayToFile(file, multipartFile.getBytes());
        return ResponseEntity.ok(encryptService.DecryptFile(key, file));
    }
}
