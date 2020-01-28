package com.wenlong.yu;

import com.aliyuncs.exceptions.ClientException;
import com.wenlong.yu.controller.SendCodeController;
import com.wenlong.yu.pojo.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendCodeTest {

    @Autowired
    private SendCodeController sendCodeController;

    @Test
    public void sendCode() {
        try {
            Result result = sendCodeController.sendCode("13636488415");
            System.out.println(result);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

}
