package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Studenttime;
import pri.Mark.ext.model.StudenttimeExample;

public interface StudenttimeMapper {
    int countByExample(StudenttimeExample example);

    int deleteByExample(StudenttimeExample example);

    int deleteByPrimaryKey(Integer studenttimeId);

    int insert(Studenttime record);

    int insertSelective(Studenttime record);

    List<Studenttime> selectByExample(StudenttimeExample example);

    Studenttime selectByPrimaryKey(Integer studenttimeId);

    int updateByExampleSelective(@Param("record") Studenttime record, @Param("example") StudenttimeExample example);

    int updateByExample(@Param("record") Studenttime record, @Param("example") StudenttimeExample example);

    int updateByPrimaryKeySelective(Studenttime record);

    int updateByPrimaryKey(Studenttime record);
}