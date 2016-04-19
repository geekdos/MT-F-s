package com.ensaf.etudiant.mtapplication.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ensaf.etudiant.mtapplication.R;
import com.ensaf.etudiant.mtapplication.maps.MapConfiguration;
import com.ensaf.etudiant.mtapplication.maps.MapStarter;
import com.ensaf.etudiant.mtapplication.maps.monuments.MonumentsMapActivity;
import com.ensaf.etudiant.mtapplication.model.DummyModel;
import com.ensaf.etudiant.mtapplication.util.ImageUtil;

public class GoogleCardsTravelAdapter extends ArrayAdapter<DummyModel>
		implements OnClickListener {

	private LayoutInflater mInflater;
	private double x, y;
	private String placeName;

	public GoogleCardsTravelAdapter(Context context, List<DummyModel> items) {
		super(context, 0, items);
		mInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public long getItemId(int position) {
		return getItem(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final ViewHolder holder;
		if (convertView == null) {
			convertView = mInflater.inflate(
					R.layout.list_item_google_cards_travel, parent, false);
			holder = new ViewHolder();
			holder.image = (ImageView) convertView
					.findViewById(R.id.list_item_google_cards_travel_image);
			holder.categoryName = (TextView) convertView
					.findViewById(R.id.list_item_google_cards_travel_category_name);
			holder.title = (TextView) convertView
					.findViewById(R.id.list_item_google_cards_travel_title);
			holder.text = (TextView) convertView
					.findViewById(R.id.list_item_google_cards_travel_text);
			holder.explore = (TextView) convertView
					.findViewById(R.id.list_item_google_cards_travel_explore);
			holder.share = (TextView) convertView
					.findViewById(R.id.list_item_google_cards_travel_share);
			holder.explore.setOnClickListener(this);
			holder.share.setOnClickListener(this);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		DummyModel item = getItem(position);
		ImageUtil.displayImage(holder.image, item.getImageURL(), null);
		holder.title.setText(item.getText());
		holder.text.setText(item.getDescription());
		holder.categoryName.setText(item.getText());
		holder.explore.setTag(position);
		holder.share.setTag(position);
		this.x = item.getMx();
		this.y = item.getMy();
		this.placeName = item.getMplaceName();
		return convertView;
	}

	private static class ViewHolder {
		public ImageView image;
		public TextView categoryName;
		public TextView title;
		public TextView text;
		public TextView explore;
		public TextView share;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int possition = (Integer) v.getTag();
		switch (v.getId()) {
		case R.id.list_item_google_cards_travel_explore:
			// click on explore button
			MapStarter mapStarter = new MapStarter();
			mapStarter.setContext(v.getContext());
			mapStarter.startActivitys(this.x, this.y, this.placeName);
			break;
		case R.id.list_item_google_cards_travel_share:
			// click on share button
			break;
		}
	}
}
