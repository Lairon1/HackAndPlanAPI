package ru.lairon1.hackandplanapi.model.milestone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lairon1.hackandplanapi.model.Board;
import ru.lairon1.hackandplanapi.model.user.User;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 0xLairon1
 * @project HackAndPlanAPI
 * @since 15.07.2025
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Milestone {

    private long projectId;
    private long milestoneId;
    private String name;
    private String generalInfo;
    private User creator;
    private LocalDateTime startDate;
    private LocalDateTime dueDate;
    private LocalDateTime closingDate;
    private LocalDateTime creationDate;
    private List<Board> boards;

}
