package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Shuoshuo;
import pri.Mark.ext.model.ShuoshuoExample;

public interface ShuoshuoMapper {
    int countByExample(ShuoshuoExample example);

    int deleteByExample(ShuoshuoExample example);

    int deleteByPrimaryKey(Integer shuoshuoId);

    int insert(Shuoshuo record);

    int insertSelective(Shuoshuo record);

    List<Shuoshuo> selectByExampleWithBLOBs(ShuoshuoExample example);

    List<Shuoshuo> selectByExample(ShuoshuoExample example);

    Shuoshuo selectByPrimaryKey(Integer shuoshuoId);

    int updateByExampleSelective(@Param("record") Shuoshuo record, @Param("example") ShuoshuoExample example);

    int updateByExampleWithBLOBs(@Param("record") Shuoshuo record, @Param("example") ShuoshuoExample example);

    int updateByExample(@Param("record") Shuoshuo record, @Param("example") ShuoshuoExample example);

    int updateByPrimaryKeySelective(Shuoshuo record);

    int updateByPrimaryKeyWithBLOBs(Shuoshuo record);

    int updateByPrimaryKey(Shuoshuo record);
}