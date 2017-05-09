package android.course.recycleviewdemos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Jakars on 09/05/2017.
 */

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    // Need:
    //data to know the count. to do binding
    //inflater: to create the view for the viewholder
    //context: to use explicit intents
    private LayoutInflater inflater;
    private Context context;
    private List<SongItem> data;

    //alt+insert -> constructor

    public SongAdapter(Context context, List<SongItem> data) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.data = data;
    }

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= inflater.inflate(R.layout.song_card_item, parent, false);
        return new SongViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        SongItem song = data.get(position);
        //data binding
        //tvTitle.setText(...)
        holder.tvArtist.setText(song.getArtist());
        holder.tvTitle.setText(song.getTitle());
        holder.ivThumbnail.setImageResource(song.getThumbnailResId());


    }

    @Override
    public int getItemCount() {
        //how many items? data.size
        return data.size();
    }
    public class SongViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvArtist;
        ImageView ivThumbnail;

        public SongViewHolder(View itemView) {
            super(itemView);
            tvArtist = (TextView) itemView.findViewById(R.id.tvArtist);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivThumbnail = (ImageView) itemView.findViewById(R.id.ivThumbnail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    SongItem song = data.get(position);
//                    Toast.makeText(context, song.getTitle(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(context, DetailsActivity.class);

                    intent.putExtra("Song", song);

                    context.startActivity(intent);
                }


            });
        }
    }
}

