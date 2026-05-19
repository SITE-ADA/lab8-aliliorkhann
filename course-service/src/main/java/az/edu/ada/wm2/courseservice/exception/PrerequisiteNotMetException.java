package az.edu.ada.wm2.courseservice.exception;

public class PrerequisiteNotMetException extends RuntimeException {
    public PrerequisiteNotMetException(Long prerequisiteId) {
        super("Bu kursa qeydiyyatdan keçmək üçün əvvəlcə ön şərt olan kursu (ID: " + prerequisiteId + ") bitirməlisiniz.");
    }
}