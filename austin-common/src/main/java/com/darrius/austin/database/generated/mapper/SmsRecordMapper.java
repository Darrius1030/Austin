package com.darrius.austin.database.generated.mapper;

import com.darrius.austin.database.generated.model.SmsRecord;
import com.darrius.austin.database.generated.model.SmsRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsRecordMapper {
    /**
     * Count by example.
     * 
     * @param example  The {@link SmsRecordExample}.
     * @return The long.
     */
    long countByExample(SmsRecordExample example);

    /**
     * Delete by example.
     * 
     * @param example  The {@link SmsRecordExample}.
     * @return The int.
     */
    int deleteByExample(SmsRecordExample example);

    /**
     * Delete by primary key.
     * 
     * @param id  The {@link Long}.
     * @return The int.
     */
    int deleteByPrimaryKey(Long id);

    /**
     * Insert.
     * 
     * @param record  The {@link SmsRecord}.
     * @return The int.
     */
    int insert(SmsRecord record);

    /**
     * Insert selective.
     * 
     * @param record  The {@link SmsRecord}.
     * @return The int.
     */
    int insertSelective(SmsRecord record);

    /**
     * Select by example.
     * 
     * @param example  The {@link SmsRecordExample}.
     * @return The java.util.List<com.darrius.austin.database.generated.model.SmsRecord>.
     */
    List<SmsRecord> selectByExample(SmsRecordExample example);

    /**
     * Select by primary key.
     * 
     * @param id  The {@link Long}.
     * @return The com.darrius.austin.database.generated.model.SmsRecord.
     */
    SmsRecord selectByPrimaryKey(Long id);

    /**
     * Update by example selective.
     * 
     * @param record  The {@link SmsRecord}.
     * @param example  The {@link SmsRecordExample}.
     * @return The int.
     */
    int updateByExampleSelective(@Param("record") SmsRecord record, @Param("example") SmsRecordExample example);

    /**
     * Update by example.
     * 
     * @param record  The {@link SmsRecord}.
     * @param example  The {@link SmsRecordExample}.
     * @return The int.
     */
    int updateByExample(@Param("record") SmsRecord record, @Param("example") SmsRecordExample example);

    /**
     * Update by primary key selective.
     * 
     * @param record  The {@link SmsRecord}.
     * @return The int.
     */
    int updateByPrimaryKeySelective(SmsRecord record);

    /**
     * Update by primary key.
     * 
     * @param record  The {@link SmsRecord}.
     * @return The int.
     */
    int updateByPrimaryKey(SmsRecord record);
}