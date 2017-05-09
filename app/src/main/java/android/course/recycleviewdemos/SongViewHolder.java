package android.course.recycleviewdemos;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jakars on 09/05/2017.
 */

public class SongViewHolder extends RecyclerView.ViewHolder {
    TextView tvTitle;
    TextView tvArtist;
    ImageView ivThumbnail;

    public SongViewHolder(View itemView) {
        super(itemView);
        tvArtist = (TextView) itemView.findViewById(R.id.tvArtist);
        tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        ivThumbnail = (ImageView) itemView.findViewById(R.id.ivThumbnail);
    }
}
