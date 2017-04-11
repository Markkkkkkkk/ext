package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Xq;
import pri.Mark.ext.model.XqExample;

public interface XqMapper {
    int countByExample(XqExample example);

    int deleteByExample(XqExample example);

    int deleteByPrimaryKey(Integer xqId);

    int insert(Xq record);

    int insertSelective(Xq record);

    List<Xq> selectByExample(XqExample example);

    Xq selectByPrimaryKey(Integer xqId);

    int updateByExampleSelective(@Param("record") Xq record, @Param("example") XqExample example);

    int updateByExample(@Param("record") Xq record, @Param("example") XqExample example);

    int updateByPrimaryKeySelective(Xq record);

    int updateByPrimaryKey(Xq record);
}