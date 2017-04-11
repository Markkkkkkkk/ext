package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Studentname;
import pri.Mark.ext.model.StudentnameExample;

public interface StudentnameMapper {
    int countByExample(StudentnameExample example);

    int deleteByExample(StudentnameExample example);

    int deleteByPrimaryKey(Integer studentnameId);

    int insert(Studentname record);

    int insertSelective(Studentname record);

    List<Studentname> selectByExample(StudentnameExample example);

    Studentname selectByPrimaryKey(Integer studentnameId);

    int updateByExampleSelective(@Param("record") Studentname record, @Param("example") StudentnameExample example);

    int updateByExample(@Param("record") Studentname record, @Param("example") StudentnameExample example);

    int updateByPrimaryKeySelective(Studentname record);

    int updateByPrimaryKey(Studentname record);
}