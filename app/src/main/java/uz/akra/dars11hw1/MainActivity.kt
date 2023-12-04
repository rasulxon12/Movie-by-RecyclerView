package uz.akra.dars11hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.akra.dars11hw1.adapter.MovieAdapter
import uz.akra.dars11hw1.databinding.ActivityMainBinding
import uz.akra.dars11hw1.models.Movie

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var list: ArrayList<Movie>
    lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        loadData()
        movieAdapter = MovieAdapter(this, list)
        binding.recView.adapter = movieAdapter

    }

    private fun loadData() {
        list = ArrayList()
        list.add(
            Movie(
                R.drawable.shawshank,
                "The Shawshank Redemption",
                "Views: 500.000.000",
                "Release date: September 10, 1994"
            )
        )
        list.add(
            Movie(
                R.drawable.inception,
                "Inception",
                "Views: 450.000.000",
                "Release date: July 8, 2010"
            )
        )
        list.add(
            Movie(
                R.drawable.forrest,
                "Forrest Gamp",
                "Views: 400.000.000",
                "Release date: June 23, 1994"
            )
        )
        list.add(
            Movie(
                R.drawable.batman,
                "The Dark Knight Rises",
                "Views: 400.000.000",
                "Release date: July 16, 2012"
            )
        )
        list.add(
            Movie(
                R.drawable.walle,
                "WALL-E",
                "Views: 380.000.000",
                "Release date: June 23, 2008"
            )
        )
        list.add(
            Movie(
                R.drawable.untouchables,
                "Intouchables",
                "Views: 370.000.000",
                "Release date: September 23, 2011"
            )
        )

        list.add(
            Movie(
                R.drawable.idiots,
                "3 Idiots",
                "Views: 350.000.000",
                "Release date: August 17, 2011"
            )
        )

        list.add(
            Movie(
                R.drawable.braveheart,
                "Braveheart",
                "Views: 350.000.000",
                "Release date: June 17, 1995"
            )
        )

        list.add(
            Movie(
                R.drawable.toystory,
                "Toy Story",
                "Views: 330.000.000",
                "Release date: November 19, 1995"
            )
        )

        list.add(
            Movie(
                R.drawable.nemo,
                "Finding Nemo",
                "Views: 310.000.000",
                "Release date: May 30, 2003"
            )
        )

    }
}