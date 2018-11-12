package jp.bctech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import jp.bctech.entity.Chapter;
import jp.bctech.service.ChapterService;

@RestController
@RequestMapping("/v1/chapter")
public class ChapterController {
	@Autowired
	ChapterService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Object> fetchAll() {
		List<Chapter> data = service.fetchAll();

		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", data);
		return result;
	}
}