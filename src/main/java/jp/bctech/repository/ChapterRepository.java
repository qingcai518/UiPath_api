package jp.bctech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.bctech.entity.Chapter;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
	
}