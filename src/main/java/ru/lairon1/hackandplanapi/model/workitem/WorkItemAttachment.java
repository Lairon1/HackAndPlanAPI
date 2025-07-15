package ru.lairon1.hackandplanapi.model.workitem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lairon1.hackandplanapi.model.project.ProjectFile;
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
public class WorkItemAttachment {

    private int projectId;
    private int workItemId;
    private int attachmentId;
    private ProjectFile file;
    private User user;
    private boolean isCardPicture;
    private LocalDateTime creationDate;

}
