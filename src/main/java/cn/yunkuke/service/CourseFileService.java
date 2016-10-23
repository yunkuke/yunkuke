package cn.yunkuke.service;

import java.util.List;

import cn.yunkuke.dto.Exposer;
import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.exception.CourseFileException;
import cn.yunkuke.exception.UsersException;

/**
 * @author zqb on 2016年7月28日
 */
public interface CourseFileService {
	boolean insertFile(String userId, String courseFileName, long courseFileSize, String courseFileCollege,
			 String courseFileSubject,int courseFileGoodpoint, String courseFilePath, String courseFileImgpath, int courseFileLevel);

	
	
	/**
	 * 查询所有文件记录
	 * 
	 * @return
	 */
	List<CourseFile> getCourseFileList(String courseFileName,String courseFileCollege,String courseFileSubject);
	List<CourseFile> getCourseFileList();
	/**
	 * 根据ID查单个文件
	 * 
	 * @param CourseFileId
	 * @return
	 */
	CourseFile getCourseFileById(long courseFileId);

//	/**
//	 * 根据文件名查文件
//	 * 
//	 * @param CourseFileName
//	 * @return
//	 */
//	List<CourseFile> getCourseFileByName(String courseFileName);
//
//	/**
//	 * 根据学院查文件
//	 * 
//	 * @param CourseFileCollege
//	 * @return
//	 */
//	List<CourseFile> getCourseFileByCollege(String courseFileCollege);
//    /**
//     * 根据课程查文件
//     * @param courseFileSubject
//     * @return
//     */
//	List<CourseFile> getCourseFileBySubject(String courseFileSubject);
	boolean increaseGoodpoint(long courseFileId);
	/**
	 * 输出下载接口地址
	 * 
	 * @param CourseId
	 */
	Exposer exportDownLoadUrl(long courseId) throws CourseFileException, UsersException;
}
