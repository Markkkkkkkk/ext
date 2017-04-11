package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Bloodtype;
import pri.Mark.ext.model.BloodtypeExample;

public interface BloodtypeMapper {
    int countByExample(BloodtypeExample example);

    int deleteByExample(BloodtypeExample example);

    int deleteByPrimaryKey(Integer bloodtypeId);

    int insert(Bloodtype record);

    int insertSelective(Bloodtype record);

    List<Bloodtype> selectByExample(BloodtypeExample example);

    Bloodtype selectByPrimaryKey(Integer bloodtypeId);

    int updateByExampleSelective(@Param("record") Bloodtype record, @Param("example") BloodtypeExample example);

    int updateByExample(@Param("record") Bloodtype record, @Param("example") BloodtypeExample example);

    int updateByPrimaryKeySelective(Bloodtype record);

    int updateByPrimaryKey(Bloodtype record);
}