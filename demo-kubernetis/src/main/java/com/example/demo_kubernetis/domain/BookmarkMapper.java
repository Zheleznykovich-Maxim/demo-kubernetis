package com.example.demo_kubernetis.domain;

import org.springframework.stereotype.Service;

@Service
public class BookmarkMapper {

    public BookmarkDTO toDto(Bookmark bookmark) {
        BookmarkDTO bookmarkDTO = new BookmarkDTO(null, null, null, null);
        bookmarkDTO.setId(bookmark.getId());
        bookmarkDTO.setTitle(bookmark.getTitle());
        bookmarkDTO.setUrl(bookmark.getUrl());
        bookmarkDTO.setCreatedAt(bookmark.getCreatedAt());
        return bookmarkDTO;
    }
}
