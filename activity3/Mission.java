import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mission {
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    public Mission() {
        Random rng = new Random();
        String[] possibleMissions = """
                Retrieve stolen data
                Infiltrate enemy base
                Rescue hostage
                Steal an encrypted drive from a high-security gala
                Intercept a weapons deal on a moving train
                Plant surveillance devices in an enemy embassy
                Sabotage a satellite launch without triggering alarms
                Identify the mole inside headquarters
                Sabotage enemy weapons research
                """.split("\n");
        missionTarget = possibleMissions[rng.nextInt(0, possibleMissions.length)];

        difficulty = rng.nextInt(1, 11);

        int randomDeadline = rng.nextInt(7, 31);
        missionDeadline = LocalDate.now().plusDays(randomDeadline);
    }

    public String getMissionTarget() {
        return missionTarget;
    }

    public LocalDate getMissionDeadline() {
        return missionDeadline;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void displayMissionBriefing() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM dd, yyyy");
        System.out.printf("""
                *** MISSION BRIEFING ***
                Target: %s
                Difficulty: %d
                Deadline: %s

                """, missionTarget, difficulty, missionDeadline.format(format));
    }

}
