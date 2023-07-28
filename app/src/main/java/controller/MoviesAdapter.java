package controller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ibdb.R;

import java.util.List;

import Model.Movie;
import View.infoActivity;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {

    private List<Movie> movieList;
    private Context context ;

    public MoviesAdapter(Context context ,List movieList) {
        this.movieList = movieList;
        this.context = context;
    }

    @NonNull
    @Override
    public MoviesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView= LayoutInflater.from(parent.getContext())
               .inflate(R.layout.movies_list_row,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.ViewHolder holder, int position) {
        Movie movie=movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        holder.image.setImageResource(movie.getImage());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView title, genre, year;
        private ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title=itemView.findViewById(R.id.mytitle);
            genre=itemView.findViewById(R.id.mygenre);
            year= itemView.findViewById(R.id.myyear);
            image= itemView.findViewById(R.id.myimage);

        }

        @Override
        public void onClick(View view) {
        int position=getAdapterPosition();
        Movie movie=movieList.get(position);
            Intent intent=new Intent(context, infoActivity.class);
            intent.putExtra("title",movie.getTitle());
            intent.putExtra("genre",movie.getGenre());
            intent.putExtra("year",movie.getYear());
            intent.putExtra("image",movie.getImage());
            context.startActivity(intent);
        }
    }
}
