package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Yx;
import pri.Mark.ext.model.YxExample;

public interface YxMapper {
    int countByExample(YxExample example);

    int deleteByExample(YxExample example);

    int deleteByPrimaryKey(Integer yxId);

    int insert(Yx record);

    int insertSelective(Yx record);

    List<Yx> selectByExample(YxExample example);

    Yx selectByPrimaryKey(Integer yxId);

    int updateByExampleSelective(@Param("record") Yx record, @Param("example") YxExample example);

    int updateByExample(@Param("record") Yx record, @Param("example") YxExample example);

    int updateByPrimaryKeySelective(Yx record);

    int updateByPrimaryKey(Yx record);
}