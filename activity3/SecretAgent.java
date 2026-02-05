import java.time.LocalDateTime;

public class SecretAgent {
    public SecretAgent(String agentId, String codename, int clearanceLevel) {
        this.agentId = agentId;
        this.codename = codename;
        this.clearanceLevel = clearanceLevel;
        onMission = false;
        lastMissionCompletionTime = null;
    }

    private String agentId;
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletionTime;

    // Getters
    String getAgentId() {
        return agentId;
    }

    public String getCodename() {
        return codename;
    }

    public int getClearanceLevel() {
        return clearanceLevel;
    }

    public boolean isOnMission() {
        return onMission;
    }

    public LocalDateTime getLastMissionCompletionTime() {
        return lastMissionCompletionTime;
    }

    // Setters
    public void setCodename(String newCodename) {
        this.codename = newCodename;
    }

    public void setClearanceLevel(int level) {
        if (level > 0 && level <= 5)
            this.clearanceLevel = level;
        else
            System.err.println("Error : Invalid clearance level");
    }

    public void startMission() {
        onMission = true;
    }

    public void completeMission() {
        onMission = false;
        lastMissionCompletionTime = LocalDateTime.now();
    }
}
