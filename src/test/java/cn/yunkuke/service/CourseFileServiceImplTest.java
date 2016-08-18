package cn.yunkuke.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.yunkuke.BaseTest;
import cn.yunkuke.entity.CourseFile;

/**
 * @author zqb on 2016年7月29日
 */
public class CourseFileServiceImplTest extends BaseTest {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseFileService courseFileService;

	@Test
	public void testGetCourseFileList() {
		List<CourseFile> courseFile = courseFileService.getCourseFileList();
		for (CourseFile c : courseFile) {
			System.out.println(c.toString());
		}
	}

	@Test
	public void testGetCourseFileById() {
		long courseFileId = 1001;
		CourseFile c = courseFileService.getCourseFileById(courseFileId);
		if (c == null) {
			System.out.println("文件不存在");
		} else {
			System.out.println(c.toString());
		}
	}

	@Test
	public void testGetCourseFileByName() {
		String courseFileName = "gaoshu";
		List<CourseFile> courseFile = courseFileService.getCourseFileByName(courseFileName);
		for (CourseFile c : courseFile) {
			System.out.println(c.toString());
		}
	}

	@Test
	public void testGetCourseFileByCollege() {
		String courseFileCollege = "lixueyuan";
		List<CourseFile> courseFile = courseFileService.getCourseFileByCollege(courseFileCollege);
		for (CourseFile c : courseFile) {
			System.out.println(c.toString());
		}
	}

	@Test
	public void testExportDownLoadUrl() {
		fail("Not yet implemented");
	}

}
