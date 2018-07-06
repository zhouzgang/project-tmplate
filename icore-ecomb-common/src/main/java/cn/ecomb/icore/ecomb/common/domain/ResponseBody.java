package cn.ecomb.icore.ecomb.common.domain;

/**
 * Restful 统一数据返回对象封装类
 * @author zhouzhigang
 * @date 2017/11/13.
 */
public class ResponseBody {

    /**
     * 返回请求的 Http 状态码
     * 是否要用 Spring 中的 HttpStatus 枚举？
     */
    private int status;

    /**
     * 放回详细状态码
     */
    private int code;

    /**
     * 返回用户错误信息
     * eg. 异常出现的原因
     */
    private String message;

    /**
     * 返回开发者错误信息
     * eg. 异常出现的类，方法
     */
    private String developerMessage;

    /**
     * 返回正常状态的数据
     */
    private Object data;

    public int getStatus() {
        return status;
    }

    public ResponseBody setStatus(int status) {
        this.status = status;
        return this;
    }

    public int getCode() {
        return code;
    }

    public ResponseBody setCode(int code) {
        this.code = code;
        return this;
    }

    public ResponseBody setCode(String code) {
        this.code = Integer.parseInt(code);
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public ResponseBody setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
}
