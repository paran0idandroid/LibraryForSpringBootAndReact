package com.herb.lib.api.model.book;


import com.herb.lib.api.model.BaseDTO;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 书籍实体类
 */
@Data
public class BookDTO extends BaseDTO implements Serializable {

    /**
    数据ID
     */
    private int id;

    /**
     * 书籍名称
     */
    private String bookName;

    /**
     * 书籍分类名称
     */
    private int bookClassId;

    /**
     * 书籍价格
     */
    private BigDecimal bookPrice;

    /**
     * 书籍数量
     */
    private int bookCount;

    /**
     * 书籍出版社
     */
    private String bookPublish;

    /**
     * 书籍作者
     */
    private String bookAuthor;

    /**
     * 书籍图片（多个之间用分号隔开）
     */
    private String bookImg;

    /**
     * 出版日期
     */
    private Date publishDate;

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookClassId() {
        return bookClassId;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public String getBookPublish() {
        return bookPublish;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookImg() {
        return bookImg;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}
