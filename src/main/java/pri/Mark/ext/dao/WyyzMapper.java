package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Wyyz;
import pri.Mark.ext.model.WyyzExample;

public interface WyyzMapper {
    int countByExample(WyyzExample example);

    int deleteByExample(WyyzExample example);

    int deleteByPrimaryKey(Integer wyyzId);

    int insert(Wyyz record);

    int insertSelective(Wyyz record);

    List<Wyyz> selectByExample(WyyzExample example);

    Wyyz selectByPrimaryKey(Integer wyyzId);

    int updateByExampleSelective(@Param("record") Wyyz record, @Param("example") WyyzExample example);

    int updateByExample(@Param("record") Wyyz record, @Param("example") WyyzExample example);

    int updateByPrimaryKeySelective(Wyyz record);

    int updateByPrimaryKey(Wyyz record);
}