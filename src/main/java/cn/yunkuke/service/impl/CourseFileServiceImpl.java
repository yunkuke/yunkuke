package cn.yunkuke.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yunkuke.dao.CourseFileDao;
import cn.yunkuke.dao.UsersDao;
import cn.yunkuke.dto.Exposer;
import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.exception.CourseFileException;
import cn.yunkuke.exception.UsersException;
import cn.yunkuke.service.CourseFileService;

/**
 * @author zqb on 2016年7月28日
 */
@Service
public class CourseFileServiceImpl implements CourseFileService {

	private final static Logger LOG = LoggerFactory.getLogger(CourseFileServiceImpl.class);

	// 注入Service依赖
	@Autowired
	private CourseFileDao courseFileDao;
	@Autowired
	private UsersDao userDao;

	public List<CourseFile> getCourseFileList() {

		return courseFileDao.findCourseFileAll();
	}

	public CourseFile getCourseFileById(long courseFileId) {

		return courseFileDao.findCourseFileById(courseFileId);
	}

	public List<CourseFile> getCourseFileByName(String courseFileName) {

		return courseFileDao.findCourseFileByName(courseFileName);
	}

	public List<CourseFile> getCourseFileByCollege(String courseFileCollege) {

		return courseFileDao.searchCourseFilesByCollege(courseFileCollege);
	}
	public List<CourseFile> getCourseFileBySubject(String courseFileSubject) {
		return courseFileDao.searchCourseFilesBySubject(courseFileSubject);
	}
	public Exposer exportDownLoadUrl(long courseId) throws CourseFileException, UsersException {

		return null;
	}

	public boolean insertFile(String userId, String courseFileName, long courseFileSize, String courseFileCollege,
			String courseFileSubject,int courseFileGoodpoint, String courseFilePath, String courseFileImgpath, int courseFileLevel) {

		return courseFileDao.insertCourseFile(userId, courseFileName, courseFileSize, courseFileCollege,
				courseFileSubject,courseFileGoodpoint, courseFilePath, courseFileImgpath, courseFileLevel);
	}



}
