package tech.itpark.competition;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class CompetitionApplicationTests {

    MockMvc mockMvc;

    @Test
    void contextLoads() throws Exception {
        //getById
//        mockMvc.perform(MockMvcRequestBuilders.get("/participant/1"))
//                .andExpect(MockMvcResultMatchers.content()
//                        .string("{\"id\": 1, \"name\": \"Lee\",\"surname\": \"Jong Suk\",\"country\": \"South Korea\",\"city\": \"Seoul\",\"age\": 18,\"gender\": \"M\",\"competence\": \"Creativity and Design\",\"competence_name\": \"Jewelry skill\",\"url_image\": \"https://mtdata.ru/u21/photo591B/20115901394-0/original.jpg\"}"));
    }

}
