package com.herb.lib.service;

import com.herb.lib.api.constants.ResultDTO;
import com.herb.lib.api.enums.HttpCode;
import com.herb.lib.api.model.book.BookClassDTO;
import com.herb.lib.api.service.BookClassService;
import com.herb.lib.mybatis.mapper.book.BookClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;


import java.util.List;

/**
 * 书籍分类Service实现类
 */
@Service
public class BookClassServiceImpl implements BookClassService {

    @Autowired
    private BookClassMapper bookClassMapper;

    @Override
    public ResultDTO findListByName(String name) {
        //非空判断
        if(StringUtils.isEmpty(name)){
            return new ResultDTO(HttpCode.FAIL.getCode(),"搜索关键字不能为空");
        }

        //业务查找
        List<BookClassDTO> list = bookClassMapper.findListByName(name);
        if(CollectionUtils.isEmpty(list)){
            return new ResultDTO(HttpCode.FAIL.getCode(), "暂无对应分类数据");
        }

        return new ResultDTO(HttpCode.SUCCESS.getCode(), "查找成功", list);

    }

    @Override
    public ResultDTO fingById(int id) {
        //非空判断
        if(0 == id){
            return new ResultDTO(HttpCode.FAIL.getCode(),"数据ID不能为空");
        }
        //业务查找
        BookClassDTO bookClassDTO = bookClassMapper.fingById(id);
        if(null == bookClassDTO){
            return new ResultDTO(HttpCode.FAIL.getCode(),"暂无分类数据");
        }

        return new ResultDTO(HttpCode.SUCCESS.getCode(), "查找成功", bookClassDTO);
    }

    @Override
    public ResultDTO insert(BookClassDTO entity) {
        //非空判断
        if(StringUtils.isEmpty(entity.getName())){
            return new ResultDTO(HttpCode.FAIL.getCode(), "分类名称不能为空");
        }
        int influenceNumber = bookClassMapper.insert(entity);
        if(influenceNumber <= 0){
            //新增失败
            return new ResultDTO(HttpCode.FAIL.getCode(), "新增失败");
        }

        return new ResultDTO(HttpCode.SUCCESS.getCode(), "新增成功");
    }

    @Override
    public ResultDTO update(BookClassDTO entity) {
        //非空判断
        if(StringUtils.isEmpty(entity.getId())){
            return new ResultDTO(HttpCode.FAIL.getCode(), "数据ID不能为空");
        }
        int influenceNumber = bookClassMapper.insert(entity);
        if(influenceNumber <= 0){
            //更新失败
            return new ResultDTO(HttpCode.FAIL.getCode(), "更新失败");
        }

        return new ResultDTO(HttpCode.SUCCESS.getCode(), "更新成功");
    }

    @Override
    public ResultDTO delete(int id) {
        //非空判断
        if(id == 0){
            return new ResultDTO(HttpCode.FAIL.getCode(), "数据ID不能为空");
        }

        int influenceNumber = bookClassMapper.delete(id);
        if(influenceNumber <= 0){
            //删除失败
            return new ResultDTO(HttpCode.FAIL.getCode(), "删除失败");
        }
        return new ResultDTO(HttpCode.SUCCESS.getCode(), "删除成功");
    }

}
