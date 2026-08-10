package org.example.aifile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class PDFService {
    public int uploadPDF(MultipartFile file) {
        return 0;
    }
}