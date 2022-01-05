package org.example.ticket_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LuckyTicketTest {

    @Test
    void luckyTicket() {
        List<String> list = new ArrayList<String>();
        Assertions.assertEquals("000000", LuckyTicket.luckyTicket(list).get(0));
        Assertions.assertEquals("999999", list.get(list.size() - 1));
        Assertions.assertEquals(55252, list.size());
    }
}