package uca.data.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import uca.data.search.domain.Item;

/**
 * Description:
 *
 * @author andy.lv
 * @date 2020/3/31 23:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSearchApplicationTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void createIndex() {
        elasticsearchTemplate.createIndex(Item.class);
    }

    @Test
    public void deleteIndex() {
        elasticsearchTemplate.deleteIndex(Item.class);
    }

}
