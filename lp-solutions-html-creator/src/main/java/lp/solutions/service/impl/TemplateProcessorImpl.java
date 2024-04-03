package lp.solutions.service.impl;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lp.solutions.configurations.properties.HtmlFileProperties;
import lp.solutions.service.TemplateProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

import java.util.Map;

@Service
public class TemplateProcessorImpl implements TemplateProcessorService {

    @Autowired
    private Configuration configuration;
    public void createTemplate(String html, Map<String, Object> dataMap) throws IOException, TemplateException {
        StringReader fileReader = new StringReader(html);
        Template template = new Template("", fileReader);
        template.process(dataMap, new FileWriter(HtmlFileProperties.templatesDirectory + "/test-task.html"));
    }
}
