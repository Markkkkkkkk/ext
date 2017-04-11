package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Zzmm;
import pri.Mark.ext.model.ZzmmExample;

public interface ZzmmMapper {
    int countByExample(ZzmmExample example);

    int deleteByExample(ZzmmExample example);

    int deleteByPrimaryKey(Integer zzmmId);

    int insert(Zzmm record);

    int insertSelective(Zzmm record);

    List<Zzmm> selectByExample(ZzmmExample example);

    Zzmm selectByPrimaryKey(Integer zzmmId);

    int updateByExampleSelective(@Param("record") Zzmm record, @Param("example") ZzmmExample example);

    int updateByExample(@Param("record") Zzmm record, @Param("example") ZzmmExample example);

    int updateByPrimaryKeySelective(Zzmm record);

    int updateByPrimaryKey(Zzmm record);
}