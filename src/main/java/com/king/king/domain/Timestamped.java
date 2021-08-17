package com.king.king.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // Entity가 자동으로 컬럼으로 인식
@EntityListeners(AuditingEntityListener.class) // 생성/변경 시간을 자동 업데이트
public abstract class Timestamped {

    @CreatedDate
    private LocalDateTime createdAt; // 생성시간

    @LastModifiedDate
    private LocalDateTime modifiedAt; // 수정시간
}
