package spring.boot.demo.controller;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class UserControllerTest extends ControllerBaseTest {

    @Test
    public void testFindUserById() throws Exception {
        String url = "/user/get-user-info.htm";
        this.mockMvc.perform(MockMvcRequestBuilders.post(url).accept(MediaType.APPLICATION_JSON).param("id", "1")).andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
