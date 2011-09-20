package com.android.hello;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class IndexActivity extends Activity {
    /** Called when the activity is first created. */
	private ListView mTracksListView;
	private PlaylistAdapter mPlayListAdapter;
	private ArrayList<PlaySongTest> playlist;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mTracksListView = (ListView)findViewById(R.id.PlaylistTracksListView);
        mPlayListAdapter = new PlaylistAdapter(this, R.layout.row);
        mTracksListView.setAdapter(mPlayListAdapter);
        playlist = new ArrayList<PlaySongTest>();
        setData();
        
    }
    
    public void setData(){
    	for (int i=0; i < 5; i++){
    		PlaySongTest ps = new PlaySongTest();
    		ps.setSongName("songName"+i);
    		ps.setSongArtistAlbum("songArtistAlbum"+i);
    		ps.setSongDuration("songDuration"+i);
    		ps.setSongRating(i);
    		playlist.add(ps);
    	}
    	
    	
    	mPlayListAdapter.setPlaylist(playlist);
    }
}