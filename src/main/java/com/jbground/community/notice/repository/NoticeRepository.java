package com.jbground.community.notice.repository;

import com.jbground.community.notice.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
