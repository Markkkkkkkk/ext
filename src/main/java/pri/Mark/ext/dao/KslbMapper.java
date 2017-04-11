package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Kslb;
import pri.Mark.ext.model.KslbExample;

public interface KslbMapper {
    int countByExample(KslbExample example);

    int deleteByExample(KslbExample example);

    int deleteByPrimaryKey(Integer kslbId);

    int insert(Kslb record);

    int insertSelective(Kslb record);

    List<Kslb> selectByExample(KslbExample example);

    Kslb selectByPrimaryKey(Integer kslbId);

    int updateByExampleSelective(@Param("record") Kslb record, @Param("example") KslbExample example);

    int updateByExample(@Param("record") Kslb record, @Param("example") KslbExample example);

    int updateByPrimaryKeySelective(Kslb record);

    int updateByPrimaryKey(Kslb record);
}