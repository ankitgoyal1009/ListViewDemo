package com.example.listviewdemo;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = new TextView(this);
		tv.setText("textView");
		ListView verticalList = (ListView) findViewById(R.id.vertical_list);
		HorizontalListView list = (HorizontalListView) LayoutInflater.from(this).inflate(R.layout.vertical_child, verticalList,false);
		
		//HorizontalListView list = (HorizontalListView) findViewById(R.id.horizontal_list);
		BaseAdapter mAdapter = new BaseAdapter() {
			
			 @Override
		        public View getView(final int position, View convertView, ViewGroup parent) {
		            ImageButton i =new ImageButton(MainActivity.this);
		            i.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher));
		            Log.d("List","Horizon getView:"+position);
		            return i;
		        }
			
			@Override
			public long getItemId(int arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getItem(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 200;
			}
		};
		//ListView list = (ListView) findViewById(R.id.vertical_list);
		//VerticalAdapter mAdapter = new VerticalAdapter(this);
		list.setAdapter(mAdapter);
		//HorizontalListView listSet[] = {new HorizontalListView(this),new HorizontalListView(this),new HorizontalListView(this),new HorizontalListView(this)};
		//BaseAdapter mAdapterSet[] = {mAdapter,mAdapter,mAdapter,mAdapter};
		//verticalList.setAdapter(new VerticalAdapter(this,listSet,mAdapterSet ));
		verticalList.setAdapter(new VerticalAdapter(this,list));
	}

}
