package com.ysy.webmvc.viewtech.pdfexcel;

import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

public class SampleXlsxView extends AbstractXlsxView {

    @Override
    @SuppressWarnings("unchecked")
    protected void buildExcelDocument(Map<String, Object> model,
                                      Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response) {
        Sheet sheet = workbook.createSheet("data");
        List<List<String>> rows = (List<List<String>>) model.getOrDefault("rows", List.of());
        for (int r = 0; r < rows.size(); r++) {
            Row row = sheet.createRow(r);
            List<String> cells = rows.get(r);
            for (int c = 0; c < cells.size(); c++) {
                row.createCell(c).setCellValue(cells.get(c));
            }
        }
    }
}
