package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Relative;
import pri.Mark.ext.model.RelativeExample;

public interface RelativeMapper {
    int countByExample(RelativeExample example);

    int deleteByExample(RelativeExample example);

    int deleteByPrimaryKey(Integer relativeId);

    int insert(Relative record);

    int insertSelective(Relative record);

    List<Relative> selectByExample(RelativeExample example);

    Relative selectByPrimaryKey(Integer relativeId);

    int updateByExampleSelective(@Param("record") Relative record, @Param("example") RelativeExample example);

    int updateByExample(@Param("record") Relative record, @Param("example") RelativeExample example);

    int updateByPrimaryKeySelective(Relative record);

    int updateByPrimaryKey(Relative record);
}