package uca.data.search.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * Description:
 *
 * @author andy.lv
 * @date 2020/3/31 23:06
 */
@Document(indexName = "item",type = "docs", shards = 5, replicas = 1)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    private Long id;
    @Field(type = FieldType.Text)
    private String title; //标题
    @Field(type = FieldType.Text)
    private String category;// 分类
    @Field(type = FieldType.Text)
    private String brand; // 品牌
    @Field(type = FieldType.Double)
    private Double price; // 价格
    @Field(index = false, type = FieldType.Text)
    private String images; // 图片地址
}
