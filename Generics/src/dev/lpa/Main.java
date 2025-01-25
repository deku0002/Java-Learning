package dev.lpa;

interface Player {

    String name();
}

record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
record VolleyballPlayer(String name, String position) implements Player{};

public class Main implements Player {

    public static void main(String[] args) {

        var philly = new Affiliation("city","philadelphia, PA","US");

//        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
//        BaseballTeam astros1 = new BaseballTeam("Huston Astros");
//        scoreResult(phillies1,3,astros1,5);
//
//        BaseballTeam phillies2 = new BaseballTeam("Philadelphia Phillies");
//        BaseballTeam astros2 = new BaseballTeam("Huston Astros");
//        scoreResult(phillies2,3,astros2,5);
//
        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies",philly);
        Team<BaseballPlayer, Affiliation> astros = new Team<>("Huston Astros");
        scoreResult(phillies,3,astros,5);
//
//        var harper = new BaseballPlayer("B Harper","Right Fielder");
//        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
//        phillies.addTeamMember(harper);
//        phillies.addTeamMember(marsh);
//        var guthrie = new BaseballPlayer("D Guthrie","Centre Fielder");
//        phillies.addTeamMember(guthrie);
//        phillies.listTeamMembers();
//
        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, String> afc = new Team<>("Adelaide Crows","City of Adelaide, South Africa, in AU");
        var tex = new FootballPlayer("Tex Walker","Centre Half Forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird","Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();
//
//        Team<VolleyballPlayer> adelaide = new Team<>("Adelaide Storm");
//        adelaide.addTeamMember(new VolleyballPlayer("N Roberts","setter"));
//        adelaide.listTeamMembers();
//
//        var canberra = new Team<VolleyballPlayer>("Canberra Heat");
//        canberra.addTeamMember(new VolleyballPlayer("B Black","opposite"));
//        canberra.listTeamMembers();
//        scoreResult(canberra,0,adelaide,1);
    }

    public static void scoreResult (BaseballTeam team1, int t1_score,
                                    BaseballTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }

    public static void scoreResult (SportsTeam team1, int t1_score,
                                    SportsTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }

    public static void scoreResult (Team team1, int t1_score,
                                    Team team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }

    @Override
    public String name() {
        return "";
    }
}
