package com.example.listviewdemo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VerticalAdapter extends BaseAdapter {
	Context mContext;
	View mHorizontalList;
	View mHorizontalListSet[];
	private BaseAdapter mAdapter;
	private BaseAdapter mAdapterSet[];
	public VerticalAdapter(Context mContext) {
		super();
		this.mContext = mContext;
		
	}

	public VerticalAdapter(Context mContext, View list) {
		super();
		this.mContext = mContext;
		this.mHorizontalList = list;
	}

	public VerticalAdapter(Context mContext,
			View[] listSet) {
		super();
		this.mContext = mContext;
		this.mHorizontalListSet = listSet;
	}

	public VerticalAdapter(Context mContext,
	View[] listSet, BaseAdapter mAdapter) {
		super();
		this.mContext = mContext;
		this.mHorizontalListSet = listSet;
		this.mAdapter = mAdapter;
	}
	public VerticalAdapter(Context mContext,
	View[] listSet, BaseAdapter mAdapterSet[]) {
		super();
		this.mContext = mContext;
		this.mHorizontalListSet = listSet;
		this.mAdapterSet = mAdapterSet;
	}

	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//LinearLayout verticalChildLayout = (LinearLayout) LayoutInflater.from(mContext).inflate(R.layout.vertical_child, parent,false);
		/*HorizontalListView verticalChild = (HorizontalListView) LayoutInflater.from(mContext).inflate(R.layout.vertical_child, parent,false);
		//HorizontalListView verticalChild = (HorizontalListView) verticalChildLayout.findViewById(R.id.horizontal_list);
		HorizontalAdapter horizontalAdapter = new HorizontalAdapter(mContext);
		verticalChild.setAdapter(horizontalAdapter);
		convertView = verticalChild;*/
		HorizontalListView hList = (HorizontalListView) mHorizontalListSet[position];
		hList.setAdapter(mAdapterSet[position]);
		Log.d("List","MainList getView:"+position);
		return hList;
	}

}
