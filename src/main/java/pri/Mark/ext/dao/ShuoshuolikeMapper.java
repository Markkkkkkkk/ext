package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Shuoshuolike;
import pri.Mark.ext.model.ShuoshuolikeExample;

public interface ShuoshuolikeMapper {
    int countByExample(ShuoshuolikeExample example);

    int deleteByExample(ShuoshuolikeExample example);

    int deleteByPrimaryKey(Integer shuoshuolikeId);

    int insert(Shuoshuolike record);

    int insertSelective(Shuoshuolike record);

    List<Shuoshuolike> selectByExample(ShuoshuolikeExample example);

    Shuoshuolike selectByPrimaryKey(Integer shuoshuolikeId);

    int updateByExampleSelective(@Param("record") Shuoshuolike record, @Param("example") ShuoshuolikeExample example);

    int updateByExample(@Param("record") Shuoshuolike record, @Param("example") ShuoshuolikeExample example);

    int updateByPrimaryKeySelective(Shuoshuolike record);

    int updateByPrimaryKey(Shuoshuolike record);
}