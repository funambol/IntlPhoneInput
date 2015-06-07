package net.rimoto.android.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.rimoto.android.R;
import net.rimoto.core.models.SCEService;

import java.util.ArrayList;
import java.util.List;

public class SCEServicesRecycleAdapter extends RecyclerView.Adapter<SCEServicesRecycleAdapter.ViewHolder> {
    private List<SCEService> services = new ArrayList<>();

    @Override
    public SCEServicesRecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_service, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SCEServicesRecycleAdapter.ViewHolder holder, int position) {
        holder.setService(services.get(position));
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    public void setServices(List<SCEService> services) {
        this.services = services;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView serviceName;
        private SCEService service;

        public ViewHolder(View itemView) {
            super(itemView);

            serviceName = (TextView) itemView.findViewById(R.id.serviceName);
        }
        public void setService(SCEService service) {
            this.service = service;
            serviceName.setText(service.getName());
        }
    }
}