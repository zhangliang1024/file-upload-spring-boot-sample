package com.zhliang.pzy.file.upload.controller;

import com.zhliang.pzy.file.cloud.inter.CloudStorageFactory;
import com.zhliang.pzy.file.exception.CloudBaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 * 文件上传
 */
@RestController
@RequestMapping("/cloud")
public class FileUploadController {
	@Autowired
	private CloudStorageFactory factory;
	/**
	 * 上传文件
	 */
	@RequestMapping(value = "/upload")
	public String upload(@RequestParam("file") MultipartFile file) throws Exception {
		if (file.isEmpty()) {
			throw new CloudBaseException("上传文件不能为空");
		}
		//上传文件
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		return factory.buildService().uploadSuffix(file.getBytes(), suffix);
	}



}
