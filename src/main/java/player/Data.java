package player;

import java.io.Serializable;

public class Data implements Serializable {

    String name;
    String team;
    String nick;
    String time;
    boolean hadTeam = false;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTeam() { return this.team; }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getNick() {
        return this.nick;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public boolean isHadTeam() {
        return this.hadTeam;
    }
    public void setHadTeam(boolean hadTeam) {
        this.hadTeam = hadTeam;
    }

}
