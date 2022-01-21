package com.example.demo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParserDate {

    public LocalDateTime parseDate(String dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        LocalDateTime newCreatedDate = LocalDateTime.parse(dateTime, formatter);

        return newCreatedDate;
    }
}
