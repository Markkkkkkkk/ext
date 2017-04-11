package pri.Mark.ext.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.Mark.ext.model.Identitytype;
import pri.Mark.ext.model.IdentitytypeExample;

public interface IdentitytypeMapper {
    int countByExample(IdentitytypeExample example);

    int deleteByExample(IdentitytypeExample example);

    int deleteByPrimaryKey(Integer identitytypeId);

    int insert(Identitytype record);

    int insertSelective(Identitytype record);

    List<Identitytype> selectByExample(IdentitytypeExample example);

    Identitytype selectByPrimaryKey(Integer identitytypeId);

    int updateByExampleSelective(@Param("record") Identitytype record, @Param("example") IdentitytypeExample example);

    int updateByExample(@Param("record") Identitytype record, @Param("example") IdentitytypeExample example);

    int updateByPrimaryKeySelective(Identitytype record);

    int updateByPrimaryKey(Identitytype record);
}