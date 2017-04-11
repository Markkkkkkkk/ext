package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Dbdescription;
import pri.Mark.ext.model.DbdescriptionExample;

public interface DbdescriptionMapper {
    int countByExample(DbdescriptionExample example);

    int deleteByExample(DbdescriptionExample example);

    int deleteByPrimaryKey(Integer dbdescriptionId);

    int insert(Dbdescription record);

    int insertSelective(Dbdescription record);

    List<Dbdescription> selectByExampleWithBLOBs(DbdescriptionExample example);

    List<Dbdescription> selectByExample(DbdescriptionExample example);

    Dbdescription selectByPrimaryKey(Integer dbdescriptionId);

    int updateByExampleSelective(@Param("record") Dbdescription record, @Param("example") DbdescriptionExample example);

    int updateByExampleWithBLOBs(@Param("record") Dbdescription record, @Param("example") DbdescriptionExample example);

    int updateByExample(@Param("record") Dbdescription record, @Param("example") DbdescriptionExample example);

    int updateByPrimaryKeySelective(Dbdescription record);

    int updateByPrimaryKeyWithBLOBs(Dbdescription record);

    int updateByPrimaryKey(Dbdescription record);
}