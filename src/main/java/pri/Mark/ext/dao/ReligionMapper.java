package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Religion;
import pri.Mark.ext.model.ReligionExample;

public interface ReligionMapper {
    int countByExample(ReligionExample example);

    int deleteByExample(ReligionExample example);

    int deleteByPrimaryKey(Integer religionId);

    int insert(Religion record);

    int insertSelective(Religion record);

    List<Religion> selectByExample(ReligionExample example);

    Religion selectByPrimaryKey(Integer religionId);

    int updateByExampleSelective(@Param("record") Religion record, @Param("example") ReligionExample example);

    int updateByExample(@Param("record") Religion record, @Param("example") ReligionExample example);

    int updateByPrimaryKeySelective(Religion record);

    int updateByPrimaryKey(Religion record);
}