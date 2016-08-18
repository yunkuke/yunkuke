package cn.yunkuke.dto;

/**
 * 暴露下载地址
 * 
 * @author zqb on 2016年7月28日
 */
public class Exposer {
	private boolean exposed;
	private String md5;
	private long CourseFileId;
	
	public Exposer(boolean exposed, String md5, long courseFileId) {
		super();
		this.exposed = exposed;
		this.md5 = md5;
		CourseFileId = courseFileId;
	}

	public Exposer(boolean exposed, long courseFileId) {
		super();
		this.exposed = exposed;
		CourseFileId = courseFileId;
	}

	public boolean isExposed() {
		return exposed;
	}

	public void setExposed(boolean exposed) {
		this.exposed = exposed;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public long getCourseFileId() {
		return CourseFileId;
	}

	public void setCourseFileId(long courseFileId) {
		CourseFileId = courseFileId;
	}
	
	
	
	
}
