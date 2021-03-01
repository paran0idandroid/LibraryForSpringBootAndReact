package com.herb.lib.mybatis.mapper.book;

import com.herb.lib.api.model.book.BookClassDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookClassMapper {
    /**
     * 根据名称模糊查询全部分类信息
     * @param name 分类名称
     * @return 匹配的数据集
     */
    List<BookClassDTO> findListByName(String name);

    /**
     * 根据ID查找数据
     * @param id 数据ID
     * @return 查找的数据集
     */
    BookClassDTO fingById(int id);

    /**
     * 新增
     * @param entity 实体类（不包含ID）
     * @return 影响行数
     */
    int insert(BookClassDTO entity);

    /**
     * 更新
     * @param entity 实体类（不包含ID）
     * @return 影响行数
     */
    int update(BookClassDTO entity);

    /**
     * 删除
     * @param id 数据主键
     * @return 影响行数
     */
    int delete(int id);
}
