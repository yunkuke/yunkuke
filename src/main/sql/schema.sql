-- 数据库初始化脚本

--创建数据库
CREATE DATABASE  yunkuke DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
--使用数据库
use yunkuke;
--创建用户表

CREATE TABLE users(
	`user_id` varchar(30) NOT NULL  COMMENT '用户id',
	`user_name` varchar(20) NOT NULL COMMENT '用户姓名',
	`user_password` varchar(32) NOT NULL COMMENT '用户密码',
	`user_school` varchar(50) NOT NULL COMMENT '用户所属学校',
	`user_level` int NOT NULL COMMENT '用户级别',
	PRIMARY KEY(`user_id`)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户表';
--创建课程文件表
CREATE TABLE coursefile(
	`courseFile_id` bigint NOT NULL AUTO_INCREMENT COMMENT '课程文件id',
	`user_id` varchar(30)  NOT NULL COMMENT '用户id',
	`courseFile_name` varchar(120) NOT NULL COMMENT '课程文件名称',
	`courseFile_size` bigint NOT NULL COMMENT '课程文件大小',
	`courseFile_college` varchar(50) NOT NULL COMMENT '课程文件所属学院',
	`courseFile_subject` varchar(50) NOT NULL COMMENT '课程文件所属课程',
	`courseFile_uplodeDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '课程文件上传时间',
	`courseFile_goodpoint` int NOT NULL DEFAULT '0' COMMENT '课程文件点赞量',
	`courseFile_path` varchar(200) NOT NULL COMMENT '课程文件路径',
	`courseFile_imgpath` varchar(200) NOT NULL COMMENT '课程文件预览图片路径',
	`courseFile_level` int NOT NULL COMMENT '课程文件级别',
	PRIMARY KEY(`courseFile_id`),
	key idx_user_id(`user_id`),
	key idx_courseFile_name(`courseFile_name`),
	key idx_courseFile_college(`courseFile_college`)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='课程文件表';

--初始化用户数据
insert into 
	users(user_id,user_password,user_name,user_school,user_level)
values
	(10001,'123','zqb','中国矿业大学',1),
	(10002,'456','zs','中国矿业大学',2),
	(10003,'789','zc','中国矿业大学',3);
insert into 
	courseFile(courseFile_level，courseFile_name，courseFile_college，courseFile_path，courseFile_imgpath)
values
('1''高数','中国矿业大学',c://666/gs.ppt,c://666/gs.img）,
('2''离散数学','中国矿业大学',c://777/ls.ppt,c://777/ls.img）,
('3''概率论','中国矿业大学',c://888/gll.ppt,c://888/gll.img）;
--连接数据库
mysql -uroot -p