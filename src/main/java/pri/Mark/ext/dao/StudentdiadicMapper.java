package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Studentdiadic;
import pri.Mark.ext.model.StudentdiadicExample;

public interface StudentdiadicMapper {
    int countByExample(StudentdiadicExample example);

    int deleteByExample(StudentdiadicExample example);

    int deleteByPrimaryKey(Integer studentdiadicId);

    int insert(Studentdiadic record);

    int insertSelective(Studentdiadic record);

    List<Studentdiadic> selectByExample(StudentdiadicExample example);

    Studentdiadic selectByPrimaryKey(Integer studentdiadicId);

    int updateByExampleSelective(@Param("record") Studentdiadic record, @Param("example") StudentdiadicExample example);

    int updateByExample(@Param("record") Studentdiadic record, @Param("example") StudentdiadicExample example);

    int updateByPrimaryKeySelective(Studentdiadic record);

    int updateByPrimaryKey(Studentdiadic record);
}