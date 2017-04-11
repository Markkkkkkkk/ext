package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Description;
import pri.Mark.ext.model.DescriptionExample;

public interface DescriptionMapper {
    int countByExample(DescriptionExample example);

    int deleteByExample(DescriptionExample example);

    int deleteByPrimaryKey(Integer descriptionId);

    int insert(Description record);

    int insertSelective(Description record);

    List<Description> selectByExampleWithBLOBs(DescriptionExample example);

    List<Description> selectByExample(DescriptionExample example);

    Description selectByPrimaryKey(Integer descriptionId);

    int updateByExampleSelective(@Param("record") Description record, @Param("example") DescriptionExample example);

    int updateByExampleWithBLOBs(@Param("record") Description record, @Param("example") DescriptionExample example);

    int updateByExample(@Param("record") Description record, @Param("example") DescriptionExample example);

    int updateByPrimaryKeySelective(Description record);

    int updateByPrimaryKeyWithBLOBs(Description record);

    int updateByPrimaryKey(Description record);
}