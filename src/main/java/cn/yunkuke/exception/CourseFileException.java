package cn.yunkuke.exception; 
/** 
* @author zqb on 2016年7月28日 
*/
public class CourseFileException extends RuntimeException{
	public CourseFileException(String message) {
		super(message);
	}

	public CourseFileException(String message, Throwable cause) {
		super(message, cause);
	}
}
