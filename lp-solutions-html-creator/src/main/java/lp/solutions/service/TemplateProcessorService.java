package lp.solutions.service;

import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.Map;

public interface TemplateProcessorService {

    void  createTemplate(String html, Map<String, Object> dataMap) throws IOException, TemplateException;
}
