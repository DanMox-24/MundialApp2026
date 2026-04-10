package com.mundial2026.app;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TeamAdapter adapter;
    private List<Team> allTeams;
    private List<Team> filteredTeams;
    private EditText etSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("⚽ Mundial 2026 - 48 Equipos");
        }

        // Inicializar vistas
        recyclerView = findViewById(R.id.recyclerView);
        etSearch = findViewById(R.id.etSearch);

        // Cargar datos
        allTeams = TeamsData.getTeams();
        filteredTeams = new ArrayList<>(allTeams);

        // Configurar RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TeamAdapter(this, filteredTeams);
        recyclerView.setAdapter(adapter);

        // Configurar búsqueda en tiempo real
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterTeams(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void filterTeams(String query) {
        filteredTeams.clear();
        if (query.isEmpty()) {
            filteredTeams.addAll(allTeams);
        } else {
            String lowerQuery = query.toLowerCase();
            for (Team team : allTeams) {
                if (team.getName().toLowerCase().contains(lowerQuery) ||
                    team.getConfederation().toLowerCase().contains(lowerQuery)) {
                    filteredTeams.add(team);
                }
            }
        }
        adapter.notifyDataSetChanged();
    }
}
