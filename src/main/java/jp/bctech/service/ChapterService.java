package jp.bctech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.bctech.repository.ChapterRepository;
import jp.bctech.entity.Chapter;

import java.util.*;

@Service
@Transactional
public class ChapterService {
	@Autowired
	ChapterRepository repository;
	
	public List<Chapter> fetchAll() {
		return repository.findAll();
	}
}
