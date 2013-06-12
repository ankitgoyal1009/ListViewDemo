package com.example.listviewdemo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HorizontalAdapter extends BaseAdapter {
	Context mContext;

	public HorizontalAdapter(Context mContext) {
		super();
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//LinearLayout horizontalChildLayout = (LinearLayout) LayoutInflater.from(mContext).inflate(R.layout.horizontal_child, parent);
		TextView horizontalChild = (TextView) LayoutInflater.from(mContext).inflate(R.layout.horizontal_child, parent,false);
		//TextView horizontalChild = (TextView) horizontalChildLayout.findViewById(R.id.horizontal_child_text);
		//convertView = horizontalChild;
		Log.d("List","Horizontal getView:"+position);
		return horizontalChild;
	}

}
