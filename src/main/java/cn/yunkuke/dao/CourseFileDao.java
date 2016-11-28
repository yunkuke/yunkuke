package cn.yunkuke.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.yunkuke.entity.CourseFile;

/**
 * @author zqb on 2016年7月27日
 */
public interface CourseFileDao {

	/**
	 * 上传文件 private long courseFileId; private int courseFileLevel; private
	 * String courseFileName; private long courseFileSize; private String
	 * courseFileCollege; private long userId; private Date
	 * courseFileUplodeDate; private int courseFileGoodpoint; private String
	 * courseFilePath; private String courseFileImgpath;
	 * 
	 * @return
	 */
	public boolean insertCourseFile(@Param("userId") String userId, @Param("courseFileName") String courseFileName,
			@Param("courseFileSize") long courseFileSize, @Param("courseFileCollege") String courseFileCollege,
			@Param("courseFileSubject") String courseFileSubject,@Param("courseFileGoodpoint") int courseFileGoodpoint, 
			@Param("courseFilePath") String courseFilePath,@Param("courseFileImgpath") String courseFileImgpath, 
			@Param("courseFileLevel") int courseFileLevel);
	/**
	 * 根据条件联合查询文件
	 * @return
	 */
	public List<CourseFile> fileQuary(CourseFile coursefile);

	/**
	 * 根据文件ID查找
	 * 
	 * @param courseFileId
	 * @return
	 */
	public CourseFile findCourseFileById(long courseFileId);
	/**
	 * 根据ID删除
	 * @param courseFileId
	 * @return
	 */
	public boolean deleteCourseFileById(long courseFileId);
//
//	/**
//	 * 根据文件名查找
//	 * 
//	 * @param courseFileName
//	 * @return
//	 */
//	public List<CourseFile> findCourseFileByName(String courseFileName);
//
//	/**
//	 * 根据文件所属学院查找
//	 * 
//	 * @param courseFileCollege
//	 * @return
//	 */
//	public ArrayList<CourseFile> searchCourseFilesByCollege(String courseFileCollege);
//	/**
//	 * 根据文件所属课程查找
//	 * @param CourseFileSubject
//	 * @return
//	 */
//	public ArrayList<CourseFile> searchCourseFilesBySubject(String CourseFileSubject);
	/**
	 * 点赞
	 * 
	 * @param coureseFileId
	 * @param courseFileGoodpoint
	 * @return
	 */
	public boolean increaseGoodpoint(@Param("courseFileId") long courseFileId);
}
