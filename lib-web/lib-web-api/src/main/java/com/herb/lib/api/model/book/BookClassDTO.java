package com.herb.lib.api.model.book;


import com.herb.lib.api.model.BaseDTO;
import lombok.Data;

import java.io.Serializable;

/**
 * 书籍分类实体类
 */
@Data
public class BookClassDTO extends BaseDTO implements Serializable {

    /**
     * 分类名称
     */
    private String name;
    private int id;
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
