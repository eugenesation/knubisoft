package org.example.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private String protocol, host, port, path, firstQuery, secondQuery;

    private Parser() {
    }

    public void setFirstQuery(String firstQuery) {
        this.firstQuery = firstQuery;
    }

    public void setSecondQuery(String secondQuery) {
        this.secondQuery = secondQuery;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static Parser parse() {
        String example = "http://www.ietf.org:80/rfc/rfc2396.txt?q=1&s1";
        Parser parser = new Parser();

        Pattern pattern = Pattern.compile("(http|https).+?(www.+[a-z]):([0-9]+).+?([a-z].+[.]...).([a-z]..).([a-z].)");
        Matcher matcher = pattern.matcher(example);
        while (matcher.find()) {
            for (int i = 1; i <= 6; i++) {
                System.out.println("Domain: " + matcher.group(i));
            }
        }

        parser.setProtocol(matcher.group(1));
        parser.setHost(matcher.group(2));
        parser.setPort(matcher.group(3));
        parser.setPath(matcher.group(4));
        parser.setFirstQuery(matcher.group(5));
        parser.setSecondQuery(matcher.group(6));

        return parser;
    }

}
