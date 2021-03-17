package com.herb.lib.web.book;

import com.herb.lib.api.constants.ResultDTO;
import com.herb.lib.api.enums.HttpCode;
import com.herb.lib.api.model.book.BookDTO;
import com.herb.lib.api.service.book.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗海强
 * @version 1.0
 * @date 2021/3/4 20:33
 */
@RestController
@RequestMapping("/book")
public class BookController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private BookService bookService;

    /**
     * 根据名称查找分类信息
     * @param bookDTO
     * @return
     */
    @RequestMapping("/findListByName")
    public ResultDTO findListByName(@RequestBody BookDTO bookDTO){
        try{
            return bookService.findListByName(bookDTO.getBookName());
        }catch (Exception e){
            logger.error("系统异常：" + e);
            return new ResultDTO(HttpCode.ERROR.getCode(), "系统异常");
        }
    }


    /**
     * 根据Id查找数据
     * @param bookDTO
     * @return
     */
    @RequestMapping("/findById")
    public ResultDTO findById(@RequestBody BookDTO bookDTO){
        try{
            return bookService.findById(bookDTO.getId());
        }catch (Exception e){
            logger.error("系统异常：" + e);
            return new ResultDTO(HttpCode.ERROR.getCode(), "系统异常");
        }
    }

    /**
     * 新增
     * @param bookDTO
     * @return
     */
    @RequestMapping("/insert")
    public ResultDTO insert(@RequestBody BookDTO bookDTO){
        try{
            return bookService.insert(bookDTO);
        }catch (Exception e){
            logger.error("系统异常：" + e);
            return new ResultDTO(HttpCode.ERROR.getCode(), "系统异常");
        }
    }

    /**
     * 更新
     * @param bookDTO
     * @return
     */
    @RequestMapping("/update")
    public ResultDTO update(@RequestBody BookDTO bookDTO){
        try{
            return bookService.update(bookDTO);
        }catch (Exception e){
            logger.error("系统异常：" + e);
            return new ResultDTO(HttpCode.ERROR.getCode(), "系统异常");
        }
    }

    /**
     * 删除
     * @param bookDTO
     * @return
     */
    @RequestMapping("/delete")
    public ResultDTO delete(@RequestBody BookDTO bookDTO){
        try{
            return bookService.delete(bookDTO.getId());
        }catch (Exception e){
            logger.error("系统异常：" + e);
            return new ResultDTO(HttpCode.ERROR.getCode(), "系统异常");
        }
    }
}
