package cn.yunkuke.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yunkuke.entity.CourseFile;

/**
 * @author zqb on 2016年7月27日
 */
@RunWith(SpringJUnit4ClassRunner.class)
//// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })

public class CourseFileDaoTest {
	@Resource
	private CourseFileDao CourseFileDao;
	@Resource
	private UsersDao UsersDao;

	@Test
	public void testInsertCourseFile() {
//		String userId = "10001";
//		String courseFileName = "gaoshu";
//		long courseFileSize = 12121;
//		String courseFileCollege = "lixueyuan";
//		String courseFileSubject = "gaodengshuxue";
//		int courseFileGoodpoint = 0;
//		String courseFilePath = "d://";
//		String courseFileImgpath = "d://";
//		int courseFileLevel = 0;
//		boolean state = CourseFileDao.insertCourseFile(userId, courseFileName, courseFileSize, courseFileCollege,
//				courseFileSubject,courseFileGoodpoint, courseFilePath, courseFileImgpath, courseFileLevel);
//		if (state == true) {
//			System.out.println("添加文件成功");
//		} else {
//			System.out.println("添加文件失败");
//		}
	CourseFile cc =new CourseFile();
		
		cc.setCourseFileName("lo");
		System.out.println(cc.toString());
		List<CourseFile> c = CourseFileDao.fileQuary(cc);
		for (CourseFile courseFile : c) {
			System.out.println(courseFile.toString());
		}
	}

	public void testFileQuary() {
		CourseFile cc =new CourseFile();
		
		cc.setCourseFileName("lo");
		System.out.println(cc.toString());
		List<CourseFile> c = CourseFileDao.fileQuary(cc);
		for (CourseFile courseFile : c) {
			System.out.println(courseFile.toString());
		}
	}

//	@Test
//	public void testFindCourseFileById() {
//		long courseFileId = 1005;
//		CourseFile c = CourseFileDao.findCourseFileById(courseFileId);
//		if (c != null) {
//			System.out.println(c.toString());
//		} else {
//			System.out.println("文件不存在");
//		}
//
//	}
//
//	@Test
//	public void testFindCourseFileByName() {
//		String courseFileName = "gaoshu";
//		List<CourseFile> c = CourseFileDao.findCourseFileByName(courseFileName);
//		for (CourseFile courseFile : c) {
//			System.out.println(courseFile.toString());
//		}
//
//	}
//
//	@Test
//	public void testSearchCourseFilesByCollege() {
//		String courseFileCollege = "lixueyuan";
//		List<CourseFile> c = CourseFileDao.searchCourseFilesByCollege(courseFileCollege);
//		for (CourseFile co : c) {
//			System.out.println(co.toString());
//		}
//	}

	@Test
	public void testIncreaseGoodpoint() {
		long courseFileId = 1001;
		if (CourseFileDao.findCourseFileById(courseFileId) != null) {
			int courseFileGoodpoint = CourseFileDao.findCourseFileById(courseFileId).getCourseFileGoodpoint();
			boolean state = CourseFileDao.increaseGoodpoint(courseFileId);
			if (state == true) {
				System.out.println(courseFileId + "的赞数为"
						+ CourseFileDao.findCourseFileById(courseFileId).getCourseFileGoodpoint());
			} else {
				System.out.println("点赞失败");
			}
		} else {
			System.out.println("文件不存在");
		}

	}
}
