package com.mundial2026.app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    private List<Team> teamList;
    private Context context;

    public TeamAdapter(Context context, List<Team> teamList) {
        this.context = context;
        this.teamList = teamList;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team team = teamList.get(position);

        holder.tvFlag.setText(team.getFlagEmoji());
        holder.tvName.setText(team.getName());
        holder.tvConfederation.setText(team.getConfederation());
        holder.tvRanking.setText("FIFA " + team.getFifaRanking());

        holder.cardView.setOnClickListener(v -> {
            Intent intent = new Intent(context, TeamDetailActivity.class);
            intent.putExtra("TEAM_POSITION", position);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView tvFlag;
        TextView tvName;
        TextView tvConfederation;
        TextView tvRanking;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            tvFlag = itemView.findViewById(R.id.tvFlag);
            tvName = itemView.findViewById(R.id.tvName);
            tvConfederation = itemView.findViewById(R.id.tvConfederation);
            tvRanking = itemView.findViewById(R.id.tvRanking);
        }
    }
}
