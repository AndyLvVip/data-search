package uca.data.search.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import uca.data.search.domain.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author andy.lv
 * @date 2020/3/31 23:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ItemRepositoryTest {
    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void save(){
        Item item = new Item(1L, "小米9", " 手机",
                "小米", 2999.00, "http://image.baidu.com/13123.jpg");
        itemRepository.save(item);
   }

    @Test
    public void saveList(){
        List<Item> list = new ArrayList<>();
        list.add(new Item(2L, "华为Mate20", " 手机", "华为", 3699.00, "http://image.baidu.com/13123.jpg"));
        list.add(new Item(3L, "苹果X", " 手机", "苹果", 8999.00, "http://image.baidu.com/13123.jpg"));
        itemRepository.saveAll(list);
    }

    @Test
    public void update(){
        Item item = new Item(1L, "小米笔记本", " 电脑",
                "小米", 5499.00, "http://image.baidu.com/13123.jpg");
        itemRepository.save(item);
    }

    @Test
    public void query() {
        itemRepository.findAll(Sort.by("price").ascending())
                .forEach(System.out::println);
        ;

    }
}
