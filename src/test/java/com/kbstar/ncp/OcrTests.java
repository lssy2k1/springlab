package com.kbstar.ncp;

import com.kbstar.util.OcrUtil;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Map;

@Slf4j
@SpringBootTest
class OcrTests {

    @Value("${uploadimgdir}")
    String imgpath;

    @Test
    void contextLoads() {
        JSONObject jo = null;
        jo = (JSONObject) OcrUtil.getResult(imgpath, "biz2.jpg");
//        log.info(jo.toJSONString());
        Map map = OcrUtil.getData(jo);
        log.info(map.values().toString());
    }
}
