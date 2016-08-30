package com.kakaocorp.www.openapi;

import com.kakaocorp.www.service.OpenApi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by terrypark on 16. 8. 30..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OpenApiTest {

    @Autowired
    OpenApi openApi;

    @Test
    public void testGetOpenApiValues(){
        String values = openApi.getOpenApiValues("http://www.daum.net");
        Assert.assertNotNull(values);
    }
}
