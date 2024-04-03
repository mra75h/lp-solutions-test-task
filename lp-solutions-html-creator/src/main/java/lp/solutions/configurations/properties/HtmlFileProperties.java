package lp.solutions.configurations.properties;

import java.nio.file.Paths;

public abstract class HtmlFileProperties {

    public static String  templatesDirectory =
            Paths.get("src","main","resources","templates").toFile().getAbsolutePath();

}
