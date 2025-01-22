package com.zs.springbootinit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author ZhuangShuo
 * @date 2024/12/17
 * @description
 */
@SpringBootTest
public class temp {


    @Test
    public void test() throws URISyntaxException {
        String url = "https://www.baidu.com";
        // 提取
        String[] split = url.split("://");
        String protocol = split[0];
        String[] split1 = split[1].split("/");
        String host = split1[0];
        System.out.println(protocol);

        URI i = new URI(url);
        System.out.println(i);

        System.out.println(i.getHost());

    }
}
