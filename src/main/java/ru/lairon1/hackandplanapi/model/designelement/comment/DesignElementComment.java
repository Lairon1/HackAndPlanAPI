package ru.lairon1.hackandplanapi.model.designelement.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lairon1.hackandplanapi.model.user.User;

import java.time.LocalDateTime;

/**
 * @author 0xLairon1
 * @project HackAndPlanAPI
 * @since 15.07.2025
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DesignElementComment {

    private long projectId;
    private long designElementId;
    private long commentId;
    private String text;
    private User user;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;

}
