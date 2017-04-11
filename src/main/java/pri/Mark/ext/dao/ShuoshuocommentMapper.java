package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Shuoshuocomment;
import pri.Mark.ext.model.ShuoshuocommentExample;

public interface ShuoshuocommentMapper {
    int countByExample(ShuoshuocommentExample example);

    int deleteByExample(ShuoshuocommentExample example);

    int deleteByPrimaryKey(Integer shuoshuocommentId);

    int insert(Shuoshuocomment record);

    int insertSelective(Shuoshuocomment record);

    List<Shuoshuocomment> selectByExampleWithBLOBs(ShuoshuocommentExample example);

    List<Shuoshuocomment> selectByExample(ShuoshuocommentExample example);

    Shuoshuocomment selectByPrimaryKey(Integer shuoshuocommentId);

    int updateByExampleSelective(@Param("record") Shuoshuocomment record, @Param("example") ShuoshuocommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Shuoshuocomment record, @Param("example") ShuoshuocommentExample example);

    int updateByExample(@Param("record") Shuoshuocomment record, @Param("example") ShuoshuocommentExample example);

    int updateByPrimaryKeySelective(Shuoshuocomment record);

    int updateByPrimaryKeyWithBLOBs(Shuoshuocomment record);

    int updateByPrimaryKey(Shuoshuocomment record);
}