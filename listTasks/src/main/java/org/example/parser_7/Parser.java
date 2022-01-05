package org.example.parser_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private String protocol, host, port, path, firstQuery, secondQuery;

    public Parser() {
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getFirstQuery() {
        return firstQuery;
    }

    public String getSecondQuery() {
        return secondQuery;
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

    public static Parser parse(String example, Parser parser) {

        Pattern pattern = Pattern.compile("(http|https).+\\/(.+):([0-9]+)(.+?)\\?(.+)");
        Matcher matcher = pattern.matcher(example);
        while (matcher.find()) {
            parser.setProtocol(matcher.group(1));
            parser.setHost(matcher.group(2));
            parser.setPort(matcher.group(3));
            parser.setPath(matcher.group(4));
            parser.setFirstQuery(matcher.group(5));
        }


        return parser;
    }

    @Override
    public String toString() {
        return "Parser{" +
                "protocol='" + protocol + '\'' +
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", path='" + path + '\'' +
                ", firstQuery='" + firstQuery + '\'' +
                ", secondQuery='" + secondQuery + '\'' +
                '}';
    }
}
