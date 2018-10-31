package com.yoofy.crawl.vo;

/**
 * @author yoofy.liu
 * @date 2018/10/31 14:10
 */
public class BaseReturnVO {
    private Integer code;
    private String description;
    private Object data;

    public BaseReturnVO() {
    }

    public BaseReturnVO(Integer code, String description) {
        this.code = code;
        this.description = description;
        this.data = "";
    }

    public BaseReturnVO(Object data) {
        this.code = 200;
        this.description = "ok";
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseReturnVO{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
