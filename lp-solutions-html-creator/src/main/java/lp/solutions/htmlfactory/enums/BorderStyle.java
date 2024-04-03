package lp.solutions.htmlfactory.enums;

public enum BorderStyle {

    DATTED ("datted"),
    DASHED ("dashed"),
    SOLID ("solid"),
    HIDDEN ("hidden"),
    DOUBLE ("double"),
    NONE ("none");
    public final String name;
    BorderStyle(String name) {
        this.name = name;
    }
}
