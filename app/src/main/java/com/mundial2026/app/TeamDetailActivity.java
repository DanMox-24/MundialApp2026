package com.mundial2026.app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class TeamDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_detail);

        // Obtener posición del equipo desde el Intent
        int position = getIntent().getIntExtra("TEAM_POSITION", 0);
        List<Team> teams = TeamsData.getTeams();
        Team team = teams.get(position);

        // Configurar ActionBar con botón de retroceso
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(team.getName());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Vincular vistas
        TextView tvDetailFlag = findViewById(R.id.tvDetailFlag);
        TextView tvDetailName = findViewById(R.id.tvDetailName);
        TextView tvDetailConfederation = findViewById(R.id.tvDetailConfederation);
        TextView tvDetailGroup = findViewById(R.id.tvDetailGroup);
        TextView tvDetailCoach = findViewById(R.id.tvDetailCoach);
        TextView tvDetailCapital = findViewById(R.id.tvDetailCapital);
        TextView tvDetailRanking = findViewById(R.id.tvDetailRanking);
        TextView tvDetailAppearances = findViewById(R.id.tvDetailAppearances);
        TextView tvDetailBestResult = findViewById(R.id.tvDetailBestResult);
        TextView tvDetailStadium = findViewById(R.id.tvDetailStadium);
        TextView tvDetailDescription = findViewById(R.id.tvDetailDescription);

        // Asignar datos del equipo
        tvDetailFlag.setText(team.getFlagEmoji());
        tvDetailName.setText(team.getName());
        tvDetailConfederation.setText("Confederación: " + team.getConfederation());
        tvDetailGroup.setText("Grupo: " + team.getGroup());
        tvDetailCoach.setText("🧑‍💼 DT: " + team.getCoach());
        tvDetailCapital.setText("🏙️ Capital: " + team.getCapitalCity());
        tvDetailRanking.setText("📊 Ranking FIFA: " + team.getFifaRanking());
        tvDetailAppearances.setText("🏆 Mundiales: " + team.getWorldCupAppearances());
        tvDetailBestResult.setText("🥇 Mejor resultado: " + team.getBestResult());
        tvDetailStadium.setText("🏟️ Estadio: " + team.getStadium());
        tvDetailDescription.setText(team.getDescription());
    }

    // Botón de retroceso en ActionBar
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
