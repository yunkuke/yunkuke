package cn.yunkuke.entity;

/**
 * @author zhaoqinbo on 2016年7月26日
 *
 */
public class CourseFile {
	/*
	 * `courseFile_id` bigint NOT NULL AUTO_INCREMENT COMMENT '课程文件id',
	 * `courseFile_level` int NOT NULL COMMENT '课程文件级别', `courseFile_name`
	 * varchar(120) NOT NULL COMMENT '课程文件名称', `courseFile_size` bigint NOT NULL
	 * COMMENT '课程文件大小', `courseFile_college` varchar(50) NOT NULL COMMENT
	 * '课程文件所属学院', `user_id` bigint NOT NULL COMMENT '用户id',
	 * `courseFile_uplodeDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
	 * COMMENT '课程文件上传时间', `courseFile_goodpoint` int NOT NULL DEFAULT '0'
	 * COMMENT '课程文件点赞量', `courseFile_path` varchar(200) NOT NULL COMMENT
	 * '课程文件路径', `courseFile_imgpath` varchar(200) NOT NULL COMMENT
	 * '课程文件预览图片路径',--TODO默认图片路径
	 */
	private long courseFileId;
	private int courseFileLevel;
	private String courseFileName;
	private long courseFileSize;
	private String courseFileCollege;
	private String courseFileSubject;
	private String userId;
	private java.sql.Date courseFileUplodeDate;
	private int courseFileGoodpoint;
	private String courseFilePath;
	private String courseFileImgpath;

	/**
	 * @return the courseFileId
	 */
	public long getCourseFileId() {
		return courseFileId;
	}

	/**
	 * @param courseFileId
	 *            the courseFileId to set
	 */
	public void setCourseFileId(long courseFileId) {
		this.courseFileId = courseFileId;
	}

	/**
	 * @return the courseFileLevel
	 */
	public int getCourseFileLevel() {
		return courseFileLevel;
	}

	/**
	 * @param courseFileLevel
	 *            the courseFileLevel to set
	 */
	public void setCourseFileLevel(int courseFileLevel) {
		this.courseFileLevel = courseFileLevel;
	}

	/**
	 * @return the courseFileName
	 */
	public String getCourseFileName() {
		return courseFileName;
	}

	/**
	 * @param courseFileName
	 *            the courseFileName to set
	 */
	public void setCourseFileName(String courseFileName) {
		this.courseFileName = courseFileName;
	}

	/**
	 * @return the courseFileSize
	 */
	public long getCourseFileSize() {
		return courseFileSize;
	}

	/**
	 * @param courseFileSize
	 *            the courseFileSize to set
	 */
	public void setCourseFileSize(long courseFileSize) {
		this.courseFileSize = courseFileSize;
	}

	/**
	 * @return the courseFileCollege
	 */
	public String getCourseFileCollege() {
		return courseFileCollege;
	}

	/**
	 * @param courseFileCollege
	 *            the courseFileCollege to set
	 */
	public void setCourseFileCollege(String courseFileCollege) {
		this.courseFileCollege = courseFileCollege;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the courseFileUplodeDate
	 */
	public java.sql.Date getCourseFileUplodeDate() {
		return courseFileUplodeDate;
	}

	/**
	 * @param courseFileUplodeDate
	 *            the courseFileUplodeDate to set
	 */
	public void setCourseFileUplodeDate(java.sql.Date courseFileUplodeDate) {
		this.courseFileUplodeDate = courseFileUplodeDate;
	}

	/**
	 * @return the courseFileGoodpoint
	 */
	public int getCourseFileGoodpoint() {
		return courseFileGoodpoint;
	}

	/**
	 * @param courseFileGoodpoint
	 *            the courseFileGoodpoint to set
	 */
	public void setCourseFileGoodpoint(int courseFileGoodpoint) {
		this.courseFileGoodpoint = courseFileGoodpoint;
	}

	/**
	 * @return the courseFilePath
	 */
	public String getCourseFilePath() {
		return courseFilePath;
	}

	/**
	 * @param courseFilePath
	 *            the courseFilePath to set
	 */
	public void setCourseFilePath(String courseFilePath) {
		this.courseFilePath = courseFilePath;
	}

	/**
	 * @return the courseFileImgpath
	 */
	public String getCourseFileImgpath() {
		return courseFileImgpath;
	}

	/**
	 * @param courseFileImgpath
	 *            the courseFileImgpath to set
	 */
	public void setCourseFileImgpath(String courseFileImgpath) {
		this.courseFileImgpath = courseFileImgpath;
	}
	
	public String getCourseFileSubject() {
		return courseFileSubject;
	}

	public void setCourseFileSubject(String courseFileSubject) {
		this.courseFileSubject = courseFileSubject;
	}

	@Override
	public String toString() {
		return "CourseFile [courseFileId=" + courseFileId + ", courseFileLevel=" + courseFileLevel + ", courseFileName="
				+ courseFileName + ", courseFileSize=" + courseFileSize + ", courseFileCollege=" + courseFileCollege
				+ ", courseFileSubject=" + courseFileSubject + ", userId=" + userId + ", courseFileUplodeDate="
				+ courseFileUplodeDate + ", courseFileGoodpoint=" + courseFileGoodpoint + ", courseFilePath="
				+ courseFilePath + ", courseFileImgpath=" + courseFileImgpath + "]";
	}
	@Override
	public int hashCode() {  
		String in = Long.toString(courseFileId);  
		return in.hashCode();  
		}  


}
