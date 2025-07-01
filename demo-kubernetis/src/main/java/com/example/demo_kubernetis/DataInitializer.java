package com.example.demo_kubernetis;

import com.example.demo_kubernetis.domain.Bookmark;
import com.example.demo_kubernetis.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) {
        bookmarkRepository.save(new Bookmark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "SivaLabs2", "https://sivalabs.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "SivaLabs3", "https://sivalabs.in", Instant.now()));
    }
}
