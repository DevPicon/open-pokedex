package pe.picondev.android.openpokedex.presentation.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import pe.picondev.android.openpokedex.R;
import pe.picondev.android.openpokedex.model.entities.PokemonEntity;

/**
 * Created by Armando on 12/12/2015.
 */
public class PokemonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<PokemonEntity> pokemonEntityList;

    public PokemonAdapter(List<PokemonEntity> pokemonEntityList) {
        this.pokemonEntityList = pokemonEntityList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_list_item, parent, false);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PokemonViewHolder pokemonViewHolder = (PokemonViewHolder) holder;

        PokemonEntity pokemonEntity = pokemonEntityList.get(position);

        pokemonViewHolder.getPokemonName().setText(pokemonEntity.getName());
        pokemonViewHolder.getPokemonType().setText(pokemonEntity.getType());
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public long getItemId(int position) {
        PokemonEntity pokemonEntity = pokemonEntityList.get(position);
        return pokemonEntity.getId();
    }

    @Override
    public int getItemCount() {
        if (pokemonEntityList != null) {
            return pokemonEntityList.size();
        }

        return 0;
    }
}
