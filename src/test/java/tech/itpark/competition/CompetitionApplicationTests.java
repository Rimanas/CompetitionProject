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

@SpringBootTest
@AutoConfigureMockMvc
class CompetitionApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    void contextLoads() throws Exception {

        //getAll
        mockMvc.perform(MockMvcRequestBuilders.get("/participant"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("[{\"id\":1,\"name\":\"Lee\",\"surname\":\"Jong Suk\",\"country\":\"South Korea\",\"city\":\"Seoul\",\"age\":18,\"gender\":\"M\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Jewelry skill\",\"url_image\":\"https://mtdata.ru/u21/photo591B/20115901394-0/original.jpg\"},{\"id\":2,\"name\":\"Park\",\"surname\":\"Seo Joon\",\"country\":\"South Korea\",\"city\":\"Pusan\",\"age\":21,\"gender\":\"M\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Visual merchandising\",\"url_image\":\"https://cdn.smartfacts.ru/367994/park-seo-jun_0.jpg\"},{\"id\":3,\"name\":\"Park\",\"surname\":\"Shin Hye\",\"country\":\"South Korea\",\"city\":\"Gwangju\",\"age\":25,\"gender\":\"M\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Graphic design\",\"url_image\":\"https://www.iloveasia.su/wp-content/uploads/2015/12/71483-3792591.jpg\"},{\"id\":4,\"name\":\"Bae\",\"surname\":\"Suzy\",\"country\":\"South Korea\",\"city\":\"Suwon\",\"age\":22,\"gender\":\"F\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Fashion technology\",\"url_image\":\"https://www.k-pop.ru/wp-content/uploads/2013/01/Suzy_-_Bean_Pole_accessory_catalogue_2015_Spring-Summer_05.jpg\"},{\"id\":5,\"name\":\"Shin\",\"surname\":\"Min A\",\"country\":\"South Korea\",\"city\":\"Seoul\",\"age\":31,\"gender\":\"F\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Floristics\",\"url_image\":\"https://i.pinimg.com/736x/e5/5c/e1/e55ce195d2788d8ba2deb20683145aa9.jpg\"},{\"id\":6,\"name\":\"Mark\",\"surname\":\"Prin Suparat\",\"country\":\"Thailand\",\"city\":\"Bangkok\",\"age\":29,\"gender\":\"M\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Fashion technology\",\"url_image\":\"https://i.pinimg.com/736x/94/ab/39/94ab395e2528795c6f16f09150148257.jpg\"},{\"id\":7,\"name\":\"Yaya\",\"surname\":\"Urassaraya\",\"country\":\"Thailand\",\"city\":\"Trat\",\"age\":24,\"gender\":\"M\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Graphic design\",\"url_image\":\"https://i.pinimg.com/736x/fa/1f/bb/fa1fbb97d73d6b81dc2159b15b012718.jpg\"},{\"id\":8,\"name\":\"Shakrit\",\"surname\":\"Yamnarm\",\"country\":\"Thailand\",\"city\":\"Bangkok\",\"age\":23,\"gender\":\"M\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Visual merchandising\",\"url_image\":\"https://wp.silksweb.com/wp-content/uploads/2018/07/pkg14-795x1024-795x1024.jpg\"},{\"id\":9,\"name\":\"Palpat\",\"surname\":\"Attanpanyapol\",\"country\":\"Thailand\",\"city\":\"Krabi\",\"age\":22,\"gender\":\"F\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Jewelry skill\",\"url_image\":\"https://i.pinimg.com/originals/fb/e9/55/fbe95531564dd02947dd0a31b6f4f72d.jpg\"},{\"id\":10,\"name\":\"Sara\",\"surname\":\"Lidge\",\"country\":\"Thailand\",\"city\":\"Surin\",\"age\":27,\"gender\":\"F\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Floristics\",\"url_image\":\"https://s1.imgs.cc/img/v4OhYWY.jpg\"},{\"id\":11,\"name\":\"Lee\",\"surname\":\"Jong Suk\",\"country\":\"South Korea\",\"city\":\"Seoul\",\"age\":18,\"gender\":\"M\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Floristics\",\"url_image\":\"https://asiapoisk.com/uploads/cache/people/jW6zwc-465x600.jpg\"}]"));

        //getById
        mockMvc.perform(MockMvcRequestBuilders.get("/participant/1"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"id\":1,\"name\":\"Lee\",\"surname\":\"Jong Suk\",\"country\":\"South Korea\",\"city\":\"Seoul\",\"age\":18,\"gender\":\"M\",\"competence\":\"Creativity and Design\",\"competence_name\":\"Jewelry skill\",\"url_image\":\"https://mtdata.ru/u21/photo591B/20115901394-0/original.jpg\"}"));
    }

}
