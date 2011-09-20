/*
 * Copyright (C) 2009 Teleca Poland Sp. z o.o. <android@teleca.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.hello;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * Adapter representing tracks 
 * 
 * @author Lukasz Wisniewski
 */
public class PlaylistAdapter extends BaseAdapter {
	
	private ArrayList<PlaySongTest> mPlaylist;
	private Activity mContext;
	
	private int mLayoutId;
	

	
	public PlaylistAdapter(Activity context, int layoutId) {
		mContext = context;
		mLayoutId = layoutId;
	}

	@Override
	public int getCount() {
		if(mPlaylist != null)
			return mPlaylist.size();
		else
			return 0;
	}

	@Override
	public Object getItem(int index) {
		return mPlaylist.get(index);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row=convertView;


		if (row==null) {
			LayoutInflater inflater = mContext.getLayoutInflater();
			row=inflater.inflate(mLayoutId, null);

		}
		PlaySongTest content = mPlaylist.get(position);
		if (content != null) {
			TextView msongName = (TextView) row.findViewById(R.id.TrackRowName);
			TextView msongArtistAlbum = (TextView) row
					.findViewById(R.id.TrackRowArtistAlbum);
			TextView msongDuration = (TextView) row
					.findViewById(R.id.TrackRowDuration);
			ProgressBar msongRating = (ProgressBar) row
					.findViewById(R.id.TrackRowRatingBar);

			msongName.setText(mPlaylist.get(position).getSongName());
			msongArtistAlbum.setText(mPlaylist.get(position)
					.getSongArtistAlbum());
			msongRating.setMax(10);
			msongRating.setProgress(mPlaylist.get(position).getSongRating());
			msongDuration.setText(mPlaylist.get(position).getSongDuration());
		}
		return row;
	}
	
	public static String secondsToString(int seconds){
		String s = ""+seconds/60+":";
		int t = seconds%60;
		s += t < 10 ? "0"+t : t; 
		return s;
	}

	public void setPlaylist(ArrayList<PlaySongTest> playlist) {
		this.mPlaylist = playlist;
	}

}
