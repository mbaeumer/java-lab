package se.mbaeumer.javalab.streamdemo.collectors;

public class Bug {
    private int id;
    private String description;
    private Severity severity;

    public Bug(int id, String description, Severity severity) {
        this.id = id;
        this.description = description;
        this.severity = severity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }
}
