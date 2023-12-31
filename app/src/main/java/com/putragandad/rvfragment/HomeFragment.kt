package com.putragandad.rvfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var recyclerView : RecyclerView = view.findViewById(R.id.rv_movielist)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val movieList = ArrayList<MovieList>()

        movieList.add(MovieList(R.drawable.movie_1, "Mission: Impossible Dead Reckoning Part 1", "2023", "Tom Cruise, Rebecca Ferguson, Hayley Atwell"))
        movieList.add(MovieList(R.drawable.movie_2, "Titanic", "1997", "Leonardo DiCaprio, Kate Winslet, etc"))
        movieList.add(MovieList(R.drawable.movie_3, "The Last of Us", "2023", "Pedro Pascal, Bella Ramsey, Anna Torv, etc"))
        movieList.add(MovieList(R.drawable.movie_4, "Avatar: The Way of Water", "2022", "Sam Worthington, Zoe Saldana, Sigourney Weaver, etc"))

        val movieListHomeAdapter = MovieListHomeAdapter(movieList)

        recyclerView.adapter = movieListHomeAdapter
    }
}