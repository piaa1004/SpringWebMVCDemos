package com.ysy.webmvc.dispatcherservlet.multipart;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        return String.format("received name=%s size=%d type=%s",
                file.getOriginalFilename(), file.getSize(), file.getContentType());
    }
}
