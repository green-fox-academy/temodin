package com.groot.demo.controller;

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.groot.demo.model.Response;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.nio.charset.Charset;
//
//import static org.hamcrest.core.Is.is;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.groot.demo.model.Message;
import com.groot.demo.model.Response;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)

public class GuardianControllerTest {
    ObjectMapper mapper = new ObjectMapper();

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype()
            //,Charset.forName("utf8")
    );

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void postGrootBack_successful() throws Exception {
        Message testMessage = new Message("Hello, Ork!");
        mockMvc.perform(post("/postgroot")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(testMessage)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is("Hello, Ork!")))
                .andExpect(jsonPath("$.translate", is("I am groot!")));
    }

    @Test
    public void getGrootBack_successful() throws Exception {
        mockMvc.perform(get("/getgroot")
                .param("message", "Hello, Ork!"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is("Hello, Ork!")))
                .andExpect(jsonPath("$.translate", is("I am groot!")));
    }

    @Test
    public void getGrootBack_unsuccessful() throws Exception {
        mockMvc.perform(get("/getgroot"))
                //.param("message",null))
                .andExpect(status().is4xxClientError())
                .andExpect(jsonPath("$.error", is("I am groot!")));
    }

    @Test
    public void calcSpeed_successful() throws Exception {
        mockMvc.perform(get("/yondu")
                .param("time", "10")
                .param("distance", "100"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.distance", is(100)))
                .andExpect(jsonPath("$.time", is(10)))
                .andExpect(jsonPath("$.speed", is(10)));
    }
    @Test
    public void calcSpeed_unsuccessful1() throws Exception {
        mockMvc.perform(get("/yondu"))
                //.param("time", "10")
                //.param("distance", "100"))
                .andExpect(status().is4xxClientError())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Wrong input.")));
    }

    @Test
    public void calcSpeed_unsuccessful2() throws Exception {
        mockMvc.perform(get("/yondu")
                .param("time", "10"))
                //.param("distance", "100"))
                .andExpect(status().is4xxClientError())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Wrong input.")));
    }
    @Test
    public void calcSpeed_unsuccessful3() throws Exception {
        mockMvc.perform(get("/yondu")
                //.param("time", "10"))
                .param("distance", "100"))
                .andExpect(status().is4xxClientError())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Wrong input.")));
    }
    @Test
    public void calcSpeed_unsuccessful4() throws Exception {
        mockMvc.perform(get("/yondu")
                .param("time", "0")
                .param("distance", "100"))
                .andExpect(status().is4xxClientError())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Wrong input.")));
    }
    @Test
    public void calcSpeed_unsuccessful5() throws Exception {
        mockMvc.perform(get("/yondu")
                .param("time", "10")
                .param("distance", "-100"))
                .andExpect(status().is4xxClientError())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Wrong input.")));
    }

    @Test
    public void shipStatusEmpty () throws Exception {

        mockMvc.perform(get("/rocket"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.caliber25",is(0)))
                .andExpect(jsonPath("$.caliber30",is(0)))
                .andExpect(jsonPath("$.caliber50",is(0)))
                .andExpect(jsonPath("$.shipstatus",is("empty")))
                .andExpect(jsonPath("$.ready",is(false)));
    }

    @Test
    public void shipStatusFilled () throws Exception {
        mockMvc.perform(get("/rocket/fill")
                .param("caliber",".50")
                .param("amount","5000"));
        mockMvc.perform(get("/rocket"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.caliber25",is(0)))
                .andExpect(jsonPath("$.caliber30",is(0)))
                .andExpect(jsonPath("$.caliber50",is(5000)))
                .andExpect(jsonPath("$.shipstatus",is("40%")))
                .andExpect(jsonPath("$.ready",is(false)));
    }

    @Test
    public void shipStatusFilledFull () throws Exception {
        mockMvc.perform(get("/rocket/fill")
                .param("caliber",".50")
                .param("amount","12500"));
        mockMvc.perform(get("/rocket"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.caliber25",is(0)))
                .andExpect(jsonPath("$.caliber30",is(0)))
                .andExpect(jsonPath("$.caliber50",is(12500)))
                .andExpect(jsonPath("$.shipstatus",is("full")))
                .andExpect(jsonPath("$.ready",is(true)));
    }

    @Test
    public void shipStatusFilledOver () throws Exception {
        mockMvc.perform(get("/rocket/fill")
                .param("caliber",".50")
                .param("amount","13500"));
        mockMvc.perform(get("/rocket"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.caliber25",is(0)))
                .andExpect(jsonPath("$.caliber30",is(0)))
                .andExpect(jsonPath("$.caliber50",is(13500)))
                .andExpect(jsonPath("$.shipstatus",is("overloaded")))
                .andExpect(jsonPath("$.ready",is(false)));
    }

    @Test
    public void shipStatusNoParam () throws Exception {
        mockMvc.perform(get("/rocket/fill"))
                        .andExpect(status().is4xxClientError())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error",is("Missing parameter!")));
    }

    @Test
    public void shipStatusFillResponse () throws Exception {
        mockMvc.perform(get("/rocket/fill")
                .param("caliber",".50")
                .param("amount","5000"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received",is(".50")))
                .andExpect(jsonPath("$.amount",is(5000)))
                .andExpect(jsonPath("$.shipstatus",is("40%")))
                .andExpect(jsonPath("$.ready",is(false)));
    }

}

