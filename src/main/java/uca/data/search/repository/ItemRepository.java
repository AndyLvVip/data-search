package uca.data.search.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import uca.data.search.domain.Item;

/**
 * Description:
 *
 * @author andy.lv
 * @date 2020/3/31 23:19
 */
@Repository
public interface ItemRepository extends ElasticsearchRepository<Item, Long> {

}
