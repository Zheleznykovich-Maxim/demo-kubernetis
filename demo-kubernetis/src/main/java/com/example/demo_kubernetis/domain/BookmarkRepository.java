package com.example.demo_kubernetis.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepository  extends JpaRepository<Bookmark, Long> {
}
