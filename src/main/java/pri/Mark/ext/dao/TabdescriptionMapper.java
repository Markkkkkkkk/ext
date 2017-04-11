package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Tabdescription;
import pri.Mark.ext.model.TabdescriptionExample;

public interface TabdescriptionMapper {
    int countByExample(TabdescriptionExample example);

    int deleteByExample(TabdescriptionExample example);

    int deleteByPrimaryKey(Integer tabdescriptionId);

    int insert(Tabdescription record);

    int insertSelective(Tabdescription record);

    List<Tabdescription> selectByExampleWithBLOBs(TabdescriptionExample example);

    List<Tabdescription> selectByExample(TabdescriptionExample example);

    Tabdescription selectByPrimaryKey(Integer tabdescriptionId);

    int updateByExampleSelective(@Param("record") Tabdescription record, @Param("example") TabdescriptionExample example);

    int updateByExampleWithBLOBs(@Param("record") Tabdescription record, @Param("example") TabdescriptionExample example);

    int updateByExample(@Param("record") Tabdescription record, @Param("example") TabdescriptionExample example);

    int updateByPrimaryKeySelective(Tabdescription record);

    int updateByPrimaryKeyWithBLOBs(Tabdescription record);

    int updateByPrimaryKey(Tabdescription record);
}