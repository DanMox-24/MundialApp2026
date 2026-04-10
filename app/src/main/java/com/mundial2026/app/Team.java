package com.mundial2026.app;

public class Team {
    private String name;
    private String flagEmoji;
    private String confederation;
    private String group;
    private String coach;
    private String capitalCity;
    private String fifaRanking;
    private String worldCupAppearances;
    private String bestResult;
    private String stadium;
    private String description;

    public Team(String name, String flagEmoji, String confederation, String group,
                String coach, String capitalCity, String fifaRanking,
                String worldCupAppearances, String bestResult, String stadium,
                String description) {
        this.name = name;
        this.flagEmoji = flagEmoji;
        this.confederation = confederation;
        this.group = group;
        this.coach = coach;
        this.capitalCity = capitalCity;
        this.fifaRanking = fifaRanking;
        this.worldCupAppearances = worldCupAppearances;
        this.bestResult = bestResult;
        this.stadium = stadium;
        this.description = description;
    }

    public String getName() { return name; }
    public String getFlagEmoji() { return flagEmoji; }
    public String getConfederation() { return confederation; }
    public String getGroup() { return group; }
    public String getCoach() { return coach; }
    public String getCapitalCity() { return capitalCity; }
    public String getFifaRanking() { return fifaRanking; }
    public String getWorldCupAppearances() { return worldCupAppearances; }
    public String getBestResult() { return bestResult; }
    public String getStadium() { return stadium; }
    public String getDescription() { return description; }
}
