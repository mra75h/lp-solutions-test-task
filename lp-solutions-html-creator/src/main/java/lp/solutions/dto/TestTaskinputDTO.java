package lp.solutions.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TestTaskinputDTO {

    private String name;
    private String url;
    private List<Map<String, String>> employee;
}
