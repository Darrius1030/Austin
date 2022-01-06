package com.darrius.austin.database.generated.mapper;

import com.darrius.austin.database.generated.model.MessageTemplate;
import com.darrius.austin.database.generated.model.MessageTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageTemplateMapper {
    /**
     * Count by example.
     * 
     * @param example  The {@link MessageTemplateExample}.
     * @return The long.
     */
    long countByExample(MessageTemplateExample example);

    /**
     * Delete by example.
     * 
     * @param example  The {@link MessageTemplateExample}.
     * @return The int.
     */
    int deleteByExample(MessageTemplateExample example);

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
     * @param record  The {@link MessageTemplate}.
     * @return The int.
     */
    int insert(MessageTemplate record);

    /**
     * Insert selective.
     * 
     * @param record  The {@link MessageTemplate}.
     * @return The int.
     */
    int insertSelective(MessageTemplate record);

    /**
     * Select by example.
     * 
     * @param example  The {@link MessageTemplateExample}.
     * @return The java.util.List<com.darrius.austin.database.generated.model.MessageTemplate>.
     */
    List<MessageTemplate> selectByExample(MessageTemplateExample example);

    /**
     * Select by primary key.
     * 
     * @param id  The {@link Long}.
     * @return The com.darrius.austin.database.generated.model.MessageTemplate.
     */
    MessageTemplate selectByPrimaryKey(Long id);

    /**
     * Update by example selective.
     * 
     * @param record  The {@link MessageTemplate}.
     * @param example  The {@link MessageTemplateExample}.
     * @return The int.
     */
    int updateByExampleSelective(@Param("record") MessageTemplate record, @Param("example") MessageTemplateExample example);

    /**
     * Update by example.
     * 
     * @param record  The {@link MessageTemplate}.
     * @param example  The {@link MessageTemplateExample}.
     * @return The int.
     */
    int updateByExample(@Param("record") MessageTemplate record, @Param("example") MessageTemplateExample example);

    /**
     * Update by primary key selective.
     * 
     * @param record  The {@link MessageTemplate}.
     * @return The int.
     */
    int updateByPrimaryKeySelective(MessageTemplate record);

    /**
     * Update by primary key.
     * 
     * @param record  The {@link MessageTemplate}.
     * @return The int.
     */
    int updateByPrimaryKey(MessageTemplate record);
}