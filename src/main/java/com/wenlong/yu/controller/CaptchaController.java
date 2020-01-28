package com.wenlong.yu.controller;

import com.wenlong.yu.utils.VerifyUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

@Controller
public class CaptchaController {

  @RequestMapping("captcha")
  @ResponseBody
  public void getCaptcha(HttpServletResponse response) throws IOException {
    Map<String, Object> map = VerifyUtil.createImage();
    //将图片输出给浏览器
    BufferedImage image = (BufferedImage) map.get("image");
    response.setContentType("image/png");
    OutputStream os = response.getOutputStream();
    ImageIO.write(image, "png", os);
  }
}
