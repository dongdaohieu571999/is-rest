package com.is.issystem.controller;

import com.google.api.client.util.Value;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping(value = "/api/file_management")
public class FileManagementController {

    @Autowired
    private Storage storage;

    @Value("${file.storage}")
    private Resource localfilepath;

    @PostMapping(value = "/upload_file")
    public ResponseEntity uploadFile(@RequestBody String fileName) throws IOException {
        BlobId blobId = BlobId.of("is-solution.appspot.com",fileName);
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
        File fileToRead = new File("gcp-credencial.json");
        byte[] data = Files.readAllBytes(Paths.get(fileToRead.toURI()));
        storage.create(blobInfo,data);
        return ResponseEntity.status(HttpStatus.OK).body(fileName);
    }
}
