package lp.solutions.api;

import freemarker.template.TemplateException;
import lp.solutions.htmlfactory.TableProperties;
import lp.solutions.htmlfactory.enums.BorderStyle;
import lp.solutions.htmlfactory.enums.Color;
import lp.solutions.service.TemplateProcessorService;
import lp.solutions.dto.TestTaskinputDTO;
import lp.solutions.htmlfactory.HtmlDocument;
import lp.solutions.util.DtoToMap;

import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.Map;

@RestController
public class MarkerController {

    private final TemplateProcessorService templateProcessorService;
    public MarkerController(TemplateProcessorService templateProcessorService) {
        this.templateProcessorService = templateProcessorService;
    }

    @PostMapping("/create-test-task-html")
    public void createTestTaskHtml(@RequestBody TestTaskinputDTO testTaskinputDTO) throws IOException, TemplateException, IllegalAccessException {
        TableProperties tableProperties = new TableProperties();
        tableProperties.setPx(1);
        String htmlDocument = new HtmlDocument()
                .title("${name} - Teszt Feladat").head()
                .header("Teszt Feladat").href("${url}", "Megoldás").paragraph()
                .paragraph("A feladat elkészítőjének adatai")
                .tr("Név", "${val.employeeName}", "employee")
                .tr("Elérhetőség", "${val.employeeContact}", "employee").table(tableProperties)
                .href("http://lpsolutions.hu","L&P Solutions").body()
                .html();


        Map<String, Object> dataMap = DtoToMap.map(testTaskinputDTO);
        templateProcessorService.createTemplate(htmlDocument, dataMap);
    }
}
