package ru.lairon1.hackandplanapi.model.webhook;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lairon1.hackandplanapi.model.user.ProjectUser;

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
public class Webhook {

    private long projectId;
    private long webhookId;
    private String url;
    private List<String> events;
    private boolean isEnabled;
    private List<String> headers;
    private ProjectUser creator;
    private LocalDateTime creationDate;

}
