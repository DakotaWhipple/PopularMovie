package android.thortechasia.popularmovie.data.lokal

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import kotlinx.coroutines.Deferred

@Dao
interface PopularMovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inserts(movies: List<PopularMovieEntity>)

    @Query("SELECT * FROM movie")
    fun getPopularMovies() : Deferred<List<PopularMovieEntity>>

    @Query("SELECT * FROM movie WHERE id = :id")
    fun getDetailMovie(id: Int) : Deferred<PopularMovieEntity>

}