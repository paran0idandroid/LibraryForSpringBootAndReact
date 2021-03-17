package com.herb.lib.dao.mapper.reback;

import com.herb.lib.api.model.borrow.BookBorrowDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 罗海强
 * @version 1.0
 * @date 2021/3/17 15:15
 */
@Mapper
public interface RebackMapper {

    /**
     * 更新借书信息
     * @param bookBorrowDTO
     * @return
     */
    int updateBorrowInfo(BookBorrowDTO bookBorrowDTO);


}
