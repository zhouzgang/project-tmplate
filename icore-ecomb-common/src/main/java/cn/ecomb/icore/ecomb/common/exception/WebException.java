package cn.ecomb.icore.ecomb.common.exception;

/**
 * web 层异常
 *
 * @author zhouzhigang
 * @date 2017/11/14.
 */
public class WebException extends AbstractException {

    public WebException(int code, String message) {
        super(code, message);
    }

    public WebException(int code, String message, String developerMessage) {
        super(code, message, developerMessage);
    }
}
