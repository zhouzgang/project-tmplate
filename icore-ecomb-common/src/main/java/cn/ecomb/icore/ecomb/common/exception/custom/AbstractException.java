package cn.ecomb.icore.ecomb.common.exception.custom;

import java.util.List;

/**
 * 自定义异常的父类
 *
 * @author zhouzhigang
 * @date 2017/11/14.
 */
public abstract class AbstractException extends RuntimeException{

    /**
     * 异常状态码
     */
    private int code;

    /**
     * 返回用户错误信息
     */
    private String message;

    /**
     * 校验时会存在多个字段错误的情况
     */
    private List<Error> errors;

    /**
     * 返回开发者错误信息
     */
    private String developerMessage;

    private AbstractException() {
        super();
    }

    public AbstractException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public AbstractException(int code, String message, String developerMessage) {
        this.code = code;
        this.message = message;
        this.developerMessage = developerMessage;
    }

    public int getCode() {
        return code;
    }

    public AbstractException setCode(int code) {
        this.code = code;
        return this;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public AbstractException setErrors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public AbstractException setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public AbstractException setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
        return this;
    }


    /**
     * 校验字段错误信息
     */
    class Error {

        /**
         * 错误编码
         */
        private String code;

        /**
         * 错误字段
         */
        private String field;

        /**
         * 错误信息
         */
        private String message;

        public Error() {
        }

        public Error(String code, String message) {
            this.code = code;
            this.field = message;
        }

        public Error(String code, String field, String message) {
            this.code = code;
            this.field = field;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public Error setCode(String code) {
            this.code = code;
            return this;
        }

        public String getField() {
            return field;
        }

        public Error setField(String field) {
            this.field = field;
            return this;
        }

        public String getMessage() {
            return message;
        }

        public Error setMessage(String message) {
            this.message = message;
            return this;
        }
    }
}