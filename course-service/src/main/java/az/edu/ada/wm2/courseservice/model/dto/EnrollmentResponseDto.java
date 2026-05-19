package az.edu.ada.wm2.courseservice.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentResponseDto {

    @Schema(description = "Qeydiyyatın unikal identifikatoru (ID)", example = "10")
    private Long enrollmentId;

    @Schema(description = "Kursun unikal identifikatoru (ID)", example = "1")
    private Long courseId;

    @Schema(description = "Tələbənin unikal identifikatoru (ID)", example = "15")
    private Long studentId;

    @Schema(description = "Əməliyyatın nəticəsi barədə mesaj", example = "Tələbə kursa uğurla qeydiyyatdan keçdi.")
    private String message;

    @Schema(description = "Tələbənin kursa qeydiyyatdan keçdiyi tarix və vaxt", example = "2026-05-19T17:45:00")
    private LocalDateTime enrollmentDate;
}
