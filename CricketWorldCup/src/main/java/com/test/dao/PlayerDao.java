package com.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.model.Player;

@Repository
public class PlayerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Player> getAllPlayers() {
        String sql = "SELECT * FROM player";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Player p = new Player();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setRole(rs.getString("role"));
            p.setRuns(rs.getInt("runs"));
            p.setMatches(rs.getInt("matches"));
            p.setBalls(rs.getInt("balls"));
            p.setWickets(rs.getInt("wickets"));
            p.setRunsConceded(rs.getInt("runs_conceded"));
            return p;
        });
    }
    public void seedIfEmpty() {
        Integer count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM player", Integer.class);
        if (count != null && count > 0) return;

        String insert = "INSERT INTO player (name, role, runs, matches, balls, wickets, runs_conceded) VALUES (?,?,?,?,?,?,?)";
        List<Object[]> batch = List.of(
            new Object[]{"Rohit Sharma",       "BATTER",         9200, 254, 10300,  8,   52},
            new Object[]{"Virat Kohli",        "BATTER",        13800, 282, 14900,  4,   30},       
            new Object[]{"Kane Williamson",    "BATTER",         6500, 161,  6900,  0,    0},
            new Object[]{"Jos Buttler",        "WICKET_KEEPER",  4700, 180,  4200,  0,    0},
            new Object[]{"Hardik Pandya",      "ALL_ROUNDER",    1800,  86,  1600, 84, 3800},
            new Object[]{"Shaheen Afridi",     "BOWLER",          110,  70,   250,120, 3100},
            new Object[]{"Mitchell Starc",     "BOWLER",          180, 120,   380,219, 5200},
            new Object[]{"Rashid Khan",        "BOWLER",          350, 100,   600,170, 3900}
        );
        jdbcTemplate.batchUpdate(insert, batch);
    }
}
