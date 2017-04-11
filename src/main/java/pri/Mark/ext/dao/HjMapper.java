package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Hj;
import pri.Mark.ext.model.HjExample;

public interface HjMapper {
    int countByExample(HjExample example);

    int deleteByExample(HjExample example);

    int deleteByPrimaryKey(Integer hjId);

    int insert(Hj record);

    int insertSelective(Hj record);

    List<Hj> selectByExample(HjExample example);

    Hj selectByPrimaryKey(Integer hjId);

    int updateByExampleSelective(@Param("record") Hj record, @Param("example") HjExample example);

    int updateByExample(@Param("record") Hj record, @Param("example") HjExample example);

    int updateByPrimaryKeySelective(Hj record);

    int updateByPrimaryKey(Hj record);
}