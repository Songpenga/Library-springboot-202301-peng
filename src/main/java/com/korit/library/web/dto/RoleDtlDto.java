package com.korit.library.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoleDtlDto {
    private int roleDtlId;

    private int userId;
    private int roleId;

    private List<RoleMstDto> roleMstDto;

    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
