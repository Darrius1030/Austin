package com.darrius.austin.database;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

/**
 * Mybatis Generator rule classes.
 * <p>
 * Created on 06/01/2022.
 *
 * @author Darrius
 */
public class CommentGenerator extends DefaultCommentGenerator {
    private Properties properties;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private boolean addRemarkComments;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public CommentGenerator() {
        super();
        properties = new Properties();
        suppressDate = false;
        suppressAllComments = false;
        addRemarkComments = false;
    }

    public void addJavaFileComment(CompilationUnit compilationUnit) {

    }

    /**
     * Mapper comment.
     *
     * @param xmlElement
     * @see DefaultCommentGenerator
     */
    public void addComment(XmlElement xmlElement) {
        if (suppressAllComments) {
            return;
        }
    }

    public void addRootComment(XmlElement rootElement) {

    }

    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);

        suppressDate = isTrue(properties
                .getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));

        suppressAllComments = isTrue(properties
                .getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));

        addRemarkComments = isTrue(properties
                .getProperty(PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));

        String dateFormatString = properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_DATE_FORMAT);
        if (StringUtility.stringHasValue(dateFormatString)) {
            dateFormat = new SimpleDateFormat(dateFormatString);
        }
    }

    protected String getDateString() {
        return dateFormat.format(new Date());
    }

    public void addClassComment(InnerClass innerClass,
                                IntrospectedTable introspectedTable) {
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(" * This class corresponds to the database table ");
        sb.append(introspectedTable.getFullyQualifiedTable().getIntrospectedTableName());
        innerClass.addJavaDocLine(sb.toString());
        innerClass.addJavaDocLine(" */");
    }

    public void addClassComment(InnerClass innerClass,
                                IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(introspectedTable.getFullyQualifiedTable().getIntrospectedTableName());
        innerClass.addJavaDocLine(sb.toString());
        innerClass.addJavaDocLine(" */");
    }

    public void addModelClassComment(TopLevelClass topLevelClass,
                                     IntrospectedTable introspectedTable) {
        String tableName = introspectedTable.getFullyQualifiedTable().getIntrospectedTableName();
        // Just "SEARCH_UNIQUE" table to add annotation, so in this comment place to add import java code.
        if ("SEARCH_UNIQUE".equalsIgnoreCase(tableName)) {
            topLevelClass.addJavaDocLine("import com.travelsky.trp.order.db.core.annotation.ModelConfigProperties;");
        }
        topLevelClass.addJavaDocLine("");
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * The bean for table " + tableName + ".");
        topLevelClass.addJavaDocLine(" * ");
        topLevelClass.addJavaDocLine(" * @author Darrius");
        topLevelClass.addJavaDocLine(" * @since " + this.getDateString());
        topLevelClass.addJavaDocLine(" */");
    }

    public void addEnumComment(InnerEnum innerEnum,
                               IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        innerEnum.addJavaDocLine("/**");
        sb.append(" * This enum corresponds to the database table ");
        sb.append(introspectedTable.getFullyQualifiedTable().getIntrospectedTableName());
        innerEnum.addJavaDocLine(sb.toString());
        innerEnum.addJavaDocLine(" */");
    }

    /**
     * Field comment.
     */
    public void addFieldComment(Field field,
                                IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        field.addJavaDocLine("/**");
        String remarks = introspectedColumn.getRemarks();
        if (this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
            field.addJavaDocLine(" * Database Column Remarks:");
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));
            String[] var6 = remarkLines;
            int var7 = remarkLines.length;

            for (int var8 = 0; var8 < var7; ++var8) {
                String remarkLine = var6[var8];
                field.addJavaDocLine(" *   " + remarkLine);
            }
        }
        String tableName = introspectedTable.getFullyQualifiedTable().getIntrospectedTableName();
        StringBuilder sb = new StringBuilder();
        sb.append(" * This field corresponds to the database column ");
        sb.append(tableName);
        sb.append('.');
        sb.append(introspectedColumn.getActualColumnName());
        sb.append('.');
        field.addJavaDocLine(sb.toString());
        field.addJavaDocLine(" */");
        //  Only "SEARCH_UNIQUE" table to generate annotation support get SEARCH_UNIQUE table all field.
        if ("SEARCH_UNIQUE".equalsIgnoreCase(tableName)) {
            field.addJavaDocLine(
                    "@ModelConfigProperties(name=\""
                            + introspectedColumn.getActualColumnName()
                            + "\")");
        }
    }

    /**
     * Static field comment.
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        return;
    }

    /**
     * To String.
     */
    public void addGeneralMethodComment(Method method,
                                        IntrospectedTable introspectedTable) {
        method.addJavaDocLine("/**");
        String name = method.getName().replaceAll("(?!^)([A-Z])", " $1").toLowerCase();
        method.addJavaDocLine(" * " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + ".");
        method.addJavaDocLine(" * ");
        List<Parameter> parameters = method.getParameters();
        parameters.forEach(parameter -> {
                    String s = "  The {@link " + parameter.getType().getShortName() + "}.";
                    method.addJavaDocLine(" * @param " + parameter.getName() + s);
                }
        );
        if (null != method.getReturnType()) {
            method.addJavaDocLine(" * @return The " + method.getReturnType() + ".");
        }
        method.addJavaDocLine(" */");
    }

    /**
     * Get comment.
     */
    public void addGetterComment(Method method,
                                 IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {

        StringBuilder sb = new StringBuilder();
        method.addJavaDocLine("/**");
        sb.append(" * Get ");
        sb.append(introspectedTable.getFullyQualifiedTable().getIntrospectedTableName());
        sb.append('.');
        sb.append(introspectedColumn.getActualColumnName());
        sb.append('.');
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" *");
        sb.setLength(0);
        sb.append(" * @return The value of ");
        sb.append(introspectedTable.getFullyQualifiedTable().getIntrospectedTableName());
        sb.append('.');
        sb.append(introspectedColumn.getActualColumnName());
        sb.append('.');
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" */");
    }

    /**
     * Set comment.
     */
    public void addSetterComment(Method method,
                                 IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {
        StringBuilder sb = new StringBuilder();
        method.addJavaDocLine("/**");
        sb.append(" * Set ");
        sb.append(introspectedTable.getFullyQualifiedTable().getIntrospectedTableName());
        sb.append('.');
        sb.append(introspectedColumn.getActualColumnName());
        sb.append('.');
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" *");
        Parameter parm = method.getParameters().get(0);
        sb.setLength(0);
        sb.append(" * @param ");
        sb.append(parm.getName());
        sb.append(" The value for ");
        sb.append(introspectedTable.getFullyQualifiedTable().getIntrospectedTableName());
        sb.append('.');
        sb.append(introspectedColumn.getActualColumnName());
        sb.append('.');
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" */");
    }
}
