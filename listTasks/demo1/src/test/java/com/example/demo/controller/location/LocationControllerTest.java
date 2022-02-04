package com.example.demo.controller.location;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class LocationControllerTest {

    private LocationController locationController;
    private MockMvc mockMvc;

    @Autowired
    public LocationControllerTest(LocationController locationController, MockMvc mockMvc) {
        this.locationController = locationController;
        this.mockMvc = mockMvc;
    }

    @Test
    void testInjection() {
        assertThat(locationController).isNotNull();
    }

    @Test
    void getAll() {
        try {
            this.mockMvc.perform(get("/getLocs"))
                    .andExpect(status().isOk());
        } catch (Exception exception) {
            exception.getMessage();
        }
    }

    @Test
    void getLocationById() {
        List<String> ids = new ArrayList<>(Arrays.asList("1"));
//        MvcResult mvcResult = this.mockMvc.perform(getLocationById());
    }
}