package ru.lairon1.hackandplanapi.model.workitem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class WorkItemSubtask {

    private int projectId;
    private int workItemId;
    private int subTaskId;
    private String title;
    private boolean isCompleted;
    private int index;
    private LocalDateTime creationDate;

}
