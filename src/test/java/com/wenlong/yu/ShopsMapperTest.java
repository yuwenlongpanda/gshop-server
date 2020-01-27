package com.wenlong.yu;

import com.wenlong.yu.mapper.ShopsMapper;
import com.wenlong.yu.pojo.Shops;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopsMapperTest {

    @Autowired
    private ShopsMapper shopsMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Shops> shops = shopsMapper.selectList(null);
        shops.forEach(shop -> System.out.println(shop));
    }

}
