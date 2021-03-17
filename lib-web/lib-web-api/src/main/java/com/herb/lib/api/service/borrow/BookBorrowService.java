package com.herb.lib.api.service.borrow;

import com.herb.lib.api.constants.ResultDTO;

import java.util.Date;

/**
 * @author 罗海强
 * @version 1.0
 * @date 2021/3/9 21:40
 */
public interface BookBorrowService {

    ResultDTO doBorrow(int bookId, Date startDate, Date endDate, int borrowCount, int userId, String userName, boolean vipFlag);
}
