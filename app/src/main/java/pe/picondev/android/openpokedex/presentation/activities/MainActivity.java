package pe.picondev.android.openpokedex.presentation.activities;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pe.picondev.android.openpokedex.R;
import pe.picondev.android.openpokedex.model.entities.PokemonEntity;
import pe.picondev.android.openpokedex.presentation.adapters.PokemonAdapter;

public class MainActivity extends BaseActivity {

    protected RecyclerView pokemonRecyclerView;
    private List<PokemonEntity> pokemonEntityList;

    @Override
    protected void onCreate() {
        getData();
        PokemonAdapter adapter = new PokemonAdapter(pokemonEntityList);
        pokemonRecyclerView = (RecyclerView) findViewById(R.id.pokemon_recycler_view);
        pokemonRecyclerView.setAdapter(adapter);
        pokemonRecyclerView.setHasFixedSize(true);
        pokemonRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getData() {

        pokemonEntityList = new ArrayList<>();
        PokemonEntity pokemonEntity = new PokemonEntity(1, "Bulbasaur", "grass");
        pokemonEntityList.add(pokemonEntity);
        pokemonEntity = new PokemonEntity(4, "Charmander", "fire");
        pokemonEntityList.add(pokemonEntity);
        pokemonEntity = new PokemonEntity(7, "Squirtle", "water");
        pokemonEntityList.add(pokemonEntity);
        pokemonEntity = new PokemonEntity(25, "Pikachu", "electric");
        pokemonEntityList.add(pokemonEntity);

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }
}
