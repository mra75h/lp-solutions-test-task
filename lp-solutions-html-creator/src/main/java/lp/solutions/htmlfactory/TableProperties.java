package lp.solutions.htmlfactory;

import lombok.Data;
import lp.solutions.htmlfactory.enums.BorderStyle;
import lp.solutions.htmlfactory.enums.Color;

@Data
public class TableProperties {

    private int px = 0;

    private BorderStyle borderStyle = BorderStyle.SOLID;

    private Color color = Color.BLACK;
}
