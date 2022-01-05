package org.example.parser_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParserTest {

    @Test
    void parse() {
        String uri = "http://www.ietf.org:80/rfc/rfc2396.txt?q=1&s1";
        Parser parser = new Parser();
        Parser.parse(uri, parser);

        Assertions.assertEquals("http", parser.getProtocol());
        Assertions.assertEquals("80", parser.getPort());
        Assertions.assertFalse(parser.getPath() == "/rfc2396.txt");

    }
}