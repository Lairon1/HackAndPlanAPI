package ru.lairon1.hackandplanapi.model;

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
public class Board {

    private long projectId;
    private long boardId;
    private long milestoneId;
    private String name;
    private String description;
    private String generalInfo;
    private LocalDateTime startDate;
    private LocalDateTime dueDate;
    private LocalDateTime closingDate;
    private LocalDateTime creationDate;
    private User creator;
    private boolean isDefault;

}
