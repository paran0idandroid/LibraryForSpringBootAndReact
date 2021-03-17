package com.herb.lib.api.model.borrow;

import com.herb.lib.api.model.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 借书实体类
 * @author 罗海强
 * @version 1.0
 * @date 2021/3/9 20:40
 */
@Data
public class BookBorrowDTO extends BaseDTO {

    /**
     * 用户ID
     */
    private int userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 书籍ID
     */
    private int bookId;

    /**
     * 书籍姓名
     */
    private String bookName;

    /**
     * 借阅数量
     */
    private int count;

    /**
     * 借书开始时间
     */
    private Date startDate;

    /**
     * 还书时间
     */
    private Date endDate;

    /**
     * 借书费用
     */
    private BigDecimal price;

    /**
     * 借书实际费用
     */
    private BigDecimal tradeFee;



    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setTradeFee(BigDecimal tradeFee) {
        this.tradeFee = tradeFee;
    }


}
