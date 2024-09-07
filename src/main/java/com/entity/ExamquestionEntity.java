package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 试题表
 *
 * @author 
 * @email
 */
@TableName("examquestion")
public class ExamquestionEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ExamquestionEntity() {

	}

	public ExamquestionEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 所属问卷id（外键）
     */
    @TableField(value = "exampaper_id")

    private Integer exampaperId;


    /**
     * 试题名称
     */
    @TableField(value = "examquestion_name")

    private String examquestionName;


    /**
     * 选项，json字符串
     */
    @TableField(value = "examquestion_options")

    private String examquestionOptions;


    /**
     * 分值
     */
    @TableField(value = "examquestion_score")

    private Integer examquestionScore;


    /**
     * 正确答案
     */
    @TableField(value = "examquestion_answer")

    private String examquestionAnswer;


    /**
     * 答案解析
     */
    @TableField(value = "examquestion_analysis")

    private String examquestionAnalysis;


    /**
     * 试题类型
     */
    @TableField(value = "examquestion_types")

    private Integer examquestionTypes;


    /**
     * 试题排序，值越大排越前面
     */
    @TableField(value = "examquestion_sequence")

    private Integer examquestionSequence;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：所属问卷id（外键）
	 */
    public Integer getExampaperId() {
        return exampaperId;
    }
    /**
	 * 获取：所属问卷id（外键）
	 */

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }
    /**
	 * 设置：试题名称
	 */
    public String getExamquestionName() {
        return examquestionName;
    }
    /**
	 * 获取：试题名称
	 */

    public void setExamquestionName(String examquestionName) {
        this.examquestionName = examquestionName;
    }
    /**
	 * 设置：选项，json字符串
	 */
    public String getExamquestionOptions() {
        return examquestionOptions;
    }
    /**
	 * 获取：选项，json字符串
	 */

    public void setExamquestionOptions(String examquestionOptions) {
        this.examquestionOptions = examquestionOptions;
    }
    /**
	 * 设置：分值
	 */
    public Integer getExamquestionScore() {
        return examquestionScore;
    }
    /**
	 * 获取：分值
	 */

    public void setExamquestionScore(Integer examquestionScore) {
        this.examquestionScore = examquestionScore;
    }
    /**
	 * 设置：正确答案
	 */
    public String getExamquestionAnswer() {
        return examquestionAnswer;
    }
    /**
	 * 获取：正确答案
	 */

    public void setExamquestionAnswer(String examquestionAnswer) {
        this.examquestionAnswer = examquestionAnswer;
    }
    /**
	 * 设置：答案解析
	 */
    public String getExamquestionAnalysis() {
        return examquestionAnalysis;
    }
    /**
	 * 获取：答案解析
	 */

    public void setExamquestionAnalysis(String examquestionAnalysis) {
        this.examquestionAnalysis = examquestionAnalysis;
    }
    /**
	 * 设置：试题类型
	 */
    public Integer getExamquestionTypes() {
        return examquestionTypes;
    }
    /**
	 * 获取：试题类型
	 */

    public void setExamquestionTypes(Integer examquestionTypes) {
        this.examquestionTypes = examquestionTypes;
    }
    /**
	 * 设置：试题排序，值越大排越前面
	 */
    public Integer getExamquestionSequence() {
        return examquestionSequence;
    }
    /**
	 * 获取：试题排序，值越大排越前面
	 */

    public void setExamquestionSequence(Integer examquestionSequence) {
        this.examquestionSequence = examquestionSequence;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Examquestion{" +
            "id=" + id +
            ", exampaperId=" + exampaperId +
            ", examquestionName=" + examquestionName +
            ", examquestionOptions=" + examquestionOptions +
            ", examquestionScore=" + examquestionScore +
            ", examquestionAnswer=" + examquestionAnswer +
            ", examquestionAnalysis=" + examquestionAnalysis +
            ", examquestionTypes=" + examquestionTypes +
            ", examquestionSequence=" + examquestionSequence +
            ", createTime=" + createTime +
        "}";
    }
}
package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 试题表
 *
 * @author 
 * @email
 */
@TableName("examquestion")
public class ExamquestionEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ExamquestionEntity() {

	}

	public ExamquestionEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 所属问卷id（外键）
     */
    @TableField(value = "exampaper_id")

    private Integer exampaperId;


    /**
     * 试题名称
     */
    @TableField(value = "examquestion_name")

    private String examquestionName;


    /**
     * 选项，json字符串
     */
    @TableField(value = "examquestion_options")

    private String examquestionOptions;


    /**
     * 分值
     */
    @TableField(value = "examquestion_score")

    private Integer examquestionScore;


    /**
     * 正确答案
     */
    @TableField(value = "examquestion_answer")

    private String examquestionAnswer;


    /**
     * 答案解析
     */
    @TableField(value = "examquestion_analysis")

    private String examquestionAnalysis;


    /**
     * 试题类型
     */
    @TableField(value = "examquestion_types")

    private Integer examquestionTypes;


    /**
     * 试题排序，值越大排越前面
     */
    @TableField(value = "examquestion_sequence")

    private Integer examquestionSequence;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：所属问卷id（外键）
	 */
    public Integer getExampaperId() {
        return exampaperId;
    }
    /**
	 * 获取：所属问卷id（外键）
	 */

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }
    /**
	 * 设置：试题名称
	 */
    public String getExamquestionName() {
        return examquestionName;
    }
    /**
	 * 获取：试题名称
	 */

    public void setExamquestionName(String examquestionName) {
        this.examquestionName = examquestionName;
    }
    /**
	 * 设置：选项，json字符串
	 */
    public String getExamquestionOptions() {
        return examquestionOptions;
    }
    /**
	 * 获取：选项，json字符串
	 */

    public void setExamquestionOptions(String examquestionOptions) {
        this.examquestionOptions = examquestionOptions;
    }
    /**
	 * 设置：分值
	 */
    public Integer getExamquestionScore() {
        return examquestionScore;
    }
    /**
	 * 获取：分值
	 */

    public void setExamquestionScore(Integer examquestionScore) {
        this.examquestionScore = examquestionScore;
    }
    /**
	 * 设置：正确答案
	 */
    public String getExamquestionAnswer() {
        return examquestionAnswer;
    }
    /**
	 * 获取：正确答案
	 */

    public void setExamquestionAnswer(String examquestionAnswer) {
        this.examquestionAnswer = examquestionAnswer;
    }
    /**
	 * 设置：答案解析
	 */
    public String getExamquestionAnalysis() {
        return examquestionAnalysis;
    }
    /**
	 * 获取：答案解析
	 */

    public void setExamquestionAnalysis(String examquestionAnalysis) {
        this.examquestionAnalysis = examquestionAnalysis;
    }
    /**
	 * 设置：试题类型
	 */
    public Integer getExamquestionTypes() {
        return examquestionTypes;
    }
    /**
	 * 获取：试题类型
	 */

    public void setExamquestionTypes(Integer examquestionTypes) {
        this.examquestionTypes = examquestionTypes;
    }
    /**
	 * 设置：试题排序，值越大排越前面
	 */
    public Integer getExamquestionSequence() {
        return examquestionSequence;
    }
    /**
	 * 获取：试题排序，值越大排越前面
	 */

    public void setExamquestionSequence(Integer examquestionSequence) {
        this.examquestionSequence = examquestionSequence;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Examquestion{" +
            "id=" + id +
            ", exampaperId=" + exampaperId +
            ", examquestionName=" + examquestionName +
            ", examquestionOptions=" + examquestionOptions +
            ", examquestionScore=" + examquestionScore +
            ", examquestionAnswer=" + examquestionAnswer +
            ", examquestionAnalysis=" + examquestionAnalysis +
            ", examquestionTypes=" + examquestionTypes +
            ", examquestionSequence=" + examquestionSequence +
            ", createTime=" + createTime +
        "}";
    }
}
