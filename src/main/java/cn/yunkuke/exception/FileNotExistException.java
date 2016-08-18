package cn.yunkuke.exception;

/**
 * 文件不存在异常
 * 
 * @author zqb on 2016年7月28日
 */
public class FileNotExistException extends CourseFileException {
	public FileNotExistException(String message) {
		super(message);
	}

	public FileNotExistException(String message, Throwable cause) {
		super(message, cause);
	}
}
