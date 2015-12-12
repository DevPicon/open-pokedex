package pe.picondev.android.openpokedex.presentation.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import pe.picondev.android.openpokedex.R;

/**
 * Created by Armando on 12/12/2015.
 */
public class PokemonViewHolder extends RecyclerView.ViewHolder {

    private ImageView pokemonIcon;
    private TextView pokemonName;
    private TextView pokemonType;

    public PokemonViewHolder(View itemView) {
        super(itemView);

        pokemonIcon = (ImageView) itemView.findViewById(R.id.imgPokemonIcon);
        pokemonName = (TextView) itemView.findViewById(R.id.txtPokemonName);
        pokemonType = (TextView) itemView.findViewById(R.id.txtPokemonType);
    }

    public ImageView getPokemonIcon() {
        return pokemonIcon;
    }

    public void setPokemonIcon(ImageView pokemonIcon) {
        this.pokemonIcon = pokemonIcon;
    }

    public TextView getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(TextView pokemonName) {
        this.pokemonName = pokemonName;
    }

    public TextView getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(TextView pokemonType) {
        this.pokemonType = pokemonType;
    }
}
