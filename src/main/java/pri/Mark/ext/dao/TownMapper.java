package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Town;
import pri.Mark.ext.model.TownExample;

public interface TownMapper {
    int countByExample(TownExample example);

    int deleteByExample(TownExample example);

    int deleteByPrimaryKey(Integer townEncoding);

    int insert(Town record);

    int insertSelective(Town record);

    List<Town> selectByExample(TownExample example);

    Town selectByPrimaryKey(Integer townEncoding);

    int updateByExampleSelective(@Param("record") Town record, @Param("example") TownExample example);

    int updateByExample(@Param("record") Town record, @Param("example") TownExample example);

    int updateByPrimaryKeySelective(Town record);

    int updateByPrimaryKey(Town record);
}