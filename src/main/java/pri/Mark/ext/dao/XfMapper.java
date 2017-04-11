package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Xf;
import pri.Mark.ext.model.XfExample;

public interface XfMapper {
    int countByExample(XfExample example);

    int deleteByExample(XfExample example);

    int deleteByPrimaryKey(Integer xfId);

    int insert(Xf record);

    int insertSelective(Xf record);

    List<Xf> selectByExample(XfExample example);

    Xf selectByPrimaryKey(Integer xfId);

    int updateByExampleSelective(@Param("record") Xf record, @Param("example") XfExample example);

    int updateByExample(@Param("record") Xf record, @Param("example") XfExample example);

    int updateByPrimaryKeySelective(Xf record);

    int updateByPrimaryKey(Xf record);
}