package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloadController {

    private int downloadCount = 0;

    //Ifall man gör applikationen Server sided istället för ClientSided kommer denna i bruk
    @GetMapping("/download")
    public ResponseEntity<Void> downloadResume() {
        // Increment the download count
        downloadCount++;
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getDownloadCount")
    public ResponseEntity<Integer> getDownloadCount() {
        return ResponseEntity.ok(downloadCount);
    }

}
