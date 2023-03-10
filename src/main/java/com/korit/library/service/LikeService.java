package com.korit.library.service;

import com.korit.library.entity.BookLike;
import com.korit.library.exception.CustomLikeException;
import com.korit.library.repository.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class LikeService {

    private final LikeRepository likeRepository;

    public void like(int bookId, int userId){
        BookLike bookLike = BookLike.builder()
                .bookId(bookId)
                .userId(userId)
                .build();

        if(likeRepository.getLikeStatus(bookLike) > 0){
            Map<String, String> errorMap = new HashMap<>();
            errorMap.put("likeError", "좋아요를 취소해 주세요.");
            throw new CustomLikeException(errorMap);
        }
        likeRepository.addLike(bookLike);
    }

    public void dislike(int bookId, int userId){
        BookLike bookLike = BookLike.builder()
                .bookId(bookId)
                .userId(userId)
                .build();
        if(likeRepository.getLikeStatus(bookLike) > 0){
            Map<String, String> errorMap = new HashMap<>();
            errorMap.put("likeError", "좋아요를 취소해 주세요.");
            throw new CustomLikeException(errorMap);
        }
        likeRepository.addLike(bookLike);
    }
}
