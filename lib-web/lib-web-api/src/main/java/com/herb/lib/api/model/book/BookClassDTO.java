package com.herb.lib.api.model.book;


import com.herb.lib.api.model.BaseDTO;

import java.io.Serializable;

/**
 * 书籍分类实体类
 */
public class BookClassDTO extends BaseDTO implements Serializable {

    /**
     * 分类名称
     */
    private String name;
}
