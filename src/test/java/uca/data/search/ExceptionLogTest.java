package uca.data.search;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 *
 * @author Andy Lv
 * @date 2020/4/4 18:12
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class ExceptionLogTest {

    @Test
    public void error() {
        log.error("test error log", new Throwable());
    }

}
