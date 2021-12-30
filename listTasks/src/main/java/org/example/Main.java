package org.example;

import org.example.between.DateBetween;
import org.example.difference.DateDifference;
import org.example.letters.AmountOfLetters;
import org.example.numbers.SimpleNumbers;
import org.example.parser.Parser;
import org.example.reversed.ReversedString;
import org.example.ticket.LuckyTicket;
import org.example.unique.UniqueSymbols;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println(DateBetween.isDateBetween());
    }
}
