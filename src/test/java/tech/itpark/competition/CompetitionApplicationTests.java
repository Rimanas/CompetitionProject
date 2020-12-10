package tech.itpark.competition;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
class CompetitionApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    void crudTests() throws Exception {

        mockMvc.perform(get("/participants"))
                .andExpect(MockMvcResultMatchers.content()
                        .json("[  {\n" +
                                "    \"id\": 1,\n" +
                                "    \"name\": \"Lee\",\n" +
                                "    \"surname\": \"Jong Suk\",\n" +
                                "    \"country\": \"South Korea\",\n" +
                                "    \"city\": \"Seoul\",\n" +
                                "    \"age\": 18,\n" +
                                "    \"gender\": \"M\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Jewelry skill\",\n" +
                                "    \"urlImage\": \"https://mtdata.ru/u21/photo591B/20115901394-0/original.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 2,\n" +
                                "    \"name\": \"Park\",\n" +
                                "    \"surname\": \"Seo Joon\",\n" +
                                "    \"country\": \"South Korea\",\n" +
                                "    \"city\": \"Pusan\",\n" +
                                "    \"age\": 21,\n" +
                                "    \"gender\": \"M\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Visual merchandising\",\n" +
                                "    \"urlImage\": \"https://cdn.smartfacts.ru/367994/park-seo-jun_0.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 3,\n" +
                                "    \"name\": \"Park\",\n" +
                                "    \"surname\": \"Shin Hye\",\n" +
                                "    \"country\": \"South Korea\",\n" +
                                "    \"city\": \"Gwangju\",\n" +
                                "    \"age\": 25,\n" +
                                "    \"gender\": \"M\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Graphic design\",\n" +
                                "    \"urlImage\": \"https://www.iloveasia.su/wp-content/uploads/2015/12/71483-3792591.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 4,\n" +
                                "    \"name\": \"Bae\",\n" +
                                "    \"surname\": \"Suzy\",\n" +
                                "    \"country\": \"South Korea\",\n" +
                                "    \"city\": \"Suwon\",\n" +
                                "    \"age\": 22,\n" +
                                "    \"gender\": \"F\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Fashion technology\",\n" +
                                "    \"urlImage\": \"https://www.k-pop.ru/wp-content/uploads/2013/01/Suzy_-_Bean_Pole_accessory_catalogue_2015_Spring-Summer_05.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 5,\n" +
                                "    \"name\": \"Shin\",\n" +
                                "    \"surname\": \"Min A\",\n" +
                                "    \"country\": \"South Korea\",\n" +
                                "    \"city\": \"Seoul\",\n" +
                                "    \"age\": 31,\n" +
                                "    \"gender\": \"F\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Floristics\",\n" +
                                "    \"urlImage\": \"https://i.pinimg.com/736x/e5/5c/e1/e55ce195d2788d8ba2deb20683145aa9.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 6,\n" +
                                "    \"name\": \"Mark\",\n" +
                                "    \"surname\": \"Prin Suparat\",\n" +
                                "    \"country\": \"Thailand\",\n" +
                                "    \"city\": \"Bangkok\",\n" +
                                "    \"age\": 29,\n" +
                                "    \"gender\": \"M\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Fashion technology\",\n" +
                                "    \"urlImage\": \"https://i.pinimg.com/736x/94/ab/39/94ab395e2528795c6f16f09150148257.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 7,\n" +
                                "    \"name\": \"Yaya\",\n" +
                                "    \"surname\": \"Urassaraya\",\n" +
                                "    \"country\": \"Thailand\",\n" +
                                "    \"city\": \"Trat\",\n" +
                                "    \"age\": 24,\n" +
                                "    \"gender\": \"M\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Graphic design\",\n" +
                                "    \"urlImage\": \"https://i.pinimg.com/736x/fa/1f/bb/fa1fbb97d73d6b81dc2159b15b012718.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 8,\n" +
                                "    \"name\": \"Shakrit\",\n" +
                                "    \"surname\": \"Yamnarm\",\n" +
                                "    \"country\": \"Thailand\",\n" +
                                "    \"city\": \"Bangkok\",\n" +
                                "    \"age\": 23,\n" +
                                "    \"gender\": \"M\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Visual merchandising\",\n" +
                                "    \"urlImage\": \"https://wp.silksweb.com/wp-content/uploads/2018/07/pkg14-795x1024-795x1024.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 9,\n" +
                                "    \"name\": \"Palpat\",\n" +
                                "    \"surname\": \"Attanpanyapol\",\n" +
                                "    \"country\": \"Thailand\",\n" +
                                "    \"city\": \"Krabi\",\n" +
                                "    \"age\": 22,\n" +
                                "    \"gender\": \"F\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Jewelry skill\",\n" +
                                "    \"urlImage\": \"https://i.pinimg.com/originals/fb/e9/55/fbe95531564dd02947dd0a31b6f4f72d.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 10,\n" +
                                "    \"name\": \"Sara\",\n" +
                                "    \"surname\": \"Lidge\",\n" +
                                "    \"country\": \"Thailand\",\n" +
                                "    \"city\": \"Surin\",\n" +
                                "    \"age\": 27,\n" +
                                "    \"gender\": \"F\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Floristics\",\n" +
                                "    \"urlImage\": \"https://s1.imgs.cc/img/v4OhYWY.jpg\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"id\": 11,\n" +
                                "    \"name\": \"Lee\",\n" +
                                "    \"surname\": \"Jong Suk\",\n" +
                                "    \"country\": \"South Korea\",\n" +
                                "    \"city\": \"Seoul\",\n" +
                                "    \"age\": 18,\n" +
                                "    \"gender\": \"M\",\n" +
                                "    \"competence\": \"Creativity and Design\",\n" +
                                "    \"competenceName\": \"Floristics\",\n" +
                                "    \"urlImage\": \"https://asiapoisk.com/uploads/cache/people/jW6zwc-465x600.jpg\"\n" +
                                "  }]"));

        //getById
        mockMvc.perform(get("/participants/1"))
                .andExpect(MockMvcResultMatchers.content()
                        .json("{\n" +
                                "  \"id\": 1,\n" +
                                "  \"name\": \"Lee\",\n" +
                                "  \"surname\": \"Jong Suk\",\n" +
                                "  \"country\": \"South Korea\",\n" +
                                "  \"city\": \"Seoul\",\n" +
                                "  \"age\": 18,\n" +
                                "  \"gender\": \"M\",\n" +
                                "  \"competence\": \"Creativity and Design\",\n" +
                                "  \"competenceName\": \"Jewelry skill\",\n" +
                                "  \"urlImage\": \"https://mtdata.ru/u21/photo591B/20115901394-0/original.jpg\"\n" +
                                "}"));

    }

}
