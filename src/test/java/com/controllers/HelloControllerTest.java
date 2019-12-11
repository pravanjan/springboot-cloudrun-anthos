package com.controllers;

import com.helper.HelloHelper;
import com.main.App;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.DEFAULT)

@SpringBootTest(classes = App.class)
@AutoConfigureMockMvc
@PrepareForTest({HelloHelper.class})
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void helloGradle() throws Exception {
        PowerMockito.mockStatic(HelloHelper.class);

        mvc.perform(get("/hello/test"))
                .andExpect(status().isOk());
    }


}
