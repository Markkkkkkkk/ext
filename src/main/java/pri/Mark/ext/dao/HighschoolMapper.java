package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Highschool;
import pri.Mark.ext.model.HighschoolExample;

public interface HighschoolMapper {
    int countByExample(HighschoolExample example);

    int deleteByExample(HighschoolExample example);

    int deleteByPrimaryKey(Integer highschoolId);

    int insert(Highschool record);

    int insertSelective(Highschool record);

    List<Highschool> selectByExample(HighschoolExample example);

    Highschool selectByPrimaryKey(Integer highschoolId);

    int updateByExampleSelective(@Param("record") Highschool record, @Param("example") HighschoolExample example);

    int updateByExample(@Param("record") Highschool record, @Param("example") HighschoolExample example);

    int updateByPrimaryKeySelective(Highschool record);

    int updateByPrimaryKey(Highschool record);
}