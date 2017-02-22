package spring.boot.demo.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class TimeUtilsStarterTest extends ControllerBaseTest {

    @Test
    public void testFindUserById() throws Exception {
        String url = "/time/utils/gain-now-time.htm";
        this.mockMvc.perform(MockMvcRequestBuilders.post(url)).andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
