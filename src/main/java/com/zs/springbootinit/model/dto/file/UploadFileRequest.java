package com.zs.springbootinit.model.dto.file;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件上传请求
 *
 * @author Zhuang Shuo
 * 
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}