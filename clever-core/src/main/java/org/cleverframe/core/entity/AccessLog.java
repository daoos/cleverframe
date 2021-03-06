package org.cleverframe.core.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.cleverframe.core.persistence.entity.IdEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.util.Date;

/**
 * 系统访问日志
 * <p>
 * 作者：LiZW <br/>
 * 创建时间：2016-5-19 15:19 <br/>
 */
@Entity
@Table(name = "core_access_log")
@DynamicInsert
@DynamicUpdate
public class AccessLog extends IdEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 请求时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date requestTime;

    /**
     * 请求URI
     */
    private String requestUri;

    /**
     * 操作方式,POST、GET...
     */
    private String method;

    /**
     * 请求参数数据
     */
    @Lob
    @Column(columnDefinition = "MediumText")
    private String params;

    /**
     * 请求处理时间
     */
    private Long processTime;

    /**
     * 客户端的IP地址
     */
    private String remoteAddr;
    /**
     * 用户代理
     */
    private String userAgent;
    /**
     * 是否有异常（0：否；1：是）
     */
    private Character hasException;
    /**
     * 异常信息
     */
    @Lob
    @Column(columnDefinition = "MediumText")
    private String exceptionInfo;

    /*--------------------------------------------------------------
     *          getter、setter
     * -------------------------------------------------------------*/

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Long getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Long processTime) {
        this.processTime = processTime;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Character getHasException() {
        return hasException;
    }

    public void setHasException(Character hasException) {
        this.hasException = hasException;
    }

    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }
}
