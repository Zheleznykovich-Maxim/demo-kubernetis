package com.example.demo_kubernetis.api;

import com.example.demo_kubernetis.domain.BookmarkService;
import com.example.demo_kubernetis.domain.BookmarksDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                     @RequestParam(name = "query", defaultValue = "") String query) {
        if (query == null || query.trim().isEmpty()) {
            return bookmarkService.getBookmarks(page);
        }
        return bookmarkService.searchBookmarks(page, query);
    }
}
