package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Healthstatus;
import pri.Mark.ext.model.HealthstatusExample;

public interface HealthstatusMapper {
    int countByExample(HealthstatusExample example);

    int deleteByExample(HealthstatusExample example);

    int deleteByPrimaryKey(Integer healthstatusId);

    int insert(Healthstatus record);

    int insertSelective(Healthstatus record);

    List<Healthstatus> selectByExample(HealthstatusExample example);

    Healthstatus selectByPrimaryKey(Integer healthstatusId);

    int updateByExampleSelective(@Param("record") Healthstatus record, @Param("example") HealthstatusExample example);

    int updateByExample(@Param("record") Healthstatus record, @Param("example") HealthstatusExample example);

    int updateByPrimaryKeySelective(Healthstatus record);

    int updateByPrimaryKey(Healthstatus record);
}