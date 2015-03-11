package com.example.horizontallistview;

import com.example.horizontallistview.view.HorizontalListView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class SampleActivity extends Activity implements OnItemClickListener {

	private static String[] items = new String[20];
	private HorizontalListViewAdapter mAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample);
		for(int i=0;i<items.length;i++){
			items[i]="item "+i;
		}
		mAdapter=new HorizontalListViewAdapter(this,items);
		HorizontalListView lv = (HorizontalListView) findViewById(R.id.list);
		lv.setAdapter(mAdapter);
		lv.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Toast.makeText(this, "--->"+position, 1).show();
		mAdapter.setSelectIndex(position);
	}
	
	

}
