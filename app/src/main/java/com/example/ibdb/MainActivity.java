package com.example.ibdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Model.Movie;
import controller.MoviesAdapter;

public class MainActivity extends AppCompatActivity {
private List<Movie> movieList=new ArrayList<>();
private RecyclerView recyclerView;
private MoviesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        adapter=new MoviesAdapter(this,movieList);
        RecyclerView.LayoutManager layoutManager=
                new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        MoviesData();
    }

    private void MoviesData() {
        Movie movie1=new Movie("Stranger Things",
                "100 min | Drama, Fantasy, Horror",
                "2016-2024",
                R.drawable.image1);
        movieList.add(movie1);
        Movie movie2=new Movie("Bird Box: Barcelona",
                "112 min | Horror, Mystery, Sci-Fi",
                "2023",
                R.drawable.image2);
        movieList.add(movie2);
        Movie movie3=new Movie("A Haunting in Venice",
                "PG-13 | Crime, Drama, Horror | Completed",
                "2023",
                R.drawable.image3);
        movieList.add(movie3);
        Movie movie4=new Movie("Haunted Mansion",
                "PG-13 | 122 min | Comedy, Drama, Family",
                "2023",
                R.drawable.image4);
        movieList.add(movie4);
        Movie movie5=new Movie("Insidious: The Red Door",
                "PG-13 | 107 min | Horror, Mystery, Thriller",
                "2023",
                R.drawable.image5);
        movieList.add(movie5);
        Movie movie6=new Movie("The Walking Dead",
                "44 min | Drama, Horror, Thriller",
                "2010–2022",
                R.drawable.image6);
        movieList.add(movie6);
        Movie movie7=new Movie("From",
                "52 min | Drama, Horror, Mystery",
                "2022",
                R.drawable.image7);
        movieList.add(movie7);
        Movie movie8=new Movie("The Walking Dead: Dead City ",
                "46 min | Adventure, Horror, Thriller",
                "2023",
                R.drawable.image8);
        movieList.add(movie8);

        adapter.notifyDataSetChanged();
    }
}