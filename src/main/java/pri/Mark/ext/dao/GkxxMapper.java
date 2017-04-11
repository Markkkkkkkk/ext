package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Gkxx;
import pri.Mark.ext.model.GkxxExample;

public interface GkxxMapper {
    int countByExample(GkxxExample example);

    int deleteByExample(GkxxExample example);

    int deleteByPrimaryKey(Integer gkxxId);

    int insert(Gkxx record);

    int insertSelective(Gkxx record);

    List<Gkxx> selectByExample(GkxxExample example);

    Gkxx selectByPrimaryKey(Integer gkxxId);

    int updateByExampleSelective(@Param("record") Gkxx record, @Param("example") GkxxExample example);

    int updateByExample(@Param("record") Gkxx record, @Param("example") GkxxExample example);

    int updateByPrimaryKeySelective(Gkxx record);

    int updateByPrimaryKey(Gkxx record);
}