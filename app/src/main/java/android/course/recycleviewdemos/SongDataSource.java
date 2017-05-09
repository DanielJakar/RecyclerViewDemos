package android.course.recycleviewdemos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakars on 09/05/2017.
 */

public class SongDataSource {
    public static List<SongItem> getSongs (){
        ArrayList<SongItem> songs = new ArrayList<>();

        songs.add(new SongItem("Piano Man", "Billy Joel", R.drawable.billyjoel_essential, "", "4:24"));
        songs.add(new SongItem("Born in the USA", "Bruce Springstein", R.drawable.brucespingsteengreatest_hits, "", "5:21"));
        songs.add(new SongItem("With or Without you", "U2", R.drawable.u2_joshua_tree, "","3:52"));


        return songs;
    }

}
