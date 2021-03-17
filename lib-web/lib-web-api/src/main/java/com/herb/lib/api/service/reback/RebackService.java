package com.herb.lib.api.service.reback;

import com.herb.lib.api.constants.ResultDTO;
import com.herb.lib.api.model.borrow.BookBorrowDTO;

/**
 * @author 罗海强
 * @version 1.0
 * @date 2021/3/17 15:21
 */


public interface RebackService {

    /**
     * 更新借书信息
     * @param bookBorrowDTO
     * @return
     */
    ResultDTO updateBorrowInfo(BookBorrowDTO bookBorrowDTO);
}
