package com.ysy.webmvc.viewtech.pdfexcel;

import java.util.Map;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.document.AbstractPdfView;

public class SamplePdfView extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model,
                                    Document document,
                                    PdfWriter writer,
                                    HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {
        document.add(new Paragraph("Hello PDF — title=" + model.get("title")));
        for (Object line : (Iterable<?>) model.getOrDefault("lines", java.util.List.of())) {
            document.add(new Paragraph(String.valueOf(line)));
        }
    }
}
