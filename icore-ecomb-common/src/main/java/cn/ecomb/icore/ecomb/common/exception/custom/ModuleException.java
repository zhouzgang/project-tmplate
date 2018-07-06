package cn.ecomb.icore.ecomb.common.exception.custom;

/**
 * 模块类异常
 * 需要划分模块异常时，继承此类
 *
 * @author zhouzhigang
 * @date 2017/11/14.
 */
public class ModuleException extends AbstractException {

    public ModuleException(int code, String message) {
        super(code, message);
    }

    public ModuleException(int code, String message, String developerMessage) {
        super(code, message, developerMessage);
    }
}
