package com.example.rest_lesson.controller;

import com.example.rest_lesson.LogRepository;
import com.example.rest_lesson.model.TextHu;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
//@WebMvcTest({RestController.class, LogRepository.class})
@SpringBootTest
public class RestControllerTest {
    ObjectMapper mapper = new ObjectMapper();

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype());

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testLogging () throws Exception {
        mockMvc.perform(get("/doubling")
                .param("input","5"))
                //.andExpect(content().contentType(contentType))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received",is(5)))
                .andExpect(jsonPath("$.result",is(10)))
                ;
    }

    @Test
    public void testTeve () throws Exception {
        TextHu text = new TextHu("Nem megyek erre mert megesznek ezek elevenen.","hu");
        mockMvc.perform(post("/teve")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(text)))
                .andExpect(content().contentType(contentType))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.translated",is("Nevem mevegyevek everreve mevert mevegevesznevek evezevek eveleveveveneven.")))
                .andExpect(jsonPath("$.lang",is("teve")))
        ;
    }






}
