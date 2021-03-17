package com.herb.lib.web.borrow;

import com.alibaba.fastjson.JSONObject;
import com.herb.lib.api.constants.ResultDTO;
import com.herb.lib.api.enums.HttpCode;
import com.herb.lib.api.service.borrow.BookBorrowService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


/**
 * 借书还书控制层
 * @author 罗海强
 * @version 1.0
 * @date 2021/3/9 21:49
 */

@RestController
@RequestMapping("/borrow")
public class BookBorrowController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BookBorrowService bookBorrowService;


    /**
     * 借书操作
     * @param jsonParams
     * @return
     */
    @RequestMapping("/doBorrow")
    public ResultDTO doBorrow(@RequestBody JSONObject jsonParams){
        try{
            //获取参数
            int bookId = jsonParams.getInteger("bookId");
            //int bookId = Integer.parseInt(String.valueOf(jsonParams.getOrDefault("bookId", 0)));
            Date startDate = jsonParams.getDate("startDate");
            Date endDate = jsonParams.getDate("endDate");
            int borrowCount = jsonParams.getInteger("borrowCount");
            int userId = jsonParams.getInteger("userId");
            String userName = jsonParams.getString("userName");
            boolean vipFlag = jsonParams.getBoolean("vipFlag");

            return bookBorrowService.doBorrow(bookId, startDate, endDate, borrowCount, userId, userName, vipFlag);
        } catch (Exception e){
            logger.error("系统异常：" + e);
            return new ResultDTO(HttpCode.ERROR.getCode(), "系统异常");
        }

    }
}
