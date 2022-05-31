package org.zy.file.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

@RestController
public class FileTestController {

    @PostMapping("/upload")
    public ResponseEntity<?> fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        var bufferStream = new BufferedInputStream(file.getInputStream());
        var file1 = new File("C:\\Users\\Pike\\Desktop\\a.zip");
        if (file1.exists()) {
            file1.createNewFile();
        }
        file.transferTo(file1);
        return ResponseEntity.ok("fdsfs");
    }


}
