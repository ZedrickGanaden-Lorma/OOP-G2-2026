import java.util.Arrays;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main {
    public static void getAgentStatus(SecretAgent agent) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMMM dd, yyyy");
        String lastMissionCompletionTime = "null";
        if (agent.getLastMissionCompletionTime() != null) {
            lastMissionCompletionTime = agent.getLastMissionCompletionTime().plusDays(2).format(format);
        }
        System.out.println("AgentId                     : " + agent.getAgentId());
        System.out.println("Codename                    : " + agent.getCodename());
        System.out.println("ClearanceLevel              : " + agent.getClearanceLevel());
        System.out.println("OnMission                   : " + agent.isOnMission());
        System.out.println("LastMissionCompletionTime   : " + lastMissionCompletionTime);
        System.out.println();
    }

    public static void missionAssigment(SecretAgent agent, Mission mission) {
        if (agent.getClearanceLevel() >= mission.getDifficulty()) {
            System.out.printf("%s is cleared for mission%n", "Agent " + agent.getAgentId());
        } else {
            System.out.printf("%s,s clearance is too low for this mission%n", "Agent " + agent.getAgentId());
        }
    }

    public static void main(String[] args) {
        SecretAgent agent077 = new SecretAgent("007", "James Bond", 5);
        getAgentStatus(agent077);

        Mission m = new Mission();
        m.displayMissionBriefing();
        missionAssigment(agent077, m);
        agent077.completeMission();
        getAgentStatus(agent077);
    }
}