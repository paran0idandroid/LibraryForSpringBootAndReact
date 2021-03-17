package com.herb.lib.dao.mapper.borrow;

import com.herb.lib.api.model.borrow.BookBorrowDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 借书还书接口层
 * @author 罗海强
 * @version 1.0
 * @date 2021/3/9 21:13
 */
@Mapper
public interface BookBorrowMapper {

    int insert(BookBorrowDTO bookBorrowDTO);
}
