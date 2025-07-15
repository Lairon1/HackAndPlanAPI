package ru.lairon1.hackandplanapi.model.project;

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
public class ProjectFile {

    private long projectId;
    private long fileId;
    private String name;
    private String thumbName;
    private String url;
    private String thumbUrl;
    private long size;
    private boolean isImage;
    private User user;
    private LocalDateTime creationDate;

}
