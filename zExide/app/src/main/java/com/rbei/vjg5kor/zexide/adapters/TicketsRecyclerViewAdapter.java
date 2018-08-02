package com.rbei.vjg5kor.zexide.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rbei.vjg5kor.zexide.R;
import com.rbei.vjg5kor.zexide.activities.TicketDetailActivity;
import com.rbei.vjg5kor.zexide.models.Ticket;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TicketsRecyclerViewAdapter extends RecyclerView.Adapter<TicketsRecyclerViewAdapter.ViewHolder> {

    Context context;
    List<Ticket> tickets;

    public TicketsRecyclerViewAdapter(Context context,List<Ticket> tickets){
        this.context=context;
        this.tickets=tickets;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tickets_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
          Ticket ticket=tickets.get(position);
          holder.tvTicketNo.setText(ticket.getTicketNo());
          holder.tvDueDate.setText(ticket.getTicketDue());

        Picasso.with(getContext()).load(ticket.getAlertType())

                .into(holder.ivAlert);
        Picasso.with(getContext()).load(ticket.getTicketType())
                .resize(250, 150).into(holder.ivTicketType);


    }

    private Context getContext() {
      return context;
    }

    @Override
    public int getItemCount() {
        return tickets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.ivAlert)
        ImageView ivAlert;
        @BindView(R.id.tvTicketNo)
        TextView tvTicketNo;
        @BindView(R.id.tvDueDate)
        TextView tvDueDate;
        @BindView(R.id.ivTicketType)
        ImageView ivTicketType;
        @BindView(R.id.cvTicket)
        CardView cvTicket;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Ticket ticket=tickets.get(getAdapterPosition());
            Intent intent=new Intent(getContext(), TicketDetailActivity.class);
            intent.putExtra("Ticket",ticket);
            getContext().startActivity(intent);

        }
    }
}