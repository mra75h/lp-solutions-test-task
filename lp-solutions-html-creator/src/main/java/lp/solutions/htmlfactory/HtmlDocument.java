package lp.solutions.htmlfactory;

public class HtmlDocument {

    private final String content;

    public HtmlDocument() {
        this("");
    }

    public HtmlDocument(String html) {
        this.content = html;
    }

    public String html() { return "<html>"+ content +"</html>"; }

    public HtmlDocument header(String header) {
        return new HtmlDocument(content +"<h1>"+ header +"</h1>");
    }

    public HtmlDocument head() {
        return new HtmlDocument("<head>"+ content +"</head>");
    }

    public HtmlDocument title(String title) {
        return new HtmlDocument(content +"<title>"+ title +"</title>");
    }

    public HtmlDocument body() {
        return new HtmlDocument( "<body>"+ content +"</body>");
    }

    public HtmlDocument paragraph(String paragraph) {
        return new HtmlDocument( content + "<p>"+ paragraph +"</p>");
    }

    public HtmlDocument paragraph() {
        return new HtmlDocument( "<p>"+ content +"</p>");
    }

    public HtmlDocument href(String webAddress, String text) {
        return new HtmlDocument( content + " <a href=\""+ webAddress +"\">"+ text +"</a>");
    }

    public HtmlDocument table(TableProperties tableProperties) {
        return new HtmlDocument("<table border=\"" +
                tableProperties.getPx() + "px "+ tableProperties.getBorderStyle() + " " + tableProperties.getColor() + " \">"+ content +"</table>");
    }

    public HtmlDocument tr(String value1, String value2, String value3) {
        return new HtmlDocument(content + "<tr><td>"+ value1 +"</td><#list "+ value3 +" as val><td>"+ value2 +"</td></#list></tr>");
    }
}
