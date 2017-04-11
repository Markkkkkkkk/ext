package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Shuoshuopicture;
import pri.Mark.ext.model.ShuoshuopictureExample;

public interface ShuoshuopictureMapper {
    int countByExample(ShuoshuopictureExample example);

    int deleteByExample(ShuoshuopictureExample example);

    int deleteByPrimaryKey(Integer shuoshuopictureId);

    int insert(Shuoshuopicture record);

    int insertSelective(Shuoshuopicture record);

    List<Shuoshuopicture> selectByExampleWithBLOBs(ShuoshuopictureExample example);

    List<Shuoshuopicture> selectByExample(ShuoshuopictureExample example);

    Shuoshuopicture selectByPrimaryKey(Integer shuoshuopictureId);

    int updateByExampleSelective(@Param("record") Shuoshuopicture record, @Param("example") ShuoshuopictureExample example);

    int updateByExampleWithBLOBs(@Param("record") Shuoshuopicture record, @Param("example") ShuoshuopictureExample example);

    int updateByExample(@Param("record") Shuoshuopicture record, @Param("example") ShuoshuopictureExample example);

    int updateByPrimaryKeySelective(Shuoshuopicture record);

    int updateByPrimaryKeyWithBLOBs(Shuoshuopicture record);

    int updateByPrimaryKey(Shuoshuopicture record);
}