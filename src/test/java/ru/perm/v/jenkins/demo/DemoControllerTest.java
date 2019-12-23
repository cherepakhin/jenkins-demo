/*
 * Copyright (c) 20.12.2019, 11:58
 * Autor: Cherepakhin Vasily
 * Email: vasi.che@gmail.com
 */

package ru.perm.v.jenkins.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(DemoController.class)
public class DemoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getSimple() throws Exception {
        mockMvc.perform(get("/rest-demo")).andDo(print()).andExpect(status().isOk())
                .andReturn().equals("Ok3");
    }
}